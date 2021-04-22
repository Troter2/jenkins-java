
class Fibonacci{
    public static void main(String[] args){
  
        int n,f=0;
        int t1 = 1;
        int t2;

        n = 10;
        for(int i = 1; i<=n; i++){
            t2=f;
            f=t1+f;
            t1=t2;
            System.out.println(t1);
        }
    }
    }