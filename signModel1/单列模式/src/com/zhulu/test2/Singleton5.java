package com.zhulu.test2;
//懒汉式单例模式
public class Singleton5 {
	private static Singleton5 instance;
    private Singleton5(){
    	
    }
    
    public static synchronized Singleton5 getInstance() {
    	if (instance == null) {
    		instance = new Singleton5();
    	}
    	return instance;
    }
}
