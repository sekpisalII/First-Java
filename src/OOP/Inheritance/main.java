package OOP.Inheritance;
 interface MathSolver {
    // Calculates the sum of variable number of integers
    Integer sum(Integer... numbers);
    // Subtracts two integers
    Integer subtract(Integer a, Integer b);
    // Multiplies two integers
    Integer multiply(Integer a, Integer b);
}
class MathSolverImp implements MathSolver {
    @Override
    public Integer sum(Integer... numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
    @Override
    public Integer subtract(Integer a, Integer b) {
        return a - b;
    }
    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }
}
public class main {
    public static void main (String[] args) {
        MathSolver solver = new MathSolverImp();
        Integer sumResult = solver.sum(5, 10, 15);
        System.out.println(STR."Sum: \{sumResult}");
        Integer subtractResult = solver.subtract(30, 20);
        System.out.println(STR."Difference: \{subtractResult}");
        Integer multiplyResult = solver.multiply(7, 8);
        System.out.println(STR."Product: \{multiplyResult}");
    }
}