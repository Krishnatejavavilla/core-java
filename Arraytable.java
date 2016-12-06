package arraytable;

public class Arraytable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int table [][]=new int[3][4];
		
		for(int t=0;t<=2;t++)
		{
			for(int i=0;i<=3;i++)
			{
				table[t][i]=(t*3)+i+1;
				System.out.print(table[t][i] + " ");
				
			}
			System.out.println();
		}

	}

}
