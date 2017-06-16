package com.org.concurrency.blockingqueue;

import java.util.List;
import java.util.concurrent.BlockingQueue;

public class BQProducer extends Thread {
	private final BlockingQueue<List<String>> queueList;
	private final String name;

	public BQProducer(BlockingQueue<List<String>> queueList, String name) {
		this.queueList = queueList;
		this.name = name;
	}

	@Override
	public void run() {
		super.run();
	}
	
	
}
