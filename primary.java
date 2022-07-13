public class Primary {

    public double x = 20;
    private double y = 30;

    public Primary(){
    }

    public Primary(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void powerX(){
        this.x *= this.x;
    }

    public void powerY(){
        this.y *= this.y;
    }

    public double getX(){
        return x;
    }

    private void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    private void setY(double y){
        this.y = y;
    }

    public String toString(){
        return String.format ("(x:%.02f, Y:%.02f)", x, y);
    }
}



