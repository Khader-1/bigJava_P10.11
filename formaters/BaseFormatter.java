package formaters;
public class BaseFormatter implements NumberFormatter {

    private byte base;

    public BaseFormatter(byte base) {
        this.base = (byte) Math.min(36, Math.max(2, base));
    }

    /**
     * @param base the base to set
     */
    public void setBase(byte base) {
        this.base = base;
    }

    public byte getBase() {
        return base;
    }

    @Override
    public String format(int n) {
        String answer = "";
        while (n > 0) {
            answer = n % base + answer;
            n /= base;
        }
        return answer;
    }

    // 5(2)
    // 5 % 2    1
    // 2 % 2    0
    // 1 % 2    1
    

}