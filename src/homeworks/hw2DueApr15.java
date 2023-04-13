package homeworks;
/*
Create an array of names and store all names of
your group. Then print your name from that array. (use 2 different ways of creating an array).

 */
public class hw2DueApr15 {
    public static void main(String[] args) {
        String[] group={"Rajber","Asghar","Harish","Sid","Ronnie"};
        System.out.println(group[3]);

        String[] names=new String[7];
        names[0]="Rajber";
        names[1]="Asghar";
        names[2]="Harish";
        names[3]="Sid";
        names[4]="Ronnie";
        System.out.println(names[4]);
    }
}
