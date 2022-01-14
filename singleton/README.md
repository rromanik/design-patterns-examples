# Singleton
The best solutions would be:
- Enum ([`nik.roma.effectivejava.Elvis`](./src/main/java/nik/roma/effectivejava/Elvis.java))
- Using initialization-on-demand holder idiom ([`nik.roma.wikipedia.InnerHolderSingleton`](./src/main/java/nik/roma/wikipedia/InnerHolderSingleton.java))
- Using double-checked locking and other preventive steps ([`nik.roma.internet.WatchfulSingleton`](./src/main/java/nik/roma/internet/WatchfulSingleton.java))

[link](./src/main/java/nik/roma/internet/WatchfulSingleton.java)

### References:
1. https://en.wikipedia.org/wiki/Singleton_pattern
2. Effective Java, 3rd Edition, Item 3
3. https://medium.com/@kevalpatel2106/how-to-make-the-perfect-singleton-de6b951dfdb0
4. https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
5. https://androidwave.com/perfect-singleton-in-java/