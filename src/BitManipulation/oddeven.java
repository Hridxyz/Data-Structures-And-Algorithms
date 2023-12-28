package BitManipulation;

public class oddeven {
    public static int check(int x){
        if((x & 1)==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        return 0;
    }
    public static void main(String[]args){
    int y=23;
    check(y);
    }

}
