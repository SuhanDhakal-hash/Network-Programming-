import java.io.InputStream;
import java.net.URL;

public class URLContentData {

	public static void main(String[] args) {
		String urlString = args[0];
				
		//retrieve  data from url using getContent()
		try {
			URL url = new URL(urlString);
			//Object o = url.getContent();
			
			//System.out.println(o);
			InputStream is = (InputStream)url.getContent();
			
			int c;
			while((c = is.read()) != -1) {
				char ch = (char)c;
				System.out.print(ch);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
