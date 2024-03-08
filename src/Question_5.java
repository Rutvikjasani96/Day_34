public class Question_5 {
//    given n positive distinct elements, choose arr[i] & arr[j] such that i!=j.
//    if abs(arr[i]-arr[j]) (absolute difference) is not present in the array insert
//    abs(arr[i]-arr[j]) in the array. repeat above 2 steps untill no more element can be added in array.
//    find the min element in final array.
//    Facebook & Tower Research
    public static void main(String[] args) {
        int[] array = {6,2,12,8};
        System.out.println("ans : "+solution(array));
    }
    static int solution(int[] array){
        return Question_3.gcdOfArray(array);
    }
}
