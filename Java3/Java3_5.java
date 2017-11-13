/* print calculate of (x,y) */
import java.io.*;

public class Java3_5
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(System.in) );

        System.out.print("num = ");
        int x = Integer.parseInt(br.readLine());

        if(x%2 == 0) System.out.println(x+ " : 偶数");
        else System.out.println(x+ " : 奇数");
    }
}
