package lista03;

public class Mecanico extends Pessoa{
	
	private String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "Mecanico [especialidade=" + especialidade + "]";
	}

	public Mecanico(String cpf, String nome, String especialidade) {
		super(cpf, nome);
		this.especialidade = especialidade;
	}
	
	

}
