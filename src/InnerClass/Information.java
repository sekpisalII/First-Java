package InnerClass;
import javax.swing.undo.CannotUndoException;
public class Information {
    public static void main(String[] args) {
        Helper helper = new Helper();
        Helper.currencyEx currencyE = helper.new currencyEx();
       currencyE.fromRielToDollar(1000);
       currencyE.fromDollarToRiel(1000);
    }
}
