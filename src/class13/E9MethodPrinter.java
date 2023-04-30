package class13;
/*
Method is a block of code that contains java code which is executed when we call that method
In Java , methods can only exist inside classes.
 */
public class E9MethodPrinter {
   void printSomething(){
      System.out.println("Hello Java");
      System.out.println("Hello Java");
      System.out.println("Hello Java");
      System.out.println("Hello Java");
   }
   void printWord(String word){
      System.out.println(word);
      System.out.println(word);
      System.out.println(word);
      System.out.println(word);

   }
   void printWordManyTimes(String word,int number){
      for (int i = 0; i < number; i++) {
         System.out.println(word);

      }
   }

}
