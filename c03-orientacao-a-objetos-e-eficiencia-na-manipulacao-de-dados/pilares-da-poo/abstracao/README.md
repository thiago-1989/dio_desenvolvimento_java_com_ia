# Abstração
Para você ser, é preciso você fazer.

Sabemos que qualquer sistema de mensagens instantâneas realiza as mesmas operações de Enviar e Receber Mensagem, dentre outras operações comuns ou exclusivas de cada aplicativo disponível no mercado.

Mas será que as ações realizadas, contém o mesmo comportamento ? Acreditamos que não.

<div style="background-color: lightblue"><p style="color:black">Já imaginou a Microsoft falar para o <strong>Facebook</strong>: <strong>"Ei, toma meu código do MSN!".</strong></p></div>

O que vale destacar para compreender, é que todo e qualquer sistema de mensagem precisa sim, no mínimo Enviar e Receber Mensagem, logo, consideramos se firmar um "contrato" para qualquer um que queira se apresentar assim para o mercado.

Observem a nova estruturação dos códigos abaixo, com base na implementação apresentada no pilar **Herança**.

### ServicoPai
```Java
public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();	
}
```
### MSN
```Java
public class MSNMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
}
```
### Facebook
```Java
public class FacebookMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}
```
### Telegram
```Java
public class Telegram extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
}

```

<div style="background-color:black">
Em Java, o conceito de abstração é representado pela palavra reservada <strong>**abstract**</strong>e métodos que NÃO possuem corpo na classe abstrata (pai).

É muito difícil falar de abstraçãoe <strong>NÃO</strong> mencionar polimorfismo.
<div>