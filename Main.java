import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int day;

        Scanner scn= new Scanner(System.in);

        System.out.print("Lütfen Numara Giriniz:");
        day = scn.nextInt();


        switch (day){

            case 1:
                System.out.println("Bugün Pazartesi");
                break;

            case 2:
                System.out.println("Bugün Salı");
                break;

            default:
                System.out.println("Hatalı Giriş Yaptınız");


        }

    }
}
