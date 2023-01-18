import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner snc = new Scanner(System.in);

        System.out.print("Mayın tarlası oyunun\nSatır sayısını belirtiniz x : ");
        int rowSize = snc.nextInt();
        System.out.print("Sütun sayısını belirtiniz y : ");
        int colSize = snc.nextInt();

        MineSweeper Ms = new MineSweeper(rowSize, colSize);

        System.out.println("----------------");
        Ms.printBoard(Ms.getMineArray());
        Ms.run();
    }
}