public class Rectangle {

    // Properties
    private int length;
    private int width;

    // Constructors
    public Rectangle(int inputLength, int inputWidth){
        this.length = inputLength;
        this.width = inputWidth;
    }

    // Behaviours
    public int areaCalculator(){
        return (this.length * this.width);
    }

    public boolean isRectangle(){
        if (this.length == this.width) {
            return true;
        }
        else return false;
    }
}
