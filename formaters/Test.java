package formaters;

public class Test {
    public static void main(String[] args) {
        NumberFormatter[] formatters = new NumberFormatter[7];
        System.out.println("\n\n");

        formatters[0] = new DefaultFormatter();

        formatters[1] = new DecimalSeparatorFormatter();

        formatters[2] = new BaseFormatter((byte) 2);

        formatters[3] = new BaseFormatter((byte) 16);

        formatters[4] = new BaseFormatter((byte) 10);

        formatters[5] = new AccountingFormatter();

        formatters[6] = new AccountingFormatter();


        System.out.println("default 15 : " + formatters[0].format(15));
        System.out.println("decimal separator 2000065 : " + formatters[1].format(2000065));
        System.out.println("Base(2) 5 : " + formatters[2].format(5));
        System.out.println("Base(16) 20 : " + formatters[3].format(20));
        System.out.println("Base(10) 783 : " + formatters[4].format(783));
        System.out.println("Accounting -241 : " + formatters[5].format(-241));
        System.out.println("Accounting 241 : " + formatters[6].format(241));

    }
}