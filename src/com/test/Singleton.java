package com.test;

/**
 * 设计模式之 单例模式，
 * 就是要保证一个类有且只能存在一个实例对象
 * @author crg
 *
 */
public class Singleton {
//    private static Singleton uniqueInstance;
//    
//    /**
//     *  构造方法私有化，外部不能访问
//     */
//    private Singleton(){}
//    
//    /**
//     * 向外部提供获取该类实例的静态方法
//     * @return
//     */
//    public static synchronized Singleton getInstance(){
//        if (uniqueInstance == null) {
//            
//            synchronized (Singleton.class) {
//                if (uniqueInstance == null) {
//                    
//                  //该类对象不存在 才创建实例对象，如果存在直接返回该
//                    uniqueInstance = new Singleton();
//                }
//            }
//        }
//        return uniqueInstance;
//    }
    private static Singleton uniqueInstance = new Singleton();
    
  /**
   *  构造方法私有化，外部不能访问
   */
  private Singleton(){}
  
  public static Singleton getInstance(){
        
        return uniqueInstance;
}
}
