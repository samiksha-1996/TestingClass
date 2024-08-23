package LogicalProgram;

import java.util.Arrays;

public class practise {

	public static void main(String[] args) {
		int count=0;
	       int arr[] = { 1,1, 2, 3, 4, 3, 5, 7,3, 5, 8, 9, 1, 7 }; //1,3,5,7
	       Arrays.sort(arr);
	       System.out.println(Arrays.toString(arr));
	       
	       if(arr[0]==arr[1]){
	           count++; //count=1,2
	       }
	       for(int i =1; i<arr.length-1;i++){
	           
	           if(arr[i-1]!=arr[i+1]){
	               if(arr[i]==arr[i+1])
	                  count++;
	             
	               
	             
	              
	           }
	       }
	    
	          System.out.println(count);
	    }
	
	}


