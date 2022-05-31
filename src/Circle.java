public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
   public double getArea(){
        return Math.PI*this.radius*this.radius;
    }



    @Override
    public String toString(){
        return  "Радиус круга = " + radius + "\n" +
                "Площадь этого круга = " + getArea();

    }
}
