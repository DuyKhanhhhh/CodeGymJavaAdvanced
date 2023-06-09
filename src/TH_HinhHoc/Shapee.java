package TH_HinhHoc;

public class Shapee {
    public String color;
    public boolean filled ;
    public Shapee(){
        color = "green";
        filled = true;
    }
    public Shapee(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString(){
        return "A Shape with color of " + getColor()
        + " and " + (isFilled() ? "filled" : "not filled");
    }
}
