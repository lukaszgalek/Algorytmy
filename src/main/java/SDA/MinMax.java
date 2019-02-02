package SDA;

public class MinMax {
    private int max;
    private int min;
    private int indexMax;
    private int indexMin;



    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public int getIndexMax() {
        return indexMax;
    }

    public int getIndexMin() {
        return indexMin;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setIndexMax(int indexMax) {
        this.indexMax = indexMax;
    }

    public void setIndexMin(int indexMin) {
        this.indexMin = indexMin;
    }

    @Override
    public String toString() {
        return "MinMax{" +
                "max=" + max +
                ", min=" + min +
                ", indexMax=" + indexMax +
                ", indexMin=" + indexMin +
                '}';
    }
}
