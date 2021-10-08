package basic.sample;

public class TypeConversion {
    public static void main(String[] args) {
        //数値→文字 あまり使わない
        double d1 = 20.0;
        String str = String.valueOf(d1);
        System.out.println(str);
        System.out.println(str.equals(str));

        //文字→数値 頻繁に使う
        String number = "12.34";
        double d2 = Double.parseDouble(number);
        double d3 = Double.valueOf(number);
        System.out.println(d2);
        System.out.println(d2 == 12.34);
        System.out.println(d3);
        System.out.println(d3 == 12.34);

        System.out.println(StaticSample.add(5, 12));
    }
}
