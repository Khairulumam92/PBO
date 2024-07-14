import java.util.ArrayDeque;

public class ArrayDequeExam {
    public static void main(String[] args) throws Exception {
        // membuat ArrayDeque dengan tipe data string
        ArrayDeque<String> deque = new ArrayDeque<>();

        // menambahkan nama kedalam deque
        deque.addLast("Heru");
        deque.addFirst("Umam");
        deque.addLast("Caca");
        deque.addFirst("Hendri");

        // mengakses data yang ada dalam deque
        System.out.println("Orang dengan prioritas tertinggi : " + deque.getFirst());
        System.out.println("Nama terakhir : " + deque.getLast());

        // menampilkan isi deque
        System.out.println("Isi deque : " + deque);
    }
}
