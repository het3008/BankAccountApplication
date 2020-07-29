package utilities;
import java.io.*;
import java.util.*;

public class CSV {
    // This function  will read data from a CSV file and return as a list
    public static List<String[]>read(String file) throws Exception
    {
List<String[]>data= new LinkedList<String[]>();
String dataRow;
BufferedReader br=new BufferedReader(new FileReader(file));
 while((dataRow=br.readLine()) !=null)
        {
            String dataRecords[] = dataRow.split(",");
            data.add(dataRecords);
        }
        return data;

    }

}
