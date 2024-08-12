//JAVA LAB 6th AUGUST

1. class Student{
    public String n;
    Student(String n){
        this.n=n;
    }
    public String toString(){
        return n;
    }
}
class main{
    public static void main(String args[]){
        Student[] ob=new Student[]{new Student("Dharma"),new Student("snvi"),new Student("Rupa"),new Student("Ajay")};
        for(Student m:ob){
            System.out.print(m+" ");
        }
    }
}



 
2. public class ex5 {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        System.out.println("You are trying to access element out of array size");
        System.out.println(arr[5]);
    }
}

 
3. public class Ex6 {
    public static void main(String[] args) {
        int[][] arr = new int[10][20];
        arr[0][0] = 1;
        System.out.println(arr[0][0]);
    }

}

 
4. public class Ex6 {
    public static void main(String[] args) {
        int[][][] arr = new int[10][20][15];
        arr[0][0][0] = 1;
        System.out.println(arr[0][0][0]);
    }

}


 

5. class test{
    public static void main(String args[]){
        int[] a={3,2,1,4,5};
        sum(a);
    }
    public static void sum(int[] a){
        int s=0;
        for(int i=0;i<a.length;i++){
            s=s+a[i];
        }
        System.out.println(s);
    }
}
 

6.public class Main {
    public static void main(String [] args) {
        int[]arr={1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum += arr[i];}
            System.out.println(sum);
       
    }
}
 
7. class test{
    public static void main(String args[]){
        int a[]=m();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int[] m(){
        return new int[]{1,2,3};
    }
}
 
8. public class Main {
    public static void main(String[] args) {

        int intarr[] = new int[3];
        byte byt1arr[] = new byte[3];
        short shortsarr[] = new short[3];
        String[] strarr = new String[3];
        System.out.println(intarr.getClass());
        System.out.println(byt1arr.getClass().getSuperclass());
        System.out.println(shortsarr.getClass());
        System.out.println(strarr.getClass());
    }
}

 
9. public class Main {
    public static void main(String[] args) {
        int intarr[] = { 1, 2, 3 };
        int carr[] = intarr.clone();
        System.out.println(intarr == carr);
        for (int i = 0; i < carr.length; i++) {
            System.out.println(carr[i] + " ");

        }
    }
}

 
10. public class Main {
    public static void main(String[] args) {
        int intarr[][] = { { 1, 2, 3 }, { 4, 5 } };
        int carr[][] = intarr.clone();
        System.out.println(intarr == carr);
        System.out.println(intarr[0] == carr[0]);
        System.out.println(intarr[1] == carr[1]);

    }
}
