class Array3D
{
	public static void main(String args[])
	{
		int arr[][][] = {{{2,3,1},{2,3,4}},{{6,5,9},{8,4,5}},{{4,5,2},{3,5,7}}};
		for(int ar[][] : arr){ //row
			for(int a[] : ar){ // row
				for(int num : a){ //column
					System.out.print(num+"\t"); 
				}
				System.out.println();
			}
		System.out.println("\n");
		}
	}
}