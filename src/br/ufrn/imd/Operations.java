package br.ufrn.imd;

public class Operations {
    public void operate(int op){
        System.out.println("Operating int...");
    }

    public void operate(String op){
        System.out.println("Operating String...");
    }

    public void operate(int op1, int op2){
        System.out.println("Operating two arguments int...");
    }

    public static void main(String[] args) {
        Operations operations = new Operations();
        operations.operate(1);
        operations.operate("operating...");
        operations.operate(10, 20);
    }
}
