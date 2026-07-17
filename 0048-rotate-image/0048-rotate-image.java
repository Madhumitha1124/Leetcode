class Solution {
    public void rotate(int[][] arr1) {
        int row=arr1.length;
        int col=arr1[0].length;
        int [][]arr2=new int[col][row];
	    for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	            arr2[j][i]=arr1[i][j];
	        }
	    }
	  
	 for(int i=0;i<arr2.length;i++){
	        for(int j=0;j<arr2[0].length/2;j++){
	           // System.out.print(arr2[i][j]);
	           int temp=arr2[i][j];
	           arr2[i][j]=arr2[i][arr2[0].length-j-1];
	           arr2[i][arr2[0].length-j-1]=temp;
	           
	        } 
	    }
	     for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	          arr1[i][j]=arr2[i][j];
	}
  
    }
    }}