package Area;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Tester0611 {

	public static void main(String[] args) {
		ArrayList<String> cites = new ArrayList<>();
        ArrayList<String> areas = new ArrayList<>();
        ArrayList<String> postcode = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader("data0611.txt"));
            String line = in.readLine();
        String lastCity ="";
        while (line != null) {
            System.out.println(line);
            String[] tokens = line.split(",");
            if (!lastCity.equals(tokens[0])) {
                lastCity = tokens[0];
                cites.add(lastCity);
            }
            areas.add(tokens[1]);
            postcode.add(tokens[2]);
            line = in.readLine();
        }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        System.out.println(cites);
        }

}
