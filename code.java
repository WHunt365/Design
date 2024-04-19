package franceearray;

public class code {
	 private String []Barcode = {"01","02","03","04"};
	 private String []Product = {"album","pc","ticket","poster"};
	 
	 public String product ="";
	 public String getproduct()
	 {
		 return product;
	 }
			 public void SearchBarcode(String barcode)
			 {
				 for(int i=0; i< Barcode.length;i++)
				 {
					 if(barcode.equalsIgnoreCase(Barcode[i]))
				
				 {
				 
					 product = Product[i];
					 break;
				 }
					 product ="Product Not Found";
		}
	}
			 public static void main(String[] args) {
				 code pos=new code();
				 pos.SearchBarcode("6");
				 System.out.println("Product"+ pos.getproduct());
			 }
	}
