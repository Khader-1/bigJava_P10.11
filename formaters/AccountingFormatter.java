package formaters;

public class AccountingFormatter extends DefaultFormatter {
    public String format(int n){
        String formatted = super.format(n);
        if(formatted.startsWith("-")){
            formatted = formatted.substring(1);
            formatted = "(" + formatted+ ")";
        }
        return formatted;
    }
}