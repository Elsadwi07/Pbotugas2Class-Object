import java.util.Scanner;
public class number {
	int num;
	Scanner scan = new Scanner(System.in);
	
	number(){
		System.out.print("------------------------------------\n");
		System.out.print("Nama  : Elsa Dwi Handayani\n");
		System.out.print("NIM   : 19051397035\n");
		System.out.print("Prodi : D4 Manajemen Informatika\n");
		System.out.print("------------------------------------\n");
		System.out.print("Input number: ");
		num = scan.nextInt();
		System.lineSeparator();
	}
	
	void checkLessGre() {
		if(num < 0) {
			System.out.print(num + " adalah bilangan Negatif ");
		}
		else {
			System.out.print(num + " adalah bilangan Positif ");
		}
	}
	
	void checkEvenOdd() {
		if(num % 2 == 0) {
			System.out.println("Genap!");
		}
		else {
			System.out.println("Ganjil!");
		}
	}
	
	void check() {
		checkLessGre();
		checkEvenOdd();
	}
	
	public static void main(String[] args) {
		number obj = new number();
		obj.check();
	}

}