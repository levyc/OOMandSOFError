package com.stack;

public class TestStackOOM {
    public void whiletrue() {
        while (true) {

        }
    }
    public static void main(String[] args) {

        while (true) {
            Thread thread = new Thread(new Runnable() {

                @Override
                public void run() {
                    new TestStackOOM().whiletrue();
                }
            });
            thread.start();

        }
        
    }
}
