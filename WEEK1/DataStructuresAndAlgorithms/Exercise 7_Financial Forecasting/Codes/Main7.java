import java.util.Scanner;

public class Main7 {

    public static double futureValue(double pv, double gr, int p) {
        if (p == 0) {
            return pv;
        }
        return futureValue(pv * (1 + gr), gr, p - 1);
    }

    public static double futureValueFastOptim(double pv, double gr, int p) {
        return pv * power(1 + gr, p);
    }

    private static double power(double b, int e) {
        if (e == 0) return 1;
        double half = power(b, e / 2);
        return (e % 2 == 0) ? half * half : b * half * half;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the present value: ");
        double pv = sc.nextDouble();

        System.out.print("Enter the growth rate: ");
        double gr = sc.nextDouble();

        System.out.print("Enter the number of p: ");
        int p = sc.nextInt();

        double fv1 = futureValue(pv, gr, p);
        double fv2 = futureValueFastOptim(pv, gr, p);

        System.out.println("Recursive Future Value: " + fv1);
        System.out.println("Optimized Recursive Future Value: " + fv2);

        sc.close();
    }
}
