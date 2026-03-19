class Solution {
    public int maxDepth(String s) {
        int n= s.length();
        int result=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                count++;
            }else if(s.charAt(i)==')'){
                count--;
            }
            result=Math.max(result,count);
        }
        return result;
    }
}
