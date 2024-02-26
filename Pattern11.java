public class Pattern11 {
    public static void main(String[] args) {
        int n=3;
        int s=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                s=0;
            }
            else{
                s=1;
            }
            for(int j=1;j<=i;j++){
                System.out.print(s);
                s=1-s;
            }
            System.out.println();
        }
    }
}
