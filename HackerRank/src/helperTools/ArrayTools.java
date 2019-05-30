package helperTools;

public class ArrayTools {
	
	public static void printArr(int[] arrToPrint) {
    	System.out.println("--- NEW PRINT ---");
    	for(int i = 0; i < arrToPrint.length; i++) {
    		System.out.print(arrToPrint[i] + " ");
    	}
    	System.out.println();
    }
}
