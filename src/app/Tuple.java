package app;

public class Tuple {
    private double first;

    public void setFirst(double first) {
        this.first = first;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public void setThird(double third) {
        this.third = third;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public double getThird() {
        return third;
    }

    private double second;
    private double third;
    public  Tuple(double first, double second, double third){
        this.first = first;
        this.second = second;
        this.third = third;

    }
    public Tuple(){};

    public Tuple getTuple(){
        Tuple tuple = new Tuple(first,second,third);
        return tuple;
    }
}
