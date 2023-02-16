package bookpack;

public class Book {

	private String title;
	private String author;
	private int pubDate;

	public Book(String t, String a, int d) {
		this.title = t;
		this.author = a;
		this.pubDate = d;
	}

	public void show() {
		System.out.print(title);
		System.out.print(", ");
		System.out.print(author);
		System.out.print(", ");
		System.out.print(pubDate);
		System.out.println();

	}

	@Override
	public String toString() {
		return "Book [title = " + title + ", author = " + author + ", pubDate = " + pubDate + "]";
	}

	
	
}
