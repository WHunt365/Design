package design;

public class row {

	public static void main(String[] args) {
		int [][] n = {{5,4,0,3,1,0,},
		{3,4,5,8,9,1},
		{3,6,5,7,9,0},
		{2,4,7,9,2,10}};
		 for(int r =0;r < n.length; r++) 
		 {
			 for(int c =0;c < n[r].length;c++)
				 System.out.print(n[r][c] + "  ");
			 System.out.println();
		 }	 
		 }

	}


