package formaters;

public class DefaultFormatter implements NumberFormatter{

    @Override
    public String format(int n) {
        return n + "";
    }

}