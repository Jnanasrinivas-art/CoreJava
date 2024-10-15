public class ThisKeyword
{
    int x,y ; // class variables/instance variables

    ThisKeyword(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    void setData(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args)
    {
         ThisKeyword th = new ThisKeyword(100,200);
         th.display();
//       ThisKeyword th1 = new ThisKeyword();
//       th1.setData(10,20);
//       th1.display();

    }
}
