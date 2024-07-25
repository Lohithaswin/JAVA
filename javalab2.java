//JAVA LAB 2

//Generating a random number
public class Main {
    public static void main(String[] args) {
        
        System.out.println(Math.random());
}}

//Boolean
public class Main {
    public static void main(String[] args) {
        boolean ishappy=true;
        boolean issad=false;
        System.out.println(ishappy);
        System.out.println(issad);
}}

//Comparing and returning boolean
public class Main {
    public static void main(String[] args) {
       int x=10;
       int y=9;
        System.out.println(x>y);
      
}}

//Comparing and returning boolean
public class Main {
    public static void main(String[] args) {
       int x=10;
       int y=9;
        System.out.println(x==y);
      
}}

//Comparing using if
public class Main {
    public static void main(String[] args) {
       int x=10;
       int y=9;
       if(x>y){
        System.out.println("X greater than y");
       }
}}

 //Comparing using if and else
public class Main {
    public static void main(String[] args) {
       int x=10;
       int y=19;
       if(x>y){
        System.out.println("X greater than y");
       }
       else{
           System.out.println("y greater than x");
       }
}}

//using if-else
public class Main {
    public static void main(String[] args) {
       int x=10;
      
       if(x<9){
        System.out.println("GN");
       }
       else if(x==10){
           System.out.println("GM");
       }
       else{
           System.out.println("GG");
       }
}}

//using switch case
public class Main {
    public static void main(String[] args) {
       int d=4;
     switch(d){ 
   case 1:
       System.out.println("Monday");
       break;
          case 2:
       System.out.println("Tuesday");
       break;   case 3:
       System.out.println("wednesday");
       break;   case 4:
       System.out.println("Thursday");
       break;   case 5:
       System.out.println("Friday");
       break;   case 6:
       System.out.println("Saturday");
       break;   case 7:
       System.out.println("Sunday");
       break;
       default :
       System.out.println("Enter a valid day number");}
}}

//while loop
public class prog {
    public static void main(String[] args){

        int i=0;
        while(i<5){
            System.out.println(i);
            i++;
        }
    }
    
}

//do n while loop
public class prog {
    public static void main(String[] args){
        int i=0;
        do{
            System.out.println(i);
            i++;
        }
        while(i<5);
    }}

 //for loop
public class prog {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            System.out.println(i);
            }}}

//for each loop
public class prog {
    public static void main(String[] args){

       String[] s={"Apple","Ball","Car"};
       for (String i : s) {
        System.out.println(i);
      }}}

//for loop and if with break
public class prog {
    public static void main(String[] args){
        for(int i=0;i<6;i++){
            if (i==3){break;}
            System.out.println(i);
            }}}

//for loop and if with continue
public class prog {
    public static void main(String[] args){

        for(int i=0;i<5;i++){
            if (i==3){continue;}
            System.out.println(i);
            }}}


//Getting input from user
import java.util.Scanner;
public class prog {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
String s;
System.out.println("Enter a string:");
s=ob.nextLine();
            System.out.println(s);}}




