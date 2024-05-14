package com.main;
import java.util.Scanner;

import books.Book;
import data.Admin;
import data.Student;


public class LibrarySystem{
	
	private static Scanner scanner = new Scanner(System.in);
	private static Scanner scanners = new Scanner(System.in);
	public static void main(String[] args){
		//Add Temp Student
		Admin.studentList.add(new Student(1, "jefryy", "202310370311448", "Teknik", "Informatika", 0, 0));
		Admin.studentList.add(new Student(2, "hendry", "202310370311449", "Teknik", "Informatika", 0, 0));
		Admin.studentList.add(new Student(3, "zaky", "202310370311450", "Teknik", "informatika", 0, 0));
		Admin.studentList.add(new Student(4, "rayhan", "202310370311451", "Sihir", "ilmu hitam", 0, 0));
		//Add Temp Book
		Book.bookList.add(new Book(1,"6234-e241-ab1c", "title", "author", "Sejarah",5));
		Book.bookList.add(new Book(2,"388c-e681-9152","title","author","Novel",4));
		Book.bookList.add(new Book(3,"d95e-0c4a-9523","title","author","Manhwa",2));
		Book.bookList.add(new Book(4,"ed90-be30-5cdb","title","author","komik",1));


		menuu:
		while(true){
			menu();
			int pilih = scanner.nextInt();
			if(pilih == 1){
				Student student = new Student();
				if (inputNim()<=0) {
					System.out.println("Nim Tidak Ada Di Database!");
					continue menuu;
				};
				while(true){
					Book buku = new Book();
					student.menu();
					int pilih2 = scanner.nextInt();
					if(pilih2 == 1){
						System.out.println("Jumlah Buku Terpinjam ada "+student.showBorrowedBooks(datauser[0]));;
					}else if(pilih2 == 2){
						buku.displayBooks();
						System.out.print("Pilih Nomor Buku Yang Ingin Dipinjam: ");
						int chs = scanners.nextInt();
						if(student.borrowBook(chs)>0){
							System.out.println("Buku Berhasil Dipinjam");
							for (Student students : Admin.studentList) {
								// System.out.println(buku.stock-1);
								if (students.nim == datauser[1]) {
									Admin.studentList.get(students.id-1).setPinjam(students.pinjam+1);
									break;
								}
							}
						}else{
							System.out.println("Buku Sedang Kosong");
						}
					}else if(pilih2 == 3){
						if (student.returnBook(datauser[1]) == true) {
							System.out.println("Buku Berhasil Dikembalikan");
						}else{
							System.out.println("Anda Belum Meminjam / Tidak Ada Buku Yang Perlu Dikembalikan");
						}
					}else if(pilih2 == 4){
						break;
					}
				}
			}else if(pilih == 2){
				Admin admin = new Admin();
				if(admin.is_admin()<=0){
					System.out.println("Invalid credentials for admin.\n");
					continue menuu;
				};
				while(true){
					admin.menu();
					int pilihs = scanner.nextInt();
					if(pilihs == 1){
						admin.addStudent();
					}else if(pilihs == 2){
						admin.displayStudents();
					}else if(pilihs == 3){
						admin.displayBooks();
					}else if(pilihs == 4){
						admin.addBook();
					}else if(pilihs == 5){
						break;
					}
				}
			}else{
				System.out.println("Thankyou.. *Exiting Program.");
				System.exit(0);
			}
		}
	}

	static void menu(){
		System.out.println("===== Library System =====");
		System.out.println("1. Login as Student");
		System.out.println("2. Login as Admin");
		System.out.println("3. Exit");
		System.out.print("Choose Option(1-3): ");
	}

	static String[] datauser = new String[5];
	static int checkNim(String nim){
		for (Student user : Admin.studentList) {
			if(user.nim.equals(nim)){
				datauser[0] = String.valueOf(user.id);
				datauser[1] = user.nim;
				datauser[2] = user.nama;
				datauser[3] = user.fakultas;
				datauser[4] = user.prodi;
				return 1;
			}
		} return 0;
	}

	static int inputNim(){
		System.out.print("Enter your NIM : ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String nim = scan.nextLine();
		while(true){
			if (nim.length() != 15 ) {
				System.out.print("Nim Harus 15 Digit!!!\nMasukkan NIM mahasiswa: ");
				nim = scan.nextLine();
			}
			if (checkNim(nim) > 0){
				System.out.println("Sukses Login Sebagai " + datauser[2]);
				return 1;
				// break;
			}else{
				System.out.println("Nim Tidak Ditemukan!\n");
				return 0;
				// break;
			}
		}
	}
}