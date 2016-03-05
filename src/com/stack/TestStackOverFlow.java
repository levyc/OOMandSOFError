package com.stack;

public class TestStackOverFlow {
    private static int length = 1;  
    public void stackleak(){
          length++;
          stackleak();
      }
    public static void main(String[] args) {
        try{
            new TestStackOverFlow().stackleak();
        }
        catch(Exception e){
            System.out.println("length:"+length);
            e.printStackTrace();
        }
        
    }
}
