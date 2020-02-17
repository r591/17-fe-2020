package exception;

public class edge {
	public static void main(String[] args) {
		int i;
		for(i=2;i<10;i++)
		{
			i=i+2;
			if(i<9)
				{
				break;
			}
			for(int j=2;j<4;j++)
			{
				i=i+2;
			}
			System.out.println(i);
		}
	}
}
