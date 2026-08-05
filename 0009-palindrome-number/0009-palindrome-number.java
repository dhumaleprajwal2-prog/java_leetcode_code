class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int k=x;
        int d=0;
        while(x>0){
                int n=x%10;
                d=d*10+n;
               x=x/10;
        }if(k==d){
            return true;
        }return false;
    }
}