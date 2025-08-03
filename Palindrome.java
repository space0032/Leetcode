class Palindrome {
    public boolen isPalindrome(int x){
        // x = 121 -> 121 -> Palindrome
        if(n<0){
            return false;
        }
        int n = x ;
        int revNum = 0;
        while(n>0){
            ind d = n%10;
            revNumb = revNumx10 + d;
            n = n/10;

        }
        if(revNum == x ){
            return true;
        }else{
            return false;
        }
    }
}