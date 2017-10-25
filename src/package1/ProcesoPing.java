package package1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProcesoPing {

	public static void realizarPing() {

		try {
			String ip1 = "192.168.0.10";
			String cmdstring = "ping  " + ip1;
			String line;
			Process process = Runtime.getRuntime().exec(cmdstring);
			BufferedReader bri = new BufferedReader(new InputStreamReader(process.getInputStream()));
			BufferedReader bre = new BufferedReader(new InputStreamReader(process.getErrorStream()));

			while ((line = bri.readLine()) != null) {
				System.out.println(line);
			}
			bre.close();
			process.waitFor();
			System.out.println("HECHO");
		} catch (Exception ex) {
			System.err.println("ERROR");
			ex.printStackTrace();
		}

	}
}

/*
 * 
 * try { Process p = Runtime.getRuntime().exec(command); BufferedReader
 * inputStream = new BufferedReader( new InputStreamReader(p.getInputStream()));
 * 
 * String s = ""; // reading output stream of the command while ((s =
 * inputStream.readLine()) != null) { System.out.println(s); }
 * 
 * } catch (Exception e) { e.printStackTrace(); } }
 * 
 * public static void main(String[] args) {
 * 
 * String ip = "google.com"; runSystemCommand("ping " + ip);
 * 
 * 
 * }
 * 
 */