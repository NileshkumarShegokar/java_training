
class Circle {
    private float radius;
    private float area =23.5f;
    private float parimeter;

    public void setArea(float r) {
        area = 3.14f *r*r;
    }
    public float getArea(){
        return area;
    }

    public void setParimeter(float r){
        parimeter = 2*3.14f*r;
    }
    public float getparimeter(){
        return parimeter;
    }
}



public class GetterSetter {

    public static void main(String args[])
    {
        Circle c = new Circle();
        //System.out.println(c.area);
        c.setArea(2.2f);
        System.out.println("The Area of Circle " +c.getArea());

        c.setParimeter(2.5f);
        System.out.println("The parimeter of Circle :" +c.getparimeter());
    }
}
