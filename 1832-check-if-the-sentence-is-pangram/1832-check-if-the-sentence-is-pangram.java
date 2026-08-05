import java.util.*;
class Solution {
    public boolean checkIfPangram(String sentence) {
    HashSet<Character>set=new HashSet<>();
    for(char ch:sentence.toCharArray()){
        set.add(ch);
    }int s;
      s=set.size();
    
    if(s==26){
        return true;
    }else {
        return false;
    }
    }
}