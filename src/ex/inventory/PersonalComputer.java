package ex.inventory;

class PersonalComputer {
    // PC情報を扱うクラス
    // PCの在庫管理のための情報のひな形
    String userName ;
    int pcNo ; // PCの在庫管理番号
    int storageNo ; // 保管している倉庫の番号の情報
    int price;
    int bit ;
    String Os ;

    public PersonalComputer(String userName, int pcNo, int storageNo, int price, int bit, String Os) {
        this.userName = userName;
        this.pcNo = pcNo;
        this.storageNo = storageNo;
        this.price = price;
        this.bit = bit;
        this.Os = Os;
    }

    public String getUserName() {
        return userName;
    }

    public int getPcNo() {
        return pcNo;
    }

    public int getStorageNo() {
        return storageNo;
    }

    public int getPrice() {
        return price;
    }

    public int getBit() {
        return bit;
    }

    public String getOS() {
        return Os;
    }
}
