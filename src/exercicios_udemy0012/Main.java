package exercicios_udemy0012;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date = sdf.parse("21/06/2018 13:05:44");
		String title = "Traveling to New Zeeland";
		String content = "I'm going to visit this wonderful country";
		int likes = 12;
		
		Post post1 = new Post(date, title, content, likes);
		post1.addComment(c1);
		post1.addComment(c2);
		
		c1 = new Comment("Good night!");
		c2 = new Comment("May the Force be with you!");
		
		date = sdf.parse("28/07/2018 23:14:19");
		title = "Good night guys";
		content = "See you tomorrow";
		likes = 5;
		
		Post post2 = new Post(date, title, content, likes);
		post2.addComment(c1);
		post2.addComment(c2);
		
		System.out.println(post1);
		System.out.println(post2);
		
	}

}
