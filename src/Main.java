import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      Wire wire = new Wire("X","italia", LocalDate.of(2023,4,5));
      Wire wire1 = new Wire("S","Gruzia",LocalDate.of(2002,5,6));
      Wire wire2 = new Wire("C","Phpansia",LocalDate.of(2012,4,5));
      Wire [] wires = {wire1,wire2};
      for (Wire a: wires){
          System.out.println(a);
          System.out.println(a.toString());

      }

    }
}