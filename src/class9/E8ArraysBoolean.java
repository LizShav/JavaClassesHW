package class9;
//How many values in above array are false
public class E8ArraysBoolean {
    public static void main(String[] args) {
    boolean[] flags={true,false,true,false,false,true};
    int counter=0;
        for (int i = 0; i < flags.length ; i++) {
            if(flags[i]==false){//if we use !flags[i]-it will reverse it true
                counter++;
            }

        }
        System.out.println(counter);
    }
}
