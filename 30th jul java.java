//JAVA LAB 30TH JUL

1.//append
class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("Java");
        System.out.println(sb);
    }
}

 
2. //replace
class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(1, 3, "Java");
        System.out.println(sb);
    }
}

 
3.//insert
 class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.insert(1, "Java");
        System.out.println(sb);
    }
}

 
4. //delete
class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(1, 3);
        System.out.println(sb);
    }
}

 
5. class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.reverse();
        System.out.println(sb);
    }
}

 
6. //capacity
public class buff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());
    }
}

 

7.//ensure capacity 
public class buff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

    }
}

 
8. //StringBuilder 
class Stringbuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println(sb);
        sb.replace(1, 3, "Java");
        System.out.println(sb);
        sb.insert(1, "inserted");
        System.out.println(sb);
        sb.delete(1, 3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());

    }

}

 
9.//third maximum element in array
import java.util.Scanner;
public class theory {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
    int s;
    
    System.out.println("Enter Size of Array:");
    s=ob.nextInt();
    int[] a = new int[s];
   
    System.out.println(
            "Enter the elements: ");
    for(int i=0;i<s;i++){
        a[i] = ob.nextInt();
    }
  
    for(int i=0;i<s;i++){
        for(int j=i+1;j<s5;j++){
            if (a[i]<a[j]){
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }

    }

    System.out.printf("THE THIRD MAXIMUM INTEGER IS : %d",a[2]);
    }}







