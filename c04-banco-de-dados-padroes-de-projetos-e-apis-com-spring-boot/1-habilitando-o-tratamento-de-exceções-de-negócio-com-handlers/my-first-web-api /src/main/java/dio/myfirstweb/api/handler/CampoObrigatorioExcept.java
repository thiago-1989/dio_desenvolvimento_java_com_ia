package dio.myfirstweb.api.handler;

public class CampoObrigatorioExcept extends BusinessException{
    public CampoObrigatorioExcept(String campo) {
        super("O campo %s é obrigatório!", campo);
    }
}
