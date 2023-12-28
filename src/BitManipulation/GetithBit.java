package BitManipulation;

public class GetithBit {
    public static int getIth(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask)==0){
            return 0;
        }else return 1;
    }

    public static void main(String[]args){
        int y=23;
        System.out.println(getIth(y,3));
    }
}
