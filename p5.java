/* WAP to take range as input from the user and print perfect numbers.*/


import java.io.*;
class p5{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start: ");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter end: ");
		int end = Integer.parseInt(br.readLine());


		System.out.println("Perfect numbers between "+start+" and "+end+" are ");
		for(int i=start;i<=end;i++){
			
			int sum=0;
			for(int j=1;j<i;j++){
				if(i%j==0)
					sum=sum+j;
			}
			if(sum==i)
				System.out.println(i+" ");
		}
	}
}

		
