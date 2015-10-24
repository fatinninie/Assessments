import java.io.IOException;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
/**
 *
 * @author Fatin Nurhanini binti Rusli
 */
public class Assignment2 
{
    public static void main(String[] args) 
    {
        Document doc = null;
        try
        {
            //get page
            doc = (Document) Jsoup.connect("http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html").get();
        } catch (IOException ex) 
        {
            ex.printStackTrace();
        }
        
        //Get Element with specific ID
        Element table = doc.getElementById("mytable");
        
        //Get text inside Element 
        Elements rows = table.getElementsByTag("TR");
        for (Element row : rows) 
        {
                Elements tds = row.getElementsByTag("TD");
                for (int i = 0; i < tds.size(); i++) 
                {
                        if (i == 1) System.out.println(tds.get(i).text());
                }
        }
    }
}