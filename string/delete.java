# Check number in the string and skip equalent charecters
package ObjectOrientedProgramming;
// Given:  ab3xympr2ktp
// Output: abprp

public class Stringg3delete
{
    public static void main(String[] args)
    {
        String str = "ab3xympr2ktp";
        String g = "";
        int i;
        for (i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
            {
                int num = str.charAt(i) - 48;
                i = i + (num + 1);
            }
            g = g + str.charAt(i);
        }
        System.out.println(g);
    }
}
