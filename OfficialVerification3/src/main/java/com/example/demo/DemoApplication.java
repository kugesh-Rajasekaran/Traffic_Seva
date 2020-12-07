                                    
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;

public class Demo {
public static void main(String[] args)
{ try {
Date mydate = new Date(System.currentTimeMillis());

URL url = new URL("https://global.datagenit.com/API/sms-api.php?auth=xxxxx&senderid=xxxxx&msisdn=xxxxxx&message=Hello);
HttpURLConnection conn = (HttpURLConnection)url.openConnection();
conn.setRequestMethod("GET");
conn.setDoOutput(true);
conn.setDoInput(true);
conn.setUseCaches(false);
conn.connect();
BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
String line;
StringBuffer buffer = new StringBuffer();
while ((line = rd.readLine()) != null)
{
buffer.append(line).append("\n");
}
System.out.println(buffer.toString());
rd.close();
conn.disconnect();
}catch(Exception e)
{e
.printStackTrace();
}
}}