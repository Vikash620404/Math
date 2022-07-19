class Solution {
    public boolean isPalindrome(int x) {
int storeNumber=x;
     int ans=0;

while(storeNumber>0){
 int rem=storeNumber%10;
ans=ans*10+rem;
    storeNumber=storeNumber/10;
}  
if(ans==x)return true;
else
return false; 
    }
}






//O(N)
