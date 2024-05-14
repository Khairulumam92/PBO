package data;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import books.Book;
import util.iMenu;

public class Admin extends User implements iMenu{
	static String username = "admin";
	static String password = "admin123";
	private static Scanner scanner = new Scanner(System.in);
	private static Scanner scanners = new Scanner(System.in);
	public static ArrayList<Student> studentList = new ArrayList<>();
	@Override
	public void menu(){
		System.out.println("\n=== Admin Menu ===");
		System.out.println("1. Add Student");
		System.out.println("2. Display Registered Students");
		System.out.println("3. Display Available Books");
		System.out.println("4. Add Book");
		System.out.println("5. Logout");
		System.out.print("Choose Option(1-5): ");
	}

	public int is_admin(){
		System.out.print("Enter your username (admin) : ");
		// Scanner scan = new Scanner(System.in);
		String user = scanner.nextLine();
		System.out.print("Enter your password (admln) : ");
		String pwd = scanner.nextLine();

		if (user.equals(Admin.username)&&pwd.equals(Admin.password)) {
			return 1;
		}else{
			return 0;
		}
		
	}

	public void addStudent(){
		String data[] = new String[5];
		// Scanner scans = new Scanner(System.in);
		System.out.print("Masukkan NIM mahasiswa: ");
		data[2] = scanner.nextLine();
		while(true){
			if (String.valueOf(data[2]).length() != 15 ) {
				System.out.print(String.valueOf(data[2]).length());
				System.out.print("Nim Harus 15 Digit!!!\n");
				System.out.print("Masukkan NIM mahasiswa: ");
				data[2] = scanner.nextLine();
			}else{
				break;
			}
		}
		System.out.print("Masukkan nama mahasiswa: ");
		data[1] = scanner.nextLine();
		System.out.print("Masukkan Fakultas mahasiswa: ");
		data[3] = scanner.nextLine();
		System.out.print("Masukkan ProgramStudi mahasiswa: ");
		data[4] = scanner.nextLine();
		Admin.studentList.add(new Student(studentList.size()+1, data[1], data[2], data[3], data[4], 0, 0));
	}

	public void addBook(){
		//Fungsi Untuk Membuat Random String
		String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		//Mengatur Panjang String
		int length = 14;
		for(int i = 0; i < length; i++) {
		//Mengatur Panjang String
			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			//replace index ke 4 dan 9 menjadi -
			if(i==4||i==9){
				sb.append("-");
			}else{
				sb.append(randomChar);
			}
		}
		String randomString = sb.toString();
		String data[] = new String[6];
		// //data[1] = ID Buku 
		data[1] = randomString;
		// Scanner scans = new Scanner(System.in);
		// Scanner scanint = new Scanner(System.in);
		System.out.print("Select Book Category:\n1. Comic Book\n2. History Book\n3. Text Book\nChoose Category(1-3): ");
		int pilih = scanners.nextInt();
		if(pilih==1){
			//data[4] = Genre Buku 
			data[4] = "Manga";
		}else if(pilih==2){
			data[4] = "Sejarah";
		}else if(pilih==3){
			data[4] = "Novel";
		}
		System.out.print("Enter Title Book: ");
		//data[2] = Judul Buku 
		data[2] = scanner.nextLine();
		System.out.print("Enter Author: ");
		//data[3] = Author 
		data[3] = scanner.nextLine();
		System.out.print("Enter The Stock: ");
		//data[5] = Stock
		data[5] = scanner.nextLine();
		Book.bookList.add(new Book(Book.bookList.size()+1, data[1], data[2], data[3], data[4], Integer.valueOf(data[5])));
	}


	public static String x1 = "===========================================================================================";
	public static String x2 = "|| No.\t|| Id buku\t\t|| Nama Buku\t|| Author\t|| Category\t|| Stock ||";

	public void displayStudents(){
		for (Student user : Admin.studentList) {
			System.out.println("\nNama: " + user.nama + "\nNim: " + user.nim + "\nFakultas: " + user.fakultas + "\nProdi: " + user.prodi);
		}
	}
	public void displayBooks(){
		System.out.println(x1+"\n"+x2+"\n"+x1);
		for (Book buku : Book.bookList) {
			System.out.println("|| " + buku.inc + "\t|| " + buku.id + "\t|| " + buku.title + "\t|| " + buku.author + "\t|| " + buku.category + "\t|| " + buku.stock + "\t ||");
		}
		System.out.println(x1);
	}


}