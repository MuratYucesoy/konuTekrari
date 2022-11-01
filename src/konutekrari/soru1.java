package konutekrari;

public class soru1 {
    public static void main(String[] args) {
        //1 ile 100 arasinda yer alan 5 ile tam bolunebilen sayilari bulunuz

        int flag=0;
        for (int i = 1; i <100 ; i++) {
            if (i%5==0)
                {
                System.out.print(i+" ");
                flag++;
            }

        }


    }
}
