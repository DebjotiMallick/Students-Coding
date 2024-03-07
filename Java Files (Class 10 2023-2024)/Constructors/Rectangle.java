import java.util.Scanner;

class Rectangle{
    int length, breadth, height;
    Rectangle(int x, int y, int z){
        length = x;
        breadth = y;
        height = z;
    }

    void surfacearea(int x, int y, int z){
        int sa = 2*(x*y + y*z + z*x);
        System.out.println("Surface area: " + sa);
    }

    void volume(int x, int y, int z){
        int v = x*y*z;
        System.out.println("Volume: " + v);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, breadth, height: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        Rectangle r = new Rectangle(l, b, h);
        r.surfacearea(r.length, r.breadth, r.height);
        r.volume(r.length, r.breadth, r.height);
    }
}