import java.net.URL;

public class RelativeURLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String urlString = "https://www.bibektripathi.com.np";
		try {
			URL url = new URL(urlString);
			System.out.println(url);
			
			//String urlStringBooks = urlString + "/books";
			//relative url construction 
			String books = "/books";
			URL urlBooks = new URL(url, books);
			System.out.println(urlBooks);
			
			String category = "/category";
			URL urlCategory = new URL(url, category);
			System.out.println(urlCategory);
			
			URL newCategory = new URL(urlBooks, category);
			System.out.println(newCategory);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			// TODO: handle exception
		}
	}

}
