package nik.roma.internet;

import java.io.Serializable;

/**
 * This singleton implementation:
 * - is thread-safe;
 * - is serializable;
 * - is reflection-safe;
 *
 * Source: https://medium.com/@kevalpatel2106/how-to-make-the-perfect-singleton-de6b951dfdb0
 */
public class WatchfulSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private static volatile WatchfulSingleton sSoleInstance;

    //private constructor.
    private WatchfulSingleton(){

        //Prevent form the reflection api.
        if (sSoleInstance != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static WatchfulSingleton getInstance() {
        if (sSoleInstance == null) { //if there is no instance available... create new one
            synchronized (WatchfulSingleton.class) {
                if (sSoleInstance == null)
                    sSoleInstance = new WatchfulSingleton();
            }
        }

        return sSoleInstance;
    }

    //Make singleton from serialize and deserialize operation.
    protected WatchfulSingleton readResolve() {
        return getInstance();
    }
}