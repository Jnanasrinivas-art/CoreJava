package OOPS;

public class Constructors
{
    int sid;
    String name;

    char crole;
    Constructors(int ssid,String sname,char role)
    {
       sid=ssid;
       name=sname;
       crole=role;
    }

    void printData()
    {
        System.out.println(sid+" "+name+" "+crole+" ");
    }

    public static void main(String[] args)
    {
        Constructors cs = new Constructors(1,"srinivas",'P');
        cs.printData();
    }

}
