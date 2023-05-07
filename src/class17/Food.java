package class17;

public class Food {
    String name="Pasta";//instance variable

    void printFood(){
        String name="Burgers";//Local variable are preferred by java
        System.out.println(name);//will print local variable value
        System.out.println(this.name);//but when we use keyword "this.name" to get value from instance variable
    }

    public static void main(String[] args) {
        Food food=new Food();
        food.printFood();
    }
}
