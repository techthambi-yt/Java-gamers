class Day3assignment4
{
    public static int fun(int n)
    {
        if (n <= 1)
            return n;
        return n + fun(n - 1);
    }
    public static void main(String args[])
    {
        int n = 10;
        System.out.println(fun(n));
    }
}