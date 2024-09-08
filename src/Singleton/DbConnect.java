package Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DbConnect {
    private static DbConnect instance = null;
//    Another way of Acquiring Lock::
//    static Lock l = new ReentrantLock();
    private DbConnect() {};

    public static DbConnect getInstance(){
        if(instance == null){
            synchronized(DbConnect.class){
                if(instance == null){
                    instance = new DbConnect();
                }
            }
        }
        return instance;
    }


//    Another Way of synchronization:::
//    public static DbConnect getInstance(){
//        if(instance == null){
//            l.lock();
//                if(instance == null){
//                    instance = new DbConnect();
//                }
//                l.unlock();
//            }
//        return instance;
//        }

}

//Summary:::
//The singleton pattern is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.
//Use cases of singleton pattern
//Shared resource like database connection, logging mechanism
//Object that should be instantiated only once like configuration object
//Hide the constructor of the singleton class by making it private so that other classes cannot instantiate the singleton class.
//Add a static method that returns the instance of the singleton class. If the instance does not exist, it should create the instance and then return it.
//  Thread safety:::::
//Make the getInstance() method synchronized.
//Use double-checked locking.
