package OOPS;

public class EncAddition
{
    private int accno;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private double amount;

    void setAccno(int accno)
    {
        this.accno=accno;
    }

    int getAccno()
    {
        return accno;
    }

}

