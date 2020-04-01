import java.io.*;
import java.lang.String;

public class LoadingLevel {
	int ELE_SIZE = 18;
	
	private int[] elevation = new int[ELE_SIZE];
	private int[] position = new int[ELE_SIZE];
	private int gravity;
	private int meteorites;
	
	public LoadingLevel(File file) throws Exception{

		BufferedReader br = new BufferedReader(new FileReader(file));
		 
		String st1 = br.readLine();
		String st2 = br.readLine();
		String st3 = br.readLine();
		String st4 = br.readLine();
		br.close();
		String[] elevation_str = st1.split(" ");

		for(int i = 0; i < ELE_SIZE; i++) {
			elevation[i] = Integer.parseInt(elevation_str[i]);
		}

		String[] position_str = st2.split(" ");

		for(int i = 0; i < ELE_SIZE; i++) {
			position[i] = Integer.parseInt(position_str[i]);
		}
		
		gravity = Integer.parseInt(st3);
		
		meteorites = Integer.parseInt(st4);
	}
	
	public int[] getElevation() {
		return elevation;
	}

	public int[] getPosition() {
		return position;
	}
	
	public int getGravity() {
		return gravity;
	}
	
	public int getMeteorites() {
		return meteorites;
	}
}
