package dio.spring.security.jwt.security;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

public class JWTFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String token = request.getHeader(JWTCreator.HEADER_AUTHORIZATION);

        if (token != null && !token.isEmpty()) {
            System.out.println("Token original: " + token); // Log para verificar o token recebido

            // Remove o prefixo (e.g., "Bearer ")
            token = token.replace(SecurityConfig.PREFIX, "").trim();
            System.out.println("Token após remoção do prefixo: " + token); // Log para verificar o token após remoção do prefixo

            if (token == null || token.isEmpty() || token.chars().filter(ch -> ch == '.').count() != 2) {
                System.out.println("Token malformado"); // Log para token malformado
                response.setStatus(HttpStatus.BAD_REQUEST.value());
                return;
            }

            try {
                JWTObject tokenObject = JWTCreator.create(token, SecurityConfig.PREFIX, SecurityConfig.KEY);
                System.out.println("Token analisado com sucesso: " + tokenObject); // Log para o JWTObject criado

                List<SimpleGrantedAuthority> authorities = authorities(tokenObject.getRoles());
                UsernamePasswordAuthenticationToken userToken = new UsernamePasswordAuthenticationToken(
                        tokenObject.getSubject(),
                        null,
                        authorities);

                SecurityContextHolder.getContext().setAuthentication(userToken);
                filterChain.doFilter(request, response);
            } catch (ExpiredJwtException e) {
                e.printStackTrace();
                response.setStatus(HttpStatus.FORBIDDEN.value());
            } catch (UnsupportedJwtException e) {
                e.printStackTrace();
                response.setStatus(HttpStatus.FORBIDDEN.value());
            } catch (MalformedJwtException e) {
                e.printStackTrace();
                response.setStatus(HttpStatus.FORBIDDEN.value());
            } catch (SignatureException e) {
                e.printStackTrace();
                response.setStatus(HttpStatus.FORBIDDEN.value());
            } catch (Exception e) {
                e.printStackTrace();
                response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            }
        } else {
            SecurityContextHolder.clearContext();
            filterChain.doFilter(request, response);
        }
    }


    private List<SimpleGrantedAuthority> authorities(List<String> roles) {
        return roles.stream().map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }
}
