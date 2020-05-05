public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public Software() {
        super();
        programmer = "";
        platform = "";
        os = "";
    }

    public Software(String code, String description, double price, String programmer, String platform, String os) {
        super(code, description, price);
        this.programmer = programmer;
        this.platform = platform;
        this.os = os;
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += "Programmer:          " + programmer + "\n" +
                "Platform:            " + platform + "\n" +
                "OS:                  " + os + "\n";
        return output;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Software)) {
            return false;
        }
        Software software = (Software)other;
        if (super.equals(software) &&
            software.programmer.equals(this.programmer) &&
            software.platform.equals(this.platform) &&
            software.os.equals(this.os)) {
            return true;
        } else {
            return false;
        }
    }
}