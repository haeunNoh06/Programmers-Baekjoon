import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num;
        num = scan.nextInt();
        System.out.println((double)num/scan.nextInt());
    }
}