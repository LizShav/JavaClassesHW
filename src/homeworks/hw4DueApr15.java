package homeworks;
/*
Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

 */
public class hw4DueApr15 {
    public static void main(String[] args) {
        String[] cars={"benz","bmw","lexus","porshe","audi","nissan"};
        for (String car : cars) {
            System.out.println(car +" ");

        }
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]+ " ");

        }
        System.out.println();
        int i=0;
        while(i<cars.length){
            System.out.println(cars[i]+ " ");
            i++;
        }



    }
}
