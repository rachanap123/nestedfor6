/*WAP to take a range as input from user and print perfect cubes between that range.  */


import java.io.*;
class p4{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start: ");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter end: ");
		int end = Integer.parseInt(br.readLine());


		System.out.println("Perfect cubes between "+start+" and "+end+" are ");
		for(int i=start;i<=end;i++){
			int number = i;
			for(int j=1;j*j*j<=i;j++){
				if(j*j*j==number)
					System.out.println(number+"\t");
					
			}
		}
	}
}

		
