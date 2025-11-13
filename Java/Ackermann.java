public class Ackermann {
    
    public static int ackermann(int m, int n) {
        if (m == 0) 
            return n + 1;
        else if (n == 0)
            return ackermann(m - 1, 1);
        else
            return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {
        int result = ackermann(1, 2);
        System.out.println("Ackermann(1, 2) = " + result);
    }
}