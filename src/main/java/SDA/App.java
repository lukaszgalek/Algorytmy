package SDA;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Algorytmy algorytm = new Algorytmy();
        Scanner odczyt = new Scanner(System.in);

        int liczba = odczyt.nextInt();
        int liczba1 = odczyt.nextInt();
        int liczba2 = odczyt.nextInt();
        int liczba3= odczyt.nextInt();
//        int liczba4 = odczyt.nextInt();
//        int liczba5 = odczyt.nextInt();
//        int liczba6 = odczyt.nextInt();
//        int liczba7 = odczyt.nextInt();
//        int liczba8 = odczyt.nextInt();
//        int liczba9 = odczyt.nextInt();
//        List<Integer> values = Arrays.asList(2,3,3,3,4,5,6,7); działa ale tylko wtedy gdy nie dopisujemy juz wartosci

//int[] liczby={ liczba,liczba1,liczba2,liczba3,liczba4,liczba5,liczba6,liczba7,liczba8,liczba9};
int[] liczby={ liczba,liczba1,liczba2,liczba3,1,8,2,8,9,10};
        System.out.println(algorytm.najW(liczby));



//        System.out.println(algorytm.srednia(liczby));
        algorytm.najW(liczby);
//        System.out.println(algorytm.jakaLiczba(liczba)+"\n");
//        System.out.println(algorytm.sumaParz(liczby));
//        System.out.println(algorytm.sumaParz());
}}
