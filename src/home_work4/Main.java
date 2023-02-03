package home_work4;

public class Main {
    public static void main(String[] args){
        int e = 10;
        int f = -88;
        boolean n1= true;


        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e +92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);

        System.out.println("and");

        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}

