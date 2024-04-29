package Method;

public class CreateMethod {
    void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
    public static void main(String [] args){
    CreateMethod obj = new CreateMethod();
    obj.printNumbers();
    }
}
