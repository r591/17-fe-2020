package exception;

import java.util.Arrays;

public class seclargest {

public static void main(String[] args) {
	int a[]= {6,9,4,2,89};
	int i;
	for( i=0;i<a.length;i++)
	{
		System.out.println(a);
	}
Arrays.sort(a);
//for(int i1:a)
//{
	//System.out.println(i1);
//}

System.out.println("second largest no"+a[a.length-2
                                         ]);
}
}
