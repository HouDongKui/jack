package ff;
public class dd {
	public static void main (String[] args) {
		int[] b=new int[100];
		int count=0;
		int num=0;
	for(int i=102; i<1000; i++)
	{
		// �ж� i �Ƿ�Ϊ����
		boolean isPrime = true;
		for(int k=2; k<i; k++)
		{
			if( i % k == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		// �������������浽����b��
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
	
	// ���ҵ���������ӡ���
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
