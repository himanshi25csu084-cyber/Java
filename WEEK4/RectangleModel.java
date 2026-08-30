public class RectangleModel {
    private double length;
    private double breadth;
    public RectangleModel(){
        this.length = 1;
        this.breadth = 1;
    }
    public RectangleModel(double length){
        if(length<0){
            System.out.println("Invalid length");
            return;
        }
        this.length = length;
        this.breadth = length;
    }
    public RectangleModel(double length, double breadth){
        if(length<0||breadth<0){
            System.out.println("Enter valid length");
            return;
        }
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea(){
        return this.length*this.breadth;
    }
    public double getPerimeter(){
        return 2*(this.length+this.breadth);
    }
    public boolean isSquare(){
        if(this.length == this.breadth){
            return true;
        }
        return false;
    }


}
