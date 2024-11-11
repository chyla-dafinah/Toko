import java.util.Scanner;

public class TesterInput {
    public static void main(String[] args) {
        Product[] p = new Product[5];
        Scanner in = new Scanner(System.in);
        
        System.out.println("CD / DVD / Product");
        String pilihan = in.nextLine();

        // System.out.println("Name : ");
        // String name = in.nextLine();
        // System.out.println("Number : ");
        // int number = in.nextInt();
        // System.out.println("Quantity : ");
        // int quantity = in.nextInt();
        // System.out.println("Price : ");
        // double price = in.nextDouble();
        // in.nextLine();

        if (pilihan.equalsIgnoreCase("Product")) {
            System.out.println("Name : ");
            String name = in.nextLine();
            System.out.println("Number : ");
            int number = in.nextInt();
            System.out.println("Quantity : ");
            int quantity = in.nextInt();
            System.out.println("Price : ");
            double price = in.nextDouble();
            in.nextLine();
            p[3] = new Product(number, name, quantity, price);
            p[3].print();
        } else if (pilihan.equalsIgnoreCase("CD")) {
            System.out.println("Name : ");
            String name = in.nextLine();
            System.out.println("Number : ");
            int number = in.nextInt();
            System.out.println("Quantity : ");
            int quantity = in.nextInt();
            System.out.println("Price : ");
            double price = in.nextDouble();
            in.nextLine();
            System.out.println("Artist : ");
            String artist = in.nextLine();
            System.out.println("Label : ");
            String label = in.nextLine();
            System.out.println("Total Song : ");
            int numSong = in.nextInt();
            // CD c = new CD(number, name, quantity, price, artist, numSong, label);
            // c.print();
            p[0] = new CD(number, name, quantity, price, artist, numSong, label);
            p[0].print();
        } else if (pilihan.equalsIgnoreCase("DVD")) {
            System.out.println("Name : ");
            String name = in.nextLine();
            System.out.println("Number : ");
            int number = in.nextInt();
            System.out.println("Quantity : ");
            int quantity = in.nextInt();
            System.out.println("Price : ");
            in.nextLine();
            double price = in.nextDouble();
            System.out.println("Length : ");
            int length = in.nextInt();
            System.out.println("Rating : ");
            String rating = in.nextLine();
            System.out.println("Studio : ");
            String studio = in.nextLine();
            // DVD d = new DVD(number, name, quantity, price, length, rating, studio);
            // d.print();
            p[1] = new DVD(number, name, quantity, price, length, rating, studio);
            p[1].print();
        }
        in.close();
    }
}
