import java.util.Scanner;
public class Main {
    static void plus(){
        Scanner scan= new Scanner(System.in);
        int total=0;
        System.out.println("kaç adet sayı girmek istersiniz");
        int a =scan.nextInt();
        System.out.print(" sayıları giriniz: ");
        for (int i=0;i<a;i++){
            int sayi=scan.nextInt();
            total=total+sayi;
        }
        System.out.println(total);
    }
    static void minus(){
        Scanner scan=new Scanner(System.in);
        int result;
        System.out.println("çıkarmak 1. sayıyı giriniz: ");
            int sayi= scan.nextInt();
        System.out.println("çıkarmak 2. sayıyı giriniz:");
            int sayi2= scan.nextInt();
            result=sayi-sayi2;
        System.out.println("sonuç: "+result);
    }
    static void times(){
        Scanner scan=new Scanner(System.in);
        int result=1;
        System.out.println("kaç adet sayı girmek istersiniz");
        int a=scan.nextInt();
        System.out.println("sayıları giriniz");
        for (int i=0;i<a;i++){
            int sayi=scan.nextInt();
            result=result*sayi;
        }
        System.out.println(result);
    }
    static void divided(){
        Scanner scan= new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int a=scan.nextInt();
        System.out.println("2. sayıyı giriniz");
        int b=scan.nextInt();
        int result=a/b;
        System.out.println(result);
    }
    static void power(){
        Scanner scan= new Scanner(System.in);
        System.out.print("tabanı giriniz: ");
        int base=scan.nextInt();
        System.out.print("üssü giriniz: ");
        int power=scan.nextInt();
        int result=1;
        for (int i=0;i<power;i++){
            result=result*base;
        }
        System.out.println(result);
    }
    static void factorial(){
        Scanner scan=new Scanner(System.in);
        System.out.println("faktoriyelini almak istediğiniz sayıyı giriniz: ");
        int a=scan.nextInt();
        int result=1;
        for (int i=1;i<=a;i++){
            result=result*i;
        }
        System.out.println(result);
    }
    static void modding(){
        Scanner scan= new Scanner(System.in);
        System.out.println("modunu almak istediğiniz sayıyı  giriniz");
        int a=scan.nextInt();
        System.out.println("kaçla modunu alacaksınız");
        int b=scan.nextInt();
        int result=a%b;
        System.out.println(result);
    }
    static void area(){
        Scanner scan=new Scanner(System.in);
        System.out.println("kısa kenarı giriniz");
        int a= scan.nextInt();
        System.out.println("uzun kenarı giriniz");
        int b=scan.nextInt();
        System.out.println("alan:"+a*b);
        int cevre=2*(a+b);
        System.out.println("çevre: "+cevre);
    }

    public static void main(String[] args) {
        String menu="1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.print("yapmak istediğiniz işlemi seçiniz: ");
        System.out.println(menu);
        Scanner scan= new Scanner(System.in);
        int islem=scan.nextInt();
        switch (islem){
            case 1:
                plus();
                break;
            case 2:
                minus();
                break;
            case 3:
                times();
                break;
            case 4:
                divided();
                break;
            case 5:
                power();
                break;
            case 6:
                factorial();
                break;
            case 7:
                modding();
                break;
            case 8:
                area();
                break;
            case 9:
                break;



        }
    }
}