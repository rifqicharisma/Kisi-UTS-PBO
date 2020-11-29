package Soal2;

public class Platform {
    private String os;
    private String chipset;
    private String cpu;
    private String gpu;

    public Platform(String os, String chipset, String cpu, String gpu) {
        this.os = os;
        this.chipset = chipset;
        this.cpu = cpu;
        this.gpu = gpu;
    }

    public void PrintSpec(){
        System.out.println("-> OS\t\t: "+ os);
        System.out.println("-> Chipset\t: "+ chipset);
        System.out.println("-> CPU\t\t: "+ cpu);
        System.out.println("-> GPU\t\t: "+ gpu);
        System.out.println();
    }
}
