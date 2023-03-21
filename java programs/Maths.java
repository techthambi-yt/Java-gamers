interface addtion
{
    void x();
}
interface subraction
{
    void y();
}
interface multiplication
{
    void z();
}
class summa implements addtion,multiplication,subraction
{
   public void x()
    {
        System.out.println("this is addtion");
    }
   public void y()
    {
        System.out.println("this is subraction");
    }
   public void z()
    {
        System.out.println("this is multiplication");
    }
}
public class Maths
{
    public static void main(string[] args)
    {
    summa obj= new summa();
    obj.x();
    obj.y();
    obj.z();
    }
}