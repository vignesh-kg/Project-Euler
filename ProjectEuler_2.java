package nevshig.euler;

public class ProjectEuler_2 {

	public static void main(String[] args) 
	{
		int fn0=0;
		int fn1=2;
		
		
		int fn=0;
		int sum=fn1;
		
		do
			{
		fn=4*fn1+fn0;
		sum=sum+fn;
		fn0=fn1;
		fn1=fn;
		}while(sum<4000000);
			
		
		System.out.println(sum);
	}

}
