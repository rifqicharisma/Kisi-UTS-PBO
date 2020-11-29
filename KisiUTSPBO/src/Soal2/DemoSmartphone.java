package Soal2;

public class DemoSmartphone {
    public static void main(String[] args) {
        /*
        ---- SMARTPHONE 1 -----
         */
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy A11",
                "Fingerprint (rear-mounted), accelerometer, proximity", "No");
        Platform platform = new Platform("Android 10", "Qualcomm SM4250 Snapdragon 450 (11 nm)",
                "Octa-core 1.8 GHz Cortex-A53", "Adreno 506");
        Battery battery = new Battery("Li-Po 4000 mAh, nonremovable", "Fast charging 15W");

        smartphone.addComponent(platform,battery);

        System.out.println("Merk\t\t: "+smartphone.getMerk());
        System.out.println();

        System.out.println("Series\t\t: "+smartphone.getSeries());

        System.out.println("Platform\t: ");
        smartphone.getPlatform().PrintSpec();

        System.out.println("Sensors\t\t: "+smartphone.getSensor());

        System.out.println("Battery\t\t: ");
        smartphone.getBattery().PrintSpec();

        System.out.println("NFC\t\t\t: "+smartphone.getNfc());

        System.out.println();

        /*
        ----- SMARTHPONE 2 -----
         */

        Smartphone smartphone1 = new Smartphone("Xiaomi", "Mi 10T Pro 5G",
                "Fingerprint (side-mounted), accelerometer, gyro, proximity, compass, barometer",
                "Yes");
        Platform platform1 = new Platform("Android 10, MIUI 12", "Qualcomm SM8250 Snapdragon 865 (7 nm+)",
                "Octa-core (1x2.84 GHz Kryo 585 & 3x2.42 GHz Kryo 585 & 4x1.80 GHz Kryo 585)", "Adreno 650");
        Battery battery1 = new Battery("Li-Po 5000 mAh, nonremovable", "Fast charging 33W");

        smartphone1.addComponent(platform1,battery1);

        System.out.println("Merk\t\t: "+smartphone1.getMerk());
        System.out.println();

        System.out.println("Series\t\t: "+smartphone1.getSeries());

        System.out.println("Platform\t: ");
        smartphone1.getPlatform().PrintSpec();

        System.out.println("Sensors\t\t: "+smartphone1.getSensor());

        System.out.println("Battery\t\t: ");
        smartphone1.getBattery().PrintSpec();

        System.out.println("NFC\t\t\t: "+smartphone1.getNfc());
    }
}
