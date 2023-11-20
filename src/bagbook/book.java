package bagbook;

public class book {
	
	String book_name;
	int book_id;
	double price;
    book(String book_name,int book_id,double price)
    {
    	this.book_name=book_name;
    	this.book_id=book_id;
    	this.price=price;
    }
      public String getbookname()
      {
    	  return book_name;
      }
      public void setbookname(String book_name)
      {
    	  this.book_name=book_name;
    }
      public int getbookid()
      {
    	 return book_id;
      }
      public double getprice()
      {
    	  return price;
      }
}
