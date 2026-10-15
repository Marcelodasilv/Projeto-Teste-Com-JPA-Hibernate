package PrimeiroProjeto;

import java.util.Scanner;

import javax.persistence.EntityManager;

public class Read implements CRUD {

	public void crud(EntityManager em, Scanner scanner) {
		try {

			System.out.print("Escreva o ID para ler o cliente: ");
			int scanID = scanner.nextInt();
			String limpaBuffer = scanner.nextLine();

			Usuario cl = em.find(Usuario.class, scanID);

			if (cl == null) {
				System.out.println("Cliente não encontrado.");
				return;
			} else {

				cl.exibir();
			}
		} catch (RuntimeException e) {
			System.out.println("Erro no sistema, responsavel : " + e.getMessage());
		}
	}
}
