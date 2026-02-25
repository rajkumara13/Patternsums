class Pattern{
    void patternF(int n){
        System.out.println("PatternF:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    void patternG(int n){
        System.out.println("PatternG:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=n-i+1;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    void patternH(int n){
        System.out.println("PatternH:");
        for(int i=1;i<=n;i++){
            for(int j=n;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    void patternI(int n){
        System.out.println("PatternI:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=(n*2)-i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
public class Main {
    public static void main(String[] args) {
       Pattern p=new Pattern();
       p.patternF(5);
       p.patternG(5);
       p.patternH(5);
       p.patternI(5);
        }
    }
