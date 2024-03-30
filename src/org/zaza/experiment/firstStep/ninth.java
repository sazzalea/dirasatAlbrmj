public class ninth {
	
	public static void main(String []Arg) {
		
		int Odd = 0;
		int multiple5 = 0;
		int multiple7 = 0;
		for(int i = 0; i < 100; i++) {
			if (i % 2 == 1) {
				//System.out.println(i);
				if ((i % 5 == 0) && (i % 7 == 0 )) {
					System.out.println(i + ": multiple5 and multiple7");
				}
				else if (i % 5 == 0) {
					System.out.println(i + ": multiple of 5");
				}
				else if (i % 7 == 0) {
					System.out.println(i + ": multiple of 7");
				}
				else {
					System.out.println(i);
				}
					
			}
		
			}
			
		}
			
	}
	
