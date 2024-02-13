import java.io.*;
import java.net.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class TempCalculator {
    public static void main(String[] args) {
        // Määritellään CSV-tiedoston URL-osoite merkkijonona.
        String urlString = "https://users.metropolia.fi/~jarkkov/temploki.csv";

        // Käytetään try-with-resources -lauseketta resurssien hallintaan.
        try (InputStream istream = new URL(urlString).openStream(); // Avaa yhteyden URLiin ja hakee sisällön
             InputStreamReader istreamReader = new InputStreamReader(istream); // Muuntaa tavuvirran merkkivirraksi
             BufferedReader reader = new BufferedReader(istreamReader)) { // Puskuroi luettua merkkivirtaa

            float sum = 0; // Summa lämpötiloille
            int count = 0; // Lukumäärä löydetyille lämpötiloille
            NumberFormat nf = NumberFormat.getInstance(Locale.FRENCH); // Numeroformaatilla käsitellään desimaalierottimet
            String line;

            // Lukee tiedoston sisällön rivi riviltä
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(";"); // Erotellaan rivin arvot puolipisteellä
                // Tarkistaa, sisältääkö rivi halutun päivämäärän
                if (columns[0].contains("01.01.2023")) {
                    try {
                        // Lisää lämpötilan summaan ja kasvattaa lukumäärää
                        sum += nf.parse(columns[1]).floatValue();
                        count++;
                    } catch (ParseException e) {
                        // Tulostaa virheilmoituksen, jos lämpötilan muunto epäonnistuu
                        System.err.println("Error parsing number: " + e.getMessage());
                    }
                }
            }

            // Laskee ja tulostaa keskiarvon, jos löytyi lämpötilatietoja
            if (count > 0) {
                System.out.println("Average temperature on 01.01.2023: " + (sum / count));
            } else {
                System.out.println("No data found for 01.01.2023.");
            }

        } catch (MalformedURLException e) {
            // Käsittelee virheellisen URL-osoitteen
            System.err.println("Malformed URL: " + e.getMessage());
        } catch (IOException e) {
            // Käsittelee I/O-virheet
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
