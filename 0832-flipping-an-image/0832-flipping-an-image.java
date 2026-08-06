class Solution {
    public int[][] flipAndInvertImage(int[][] image){
   int[][] arr =new int[image.length][image.length];
   int n=image.length-1;
        for(int i=image.length-1;i>=0;i--){
            for(int j=image.length-1;j>=0;j--){
                if(image[i][j]==0){
                    arr[i][n-j]=1;
                }else if(image[i][j]==1){
                    arr[i][n-j]=0;
                }
            }
        }
     //   for(int i=0;i<0;i++){
          //  for(int j=0;j<0;j++){
                return arr;
            
        }
    }
