package com.zbb.jdk.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 线程池的四种创建
 * @Description:
 * @author zbb
 * @date 2017年6月1日 下午2:06:26
 */
@SuppressWarnings("all")
public class ExecutorsDemo {
	
	public static void main(String[] args) {
		//1
//		cacheThreadPool(); 
		
		//2
//		fixedThreadPool(); 
		
		//3.1
//		scheduledThreadPool();
		
		//3.2
//		scheduleAtFix();  
		
		//4
		singleThread();  
	}


	/**
	 * 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，
	 * 保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行,结果依次输出，相当于顺序执行各个任务
	 */
	private static void singleThread() {
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();  
		for (int i = 0; i < 10; i++) {  
		    final int index = i;  
		    singleThreadExecutor.execute(new Runnable() {  
		        @Override  
		        public void run() {  
		            try {  
		                System.out.println(index + "--" + Thread.currentThread().getName());  
		                Thread.sleep(1);  
		            } catch (InterruptedException e) {  
		                e.printStackTrace();  
		            }  
		        }  
		    });  
		}
	}
	
	
	
	/**
	 * 表示延迟5秒后每3秒执行一次
	 */
	private static void scheduleAtFix() {
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);  
		scheduledThreadPool.scheduleAtFixedRate(new Runnable() {  
			  
		    @Override  
		    public void run() {  
		        System.out.println("delay 5 seconds, and excute every 3 seconds");  
		    }  
		}, 5, 3, TimeUnit.SECONDS);
	}
	
	/**
	 * 创建一个定长线程池，支持定时及周期性任务执行
	 * 延迟执行
	 * 延迟3秒执行。
	 */
	private static void scheduledThreadPool() {
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);  
		scheduledThreadPool.schedule(new Runnable() {  
		  
		    @Override  
		    public void run() {  
		        System.out.println("delay 3 seconds");  
		    }  
		}, 3, TimeUnit.SECONDS);
	}
	
	/**
	 * 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
	 */
	private static void fixedThreadPool() {
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);  
		for (int i = 0; i < 10; i++) {  
		    final int index = i;  
		    fixedThreadPool.execute(new Runnable() {  
		        @Override  
		        public void run() {  
		            try {  
		                System.out.println(index+"--"+Thread.currentThread().getName());  
		                Thread.sleep(2000);  
		            } catch (InterruptedException e) {  
		                e.printStackTrace();  
		            }  
		        }  
		    });  
		}
	}
	
	/**
	 * 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
	 * 当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程
	 */
	private static void cacheThreadPool() {
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();  
		for (int i = 0; i < 10; i++) {  
		    final int index = i;  
//		    try {  
//		        Thread.sleep(index * 1000);  
//		    } catch (InterruptedException e) {  
//		        e.printStackTrace();  
//		    }  
		  
		    cachedThreadPool.execute(new Runnable() {  
		  
		        @Override  
		        public void run() {  
		            System.out.println(index+"--"+Thread.currentThread().getName());  
		        }  
		    });  
		}
	}
}
