package com.zhulu.test2;

import java.io.ObjectStreamException;
import java.io.Serializable;

//饿汉式单例模式
public class Singleton4{
	private static Singleton4 instance2;
	private static final Singleton4 instance3 = new Singleton4();
	
	private static Singleton4 instance4;
    static {
        instance4 = new Singleton4();
    }
	private Singleton4(){
    	
    }
    private static Singleton4 instance;
    
    public static Singleton4 getInstance() {
    	if (instance == null) {
    		instance = new Singleton4();
    	}
    	return instance;
    }
    
    public static Singleton4 getInstance2() {
    	if (instance2 == null) {
    		instance2 = new Singleton4();
    	}
    	return instance2;
    }
    
    public static Singleton4 getInstance3() {
    	return instance3;
    }
    
    public static Singleton4 getInstance4() {
    	return instance4;
    }
   
}
