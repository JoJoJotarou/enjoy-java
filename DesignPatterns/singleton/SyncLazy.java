package DesignPatterns.singleton;

/**
 * Lazy
 */
public class SyncLazy {

    private SyncLazy() {
    }

    private static volatile SyncLazy INSTANCE;

    public static SyncLazy getInstance() {

        if (INSTANCE != null) {
            return INSTANCE;
        }
        synchronized (SyncLazy.class) {
            if (INSTANCE == null) {
                INSTANCE = new SyncLazy();
            }
        }

        return INSTANCE;
    }

}

