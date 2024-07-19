package accessModifier.p2;

import accessModifier.p1.C1P1;

public class C1P2 extends C1P1 {
    public static void main(String[] args) {
        C1P1 c1 = new C1P1();
//        System.out.println(c1.privatevar);
//        System.out.println(c1.defaultvar);
        C1P2 c2 = new C1P2();
        System.out.println(c2.protectedvar);
        System.out.println(c1.publicvar);

    }
}
