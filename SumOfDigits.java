import java.util.Scanner;
class SumOfDigits {
    public static void main(String args[]){
        int n,i,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        n=s.nextInt();
        while(n>0){
            i = n % 10;
            sum = sum + i;
            n= n / 10;
        }
        System.out.println("sum of given number is "+sum);
    }
}
