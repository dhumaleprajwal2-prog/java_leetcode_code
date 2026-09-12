class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        // int k=0;
        // int t=s.length-1;
        // char f[]="";
        while(i<j){
            char a=s[i];
            s[i]=s[j];
            s[j]=a;
        // f[k]=s[j];
        // k++;
        // f[t]=s[i];
        // t--;
        i++;
        j--;
        }
        return ;
    }
}