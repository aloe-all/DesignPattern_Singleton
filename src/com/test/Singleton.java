package com.test;

/**
 * 设计模式之 单例模式，
 * 就是要保证一个类有且只能存在一个实例对象
 * @author crg
 *
 */
public class Singleton {
	// =================================================** 延迟实例化**============================================================
//	/**
//	 *  延迟实例化　在多线程环境下，为了安全性，需要同步，降低了性能，
//	 *  以空间换时间
//	 */
//	/**
//	 *  volatile 关键字保证　uniqueInstance　线程之间的可见性
//	 */
//    private volatile static Singleton uniqueInstance;
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
//    public static Singleton getInstance(){
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
    
 // =================================================** 延迟实例化**============================================================
    
 // =================================================** 急切实例化**============================================================
    
//    private static Singleton uniqueInstance = new Singleton();
//  /**
//   * 　急切实例化　随着类的加载　jvm　已经创建了　uniqueInstance　
//   * 　保证了安全性，也提高了性能
//   * 　但是，占用空间，即便在整个生命周期中，一此不使用　uniqueInstance，uniqueInstance　对象也会一直在内存中
//   * 　　是以空间换时间的解决办法
//   *  构造方法私有化，外部不能访问
//   */
//  private Singleton(){}
//  
//  public static Singleton getInstance(){
//        
//        return uniqueInstance;
//  }
  
//=================================================** 急切实例化**============================================================
  
//=================================================** 最优方案**============================================================
	
	/**
	 *  时间和空间的方案
	 */
	
	/** 
	 *  私有构造方法，禁止外部访问
	 */
	private Singleton(){}
	
	/**
	 *  静态内部类
	 * @author crg
	 *
	 */
	private static class HolderClass{
		private static final Singleton uniqueInstance = new Singleton();
	}
	public static Singleton getInstance(){
		return HolderClass.uniqueInstance;
	}
//=================================================** 最优方案**============================================================
}
