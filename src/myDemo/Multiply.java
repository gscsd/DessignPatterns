package myDemo;

public class Multiply {
    public static Double multiply(Double a, Double b) {
        System.out.println(a*b);
        return a*b;
    }
    public static String maskify(String str) {
//        throw new UnsupportedOperationException("Unimplemented");
        String maskStr="";
        if(str.length()<=4){
        	maskStr = str;
        }else{
          for(int i=0;i<str.length()-4;i++){
            maskStr+="#";
          }
          maskStr+=str.substring(str.length()-4);
        }
        return maskStr;
    }
}
