package app;

import java.text.DecimalFormat;

public class Unit {
    private String code;
    private double value;

    public Unit(String code, double value) {
        this.code = code;
        this.value = value;
    }
    public Unit(){}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }




}
