/* print calculate of (x,y) */
import java.io.*;

public class Java2_6
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(System.in) );

        System.out.print("Age = ");
        int x = Integer.parseInt(br.readLine());
        System.out.println("y = " + (x*365));
    }
}
