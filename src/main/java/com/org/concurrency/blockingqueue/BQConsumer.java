package com.org.concurrency.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class BQConsumer extends Thread {
	  private final BlockingQueue<String> queue;
	  public BQConsumer(BlockingQueue<String> queue) {
	    this.queue = queue;
	  }

	  @Override
	  public void run() {
	    while (true) {
	      try {
	        String str = this.queue.take();
	        System.out.println(str + " value has been recieved by the cosumer ");
	        Thread.sleep(3000);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	        break;
	      }
	    }
	  }
	}