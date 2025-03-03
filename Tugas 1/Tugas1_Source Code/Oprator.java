public class Oprator {
    public static void main(String[] args) {

        boolean Bool1, Bool2, TF; 
        int i, j, hsl; 
        float x, y, res; 

        Bool1 = true; 
        Bool2 = false;
        
        System.out.println("Bool1 = " + Bool1);
        System.out.println("Bool2 = " + Bool2);

        TF = Bool1 && Bool2;
        System.out.println("Bool1 && Bool2 = " + TF);

        TF = Bool1 || Bool2;
        System.out.println("Bool1 || Bool2 = " + TF);

        TF = !Bool1;
        System.out.println("!Bool1 = " + TF);

        TF = Bool1 ^ Bool2;
        System.out.println("Bool1 ^ Bool2 = " + TF);

        i = 5; 
        j = 2;
        
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        hsl = i + j;
        System.out.println("i + j = " + hsl);

        hsl = i - j;
        System.out.println("i - j = " + hsl);

        hsl = i / j;
        System.out.println("i / j = " + hsl);

        hsl = i * j;
        System.out.println("i * j = " + hsl);

        hsl = i % j;
        System.out.println("i % j = " + hsl);

        x = 5; 
        y = 5;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        res = x + y;
        System.out.println("x + y = " + res);

        res = x - y;
        System.out.println("x - y = " + res);

        res = x / y;
        System.out.println("x / y = " + res);

        res = x * y;
        System.out.println("x * y = " + res);

        TF = (i == j);
        System.out.println("i == j = " + TF);

        TF = (i != j);
        System.out.println("i != j = " + TF);

        TF = (i < j);
        System.out.println("i < j = " + TF);

        TF = (i > j);
        System.out.println("i > j = " + TF);

        TF = (i <= j);
        System.out.println("i <= j = " + TF);

        TF = (i >= j);
        System.out.println("i >= j = " + TF);

        TF = (x != y);
        System.out.println("x != y = " + TF);

        TF = (x < y);
        System.out.println("x < y = " + TF);

        TF = (x > y);
        System.out.println("x > y = " + TF);

        TF = (x <= y);
        System.out.println("x <= y = " + TF);

        TF = (x >= y);
        System.out.println("x >= y = " + TF);
    }
}
