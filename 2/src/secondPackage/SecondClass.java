package secondPackage;

import firstPackage.Subclass1;
import firstPackage.Superclass;

public class SecondClass {
    public static void main(String[] args) {
        Superclass sup = new Superclass();
        System.out.println(sup.def);
        System.out.println(sup.priv);
        System.out.println(sup.prot);
        System.out.println(sup.publ);

        Subclass1 sub1 = new Subclass1();
        System.out.println(sub1.def);
        System.out.println(sub1.priv);
        System.out.println(sub1.prot);
        System.out.println(sub1.publ);

        Subclass2 sub2 = new Subclass2();
        System.out.println(sub2.def);
        System.out.println(sub2.priv);
        System.out.println(sub2.prot);
        System.out.println(sub2.publ);
    }
}
