import java.io.*;
import java.lang.String;

public class LoadingLevel {
	int ELE_SIZE = 10;
	
	private int[] elevation = new int[ELE_SIZE];
	private int gravity;
	private int meteorites;
	
	public LoadingLevel(File file) throws Exception{

		BufferedReader br = new BufferedReader(new FileReader(file));
		 
		String st1 = br.readLine();
		String st2 = br.readLine();
		String st3 = br.readLine();
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		br.close();
		
		String[] elevation_str = st1.split(" ");
		
		System.out.println(elevation_str[0]);
		System.out.println(elevation_str[1]);
		System.out.println(elevation_str[2]);
		
		System.out.println(elevation_str.length);
		
		for(int i = 0; i < ELE_SIZE; i++) {
			System.out.println("i: " + i);
			elevation[i] = Integer.parseInt(elevation_str[i]);
		}
		
		gravity = Integer.parseInt(st2);
		
		meteorites = Integer.parseInt(st3);
	}
	
	public int[] getElevation() {
		return elevation;
	}
	
	public int getGravity() {
		return gravity;
	}
	
	public int getMeteorites() {
		return meteorites;
	}
}
