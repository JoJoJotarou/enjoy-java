package DesignPatterns.singleton;

/**
 * EnumSingleton
 */
public enum EnumSingleton {

    INSTANCE;

    private EnumSingleton() {
    }
}


/**
 * InnerEnumSingleton
 */
class InnerEnumSingleton {

    public static void main(String[] args) {
        EnumSingleton e1 = EnumSingleton.INSTANCE;

        EnumSingleton e2 = EnumSingleton.INSTANCE;

        System.out.println(e1 == e2);

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
