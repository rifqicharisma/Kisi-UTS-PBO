package Soal1;

public class DemoPemain {
    public static void main(String[] args) {
        Player[] player = new Player[3];

        // set nilai indeks 0
        player[0] = new Player();
        player[0].setNama("LJ");
        player[0].setRole("Tank");
        player[0].setTeam("Evos Legend");

        // set indeks 1
        player[1] = new Player();
        player[1].setNama("Oura");
        player[1].setTeam("Evos Legend");
        player[1].setRole("Offlaner");

        // set nilai indeks 2
        player[2] = new Player();
        player[2].setRole("Hyper Core");
        player[2].setNama("Keankira");
        player[2].setTeam("Red Tigers");

        // cetak data
        for (Player x: player) {
            System.out.println("Nama\t: "+x.getNama());
            System.out.println("Team\t: "+x.getTeam());
            System.out.println("Role\t: "+x.getRole());
            System.out.println();
        }
    }
}
