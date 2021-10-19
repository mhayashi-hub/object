package basic.inspection;

class Result {

    // field definition
    private String id;   // target ID
    private String name; // target name
    private String dateTime; // inspection date-time
    private double bT;   // target body temperature
    private int pulse;   // target heartbeet pulse
    private double sBP;  // systolic blood pressure
    private double dBP;  // diastolic blood pressure
    // constructor
    public Result(String id, String name, String dateTime, double bT, int pulse, double sBP, double dBP) {
        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
        this.bT = bT;
        this.pulse = pulse;
        this.sBP = sBP;
        this.dBP = dBP;
    }

    // getter definition
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public double getbT() {
        return bT;
    }

    public int getPulse() {
        return pulse;
    }

    public double getsBP() {
        return sBP;
    }

    public double getdBP() {
        return dBP;
    }

    // method definition
    double getMBP() {
        double mBPBase = dBP + (sBP - dBP) / 3.00;
        double mBP = Math.round(mBPBase * 10.0) / 10.0;
        return mBP;
    };
    // output override
    @Override
    public String toString() {
        return String.format("%s %s %s %.1f %d %.1f %.1f  %.1f",id,name,dateTime,bT,pulse,sBP,dBP,this.getMBP());
    };

}
