package AyseHoca.day01;

public class Q1_Print {

    /*
    Konsolda :
    "Hello "\
    / 'World'"
    yazdiriniz.
    */

    /*
	  \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
	          \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
	          \\  : Prints a back slash    : \  Ters slash yazdırır
	          \'  : Prints single quote    : '  Tek tırnak yazdırır.
	          \"  : Prints double quote    : "  Çift tırnak yazdırır.
	 */

    public static void main(String[] args) {


        System.out.println("\"Hello \"\\\n / \'World\'\" ");


        //Ornekler
        System.out.println('\'');
        System.out.println('\\');
        String isim = "Ahmet"; // Ahmet
        System.out.println("\"Ahmet\""); // "Ahmet"
        System.out.println("n"); // n
        System.out.println("\n"); // konsola bos bir satir olarak yansir
        System.out.println("n"); // n





    }



}
