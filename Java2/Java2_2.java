/* input number convert to int-type */
import java.io.*;

public class Java2_2
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(System.in) );

        int n = Integer.parseInt(br.readLine());
        System.out.println(n);
    }
}
