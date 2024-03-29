public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (value < upperLimit) {
            value++;
        } else {
            value = 0;
        }
    }

    public String toString() {
        if (value < 10) {
            return "0" + value;
        }
        return Integer.toString(value);
    }

    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        if (!(value < 0 || value > upperLimit)) {
            this.value = value;
        }
    }
}
