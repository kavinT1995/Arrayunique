# Arrayunique
import java.util.Scanner;

public class ArrayUnq{

	public static void main(String[] args) {
		int a[]=new int[5];
		
 		Scanner sr=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			a[i]=sr.nextInt();
			
			
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println(a[i]);
				}
			}
		}
		
		

	}

}
