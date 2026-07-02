class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowstar=0;
        int rowend=matrix.length-1;
        int colstart=0;
        int colend=matrix[0].length-1;
        ArrayList<Integer> ans=new ArrayList<>();
        while(rowstar<=rowend && colstart<=colend){
            for(int i=colstart;i<=colend;i++){
                    ans.add(matrix[rowstar][i]);
            }
            rowstar++;
            for(int i=rowstar;i<=rowend;i++){
                ans.add(matrix[i][colend]);

            }
            colend--;
            if(rowend>=rowstar){
            for(int i=colend;i>=colstart;i--){
                   ans.add(matrix[rowend][i]);

            }
            rowend--;
            }
            if(colend>=colstart){
            for(int i=rowend;i>=rowstar;i--){
                ans.add(matrix[i][colstart]);
            }
            colstart++;
            }
        }
        return ans;
    }
}