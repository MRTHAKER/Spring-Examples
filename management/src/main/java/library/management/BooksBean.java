package library.management;

public class BooksBean {
	String BookName,BookAuthorName,BookTitle,PublisherName,Edition;
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookAuthorName() {
		return BookAuthorName;
	}
	public void setBookAuthorName(String bookAuthorName) {
		BookAuthorName = bookAuthorName;
	}
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	public String getPublisherName() {
		return PublisherName;
	}
	public void setPublisherName(String publisherName) {
		PublisherName = publisherName;
	}
	public String getEdition() {
		return Edition;
	}
	public void setEdition(String edition) {
		Edition = edition;
	}
	public boolean isEBookAvailable() {
		return EBookAvailable;
	}
	public void setEBookAvailable(boolean eBookAvailable) {
		EBookAvailable = eBookAvailable;
	}
	public int getNumberOfCopies() {
		return NumberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		NumberOfCopies = numberOfCopies;
	}
	boolean EBookAvailable;
	int NumberOfCopies;
}
