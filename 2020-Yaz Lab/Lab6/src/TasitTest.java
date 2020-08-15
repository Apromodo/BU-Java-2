
public class TasitTest
{
    public static void main(String args[])
    {
        ITasit tasitAudi = new Audi();
        ITasit tasitHyundai = new Hyundai();
        System.out.println(tasitAudi.getMarka()+"   "+ tasitHyundai.getMarka());
    }
}