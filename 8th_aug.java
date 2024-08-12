//JAVA LAB 8th AUGUST

public class Main {
    int x = 5;

    public static void main(String[] args) {
        Main myob = new Main();
        System.out.println(myob.x);
    }
}


2. public class Main {
    int x = 5;

    public static void main(String[] args) {
        Main myob1 = new Main();
        Main myob2 = new Main();
        System.out.println(myob1.x);
        System.out.println(myob2.x);
    }
}

 

3. public class First {
    int x = 5;
}


public class Second {
    public static void main(String[] args) {
        First ob = new First();
        System.out.println(ob.x);
    }

}

 

4.
public class Main {
    

    public static void main(String[] args) {
        Main myob = new Main();
        myob.x = 432;
        System.out.println(myob.x);

    }
}

 

5.
public class Main {
    int x = 5;

    public static void main(String[] args) {
        Main myob = new Main();
        myob.x = 432;
        System.out.println(myob.x);

    }
}

 
6.
public class Main {
    final int x = 5;

    public static void main(String[] args) {
        Main myob = new Main();
        myob.x = 432;
        System.out.println(myob.x);

    }
}

 
7.
 public class Main {
    int x = 5;

    public static void main(String[] args) {
        Main myob1 = new Main();
        Main myob2 = new Main();
        myob2.x = 25;
        System.out.println(myob1.x);
        System.out.println(myob2.x);
    }
}


 
8.
public class Main {
    int x = 5;
    String a = "hello";
    String s = "World";

    public static void main(String[] args) {
        Main myob = new Main();
        System.out.println(myob.x + " " + myob.a + myob.s);
    }
}



 

9. public class Main {
    static void meth() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        meth();
    }
}


 

10.
 public class Main {
    static void meth1() {
        System.out.println("static method can be created without object");
    }

    public static void meth2() {
        System.out.println("public method must be created with object");
    }

    public static void main(String[] args) {
        meth1();
        Main myob = new Main();
        myob.meth2();
    }}




 
11.
public class Main {
    public static void meth1() {
        System.out.println("the car is going fast");
    }

    public static void meth2(int s) {
        System.out.println("Speed :" + s + "kmph");
    }

    public static void main(String[] args) {

        Main myob = new Main();
        myob.meth1();
        ;
        myob.meth2(600);
    }
}


 
12.
public class Main {
    int x;

    public Main() {
        x = 5;
    }

    public static void main(String[] args) {
        Main myob = new Main();
        System.out.println(myob.x);
    }}

 
13.
public class Main {
    int x;

    public Main(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Main myob = new Main(5);
        System.out.println(myob.x);
    }
}
