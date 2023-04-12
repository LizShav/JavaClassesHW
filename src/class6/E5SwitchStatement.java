package class6;
//we cannot use all data types with switch conditions. will work byte , short, char.
//We cannot use relational operators/logical with switch.
//thats why most def we will use if else conditions because of data types limitations for switch
public class E5SwitchStatement {
    public static void main(String[] args) {

        char gender='F';
        switch(gender){
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            case 'O':
                System.out.println("others");
                break;
            default:
                System.out.println("Char not supported");
        }
    }
}
