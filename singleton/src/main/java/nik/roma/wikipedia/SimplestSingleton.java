package nik.roma.wikipedia;

/**
 * This singleton implementation:
 * - is not thread-safe.
 *
 * Resource: https://en.wikipedia.org/wiki/Singleton_pattern#Java
 */
public class SimplestSingleton {

    private static final SimplestSingleton INSTANCE = new SimplestSingleton();

    private SimplestSingleton() {}

    public static SimplestSingleton getInstance() {
        return INSTANCE;
    }
}