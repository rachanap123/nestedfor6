/*WAP to take range as input from user and print composite numbers.
 * i/p:- Enter start: 1
 * 	 Enter end : 20
 * o/p:- Composite numbers between 1 and 20 
 * 4 6 8 9 10 12 14 15 16 18 20
 */

import java.io.*;
class p2{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start: ");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter end: ");
		int end = Integer.parseInt(br.readLine());


		System.out.println("Composite numbers between "+start+" and "+end+" are");

		for(int i=start;i<=end;i++){
			int count = 0;
			for(int j=1;j*j<=i;j++){
				if(i%j==0)
					count++;
			}
			if(count>=2)
				System.out.println(i+"  ");
		}
	}
}

