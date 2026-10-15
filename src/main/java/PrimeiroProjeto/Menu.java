package PrimeiroProjeto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public void iniciar(EntityManager em, Scanner scanner) {

		int scanInt = 0;

		while (scanInt != 5) {
			try {
				System.out.println("----- MENU ----- \n" + "1) Insert; \n" + "2) Read; \n" + "3) Update; \n"
						+ "4) Delete; \n" + "5) Sair; \n");
				System.out.print("R: ");
				scanInt = scanner.nextInt();
				String limpaBuffer = scanner.nextLine();

				switch (scanInt) {
				case 1:
					new Insert().crud(em, scanner);
					break;
				case 2:
					new Read().crud(em, scanner);
					break;
				case 3:
					new Update().crud(em, scanner);
					break;
				case 4:
					new Delete().crud(em, scanner);
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Erro 404 no Sistema");
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Erro no sistema, responsavel : " + e);
			} catch (RuntimeException e) {
				System.out.println("Erro no sistema, responsavel : " + e.getMessage());
			}
		}
	}
}
