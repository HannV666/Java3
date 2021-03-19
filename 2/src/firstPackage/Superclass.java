package firstPackage;

import secondPackage.Subclass2;

public class Superclass {
    int def;
    protected int prot;
    public int publ;
    private int priv;

    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }

    public int getProt() {
        return prot;
    }
    public void setProt(int prot) {
        this.prot = prot;
    }

    public int getPriv() {
        return priv;
    }
    public void setPriv(int priv) {
        this.priv = priv;
    }

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
