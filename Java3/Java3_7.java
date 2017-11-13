/* print calculate of (x,y) */
import java.io.*;

public class Java3_7
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader(System.in) );

        System.out.print("case = ");
        int select = Integer.parseInt(br.readLine());

        System.out.print("score = ");
        int score = Integer.parseInt(br.readLine());

        switch(select) {
          case 1:
            if(score>=60) System.out.println("合格");
            else System.out.println("不合格");
            break;
          case 2:
            if(score>=80) System.out.println("たいへんよくできました");
            else if(score>=60 && score<80) System.out.println("よくできました");
            else System.out.println("ざんねんでした");
            break;
          case 3:
            if(score>=80) System.out.println("優");
            else if(score>=70 && score<80) System.out.println("良");
            else if(score>=60 && score<70) System.out.println("可");
            else System.out.println("不可");
            break;
        }
    }
}
