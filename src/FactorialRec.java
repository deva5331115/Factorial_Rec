import java.util.Scanner;

public class FactorialRec {
    static  int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        return factorial(num-1)*num;


    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        System.out.println(factorial(number));
    }
}
