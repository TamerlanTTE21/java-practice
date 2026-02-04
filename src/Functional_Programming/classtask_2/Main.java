package Functional_Programming.classtask_2;

public class Main {
    public static void main(String[] args) {
        MathFunction mathFunction = (a, b) -> {
            if (a > b) {
                return a;
        } else {
                return b;
            }
        };
        int result = mathFunction.findMax(6, 9);
        System.out.println(result);
    }

}
interface MathFunction {
    int findMax(int a, int b);
}