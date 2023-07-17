
public class InvertedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 10, space = 0;
		
		for(int i = row; i >= 1; i--) {
			
			for(int j = 1; j <= space; j++)
				System.out.print(" ");
			
			space++;
			
			for(int k = 1; k <= row; k++)
				System.out.print("* ");
			
			row--;
			System.out.println();
		}

	}

}
