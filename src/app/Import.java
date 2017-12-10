package app;
import java.util.Scanner;
public class Import {

	public static void main(String[] args) {
		String dane;
		System.out.println("Podaj imie");
		Scanner odczyt = new Scanner(System.in);
		dane = odczyt.nextLine();
		System.out.println(dane+" Witaj na kursie java!!!");
		odczyt.close();

	}

}
