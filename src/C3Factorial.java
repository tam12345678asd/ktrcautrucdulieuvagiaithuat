public class C3Factorial {
//      Factorial(n)
//     IF n = 0 OR n = 1 THEN
//         RETURN 1
//     END IF
//     RETURN n × Factorial(n - 1)

    public static long factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
