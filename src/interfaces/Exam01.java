package interfaces;

interface Writable{
	public void writeBook();
	public void setBookMark();
}

abstract class Book implements Writable{
	public void writeBook() {}
}

class Ebook extends Book{
	public void writeBook() {}
	
	public void setBookMark() {}
	
	public static void main(String[] args) {
		Book b1 = new Ebook();
		b1.writeBook();
	}

}

