
public class MultidimensionalArray {
	public static void main(String[] args) {
		int[] oneDimensionalArray= {12,23,45};
		System.out.println(oneDimensionalArray[1]);

		//multidimensional array
		int [][] multiDimensionalArray={{12,23,45},{4,5,7,8},{45,56,78,44}};
		System.out.println(multiDimensionalArray[1][3]);
		
		double[][] doublearray= new double[4][2];
		doublearray[3][1]=2.6;
		System.out.println(doublearray[3][1]);
		
		//iterate through multidimArray
		for(int array=0; array<multiDimensionalArray.length;array++) {
			for(int  item=0;item<multiDimensionalArray[array].length;item++) {
				System.out.print(multiDimensionalArray[array][item]+"\t");
			}
			System.out.println();
		}
	}

}
