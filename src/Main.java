import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int value,power,result=1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Üssü alınacak değeri giriniz: ");
        value = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        power = scan.nextInt();

        for(int i=1;i<=power;i++){
            result *=value;
        }

        System.out.print("Sonuç: "+result);
    }
}
