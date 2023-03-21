
interface addtion
{
    void a();
}
interface subraction
{
    void b();
}
interface multiplication
{
    void c();
}
class sample implements addtion,subraction,multiplication
{
    int christo=10,aishu=20;
    public void a()
    {
        System.out.println("10+20="+christo+aishu);
    }
    public void b()
    {
        System.out.println(christo-aishu);
    }
    public void c()
    {
        System.out.println("10*20="+christo*aishu);
    }
}
class MultDeriveTest
{
    public static void main (String[] args)
    {
        sample ob1 = new sample();
        ob1.a();
        ob1.b();
        ob1.c();
    }
}