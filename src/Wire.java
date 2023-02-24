import java.time.LocalDate;
import java.util.Scanner;

public  class Wire  {
     private String brend;
     private String country;
     private LocalDate yeardateof;


     public Wire(String brend, String country, LocalDate yeardateof) {
          this.brend = brend;
          this.country = country;
          this.yeardateof = yeardateof;
     }

     public String getBrend() {
          return brend;
     }

     public void setBrend(String brend) {
          this.brend = brend;
     }

     public String getCountry() {
          return country;
     }

     public void setCountry(String country) {
          this.country = country;
     }

     public LocalDate getYeardateof() {
          return yeardateof;
     }

     public void setYeardateof(LocalDate yeardateof) {
          this.yeardateof = yeardateof;
     }



     @Override
     public String toString() {
          return "brend: " + brend +
                  "  country: " + country +
                  "  yeardateof: " + yeardateof ;
     }



     }

