// CS210 Assignment #2 "Space Needle"
// Student name

public class SpaceNeedle {
	
	final static int SIZE = 5;
	
    public static void main(String[] args) {
        drawSpaceNeedle();
    }

    public static void drawSpaceNeedle() { // this method pulls together all the other methods into one draw space needle function
        tipOfNeedle();
        topAndBottomOfNeedle();
        midLine();
        bottomHalf();
        tipOfNeedle();
        body();
        topAndBottomOfNeedle();
        midLine();
    	
    }
    public static void tipOfNeedle() { // this function is used for the tip of the space needle as well as the part right below the dome of the space needle
    	
    	for(int i = 1; i <= SIZE; i++) {
    		
    		for(int space = 1; space <= SIZE*3; space ++) {
    			
    			System.out.print(" ");
    			
    			}
    		
    		System.out.println("||");
    		
    		}
    	
    	}
    
    public static void topAndBottomOfNeedle() { // this method creates the pattern that is seen at the top half of the dome and the base of the space needle
    	
    	for(int line = 1; line <= SIZE; line++) {
    		
    		for(int space = 1; space <= SIZE - line; space++ ) {
    			
    			System.out.print("   "); // spaces before pattern
    			}
    		
    		System.out.print("__/"); // starting part of dome
    		
    		for(int j = 1; j <= line - 1; j++) {
    			
    			System.out.print(":::"); // semicolons inside dome
    			}
    		
    		System.out.print("||"); // middle of dome
    		
    		for(int k = 1; k <= line - 1; k++) {
    			
    			System.out.print(":::"); // right part of semicolons
    			}
    		
    		System.out.println("\\__"); // end of dome
    		}	
    
    }
    
    public static void midLine(){ // this method creates the mid-line of the dome with the quotes (")
    	
    	System.out.print("|");
    	
    	for(int i = 1; i <= SIZE * 3; i++) {
    	
    		System.out.print("\"\"");
    	}
    	
    	System.out.println("|");
    }
    
    public static void bottomHalf() { // this method creates the bottom half of the dome 
    	
    	for(int line = 1; line <= SIZE; line++) {
    		
    		for(int s = 1; s <= line*2 - 2; s++) {
    	
    			System.out.print(" ");
    		}
    		
    	System.out.print("\\_");
    	
    	for(int i = 1; i <= (SIZE * 3 + 1) - (line * 2); i++) {
    		System.out.print("/\\");
    		
    	}
    	System.out.println("_/");
    	
    	
    	}
    }
    
     public static void body() { // this method creates the body of the space needle
    	 
    	 for(int line = 1; line <= SIZE * SIZE; line++) {
    		 
    		 for(int s = 1; s <= (SIZE * 3 - 3); s++) {
    			 
    			 System.out.print(" ");
    		 }
    		 
    		 System.out.println("|%%||%%|");
    	 }
     }
    
    	
}
