package contrato;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import contrato.Colaborador;

public class App {
	static SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-aa");
	static Scanner scan = new Scanner(System.in);
	static Scanner scanS = new Scanner(System.in);
	static List<Colaborador> listaColaboradores = new ArrayList<Colaborador>();
	static byte opcao = 0;
	static int i;

	public static void main(String[] args) throws ParseException {

		do {
			System.out.println("\nOpção: \n*** 1 - Cadastrar Colaborador: \n*** 2 - Listar Colaboradores: " +
					"\n*** 3 - Ativar/Desativar Prioridade \n*** 4 - Solicitar Elevador " +
					"\n*** 5 - Status Elevador \n*** 0 - Sair  ");
			System.out.print("Entre com a opção: ");
			opcao = scan.nextByte();

			switch (opcao){
				case 1:
					cadastrarColaborador();
					break;
				case 2:
					listarColaboradores();
					break;
				case 3:
					;
					break;
				case 4:
					;
					break;
				case 5:
					;
					break;
				case 0:
					System.out.println("Programa encerrado");
					break;
				default:
					System.out.println("Opção Inválida");
			}
		} while (opcao != 0);

	}

	public static void cadastrarColaborador() throws ParseException {
		String matriculaColaborador;
		String cpf;
		String nomeColaborador;
		String sData;
		LocalDate data2;


		do {
			System.out.print("Digite nova matrícula: ");
			matriculaColaborador = scanS.nextLine();

			try {
				i = Integer.parseInt(matriculaColaborador);
				if (i > 0){
					boolean infvalida = true;
				} else {
					System.out.println("Não é permitida Matrícula Igual a ZERO!");
					return;
				}
				break;

			}catch (Exception exception){
				System.out.println("Digite Apenas Números");

				continue;

			}

		}while (true);

		if(listaColaboradores.size() == i){
			System.out.println("Mátrícula Já Cadastrada!");
			return;
		}

		while (true){

			System.out.print("Digite CPF: ");
			cpf = scanS.nextLine();

			if (Colaborador.validarCpf(cpf) == true) {
				break;
			}else{
				System.out.printf("Erro, CPF invalido !!!\n");
			}
		}

		System.out.print("Digite o Nome do Colaborador: ");
		nomeColaborador = scanS.nextLine();


		while (true){
			System.out.print("Digite dia Nascimento (Ano/mês/dia - Ex. 1981-09-01): ");
			sData = scanS.nextLine();

			LocalDate agora = LocalDate.now();
			data2 = LocalDate.parse(sData);
			Period periodo = Period.between(data2, agora);
			int anos = periodo.getYears();
			if (anos > 18){
				System.out.println("Cadastro Concluído com Sucesso");
				break;
			} else  {
			System.out.println("Não é Permitido Colaborador Menor 18 anos!");
			return;
			}
		}
		Colaborador colaborador = new Colaborador(matriculaColaborador, cpf, nomeColaborador
													, data2, false);
		listaColaboradores.add(colaborador);
	}

	public static void registrarContrato(){

	}

	public static void listarColaboradores(){
		for (Colaborador colaboradores: listaColaboradores) {
			System.out.println(colaboradores);
		}
	}

	public static Colaborador pesquisarColaborador(String matricula) {
		for (Colaborador colaborador : listaColaboradores) {
			if (colaborador.getMatricula() == matricula) {
				return colaborador;
			}
		}
		return null;
	}
}
	
	


