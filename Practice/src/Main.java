public class Main {
    static void myMethod(String fname){
        System.out.println(fname + " Ref");
    }
    public static void main(String[] args) {

        /*String[] cars = {"ZBM", "FORd", "Roles"};
        for(String i: cars){
            System.out.println(i);
        }
        //System.out.println("Hello world!");
        int[] nums = {1,2,3,4};*/
        int [][] myNumber = {{1,2,3},{4,5,6}};
        //System.out.println(myNumber[1][1]);
        /*for(int i = 0;i<myNumber.length;i++){
            for(int j = 0;j< myNumber[i].length;j++){
                System.out.println(myNumber[i][j]);
            }
        }*/

        myMethod("Lima");
        myMethod("Anny");

    }
}