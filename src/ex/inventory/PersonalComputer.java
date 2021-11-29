package ex.inventory;

class PersonalComputer {
    // PC情報を扱うクラス
    String userName ;
    int pcNo ;
    int storageNo;
    int memory;
    int bit;
    String Os;

    public PersonalComputer(String userName, int pcNo, int storageNo, int memory, int bit, String Os) {
        this.userName = userName;
        this.pcNo = pcNo;
        this.storageNo = storageNo;
        this.memory = memory;
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

    public int getMemory() {
        return memory;
    }

    public int getBit() {
        return bit;
    }

    public String getOS() {
        return Os;
    }
}
