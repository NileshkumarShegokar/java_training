public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuilder s1= new StringBuilder("Student");
        StringBuilder s2= new StringBuilder("Somanshu Bendale");
        System.out.println("Append: "+s1.append("some"));
        System.out.println("Capacity:"+s2.capacity());
        System.out.println("char at: "+s1.charAt(2));
        System.out.println("Delete: "+s1.delete(2,5));
        System.out.println("Delete char at: "+s2.deleteCharAt(9));
        System.out.println("index of: "+new StringBuilder("Sammmya").indexOf("m"));
        System.out.println("last index of:"+new StringBuilder("vision").lastIndexOf("is"));
        System.out.println("length of string:"+new StringBuilder("Hail mogambo"));
        System.out.println("replacing :"+s2.replace(8,s2.length(),"Xlozen11"));
        System.out.println("Reverse string: "+new StringBuilder("welcome").reverse());
        System.out.println("substring: "+new StringBuilder("welcome to java").substring(3,11));



    }
}
