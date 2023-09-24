package org.java.multithread;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            // Simulate a time-consuming task
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return 42;
        });

        future.thenAccept(result -> {
            System.out.println("Result: " + result);
        });

        System.out.println("Doing some other work while waiting...");

        // Block until all tasks are completed
        future.join();
    }
}
