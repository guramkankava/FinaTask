package net.fina;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class PageScraper {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>(); 
		String url = "http://www.oracle.com/";
		try {
			Document document = Jsoup.connect(url).get();
			for( Element img : document.select("img")) {
				list.add(img.toString());
			}
			for( Element a : document.select("a")) {
				list.add(a.toString());
			}
			
			for ( String element : list ) {
				System.out.println(element);
			}
			System.out.println(list.size());
				
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
}
