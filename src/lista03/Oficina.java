package lista03;

public class Oficina {
	
	private OrdemDeServico[] ordensServico;

	public Oficina() {}
	
	public void adicionaOS(OrdemDeServico[] os) {
		this.ordensServico = os;
	}
	
	public OrdemDeServico buscaOSServico(int codigo) {
		for (int i = 0; i <this.ordensServico.length; i++) {
			if (this.ordensServico[i].possuiServico(codigo)) {
				return this.ordensServico[i];
			}
		}
		
		return null;
	}
	
	public OrdemDeServico buscaOSMecanico(String cpf) {
		for (int i = 0; i <this.ordensServico.length; i++) {
			if (this.ordensServico[i].possuiMecanico(cpf)) {
				return this.ordensServico[i];
			}
		}
		
		return null;
	}
	
	public double calculaFaturamentoTotal() {
		double faturamentoTotal = 0;
		for (int i = 0; i<this.ordensServico.length; i++) {
			faturamentoTotal += this.ordensServico[i].getValor();
		}
		
		return faturamentoTotal;
	}

	@Override
	public String toString() {
		return "Oficina [ordensServico=" + ordensServico + ", calculaFaturamentoTotal()=" + calculaFaturamentoTotal()
				+ "]";
	}
	
	
}
