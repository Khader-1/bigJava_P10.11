package formaters;

public class DecimalSeparatorFormatter extends DefaultFormatter {
    //20000
    //20,000
    @Override
    public String format(int n) {
        char[] formated = super.format(n).toCharArray();
        String dFormated = "";
        for (int i = 0; i < formated.length; i++) {
            if((formated.length - i) % 3 == 0)
                dFormated += ",";
            dFormated += formated[i];
        }
        return dFormated;
    }

}