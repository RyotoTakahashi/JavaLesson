package javalesson01;

public class Main {
    public static void main(String[] args) {
        boolean p = false;
        boolean q = true;
        boolean r = !(p || q) && (p && !q);
        System.out.println(r);
    }
}
