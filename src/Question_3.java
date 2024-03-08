public class Question_3 {
//    given n array elements, calculate gcd of array.
    public static void main(String[] args) {
        int[] array= {3,2,1,6,4,8,10,9};
        System.out.println("gcd of array : "+gcdOfArray(array));
    }
    static int gcdOfArray(int[] array){
        int gcd = array[0];
        for(int i=1;i<array.length;i++){
            gcd = Question_1.gcd4(gcd,array[i]);
        }
        return gcd;
    }
}
