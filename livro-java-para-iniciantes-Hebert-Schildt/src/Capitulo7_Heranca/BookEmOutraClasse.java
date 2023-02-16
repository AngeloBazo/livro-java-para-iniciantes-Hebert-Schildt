package Capitulo7_Heranca;

import bookpack.Book;

public class BookEmOutraClasse {

	public static void main(String[] args) {
		
		bookpack.Book book01 = new Book("Java Book", "Olegno", 2023);
		
		book01.show();
		
		System.out.println(book01.toString());
		
	}

}
