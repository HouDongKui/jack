package ff;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class plus3 {
	/*����һ ��2~1000֮�����������������õĽ�����浽PRIME.DAT�ļ���*/  
	public void One() throws FileNotFoundException, IOException {       
		FileOutputStream full= new FileOutputStream("D:\\PRIME.DAT");      
		int a=2;        
		full.write(String.valueOf(a).getBytes());       
		full.write(" ".getBytes());       
		a=3;       
		full.write(String.valueOf(a).getBytes());       
		full.write(" ".getBytes());        
		for(int i = 3; i <= 1000; i++) {            
			for(int j = 2; j <= i/2; j++) {               
				if(i%j == 0) {                    
					break;}               
				if(j == i/2) {                    
					//System.out.println("1000��������:" + i);                  
					full.write(String.valueOf(i).getBytes());
					full.write(" ".getBytes());                
					}           
				}        
			}        
		full.close();    
		}    
	/*��������C�̸�Ŀ¼��CONFIG.SYS�ļ��Ƿ����, ��������ʾ���ļ������ƺ����ݡ�*/   
	public void Two() throws FileNotFoundException, IOException {        
		String filePath1 = "C:\\CONFIG.SYS" ;       
	    //String filePath2 = "D:\\users.txt";       
		String filePath3 = "D:\\PRIME.DAT";       
		File b= new File(filePath3);        
		if(b.exists()) {            
			System.out.println("�ļ�����Ϊ��" + b.getName());           
			FileInputStream fis = new FileInputStream(b);           
			byte[] data = new byte[(int)b.length()];           
			fis.read(data);           
			fis.close();           
			String msg = new String(new String(data));            
			System.out.println("�ļ�����Ϊ��");            
			System.out.println(msg);       
			} 
		else {           
			System.out.println("�ļ�������");        
			}    
		}   
	public void ThreeAndFour() throws FileNotFoundException, IOException {       
		//����ѧ������Ϣ��      
		int i, j;       
		int sum = 0;       
		String[] xuehao= {"202012", "202013", "201014", "201015", "201016"};       
		String[] Name = {"zhangSan", "liSi", "wanger", "xiaoming", "mazi"};   
		double[][] Score = {{88, 90, 98}, {92, 88, 80}, {84, 96, 80}, {88, 96, 84}, {82, 74, 64}};        
		double[] sumScore = new double[5];       
		for (i = 0; i < 5; i++) {            
			for(j = 0; j < 3; j++) {              
				sum += Score[i][j];           
				}           
			sumScore[i] = sum;           
			sum = 0;        
			}        
		//����ѧ����ѧ�š��������ܳɼ������ļ���       
		String filePath = "D:\\STUDENT.DAT" ;       
		File file = new File(filePath);       
		OutputStream m= new FileOutputStream(file);      
		DataOutputStream n= new DataOutputStream(m);     
		for(i = 0; i < 5; i++) {           
			n.writeUTF(xuehao[i]);            
			n.writeUTF(Name[i]);            
			n.writeDouble(sumScore[i]);       
			}       
		n.close();        //��ȡ����       
		String[] newxuehao = new String[5];        
		String[] newName = new String[5];      
		double[] newSum = new double[5];       
		InputStream fis = new FileInputStream(file);     
  DataInputStream dis = new DataInputStream(fis);       
  for(i = 0; i < 5; i++) {           
	  newxuehao[i] = dis.readUTF();          
	  newName[i] = dis.readUTF();          
	  newSum[i] = dis.readDouble();            
	  System.out.print(newxuehao[i] + " " + newName[i] + " ");         
	  System.out.printf("%.1f\n",newSum[i]/3.0);       
	  }       
     dis.close();    
     }   
	public static void main(String[] args) throws IOException {       
		plus3 exec = new plus3();        
		exec.One();       
		exec.Two(); 
		exec.ThreeAndFour();
       }

}
