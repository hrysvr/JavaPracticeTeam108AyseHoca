package AyseHoca.day02;

import java.util.Scanner;

public class Q1_RakamPozitifSayi {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi yaziniz");
        int sayi = scan.nextInt();

        if (sayi>=0 && sayi<10){
            System.out.println("Rakam");
        } else if (sayi>=10) {
            System.out.println("Pozitif sayi");
        } else if (sayi<0) {
            System.out.println("Negatif Sayi");
        }



        if (sayi>=0){

            if (sayi<10){
                System.out.println("Girdiginiz sayi bir rakamdir");
            }else {
                System.out.println("Girdiginiz sayi bir pozitif sayidir");
            }
        }else {
            System.out.println("Girdiginiz sayi bir negatif sayidir");
        }


        String result =(sayi>=0)?((sayi<10)?"Rakam" : "Pozitif Sayi") : ("Negatif Sayi");
        System.out.println(result);

    }
}
