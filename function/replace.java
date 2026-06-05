public class replace {
    public static int ZerotoFive(int n){
        int res=0;
        while(n>0){
            int digi=n%10;
            if(digi==2) res=res*10+5;
            else res=res*10+digi;
            n=n/10;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(ZerotoFive(2345));
    }
}


