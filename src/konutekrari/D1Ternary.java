package konutekrari;

import java.util.Scanner;

public class D1Ternary {
    public static void main(String[] args) {
        //kullanicidan bir tam sayi aliniz
        //sayi pozitifse cift sayi veyq cift sayi degil
        //sayi pozitif degilse 3 bassamakli veya 3 basamakli degil yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi=scan.nextInt();
        if (sayi>0){
            System.out.println(sayi%2==0? "Cift sayi": "Cift sayi degil");
        }
        else {
            System.out.println(sayi<-99 && sayi>-1000 ? "3 basamakli" :"3 basamakli degil");
        }

    }
}
