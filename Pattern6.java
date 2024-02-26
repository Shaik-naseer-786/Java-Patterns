public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        int k=1;
        for(int i=1;i<=n;i++){
            k=1;
            for(int j=n;j>=i;j--){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
