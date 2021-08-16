public class StringDemo {
    public static void main(String[] args) {
        String str1="Somanshu Bendale";
        String str2="somu";
        String str3="Somu";
        String str4="";
        String str5="         Sammmy      ";

        System.out.println(" Char at "+str1.charAt(10));

        System.out.println("code point at:"+str1.codePointAt(6));
        System.out.println("code point before:"+str1.codePointBefore(5));
        System.out.println("code point count: "+str1.codePointCount(4,16));
        System.out.println("compare to: "+str1.compareTo(str2));
        System.out.println("compare to ignore case: "+str1.compareToIgnoreCase(str2));
        System.out.println("concat "+str2.concat(str1));
        System.out.println("contains: "+str1.contains("man"));
        System.out.println("content Equals: "+ str1.contentEquals("dale"));
        System.out.println("endwith: "+str1.endsWith("e"));
        System.out.println("equals: "+str2.equals(str3));
        System.out.println("equalsIgnoreCase: "+str3.equalsIgnoreCase(str2));
        System.out.println("getBytes: "+str1.getBytes());
        System.out.println("index of: "+str1.indexOf('m'));
        System.out.println("hashcode: "+str2.hashCode());
        System.out.println("is empty: "+str4.isEmpty());
        System.out.println("lastindexof: "+str2.lastIndexOf('s',3));
        System.out.println("length: "+str1.length() );
        System.out.println("split: "+str2.split("nshu"));

        System.out.println("starts with: "+ str1.startsWith("man"));
        String sub=str1.substring(5);
        System.out.println("substring: "+sub);
        System.out.println("to char array: "+str2.toCharArray());
        System.out.println("lower case: "+str1.toLowerCase());
        System.out.println("upper case: "+str2.toUpperCase());
        System.out.println("trim: "+str5.trim());
      }
}
