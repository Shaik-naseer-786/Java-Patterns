public class Pattern17 {
    public static void main(String[] args) {
        int n=4;
        
        for(int i=1;i<=n;i++){
            int a=65;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.printf("%c",a);
                a++;
            }
            
            for(int j=i-1;j>0;j--){
                
                System.out.print((char)(64 + j));
            }
            System.out.println();
        }
    }
}
