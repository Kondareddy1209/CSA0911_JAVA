import java.util.*;
class Pyramid{
    public static void main(String args[]){
        int i,j,r;
        Scanner s=new Scanner(System.in);
        System.out.println("enter no.of rows");
        r=s.nextInt();
        for(i=0;i<r;i++){
            for(j=(r-i);j>0;j--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}