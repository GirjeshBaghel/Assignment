package Books;

public class Book_Data {
	private String Book_id;
	private String Book_Title;
	private String Book_Author;
	private String Book_Category;
	private float Book_Price;
	public String getBook_id() {
		return Book_id;
	}
	public Book_Data(String book_id, String book_Title, String book_Author, String book_Category, float book_Price) {
		super();
		Book_id = book_id;
		Book_Title = book_Title;
		Book_Author = book_Author;
		Book_Category = book_Category;
		Book_Price = book_Price;
	}
	public void setBook_id(String book_id) {
		Book_id = book_id;
	}
	public String getBook_Title() {
		return Book_Title;
	}
	public void setBook_Title(String book_Title) {
		Book_Title = book_Title;
	}
	public String getBook_Author() {
		return Book_Author;
	}
	public void setBook_Author(String book_Author) {
		Book_Author = book_Author;
	}
	public String getBook_Category() {
		return Book_Category;
	}
	public void setBook_Category(String book_Category) {
		Book_Category = book_Category;
	}
	public float getBook_Price() {
		return Book_Price;
	}
	public void setBook_Price(float book_Price) {
		Book_Price = book_Price;
	}
	
	@Override
	public String toString() {
		return "Book_Data [Book_id=" + Book_id + ", Book_Title=" + Book_Title + ", Book_Author=" + Book_Author
				+ ", Book_Category=" + Book_Category + ", Book_Price=" + Book_Price + "]";
	}
	public Book_Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
