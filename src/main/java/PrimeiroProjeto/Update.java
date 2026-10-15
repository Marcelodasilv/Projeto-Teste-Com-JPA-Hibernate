package PrimeiroProjeto;

import java.util.Scanner;

import javax.persistence.EntityManager;

public class Update implements CRUD {

	public void crud(EntityManager em, Scanner scanner) {
		try {
			System.out.print("Escreva o ID para atualizar: ");
			int scanID = scanner.nextInt();
			String limpaBuffer = scanner.nextLine();

			Usuario cl = em.find(Usuario.class, scanID);

			if (cl == null) {
				System.out.println("Cliente não encontrado.");
				return;
			} else {

				System.out.print("O que você quer mudar? \n" + "1) Nome; \n" + "2) Idade; \n" + "3) Dinheiro; \n"
						+ "4) Nada; \n" + "R: ");
				int decisao = scanner.nextInt();
				limpaBuffer = scanner.nextLine();

				switch (decisao) {

				case 1:
					System.out.print("Escreva o novo nome: ");
					String nome = scanner.nextLine();

					em.getTransaction().begin();
					cl.setNome(nome);
					em.getTransaction().commit();
					System.out.println("Update feito!");

					break;
				case 2:
					System.out.print("Escreva a nova idade: ");
					int idade = scanner.nextInt();
					limpaBuffer = scanner.nextLine();

					em.getTransaction().begin();
					cl.setIdade(idade);
					em.getTransaction().commit();
					System.out.println("Update feito!");

					break;
				case 3:
					System.out.print("Escreva o novo dinheiro: ");
					Double dinheiro = scanner.nextDouble();
					limpaBuffer = scanner.nextLine();

					em.getTransaction().begin();
					cl.setDinheiro(dinheiro);
					em.getTransaction().commit();
					System.out.println("Update feito!");

					break;
				case 4:
					break;

				default:
					System.out.println("Erro do sistema!");
					break;
				}

			}
		} catch (RuntimeException e) {
			System.out.println("Erro no sistema, responsavel : " + e.getMessage());
		}
	}
}
