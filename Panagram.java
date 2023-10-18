import java.util.Scanner;

public class Panagram {
    static Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter Your String:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String s="";
		for(char i='a';i<='z';i++){
			if(str.indexOf(i)!=-1){
				s=s+i;
			}
		}
		if(s.length()==26){
			System.out.println("Pangram");
		}
		else{
			System.out.println(" Not Pangram");
		}
	}
}