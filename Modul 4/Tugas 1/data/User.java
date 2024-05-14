package data;

public abstract class User {
    //Untuk DisplayBooks  saya ambil dari fungsi yang sudah saya buat di Admin.java
	public void displayBooks(){
		Admin tampilkanbuku = new Admin();
		tampilkanbuku.displayBooks();
	}
    public void addBook(){
        //
    }
    public void getBookList(){
        //
    }
}
