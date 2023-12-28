package Strings;

//Given a oute containing 4 directions(E,W,N,S), find the shortest path to reach destination
public class shortestPath {
    public static float shortest(String path){
        int x=0, y=0;
        for(int i=0; i<path.length();i++) {
            char dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int X2= x*x;
        int Y2= y*y;
        return (float)Math.sqrt(X2+Y2);
    }

}
