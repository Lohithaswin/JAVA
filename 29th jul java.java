//JAVA THEORY 29TH JULY

1.//ARMSTRONG NUMBER BETWEEN 2 NO’S
import java.math.*;
import java.util.Scanner;
public class theory{
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.printf("Enter the num 1:");
        int n1=ob.nextInt();
        System.out.printf("Enter the num 1:");
        int n2=ob.nextInt();
        int k;
        for(int i=n1; i<n2;i++){
         k=i; int n=0;
        while(k!=0){
             k=k/10;
            ++n;}
            k=i;
            int sum=0;
            while(k!=0){
                int d1=k%10;
            sum+=Math.pow(d1, n);
            k=k/10;

        }
        if (sum==i) {
            System.out.println(i);
            
        }
        }
    }
}
  

2.//PRINTING SQUARE
public class theory{
    public static void main(String[] args){
       for(int i=0;i<20;i++){
        System.out.print("*");}
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print("*"); 
            for (int j = 0; j < 18; j++) {
                System.out.print(" "); 
            }
            System.out.println("*"); 
        }
       
       for(int i=0;i<21;i++){
        System.out.print("*");}
       
    }}
 

3. //FINDING LCM
import java.util.Scanner;
public class theory {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter n1: ");
        int n1 = ob.nextInt();
        System.out.print("Enter n2: ");
        int n2 = ob.nextInt();

               int lcm;
               if (n1>n2){
                lcm=n1;
               }
               else{
                lcm=n2;
               }

        
        while (lcm%n1 !=0||lcm%n2 !=0) {
            lcm += (n1 > n2) ? n1 : n2; 
        }
        System.out.println(lcm);

        
    }
}







