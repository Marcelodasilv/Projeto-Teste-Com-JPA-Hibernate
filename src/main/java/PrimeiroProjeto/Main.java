package PrimeiroProjeto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetojdbc");
		EntityManager em = emf.createEntityManager();

		Scanner scanner = new Scanner(System.in);
		Menu menu = new Menu();
		menu.iniciar(em, scanner);

		em.close();
		emf.close();
	}
}