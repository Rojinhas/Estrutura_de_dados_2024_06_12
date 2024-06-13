package estrutura_de_dados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class aatividade01_fila {

	/*
	 * Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da
	 * Classe String, para organizar a ordem de chegada dos Clientes de um Banco. O
	 * programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3: 1: Adicionar
	 * um novo Cliente na fila. Deve solicitar o nome do Cliente. 2: Listar todos os
	 * Clientes na fila 3: Chamar (retirar) uma pessoa da fila 0: O programa deve
	 * ser finalizado. Caso a fila esteja vazia, o programa deverá informar que a
	 * fila está vazia ao tentar retirar (chamar) um cliente da fila..
	 */
	public static void main(String[] args) {
		Scanner novo = new Scanner(System.in);

		Queue<String> mugiwara = new LinkedList<>();
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
				mugiwara.add(tripulante);
				break;
			case 2:
				System.out.println("Listar mugiwara do bando: ");
				Iterator<String> iterator = mugiwara.iterator();

				while (iterator.hasNext()) { // Função que percorre a lista.
					System.out.println(iterator.next()); // Enquanto tiver um próximo intem.
				}
				break;
			case 3:
				System.out.println("Retirar um mugiwara do bando:");
				if (mugiwara.isEmpty()) {
					System.out.println("O bando está vazio!");
				} else {
					System.out.println("Mugiwara retirado: " + mugiwara.remove());
				}
				break;

			default:
				System.out.println("Não temos essa opção nesse bando! Poderia rever as opções?: ");
			}

		} while (opcao > 0);

	}
}
