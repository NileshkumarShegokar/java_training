public class Varardemo {

    public static void show(String ... nm)
    {
        for(String nms:nm)
        {
            System.out.println(nms);
        }
    }


    public static void main(String[] args) {
        Varardemo.show("Prachi","gayatri");
    }
}
