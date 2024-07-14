import java.util.PriorityQueue;

public class PriorotyQueueExam {
    public static void main(String[] args) throws Exception {
        // membuat PriorityQueue dengan urutan default (urutan alami) dengan tipe data
        // string
        PriorityQueue<String> queue = new PriorityQueue<>();

        // menambahkan data nama kedalam Queque
        queue.offer("Heru");
        queue.offer("Umam");
        queue.offer("Caca");
        queue.offer("Hendri");

        // menampilkan semua isi Queque
        System.out.println("Isi antrian : " + queue);

        // mengakses nama yang di prioritaskan
        System.out.println("Nama yang muncul pertama : " + queue.peek());

        // menampilkan Nama yang dihapus
        System.out.println("Nama yang dihapus : " + queue.poll());

        // menampilkan isi antrian setelah dihapus
        System.out.println("Isi antrian : " + queue);
    }
}
