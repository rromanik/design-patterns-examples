package nik.roma.wikipedia;

/**
 * This singleton implementation:
 * - is thread-safe;
 * - uses lazy initialization;
 * - uses double-checked locking (https://en.wikipedia.org/wiki/Double-checked_locking).
 *
 * Resource: https://en.wikipedia.org/wiki/Singleton_pattern#Lazy_initialization
 */
public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized(ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
}