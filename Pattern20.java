public class Pattern20 {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=n; i++) {
            for(int j=i;j<=n-1;j++){
                System.out.print("*");
            } 
            for(int j=0;j<=i-1;j++){
                if(i!=n){
                    System.out.print("  ");
                }
            }  
            for(int j=i;j<=n-1;j++){
                System.out.print("*");
            }
            System.out.println();      
        }
    }
}
