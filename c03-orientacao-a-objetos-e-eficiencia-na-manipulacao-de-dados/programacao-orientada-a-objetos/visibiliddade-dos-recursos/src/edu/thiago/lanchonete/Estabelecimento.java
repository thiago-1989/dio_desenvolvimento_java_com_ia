import area.cliente.Cliente;
import atendimento.Atendente;
import atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		/* ações que não precisam estarem disponíveis para toda a aplicação
		cozinheiro.lavarIngredientes();
		cozinheiro.baterVitaminaLiquidificador();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		*/
		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		/* As ações do almoxarife não estão visíveis portanto não é necessário estanciar 
		Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estarem disponíveis para toda a aplicação
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();*/

		/*ação que somente o seu pacote cozinha precisa conhecer (default)
		almoxarife.entregarIngredientes();
		almoxarife.trocarGas();
		*/

		Atendente atendente = new Atendente();
		//atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		/*ação que somente o seu pacote cozinha precisa conhecer (default)
		atendente.trocarGas();*/
		
		Cliente cliente = new Cliente();
		//cliente.escolherLanche(); desnecessário
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//não deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento
		// cliente.pegarPedidoBalcao(); desnecessário
		
		//esta ação é muito sigilosa, qua tal ser privada ?
		//cliente.consultarSaldoAplicativo(); privado
		
		/*já pensou os clientes ouvindo que o gás acabou ?
		cozinheiro.pedirParaTrocarGas(atendente);
		cozinheiro.pedirParaTrocarGas(almoxarife);
		*/
	}
}