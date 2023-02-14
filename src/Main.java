public class Main {
    public static void main(String[] args) {
        int x = -24;
        int y = -15;

        System.out.println(dvigubaSuma(2, 5));

        System.out.println (dvigubaSuma(x, y));

        int rezultatas1 = dvigubaSuma(2, 5);
        System.out.println(rezultatas1);
        int rezultatas2 = dvigubaSuma(x, y);
        System.out.println(rezultatas2);
    }

    public static int dvigubaSuma(int  a,  int b) {
        int rezultatas;
        rezultatas = 2 * (a + b);
        return rezultatas;
    }
    public static int kitaDvigubaSuma(int a, int b){
        return 2 * (a + b);
    }
}