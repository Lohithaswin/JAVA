//JAVA LAB 1ST AUGUST

1.//StringTokenizer
import java.util.StringTokenizer;

public class simple {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My name is khan", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }

}


 
2. 
import java.util.StringTokenizer;

public class simple {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My,name,is,khan");
        System.out.println("next token is:" + st.nextToken(","));

    }

}


 

3.//bigger string 
import java.util.StringTokenizer;

public class simple {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(
                "My name is khan wewjhe 0oijwioejwiefw jeowjefojwoejfjwefjwj efojweojowejfowj ojweofjwoefjoiwe jfoijweojwe fjowejfeoi wjeijeijiowejidjj ejjio2j poqjsdojqodj    oqwjdo  qiojoqejijroi   ",
                " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }

}


 

4.//hasMoreElements
 import java.util.StringTokenizer;

public class simple {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(
                "My name is khan ",
                " ");
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken());
        }

    }

}
 

5.//nextElement
import java.util.StringTokenizer;

public class simple {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(
                "My name is khan ",
                " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextElement());
        }

    }

}

 

6.//countTokens()
import java.util.StringTokenizer;

public class simple {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(
                "My name is khan ",
                " ");

        System.out.println(st.countTokens());

    }

}
 

7.//array
import java.util.StringTokenizer;

public class ex1 {
    public static void main(String[] args) {
        int arr[] = new int[5];

        arr[0] = 1;
        arr[1] = 45;
        arr[2] = 3;
        arr[3] = 34;
        arr[4] = 34;
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

    }

}


 
8. //creating multiple class and object

public class student {
    public int rno;
    public String name;

    student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }
    public void print() {
        System.out.println("Student{rno=" + rno + ", name='" + name + "'}");
    }
}


 class ex2 {
    public static void main(String[] args) {
        student[] arr1;
        arr1 = new student[5];
        arr1[0] = new student(1, "aman");
        arr1[1] = new student(2, "ms");
        arr1[2] = new student(3, "vk");
        arr1[3] = new student(4, "rohith");
        arr1[4] = new student(5, "klr");
        for (int i = 0; i < 5; i++) {
           arr1[i].print();
        }
    }
}








