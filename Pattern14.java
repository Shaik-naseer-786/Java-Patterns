public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int a=65;
            for(int j=1;j<=i;j++){
                System.out.printf("%c ",a);
                a++;
            }
            System.out.println();
        }
    }
}
