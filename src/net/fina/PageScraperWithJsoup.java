package net.fina;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class PageScraperWithJsoup {
	
	public static void main(String[] args) {
		String url = "http://localhost:8080/Tester/index.jsp";
		try {
			Document doument = Jsoup.connect(url).get();
			System.out.println(doument.title());
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
}
