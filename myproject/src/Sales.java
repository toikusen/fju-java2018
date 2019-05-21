import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sales {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("sales.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			while(line !=null) {
				System.out.println(line);
				String[] tokens = line.split(",");
				if (tokens.length ==2 ) {
					System.out.println(tokens[0] + "/" + tokens[1]);
					int n = Integer.parseInt(tokens[1]);
				}
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
