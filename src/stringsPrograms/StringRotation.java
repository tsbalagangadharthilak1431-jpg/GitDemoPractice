package stringsPrograms;

public class StringRotation {
    public static void main(String[] args) {
        // If s2 contains in s1+s2 then the s2 is the rotation of s1
        String s1 = "ABCD"; // ABCDABCD
        String s2 = "CDAB";
        System.out.println(s2+" is the Rotation of "+s1+" is : "+isRotational(s1,s2));
    }
    static boolean isRotational(String s1,String s2){
        return (s1.length() == s2.length() && (s1+s1).contains(s2));
    }
}
