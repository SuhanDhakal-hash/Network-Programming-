import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String urlString = "https://www.google.com/files?s=4&t=8#123";
			System.out.println(urlString);
			
			URL url = new URL(urlString);
			System.out.println(url);
			
			//scheme, authority, path, query string, fragment
			System.out.println();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			// TODO: handle exception
		}
	}
}
