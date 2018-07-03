class Demo
{
    void demoPack() throws NullPointerException
    {
        throw new NullPointerException();
    }
}
public class throwsException
{
    public static void main(String agrs[])
    {
        Demo d = new Demo();
        try
        {
            d.demoPack();
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
