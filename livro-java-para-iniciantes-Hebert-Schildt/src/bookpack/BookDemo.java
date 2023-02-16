package bookpack;

import java.util.Arrays;

public class BookDemo {

	public static void main(String[] args) {

		Book books[] = new Book[5];

		books[0] = new Book("Java", "Schildt", 2014);
		books[1] = new Book("JVC", "Schildt", 2000);
		books[2] = new Book("HTML", "Schildt", 2023);
		books[3] = new Book("Orkut", "Schildt", 2017);
		books[4] = new Book("Treze", "Schildt", 2012);

		for (int i = 0; i < books.length; i++)
			books[i].show();

	}

}
