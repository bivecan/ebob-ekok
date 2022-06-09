import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("kucuk sayıyı girin: ");
        int no1 = scan.nextInt();

        System.out.println("buyuk sayıyı girin: ");
        int no2 = scan.nextInt();

        int ebob=1; int i=1;
        while(i<=no1){
            if(no1%i==0 && no2%i==0){
                ebob = i;
            }
            i++;
        }

        int ekok=no2; int k=no2;
        while(k<=(no1*no2)){
            if(k%no1==0 && k%no2==0){
                ekok=k;
                break;
            }
            k++ ;

        }

        System.out.println("EBOB: " + ebob) ;
        System.out.println("EKOK: " + ekok) ;

    }
}
