import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Random rand= new Random();
        Scanner sc = new Scanner (System.in);
        int Rand1= rand.nextInt(50);

//        System.out.println(Rand1);
        System.out.println("guess a number");

        int count=0;
        while (true){
            int x=sc.nextInt();
            count++;
            if(x==Rand1){
                System.out.println("Welldone You Won in"+" "+count+"try");
                break;
            }
            if(x<Rand1){
                System.out.println("something bigger");
            }
            if(x>Rand1){
                System.out.println("something less");
            }
        }
    }
}
