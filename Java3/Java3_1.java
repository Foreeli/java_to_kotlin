/* print calculate of (x,y) */
import java.io.*;

public class Java3_1
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(System.in) );

        System.out.print("x = ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("y = ");
        int y = Integer.parseInt(br.readLine());

        if(x > y) System.out.println(x+ "は" +y+ "より大きい.");
    }
}
