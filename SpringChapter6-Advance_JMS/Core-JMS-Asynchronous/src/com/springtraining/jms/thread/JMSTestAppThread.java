package com.springtraining.jms.thread;

 
/**
 * Hello world!
 */
public class JMSTestAppThread {
 
    public static void main(String[] args) throws Exception {
        thread(new HelloWorldProducerThread(), false);
        thread(new HelloWorldProducerThread(), false);
        thread(new HelloWorldProducerThread(), false);
        thread(new HelloWorldProducerThread(), false);
        Thread.sleep(1000);
        thread(new HelloWorldConsumerThread(), false);
        thread(new HelloWorldProducerThread(), false);
        thread(new HelloWorldConsumerThread(), false);
        thread(new HelloWorldProducerThread(), false);
        thread(new HelloWorldConsumerThread(), false);
        thread(new HelloWorldConsumerThread(), false);
        Thread.sleep(1000);
    }
 
    public static void thread(Runnable runnable, boolean daemon) {
        Thread newThread = new Thread(runnable);
        newThread.setDaemon(daemon);
        newThread.start();
    }
}
