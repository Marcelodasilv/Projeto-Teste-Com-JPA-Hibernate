package PrimeiroProjeto;

import java.util.Scanner;

import javax.persistence.EntityManager;

public class Delete implements CRUD {

	public void crud(EntityManager em, Scanner scanner) {
		try {
			System.out.print("Escreva o ID para deletar: ");
			int scanID = scanner.nextInt();
			String limpaBuffer = scanner.nextLine();

			Usuario cl = em.find(Usuario.class, scanID);

			if (cl == null) {
				System.out.println("Cliente não encontrado.");
				return;
			} else {
				em.getTransaction().begin();
				em.remove(cl);
				em.getTransaction().commit();

				System.out.println("Deletado!");
			}
		} catch (RuntimeException e) {
			System.out.println("Erro no sistema, responsavel : " + e.getMessage());
		}
	}
}
