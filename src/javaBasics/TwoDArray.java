package javaBasics;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


int i [][]= new int[2][5];

// In two D array rows and columns exists.
		
System.out.println(""+i.length);	// Displays total no. of rows.
System.out.println("" + i[0].length); // Displays total no. of columns.

//1st row
i[0][0]=1;
i[0][1]=2;
i[0][2]=3;
i[0][3]=4;
i[0][4]=5;

//2nd row
i[1][0]=11;
i[1][1]=22;
i[1][2]=33;
i[1][3]=44;
i[1][4]=55;

System.out.println("" + i[1][0]);
System.out.println("" + i[1][1]);

System.out.println("First Row");

for(int j=0;j<i.length;j++) // Row
{
	
	for(int k=0; k<i[0].length;k++) // cols
	{


	
	System.out.println("" + i[j][k]);
	
	
	}
	System.out.println("2nd Row");
}

 }
}

