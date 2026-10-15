package PrimeiroProjeto;

import java.util.Scanner;

import javax.persistence.EntityManager;

public class Insert implements CRUD {

	public void crud(EntityManager em, Scanner scanner) {
		try {
			System.out.println("Passe os atributos. ");

			System.out.print("Nome: ");
			String nome = scanner.nextLine();

			System.out.print("Idade: ");
			int idade = scanner.nextInt();
			String limpaBuffer = scanner.nextLine();

			System.out.print("Dinheiro: ");
			double dinheiro = scanner.nextDouble();
			limpaBuffer = scanner.nextLine();

			Usuario cl = new Usuario(nome, idade, dinheiro);

			em.getTransaction().begin();
			em.persist(cl);
			em.getTransaction().commit();

			System.out.println("Seu cliente foi adicionado!");

		} catch (RuntimeException e) {
			System.out.println("Erro no sistema, responsavel : " + e.getMessage());
		}
	}
}
