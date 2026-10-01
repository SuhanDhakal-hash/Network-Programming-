import java.io.InputStream;
import java.net.URL;


//program to retreive data from getContent

public class ContentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url=new URL("https://www.google.com");
			Object o=url.getContent();
			
			InputStream is =(InputStream)o;
			int c;
			while((c=is.read())!=-1) {
				char ch=(char)c;
				System.out.print(ch);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());


}
	}

}
