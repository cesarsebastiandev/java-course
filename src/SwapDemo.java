public class SwapDemo {
    public void printInfo(){
        String x = "Water";
        String y = "Kool-Aid";
        String temp;
//        x=y;
//        y=x;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x: "+x);
        System.out.println("y: "+y);

    }
}
