package manipulandoarquivos;

import java.io.File;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o caminho da pasta: ");
		String strAtalho = sc.nextLine();

		File atalho = new File(strAtalho);

		File[] pastas = atalho.listFiles(File::isDirectory);
		System.out.println("PASTAS: ");
		for (File pasta : pastas) {
			System.out.println(pasta);
		}

		File[] arquivos = atalho.listFiles(File::isFile);
		System.out.println("ARQUIVOS: ");
		for (File arquivo : arquivos) {
			System.out.println(arquivo);
		}


		sc.close();
	}
}
