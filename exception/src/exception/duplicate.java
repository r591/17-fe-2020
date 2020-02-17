package exception;

public class duplicate {

public static void main(String[] args) {
	int a[]= {4,6,8,9,6,7};
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==6)
		{
			count=count+1;
			System.out.println(a[i]);
		}
	}
System.out.println(count);
}

}
