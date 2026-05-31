import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Decimal deci = new Decimal();
        System.out.println("NOTE: This program only works until base 36");
        System.out.println();
        System.out.println("Enter base of original number");
        int obase = sc.nextInt();
        sc.nextLine();
        if (obase > 36 || obase < 2) {
            System.out.println("Base must be less than 37 and greater than 1");
            return;
        }
        System.out.println("Enter number");
        String onum = sc.nextLine();
        int decimal = deci.convert(obase,onum);
        System.out.println();
        System.out.println("Enter base to convert number to");
        int nbase = sc.nextInt();
        if (nbase > 36 || nbase < 2) {
            System.out.println("Base must be less than or equal to 36 and greater than 1");
            return;
        }
        if (decimal==0) {
            System.out.println();
            System.out.println(onum + " in base " + nbase + ":");
            System.out.println("0");
            return;
        }
        int r;
        int q = decimal;
        int count = 0;
        while (q>0) {
            q = q / nbase;
            count++;
        }
        q = decimal;
        int[] remainders = new int[count];
        int i = 0;
        while (q>0) {
            r = q % nbase;
            remainders[i] = r;
            i++;
            q = q / nbase;
        }
        i--;
        System.out.println();
        System.out.println(onum + " in base " + nbase + ":");
        String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        while (count>0) {
            if (remainders[i] > 9) {
                System.out.print(letters[remainders[i] - 10]);
            } else {
                System.out.print(remainders[i]);
            }
            i--;
            count--;
        }
    }
}