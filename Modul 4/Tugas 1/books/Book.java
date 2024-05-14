package books;
import java.util.ArrayList;
import data.Admin;

public class Book{
	public int inc;
	public String id;
	public String title;
	public String author;
	public String category;
	public int stock;
	public int duration;
	public static ArrayList<Book> bookList = new ArrayList<>();
	public static Object buku;

	public Book(int inc, String id, String title, String author, String category, int stock){
		this.inc = inc;
		this.id = id;
		this.title = title;
		this.author = author;
		this.category = category;
		this.stock = stock;
	}

	public Book(){
		//Auto-generated constructor stub (agar bisa create constructor baru)
	}

	//Untuk Memodify Stock
	public void setStock(int stock) {
		this.stock = stock;
	}

	//Untuk DisplayBooks Saya Ambil dari fungsi yang sudah saya buat di Admin.java
	public void displayBooks(){
		Admin tampilkanbuku = new Admin();
		tampilkanbuku.displayBooks();
	}

	public void menu(){

	}

}