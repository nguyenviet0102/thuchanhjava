package Shape;

public class Quadrilateral extends Point{
    private double x, y, z, e;

    public Quadrilateral(String tenDiem, double hoanhDo, double tungDo, double x, double y, double z, double e){
        super(tenDiem, hoanhDo, tungDo);
        this.x = x; this.y = y; this.z = z; this.e =e;
    }

    public double getX() { 
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getE() {
        return e;        
    }

    public void setE(double e) {
        this.e = e;
    }


    


}
