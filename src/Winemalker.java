import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public  class Winemalker implements Drink  {
    private String name;
    private int experiance;
    private String address;
    private  Wire [] wires;

    public Winemalker(String name, int experiance, String address, Wire[] wires) {
        this.name = name;
        this.experiance = experiance;
        this.address = address;
        this.wires = wires;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Wire[] getWires() {
        return wires;
    }

    public void setWires(Wire[] wires) {
        this.wires = wires;
    }


    @Override
    public String toString() {
        return "name: " + name +
                " experiance: " + experiance +
                " address: " + address +
                " wires: " + Arrays.toString(wires);
    }

    @Override
    public void winemaking() {
        Scanner scanner = new Scanner(System.in);
        String brend = scanner.nextLine();
        String country = scanner.nextLine();
        int t= scanner.nextInt();
        int tt= scanner.nextInt();
        int ttt= scanner.nextInt();

        Wire wire = new Wire(brend,country, LocalDate.of(t,tt,ttt));
    }
}
