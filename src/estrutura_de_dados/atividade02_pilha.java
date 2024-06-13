package estrutura_de_dados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class atividade02_pilha {
	public static void main(String[] args) {
		Scanner novo = new Scanner(System.in);

		Stack<String> mugiwara = new Stack<>();
		int opcao = 0;
		String tripulante;

		do {
			System.out.println("1: Adicionar um novo mugiwara ao bando: ");
			System.out.println("2: Listar todos os mugiwaras do bando: ");
			System.out.println("3: Chamar (retirar) um mugiwara do bando: ");
			System.out.println("0: Sair do bando: ");

			opcao = novo.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Qual o nome do mugiwara que deseja adicionar?: ");
				novo.skip("\\R?"); // Permitir que a leitura seja feita de forma correta.
				tripulante = novo.nextLine();
				mugiwara.push(tripulante);
				break;
			case 2:
				System.out.println("Listar mugiwara do bando: ");
				Iterator<String> iterator = mugiwara.iterator();

				while (iterator.hasNext()) { // Função que percorre a pilha.
					System.out.println(iterator.next()); // Enquanto tiver um próximo item.
				}
				break;
			case 3:
				System.out.println("Retirar um mugiwara do bando:");
				if (mugiwara.isEmpty()) {
					System.out.println("O bando está vazio!");
				} else {
					System.out.println("Mugiwara retirado: " + mugiwara.pop());
				}
				break;

			default:
				System.out.println("Não temos essa opção nesse bando! Poderia rever as opções?: ");
			}

		} while (opcao > 0);

	}
}