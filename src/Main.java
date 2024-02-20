import java.time.Year;
import java.util.Scanner;

   public class Main {
       public static void main(String[] args) {
        int year;
        //Kullanıcı veri girişi
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl giriniz : ");
        year = input.nextInt();
        // 4'ün katları veya 100'ünkatı olan sayılardan sadece 400'e kalansız bölünenler artık yıldır.
           if ((year %4 ==0 && year % 100 != 0 ) || (year %400 == 0)) {
               System.out.println(year +" Artık yıldır.");
           } else {
               System.out.println(year +" Artık yıl değildir.");
           }
    }
}