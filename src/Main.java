public class Main {
    public static void main(String[] args) {
        Circle [] circle = new Circle[10];
        int count = 0;
        for (int i = 0; i < circle.length; i++){
            Circle c = new Circle();
            c.setRadius(i+1);
            circle[i] = c;
            if (circle[i].getRadius()%3 == 0){
                count++;
            }
            System.out.println(circle[i]);
        }
        System.out.println(count + " Круга кратны 3");



    }
}
