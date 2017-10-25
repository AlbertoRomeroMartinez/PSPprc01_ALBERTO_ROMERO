package package1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainPractica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Integer opcion;

		do {
			System.out.println("+--------------------+");
			System.out.println("|        MENU        |");
			System.out.println("+--------------------+");
			System.out.println("|1. Introducir IP    |");
			System.out.println("|2. Ping proba       |");
			System.out.println("|3. Salir            |");
			System.out.println("+--------------------+");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				Ipv4 ip = new Ipv4();
				System.out.println("Direccion ip:");
				ip.setAtr1(entrada.nextInt());
				entrada.reset();

				System.out.println(" - " + ip.getAtr1() + ".xxx.xxx.xxx");
				ip.setAtr2(entrada.nextInt());
				entrada.reset();
				System.out.println(" - " + ip.getAtr1() + "." + ip.getAtr2() + ".xxx.xxx.xxx");
				break;

			case 2:
				ProcesoPing.realizarPing();
				break;

			default:
				break;
			}

			System.out.println("");

		} while (opcion != 3);
		entrada.close();
	}

}
