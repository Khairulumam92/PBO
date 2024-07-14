import java.util.PriorityQueue;

public class PriorotyQueueExam {
    public static void main(String[] args) throws Exception {
        // membuat PriorityQueue dengan urutan default (urutan alami) dengan tipe data string
        PriorityQueue<String> queue = new PriorityQueue<>();

        // menambahkan data nama ke antrian
        queue.offer("Heru");
        queue.offer("Umam");
        queue.offer("Caca");
        queue.offer("Hendri");

        // mengakses nama yang di prioritaskan
        System.out.println("Orang dengan prioritas tertinggi : " + queue.peek());
        
        // menampilkan Nama yang dihapus
        System.out.println("Nama yang dihapus : " + queue.poll());

        // menampilkan isi antrian
        System.out.println("Isi antrian : " + queue);
    }
}
