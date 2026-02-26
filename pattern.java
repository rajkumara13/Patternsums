package org.example;
import java.util.*;
class Pattern{
    public void squarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public void rectangleTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public void patternA(int n){
        int value=1;
        for(int i=1;i<=n;i++){
            value=i%2!=0?1:0;
            for(int j=1;j<=i;j++){
                System.out.print(value+" ");
                value=value==0?1:0;
            }
            System.out.println();
        }
    }
    public void patternB(int n){
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j<i; j++) {
                System.out.print("_"+" ");
            }
            for (int j = 2; j<i; j++) {
                System.out.print("_"+" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
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
            for(int j=1;j<=n-i;j++){
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
            for(int k=1;k<=(n-i)*2+1;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    void patternJ(int n) {
        System.out.println("PatternJ:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <=i-1; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <=(n-i)*2+1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    void patternK(int n) {
        System.out.println("PatternK:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i-1; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <=(n-i)*2+1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    void patternL(int n){
        System.out.println("PatternL:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=(i*2)-1;k++) {
                if(k==1 || k==(i*2)-1|| n==i){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    void patternM(int n){
        System.out.println("patternM:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(n-i)*2+1;k++) {
                if (i == 1 || i == n || k == 1 || k== ((n - i) * 2 )+ 1) {
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
    void patternN(int n){
        System.out.println("PatternN:");
        for(int i=1;i<=n*2;i++){
            int temp=i>n?(n*2)-i+1:i;
            for(int j=1;j<=n*2;j++){
                if(j<=n-temp+1 || j>n+temp-1){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
    void patternO(int n){
        System.out.println("PatternO:");
        for(int i=1;i<=(n*2)-1;i++){
            for(int j=1;j<=(n*2)-1;j++){
                int top=i;
                int down=(n*2)-top;
                int left=j;
                int right=(n*2)-left;
                int min1=Math.min(Math.min(top,down),Math.min(left,right));
                System.out.print(min1+" ");
            }
            System.out.println();
        }
    }

}
public class Main {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=5;
            Pattern p=new Pattern();
            p.patternO(a);
        }
    }
