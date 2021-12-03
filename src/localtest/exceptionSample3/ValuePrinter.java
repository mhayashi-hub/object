package localtest.exceptionSample3;


class ValuePrinter {
    public static void main(String[] args) {
        String inputValue = "abc";
        try {int intValue = Integer.valueOf(inputValue);
                 System.out.println("intValue is "+ intValue);
            } catch (NumberFormatException e) {
                System.out.println("数値ではありません："+ e);
            }
    }
}

