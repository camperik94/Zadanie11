import java.util.Scanner;

public class Zadanie11 {
	public static void main(String[] args) {
		Pobierz pob = new Pobierz();
		
		Scanner in = new Scanner(System.in);
		
		int liczba = 1;
		
		
		
		while(liczba != 0){
			liczba = in.nextInt();
			pob.funkcja(liczba);
		}
		System.out.println(pob.getLic());
	}
}
