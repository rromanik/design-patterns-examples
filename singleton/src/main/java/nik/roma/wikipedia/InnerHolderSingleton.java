package nik.roma.wikipedia;

/**
 * This singleton implementation:
 * - is thread-safe;
 * - uses lazy initialization;
 * - uses initialization-on-demand holder idiom (https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom);
 *
 * Resource: https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
 */
public class InnerHolderSingleton {
    private InnerHolderSingleton() {}

    private static class LazyHolder {
        static final InnerHolderSingleton INSTANCE = new InnerHolderSingleton();
    }

    public static InnerHolderSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}