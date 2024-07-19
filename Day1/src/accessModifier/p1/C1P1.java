package accessModifier.p1;

public class C1P1 {
    private int privatevar = 10;
    int defaultvar = 10;
    protected int protectedvar = 10;
    public int publicvar = 10;
    public static void main(String[] args) {
        C1P1 c1 = new C1P1();
        System.out.println(c1.privatevar);
        System.out.println(c1.defaultvar);
        System.out.println(c1.protectedvar);
        System.out.println(c1.publicvar);
    }
}
