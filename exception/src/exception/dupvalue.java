package exception;

import java.util.HashMap;

public class dupvalue {

public static void main(String[] args) {
	String a[] ={"2","3","2","4"};
	HashMap<String ,Integer> hm=new HashMap<>();
	for(String s:a)
	{
		if(hm.containsKey(s)) {
			hm.put(s,hm.get(s)+1);
			System.out.println(hm);
		}
		else
		{
			hm.put(s,1);
		}
	}
	//System.out.println(hm);
		
}

}
