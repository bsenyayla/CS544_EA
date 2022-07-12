package jms;


public class Calc {
    private String operator;
    private Integer value;

    public Calc() {
    }

    public Calc(String operator, Integer value) {
        this.operator = operator;
        this.value = value;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Calc{" +
                "operator='" + operator + '\'' +
                ", value=" + value +
                '}';
    }
}


