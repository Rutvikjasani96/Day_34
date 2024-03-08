public class Question_4 {
//    given an array return true if there exists a subsequence where gcd=1.
    public static void main(String[] args) {
        int[] array = {4,6,3,8}; // true
//        int[] array = {6,12,3,18}; // false
        System.out.println("is subsequence gcd is zero : "+isSubSequenceGcdZero(array));
    }
    static boolean isSubSequenceGcdZero(int[] array){
        int gcdOfArray = Question_3.gcdOfArray(array);
        if(gcdOfArray==1){
            return true;
        }
        return false;
    }
}
