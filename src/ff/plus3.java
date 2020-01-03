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
	/*问题一 求2~1000之间的所有素数，将求得的结果保存到PRIME.DAT文件中*/  
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
					//System.out.println("1000以内素数:" + i);                  
					full.write(String.valueOf(i).getBytes());
					full.write(" ".getBytes());                
					}           
				}        
			}        
		full.close();    
		}    
	/*问题二检查C盘根目录下CONFIG.SYS文件是否存在, 若在则显示该文件的名称和内容。*/   
	public void Two() throws FileNotFoundException, IOException {        
		String filePath1 = "C:\\CONFIG.SYS" ;       
	    //String filePath2 = "D:\\users.txt";       
		String filePath3 = "D:\\PRIME.DAT";       
		File b= new File(filePath3);        
		if(b.exists()) {            
			System.out.println("文件名称为：" + b.getName());           
			FileInputStream fis = new FileInputStream(b);           
			byte[] data = new byte[(int)b.length()];           
			fis.read(data);           
			fis.close();           
			String msg = new String(new String(data));            
			System.out.println("文件内容为：");            
			System.out.println(msg);       
			} 
		else {           
			System.out.println("文件不存在");        
			}    
		}   
	public void ThreeAndFour() throws FileNotFoundException, IOException {       
		//五名学生的信息：      
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
		//五名学生的学号、姓名、总成绩存入文件中       
		String filePath = "D:\\STUDENT.DAT" ;       
		File file = new File(filePath);       
		OutputStream m= new FileOutputStream(file);      
		DataOutputStream n= new DataOutputStream(m);     
		for(i = 0; i < 5; i++) {           
			n.writeUTF(xuehao[i]);            
			n.writeUTF(Name[i]);            
			n.writeDouble(sumScore[i]);       
			}       
		n.close();        //读取数据       
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
