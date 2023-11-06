package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!"); // FAZER BOA VIAGEM!
		Comment c2 = new Comment("Wow that's awesome!"); // UAU, ISSO É INCRÍVEL
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"),
				"Traveling to new Zealand", // VIAJAR PARA NOVA ZELANDIA
				"I'm going to visit this wonderful country!", // VOU VISITAR ESTE PAÍS MARAVILHOSO!
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good nigth!"); // FAZER BOA VIAGEM!
		Comment c4 = new Comment("May the Force be with you!"); // QUE A FORÇA ESTEJA COM VOCE
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"),
				"Good nigth guys", // BOA NOITE GALERA
				"See you tomorrow", // VEJO VOCÊ AMANHA
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
