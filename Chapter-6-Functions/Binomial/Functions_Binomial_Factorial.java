public class Functions_Binomial_Factorial {

    public static int factorial(int a) {
        if (a == 0) {
            return 1;
        }
        int value = 1;
        while (a >= 1) {
            value *= a;
            a--;
        }
        return value;
    }
    public static int binomial_Factorial(int n,int r)
    {
        int a=factorial(n);
        int b=factorial(r);
        int c=factorial(n-r);

        int binomial_coefi=a/(b*c);
        return binomial_coefi;
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        int bin_Coef=binomial_Factorial( n, r);
        System.out.println("Binomial coeficient:"+bin_Coef);


    }
}