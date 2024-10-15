package OOPS;

public class AccountMain
{
    public static void main(String[] args)
    {
        EncAddition enc = new EncAddition();
        enc.setAccno(101);
        System.out.println(enc.getAccno());
        enc.setAmount(100);
        System.out.println(enc.getAmount());
        enc.setName("sa");
        System.out.println(enc.getName());
    }

}
