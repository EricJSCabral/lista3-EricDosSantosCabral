package lista03;

public class Main {

	public static void main(String[] args) {
		Oficina oficina = new Oficina();
		
		Servico servico1 = new Servico(1, "Reparo no motor", 500.00);
		Servico servico2 = new Servico(2, "Funilaria", 300.00);
		Servico servico3 = new Servico(3, "Alinhamento", 100.00);
		
		Cliente cliente1 = new Cliente ("12345678910", "Eric Cabral", "11 4578 5236");
		Cliente cliente2 = new Cliente ("12369874258", "Maria Beatriz", "11 4489 4236");
		Cliente cliente3 = new Cliente ("12336987420", "Letícia", "11 94254 3333");
		
		Mecanico mecanico1 = new Mecanico ("49026915847", "Rael", "Funilaria");
		Mecanico mecanico2 = new Mecanico ("08752046875", "Felipe", "Motor");
		
		OrdemDeServico ordem1 = new OrdemDeServico(1, cliente1);
		Servico ordemServicos1[] = {servico1, servico2}; //vetor com serviços a serem incluídos na ordem
		ordem1.adicionaServico(ordemServicos1); //incluindo
		Mecanico mecanicoServicos1[] = {mecanico1, mecanico2}; //vetor com mecanicos a serem incluidos nesta ordem
		ordem1.adicionaMecanico(mecanicoServicos1); //incluindo
		
		OrdemDeServico ordem2 = new OrdemDeServico(2, cliente2);
		Servico ordemServicos2[] = {servico1, servico3}; 
		ordem2.adicionaServico(ordemServicos2);
		Mecanico mecanicoServicos2[] = {mecanico1};
		ordem2.adicionaMecanico(mecanicoServicos2);
		
		OrdemDeServico ordem3 = new OrdemDeServico(3, cliente3);
		Servico ordemServicos3[] = {servico2, servico3};
		ordem3.adicionaServico(ordemServicos3);
		Mecanico mecanicoServicos3[] = {mecanico2};
		ordem3.adicionaMecanico(mecanicoServicos3);
		
		OrdemDeServico ordem4 = new OrdemDeServico(4, cliente1);
		Servico ordemServicos4[] = {servico1, servico2, servico3};
		ordem4.adicionaServico(ordemServicos4);
		Mecanico mecanicoServicos4[] = {mecanico1, mecanico2};
		ordem4.adicionaMecanico(mecanicoServicos4);

		
		OrdemDeServico vetorOrdens[] = {ordem1, ordem2, ordem3, ordem4};
		oficina.adicionaOS(vetorOrdens);
		
		System.out.println("Ordem de Serviço: " + oficina.buscaOSServico(1)); //busca por código
		System.out.println("Valor total: " + ordem1.calculaValorTotal());
		
		System.out.println("\n");
		System.out.println("Ordem de Serviço por CPF: " + oficina.buscaOSMecanico("49026915847")); //busca por cpf mecanico
		
		System.out.println("\n");
		System.out.println("Faturamento total da oficina: " + oficina.calculaFaturamentoTotal());

	}

}
