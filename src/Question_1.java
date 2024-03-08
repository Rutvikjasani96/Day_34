public class Question_1 {
//    given 2 numbers a & b, find GCD. a & b > 0.
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        System.out.println("gcd1 : "+gcd1(a,b));
        System.out.println("gcd2 : "+gcd2(a,b));
        System.out.println("gcd3 : "+gcd3(a,b));
        System.out.println("gcd3 : "+gcd4(a,b));
    }
    static int gcd1(int a,int b){
        // brute force TC : O(min(a,b))
        for(int i=Math.min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 0;
    }
    static int gcd2(int a,int b){
        // sqrt method
        int min = Math.min(a,b);
        int ans = Integer.MIN_VALUE;
        for(int i=1;i*i<=min;i++){
            if(a % i ==0 && b % i == 0){   // not important this if i is a factor min/i is also a factor
                ans = Math.max(ans,i);
            }
            if(a % (min/i) ==0 && b % (min/i)==0){
                ans = Math.max(ans,min/i);
            }
        }
        return ans;
    }
    static int gcd3(int a,int b){
        // euclidean
        if(a<b){
            int temp =a;
            a = b;
            b = temp;
        }
        if(b==0){
            return a;
        }
        return gcd3(a-b,b);
    }
    static int gcd4(int a,int b){
        // repetitive subtraction
        if(b==0){
            return a;
        }
        return gcd4(b,a%b);
    }
}
