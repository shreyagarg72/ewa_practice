package JavaInClass;

import java.util.Scanner;

public class Arraypract {

	public static void main(String[] args) {
		 System.out.println("enter the no. you want to input ");

	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int arr[] = new int[n+10];
	        int i = 0;
	        while(i<n){
	            arr[i] = sc.nextInt();
	            i++;
	        }
	        // push operation 
	        System.out.println("enter element in array");
	        int num = sc.nextInt();
	        for(int j = 0 ; j<5; j++) {
	        	if(j==0){
	        		arr[j] = num ;
	        		
	        	}
	        	arr[j] = arr[j+1];
	        }
	       
	        // pop operation 
	        System.out.println("Enter index of element to pop");
	        int num1 = sc.nextInt();
	        for(int j = 0 ; j<=arr.length ; j++) {
	        	if(j== num ) {
	        		arr[j] = arr[j+1];
	        	}
	        }
	        // with stack 
	        StackMeth sm = new StackMeth();
	        
	  
//

	}

}
