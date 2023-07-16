/* WAP to take 5 numbers as input from user and print the count of digits in those numbers */

import java.io.*;
class p6{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("How many numbers you want to take from user? ");
		int input = Integer.parseInt(br.readLine());
		int count = 0;

		do{
			System.out.println("Enter number");
			int num = Integer.parseInt(br.readLine());

			int temp = num;
			int cnt = 0;

			while(temp!=0){
				cnt++;
				temp=temp/10;
			}
			System.out.println("Number "+num+" has "+cnt+" digits ");

			count++;

		}while(count!=input);
	}
}

	
