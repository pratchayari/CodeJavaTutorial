import java.util.Scanner;
public class ifAct {
    public static void main(String[] args) {
        int score ;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your score : ");
        score = in.nextInt();
        if (score >= 60) {
            System.out.println("your score : " +score+ " result is : pass" );
        }else{
            System.out.println("your score : " +score+ " result is : not pass" );
        }
    }
    
}
