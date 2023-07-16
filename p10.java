/* WAP to take range as input from the user and print armstrong numbers. */

import java.io.*;
class p10{
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start: ");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter end: ");
		int end = Integer.parseInt(br.readLine());

		System.out.println("Armstrong numbers between "+start+" and "+end+" are ");

		for(int i=start;i<=end;i++){
			int num = i;
			int cnt = 0,sum = 0;
			while(num!=0){
				cnt++;
				num = num/10;
			}
			num = i;
			while(num!=0){
				int mult = 1;
				int rem = num%10;
				for(int j=1;j<=cnt;j++){
					mult = mult*rem;
				}
				sum = sum+mult;
				num = num/10;
			}
			if(sum==i)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}


