package InnerClass;

public class Helper {
    static class math{
        public int sub(int a, int b ){
            return a-b;
        }
        public int multi(int a, int b){
            return a*b;
        }
    }
    public class currencyEx {
        public void fromRielToDollar(float riel){
            System.out.println("Exchanged fromm riel to dollar: " + riel/4000);
        }
        public void fromDollarToRiel(float dollar){
            System.out.println("Exchanged fromm dollar to riel: " + dollar * 4000);
        }
    }
}
