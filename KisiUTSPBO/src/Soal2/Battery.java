package Soal2;

public class Battery {
    private String type;
    private String charging;

    public Battery(String type, String charging) {
        this.type = type;
        this.charging = charging;
    }

    // cetak spek
    public void PrintSpec(){
        System.out.println("-> Type\t\t: "+type);
        System.out.println("-> Charging : "+charging);
    }
}
