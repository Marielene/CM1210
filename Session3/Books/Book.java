public class Book{
	private String btitle;
	private String bbarcode;
	public Book(String iTitle, String iBarcode){
		btitle=iTitle;
		bbarcode=iBarcode;
	}
	public String getTitle(){
		return btitle;
	}
	public String getBarcode(){
		return bbarcode;
	}
	public String toString(){
		String s= btitle + "\t Barcode: " + bbarcode;
		return s;
	}
  }