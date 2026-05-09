public class SqrtX {
    public static void main(String[] args) {
        int n = 20;

        int ans = sqrtX(n);

        System.out.println("The square root of "+n+" is: "+ans);
    }

    public static int sqrtX(int n){
        int root = 0;

        for(int i=1; i<=n; i++){
            if(i*i > n) break;
            root = i;
        }
        return root;
    }
}
