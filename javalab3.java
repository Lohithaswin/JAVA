//JAVA LAB 3

//Char array into string
class main {
public static void main(String[] args) {
char[] a={'h','e','l','o','.'};
String h=new String(a);
System.out.println(h);
}
}

//SIMPLE CALCULATOR
import java.util.Scanner;
class main {
public static void main(String[] args) {
int c;
Scanner ob=new Scanner(System.in);
int a;
int b;
int f=1;
do{
System.out.println("MENU:\n1. ADDITION\n2.SUBRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.Exit\n");
System.out.println("Enter your choice:");
c=ob.nextInt();
switch(c){
case 1:
System.out.println("Enter number 1:");
a=ob.nextInt();
System.out.println("Enter number 2:");
b=ob.nextInt();
System.out.println(a+b);
break;
case 2:
System.out.println("Enter number 1:");
a=ob.nextInt();
System.out.println("Enter number 2:");
b=ob.nextInt();
System.out.println(a-b);
break;
case 3:
System.out.println("Enter number 1:");
a=ob.nextInt();
System.out.println("Enter number 2:");
b=ob.nextInt();
System.out.println(a*b);
break;
case 4:
System.out.println("Enter number 1:");
a=ob.nextInt();
System.out.println("Enter number 2:");
b=ob.nextInt();
System.out.println(a/b);
break;
case 5:
f=0;
break;
default:
System.out.println( "ENTER VALID CHOICE");
}
}
while (f==1);
}}






