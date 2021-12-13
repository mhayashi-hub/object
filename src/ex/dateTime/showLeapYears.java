package ex.dateTime;

class showLeapYears {
    // 2000から2100年でうるう年かどうかを個別に判定し結果を出力する。
    // 条件：西暦を4で割って割り切れる年はうるう年、
    //      ただし、100で割り切れる年はうるう年ではない
    //      ただし、400で割り切れる年はうるう年となる
    public static void main(String[] args) {
        int checkYear = 1999;
        for (int i = 0;i<=100;i++) {
            checkYear++;
            System.out.println("チェック対象年："+ checkYear);
            if (checkYear%4 == 0) {
                if (checkYear%100 == 0) {
                    if (checkYear%400 == 0) {
                        System.out.println("うるう年です。判定対象：" + checkYear);
                    } else {
                        System.out.println("うるう年ではありません。判定対象：" + checkYear);
                    }
                } else {
                    System.out.println("うるう年です。判定対象："+ checkYear);
                }
            } else {
                System.out.println("うるう年ではありません。判定対象："+ checkYear);
            }
        }
    }
}
