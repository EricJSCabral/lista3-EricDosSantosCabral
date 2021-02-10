package lista03;

import java.util.Arrays;

public class OrdemDeServico {
	
	private int codigo;
	private Cliente cliente;
	private Servico[] servicos;
	private Mecanico[] mecanicos;
	private double valor;
	
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Servico[] getServicos() {
		return servicos;
	}

	public void setServicos(Servico[] servicos) {
		this.servicos = servicos;
	}

	public Mecanico[] getMecanicos() {
		return mecanicos;
	}

	public void setMecanicos(Mecanico[] mecanicos) {
		this.mecanicos = mecanicos;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public OrdemDeServico(int codigo, Cliente cliente) {
		
		this.codigo = codigo;
		this.cliente = cliente;
	}
	
	public void adicionaServico (Servico[] servico) {
		this.servicos = servico;
	}
	
	public void adicionaMecanico (Mecanico[] mecanico) {
		this.mecanicos = mecanico;
	}
	
	public double calculaValorTotal() {
		double valorTotal = 0;
		for (int i = 0; i<this.servicos.length; i++) {
			valorTotal += this.servicos[i].getValor();
		}
		this.valor = valorTotal;
		return this.valor;
		
	}
	
	public boolean possuiServico(int codigo) {
		for (int i = 0; i<this.servicos.length; i++) {
			if (this.servicos[i].getCodigo() == codigo) {
				return true;
			}
		} 
		return false;
	}
	
	public boolean possuiMecanico(String cpf) {
		
		for (int i = 0; i<this.mecanicos.length; i++) {
			if (this.mecanicos[i].getCpf().equals(cpf)) {
				return true;
			}
		} 
		return false;
	}

	@Override
	public String toString() {
		return "OrdemDeServico [codigo=" + codigo + ", cliente=" + cliente + ", servicos=" + Arrays.toString(servicos)
				+ ", mecanicos=" + Arrays.toString(mecanicos) + "]";
	}
	
	
}
