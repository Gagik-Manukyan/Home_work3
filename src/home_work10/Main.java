package home_work10;

public class Main {
    //I know the answer but I don't know how to type it myself
    public static void main(String[] args){
        int result = showTotalAmount(100);
    }

    public static int showTotalAmount( int x) {
        int result = 0;
        for (int i = 1; i < x; i++) {
            result = i;
            System.out.println(result);

        }
        return result;
    }
}