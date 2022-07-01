package inputbufferreader;
import java.io.*;//to use i/o classes,java.io package and declear the IOException using throws clause in the method header
public class ReadNumbers {

	public static void main(String[] args)throws IOException//and declear the IOException using throws clause in the method header
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//syntax
		int num,sum=0,n,i;
		float avg;
		System.out.println("how many numbers you want:");
		n=Integer.parseInt(br.readLine());//readLine() means reads a string 
		System.out.println("enter the number");
		for(i=0;i<n;i++)
		{
			num=Integer.parseInt(br.readLine());
			sum+=num;
		}
		avg=sum/n;
		System.out.println("sum ="+sum+ " , average ="+avg);
	}

}
