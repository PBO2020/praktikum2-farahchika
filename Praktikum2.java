package praktikum2;

import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum2 {

    public static void main(String[] args) {
        
        ArrayList<String> kopi = new ArrayList<String>();
        ArrayList<String> Topping = new ArrayList<String>();
        ArrayList<String> Asal = new ArrayList<String>();

        Mesinkopi robusta = new Mesinkopi();
        robusta.setJenisKopi("Robusta");
        robusta.setAsal("Eropa");
        kopi.add(robusta.getJenisKopi());
        Asal.add(robusta.getAsal());

        Mesinkopi florest = new Mesinkopi();
        florest.setJenisKopi("Florest");
        florest.setAsal("Asia");
        kopi.add(florest.getJenisKopi());
        Asal.add(florest.getAsal());

        Mesinkopi arabica = new Mesinkopi();
        arabica.setJenisKopi("Arabica");
        arabica.setAsal("Timur Tengah");
        kopi.add(arabica.getJenisKopi());
        Asal.add(arabica.getAsal());

        Topping chk = new Topping();
        chk.setTopping("Cream");
        Topping.add(chk.getTopping());
        chk.setTopping("gula");
        Topping.add(chk.getTopping());

        for (int i = 0; i < kopi.size(); i++) {
            int j = i + 1;
            
            System.out.println("Menu kopi adalah " + j + ": " +kopi.get(i) );
        }
        
        for (int i = 0; i < Topping.size(); i++) {
            int j = i + 1;
            System.out.println("Pilihan Topping " + j + ": " + Topping.get(i));
        }


        try{
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan pilihan anda : ");
        int pilihanKopi = keyboard.nextInt() - 1;
        int pilihantopping = keyboard.nextInt() - 1;
      
        System.out.println("Pesanan anda adalah kopi " + kopi.get(pilihanKopi)+" yang berasal dari " +Asal.get(pilihanKopi)+" dengan topping " + Topping.get(pilihantopping));
        }catch (Exception e){
            System.out.println("Inputan anda salah");
            System.out.println(e + "\n");
    }
}}
}