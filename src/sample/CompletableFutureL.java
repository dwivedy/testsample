package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class CompletableFutureL {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(ForkJoinPool.commonPool());
		
		Optional<String> data= Optional.ofNullable(null);
//		System.out.println(data.orElse("s"));
		String ss=null;
		System.out.println(ss.equals(""));
		
		// issue with future blocking
//ExecutorService es=Executors.newFixedThreadPool(5);
//
//Future f=es.submit(()->{
//	Arrays.asList(1,1,1).stream().map((i)->{
////		long tot= 0
////		for(int p=0;p<5000;p++) {
////			tot=0+i*2;
////		}
//		try {
//			Thread.sleep(9000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 return i*8;
//		}).collect(Collectors.toCollection(ArrayList::new));
//});
//
////blocking
//System.out.println(f.get());
//	
//System.out.println("done");
	}

	
}
