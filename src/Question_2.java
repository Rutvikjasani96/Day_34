public class Question_2 {
//    given n array elements, find the gcd of factorial of all given element.
//    Amazon
    public static void main(String[] args) {
        int[] array = {4,3,6,8};
        System.out.println("gcd of factorial : "+gcdOfFactorial(array));
    }
    static int gcdOfFactorial(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i=0;i< array.length;i++){
            min = Math.min(min,array[i]);
        }
        int ans=1;
        for(int i=1;i<=min;i++){
            ans = ans * i;
        }
        return ans;
    }
}
