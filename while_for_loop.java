// Program to display numbers from 1 to 5

class while_for_loop {
    public static void main(String[] args) {
  
      // declare variables
      int i = 1, n = 5;
  
      // while loop from 1 to 5
      while(i <= n) {
        System.out.println("Numbers using while loop:-" +i);
        i++;
      }
      //For Loop From 0 to 4
      for(i=0;i<n;i++){
          System.out.println("Numbers using for loop:-" +i);
      }
    }
  }