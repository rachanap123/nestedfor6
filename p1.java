/*WAP to print the numbers divisible by 5 from 1 to 50 and the number is even, also print the count of even numbers.
 * i/p:- Enter a lower limit: 1
 * 	 Enter upper limit: 50
 * o/p:- 10,20,30,40,50
 * Count = 5
 */

import java.io.*;
class P1{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter lower limit: ");
		int lower = Integer.parseInt(br.readLine());

		System.out.println("Enter upper limit: ");
		int upper = Integer.parseInt(br.readLine());

		int count = 0;
		for(int i=lower;i<=upper;i++){
			if(i%5==0 && i%2==0){
				System.out.print(i+" ");
				count++;
			}
				
		}

		System.out.println();
		System.out.println("Count = "+count);
	}
}


