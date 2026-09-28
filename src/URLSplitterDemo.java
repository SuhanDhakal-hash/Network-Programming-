import java.net.URL;

public class URLSplitterDemo {

	public static void main(String[] args) {
		try {
			String urlString = "https://www.sumanprasadyadav.co.uk:5680/files/abcd/efgh?#123";
			URL url = new URL(urlString); 
			
			//printing the parts of the url
			//print scheme/protocol 
			System.out.println("Scheme: " + url.getProtocol());
			
			//printing authority 
			System.out.println("Authority: " + url.getAuthority());
			
			//printing path
			System.out.println("Path: " + url.getPath());
			
			//printing default port number 
			System.out.println("Default Port Number: " + url.getDefaultPort());
		
			//print port 
			System.out.println("Port Number : " + url.getPort());
			
			//print query string
			System.out.println("Query String : " + url.getQuery());
			
			//print fragment
			System.out.println("Fragment : " + url.getRef());
			
			System.out.println("User Info: " + url.getUserInfo());
			System.out.println("Host Name: " + url.getHost());
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
