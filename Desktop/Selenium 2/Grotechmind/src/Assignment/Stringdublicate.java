package Assignment;

public class Stringdublicate {
public static void main(String[] args) {
	
	String s="Bikash dhungana";
	int[] arr=new int[127];
	for (int i=0;i<s.length();i++)
	{
		arr[s.charAt(i)]=arr[s.charAt(i)]+1;
	}
	int max =-1;
	char c=' ';
	for(int i=0;i<s.length();i++)
	{
		if(max<arr[s.charAt(i)]) {
			max =arr[s.charAt(i)];
			c=s.charAt(i);
		}
	}
System.out.println("maximum repated character "+c);
}
}
