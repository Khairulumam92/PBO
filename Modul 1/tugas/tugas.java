import java.util.Scanner;

public class tugas {
    public static void main  (String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean login = false;

        String[][] AdminPw = {
                {"admin", "adm1n"},
                {"admin123", "admin45"},
                {"gatau", "adminnn"},
                {"admin2", "adminnn"}
        };

        do {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose Option (1-3): ");
            int pilihan = scan.nextInt();

            if (pilihan == 1) {
                System.out.print("Enter your NIM: ");
                String nim = scan.next();

                if (nim.length() == 15) {
                    System.out.println("Successful Login as Student");
                } else {
                    System.out.println("User Not Found");
                }

            } else if (pilihan == 2) {
                System.out.print("Enter your username (admin): ");
                String username = scan.next();

                System.out.print("Enter your password (admin): ");
                String password = scan.next();

                boolean adminpass = false;
                for (String[] admin : AdminPw) {
                    if (admin[0].equals(username) && admin[1].equals(password)) {
                        System.out.println("Successful Login as Admin!");
                        adminpass = true;
                        break;
                    }
                }
                if (!adminpass) {
                    System.out.println("Admin User Not Found");
                }

            } else if (pilihan == 3) {
                System.out.println("adios ma bruh");
                login = true;
            } else {
                System.out.println("Mohon pilih nomor 1-3.");
            }

        } while (!login);

    }
}