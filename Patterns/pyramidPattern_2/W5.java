package pyramidPattern_2;
// *****
//  ***
//   *
//  ***
// *****
public class W5 {
	public static void main(String[] args) {
        int line = 5;
        int star = 5;
        int space = 0;
        for (int i =0;i<line; i++){
        	for(int k = 0; k<space;k++) {
        		System.out.print(" ");
        	}
            for(int j = 0;j<star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i<2) {
            	space++;
                star-=2;
            }
            else {
            	space--;
                star+=2;
            }          
        }
    }
}
