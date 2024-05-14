package data;
// import java.util.ArrayList;

import books.Book;

public class Student{
	public int id;
	public String nama;
	public String nim;
	public String fakultas;
	public String prodi;
	public int pinjam;
	int durasi;
	int no_buku;
	// static ArrayList<Book> borrowedBooks = new ArrayList<>();

	public Student(int id, String nama, String nim, String fakultas, String prodi, int pinjam, int durasi){
		this.id = id;
		this.nama = nama;
		this.nim = nim;
		this.fakultas = fakultas;
		this.prodi = prodi;
		this.pinjam = pinjam;
		this.durasi = durasi;
	}

	public Student() {
		//Auto-generated constructor stub (agar bisa create constructor baru)
	}

	//Untuk Memodify Pinjam
	public void setPinjam(int pinjam) {
		this.pinjam = pinjam;
	}

	//Untuk Memodify Durasi
	public void setDurasi(int durasi) {
		this.durasi = durasi;
	}

	public int showBorrowedBooks(String id){
		int val = 0;
		for (Student students : Admin.studentList) {
			if(String.valueOf(students.id).equals(id)){
				val = students.pinjam;
				break;
			}
		}return val;
	}

	int stock_p;
	public int borrowBook(int inc){
		int val = 0;
		for (Book buku : Book.bookList) {
			// System.out.println(buku.stock-1);
			if (buku.inc == inc && buku.stock > 0) {
				Book.bookList.get(buku.inc-1).setStock(buku.stock-1);
				no_buku = buku.inc-1;
				stock_p = buku.stock;
				val = 1;
				break;
			}
		}return val;
	}

	public boolean returnBook(String idnim){
		int val = 0;
		for (Student students : Admin.studentList) {
			if(students.nim.equals(idnim)){
				Book.bookList.get(no_buku).setStock(stock_p+students.pinjam);
				Admin.studentList.get(students.id-1).setPinjam(0);
				val = 1;
				break;
			}
		}
		if(val>0){
			return true;
		}else{
			return false;
		}
	}

	public void menu(){
		System.out.println("=== Student Menu ===");
		System.out.println("1. Buku terpinjam");
		System.out.println("2. Pinjam buku");
		System.out.println("3. Kembalikan buku");
		System.out.println("4. Logout");
		System.out.print("Choose Option(1-4): ");
	}

}