package model;

public class Calculator {
    private Float input;
    private Float output;
    private Float amount;

    public Calculator() {
    }

    public Calculator(Float input, Float output,  Float amount) {
        this.input = input;
        this.output = output;
        this.amount = amount;
    }

    public Float getInput() {
        return input;
    }

    public void setInput(Float input) {
        this.input = input;
    }

    public Float getOutput() {
        return output;
    }

    public void setOutput(Float output) {
        this.output = output;
    }


    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
