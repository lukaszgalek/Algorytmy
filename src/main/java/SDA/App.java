package SDA;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner odczyt = new Scanner(System.in);

        System.out.println("podaj liczbe");
        int liczba = odczyt.nextInt();

        if (liczba%2 == 0){
            System.out.println("liczba jest parzysta");
        }else{
            System.out.println("liczba nieparzysta");}
    }
}
