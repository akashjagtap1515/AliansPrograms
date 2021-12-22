package pack1;

public class OccuranceArray {

	public static void main(String[] args) {

		int a []= {2,3,4,6,8,2,3,5};
		
		for(int i =0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					a[j]=' ';
					c++;
				}

			}
			if(c>0 && a[i]!=' ')
			{
				System.out.println(a[i]+ " occures " +c);
			}
				
		}
	}

}
