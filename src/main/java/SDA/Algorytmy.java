package SDA;

import java.util.Scanner;

public class Algorytmy {


    public boolean jakaLiczba(int liczba) {
        return liczba % 2 == 0;

    }


    public int sumaParz(int[] tab) {
        int wynik = 0;
//        int[] tablica = tab;
        for (int o : tab) {
            System.out.println("--" + o + "--");
        }
        for (int i : tab) {
            if (i % 2 == 0) {
                wynik += i;
            } else if (i % 2 != 0) {
                wynik -= i;
            }

        }
        return wynik;
    }

    public double srednia(int[] tablica) {
        double wynik = 0;
        for (int value : tablica) {
            wynik += value;
        }
        return wynik /= tablica.length;

    }

    public MinMax najW(int[] tablica) {
        MinMax minmax = new MinMax();
        int max = tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > max) {
                max = tablica[i];
                minmax.setIndexMax(i);
            }
        }
        int min = tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i]< min) {
                min = tablica[i];
                minmax.setIndexMin(i);
            }
            minmax.setMax(max);

            minmax.setMin(min);

        }
        return minmax;
    }


// public void jakaLiczba(){
//     System.out.println("podaj liczbe ");
//     int liczba = odczyt.nextInt();
//     if (liczba%2==0 ){
//         System.out.println("parzysta");}else{
//         System.out.println("nieparzysta");
//     }
// }
//
//    public int sumaParz() {
//        int wynik = 0;
//            System.out.println("podaj trzy liczby ");
//            int liczba = odczyt.nextInt();
//            int liczba1 = odczyt.nextInt();
//            int liczba2 = odczyt.nextInt();
//
//            int[] tab = {liczba, liczba1, liczba2};
//
//            for (int i : tab) {
//            if (i % 2 == 0) {
//                wynik += i;
//            }
//        }
//        return wynik;
//    }
}