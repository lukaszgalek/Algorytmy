package SDA;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lista {
   private static  List<Integer> lista= new LinkedList<>();
    private static Scanner wejscie = new Scanner(System.in);

    int liczba;

    public void szukajZero (){
       liczba= wejscie.nextInt();
       boolean gogo= true;
        while(gogo){
            if(liczba!=0){
                liczba= wejscie.nextInt();
            lista.add(liczba);
        }else{ gogo=false;
            System.out.println(lista.size()+1);}


    }}}


