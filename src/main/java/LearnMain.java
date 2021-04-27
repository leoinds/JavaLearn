public class LearnMain {
    public static void main(String[] args) {
        int count;
        count = 1;
        System.out.println(count == 1);
        System.out.println(count != 1);
        System.out.println(count < 1);
        System.out.println(count > 0);
        System.out.println(count <= 1);
        System.out.println(count >= 2);
        Object object1 = new object();
        Object object2 = object1;
        Object object3 = null;
        System.out.println(object1 == object2);
        System.out.println(object3 == null);
        Float r;
        r = 1 / 3f * 3;
        System.out.println(1.f == r);

        Integer i2, i3;
        i2 = -128;
        i3 = -128;
        System.out.println(i2 == i3);
        int x;
        int y;
        x = 1;
        y = 2;
        boolean a = x == y;
        boolean b = x != y;
        System.out.println();
        System.out.println(x++ != y++ || x++ == y++);
        System.out.println("x=" + x + ", y=" + y);

        System.out.println();

        System.out.println();
        if (x < y)
        {
            System.out.println("x меньше y");
            System.out.println("y больше x");
        }
    else{
            System.out.println("x не меньше y");
            System.out.println("у не больше х");
            System.out.println();
            int leo=1256;
        }
    }
}