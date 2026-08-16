class Solution {
    public boolean isSameAfterReversals(int num) {
        int k=rev(num);
        int g=rev(k);
        return g==num;
    }
    public int rev(int s){
              int n=0;
      int digit=0;
       
        while(s!=0){
          n=s%10;
          digit=digit*10+n;  
          s=s/10;
        }
        return digit;
    }
}