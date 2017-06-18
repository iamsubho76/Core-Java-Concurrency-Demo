package com.org.concurrency.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
	public static void main(String[] args) {
		int capacity = 5;
	    boolean fair = true;
	    BlockingQueue<String> queue = new ArrayBlockingQueue<>(capacity, fair);
	    BQProducer producer = new BQProducer(queue);
	    BQConsumer consumer = new BQConsumer(queue);
        //starting producer to produce messages in queue
        new Thread(producer).start();
        //starting consumer to consume messages from queue
        new Thread(consumer).start();
        System.out.println("Producer and Consumer has been started");
	}
}
