package com.org.concurrency.blockingqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class BQProducer extends Thread {
	private final BlockingQueue<String> queueList;
	private List<String> listOfString;

	public BQProducer(BlockingQueue<String> queueList) {
		listOfString = new ArrayList<>();
		loadData(listOfString);
		this.queueList = queueList;
	}

	private void loadData(List<String> listOfString) {
		listOfString.add("This is String Value 1");
		listOfString.add("This is String Value 2");
		listOfString.add("This is String Value 3");
		listOfString.add("This is String Value 4");
		listOfString.add("This is String Value 5");
		listOfString.add("This is String Value 6");
		listOfString.add("This is String Value 7");
		listOfString.add("This is String Value 8");
	}

	@Override
	public void run() {
		try{
			for(int i=0; i< listOfString.size(); i++){
				String message = null;
				if(!(i == listOfString.size())){
					message = listOfString.get(i);
					queueList.put(message);
				}else{
					message = "exit";
					queueList.put(message);
				}

			}
		}catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	
}
