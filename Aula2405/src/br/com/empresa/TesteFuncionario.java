package br.com.empresa;
import java.text.DecimalFormat;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Juliano");
		gerente.setSalario(3000.20);
		gerente.setUsuario("juliano.ferreira");
		gerente.setSenha("abc123@XPTO");
		
		DecimalFormat decimal = new DecimalFormat("00.00");
		
		System.out.println(" ###### Gerente %%%%%%");
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Salario: " + gerente.getSalario());
		System.out.println("Usuário: " + gerente.getUsuario());
		System.out.println("Senha: " + gerente.getSenha());
		System.out.println("Bonificação: " + String.format("%.2f", gerente.bonificacao()));
		System.out.println("IRPF: " + String.format("%.2f", gerente.getSalario() * 7 / 100));
		System.out.println();
		
		Secretaria secretaria = new Secretaria();
		secretaria.setNome("Juliana");
		secretaria.setSalario(1800.20);
		secretaria.setRamal(5220);
		
		
		System.out.println(" ###### Secretária %%%%%%");
		System.out.println("Nome: " + secretaria.getNome());
		System.out.println("Salario: " + secretaria.getSalario());
		System.out.println("Ramal: " + secretaria.getRamal());
		System.out.println("IRPF: " + String.format("%.2f", secretaria.getSalario() * 7 / 100));
		System.out.println();
		
		
		Telefonista telefonista = new Telefonista();
		telefonista.setNome("Telefonista");
		telefonista.setSalario(1200.20);
		telefonista.setEstacaoTrabalho(01);
		
		System.out.println(" ###### Telefonista %%%%%%");
		System.out.println("Nome: " + telefonista.getNome());
		System.out.println("Salario: " + telefonista.getSalario());
		System.out.println("Estação de Trabalho: " + telefonista.getEstacaoTrabalho());
		System.out.println("IRPF: " + String.format("%.2f", telefonista.getSalario() * 7 / 100));
		System.out.println();
		
		
		
			
		

	}

}
