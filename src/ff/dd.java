package ff;
public class dd {
	public static void main (String[] args) {
		int[] b=new int[100];
		int count=0;
		int num=0;
	for(int i=102; i<1000; i++)
	{
		// 判断 i 是否为质数
		boolean isPrime = true;
		for(int k=2; k<i; k++)
		{
			if( i % k == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		// 如果是质数，则存到数组b里
		if( isPrime )
		{
			b[count] = i;
			count ++;
			if(count >= b.length)
			{
				break;
			}
		}
	}
	
	// 把找到的质数打印输出
	for(int i=0; i<count; i++)
	{
		System.out.print( b[i] +", ");
		num=num+1;
		if (num%10==0) {
			System.out.println();
		}
	}
	
	
	}

}
