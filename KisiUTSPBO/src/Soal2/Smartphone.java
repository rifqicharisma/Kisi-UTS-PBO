package Soal2;

public class Smartphone {
    private String merk;
    private String series;
    private Platform platform;
    private String sensor;
    private Battery battery;
    private String nfc;

    // constructor


    public Smartphone(String merk, String series, String sensor, String nfc) {
        this.merk = merk;
        this.series = series;
        this.sensor = sensor;
        this.nfc = nfc;
    }

    public void addComponent(Platform platform, Battery battery){
        this.platform = platform;
        this.battery = battery;
    }

    // getter and setter

    public String getMerk() {
        return merk;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public String getNfc() {
        return nfc;
    }

    public void setNfc(String nfc) {
        this.nfc = nfc;
    }
}
