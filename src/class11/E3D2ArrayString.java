package class11;
//2nn way to do with enhanced loop
public class E3D2ArrayString {
    public static void main(String[] args) {
        String [][] names2DArray={{"Sara","Artem","Lean","Semir"},
                {"Farwa","Halima","Alina","Semir"}
        };
        for(String [] oneDArray:names2DArray){
            for(String name:oneDArray){
                System.out.print(name+" ");
            }
        }
    }
}
