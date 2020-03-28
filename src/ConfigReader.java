import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

class ConfigReader{

    private Vector data;
    public void reader(String Path) throws IOException {

        BufferedReader fileIn = null;
        try {
            fileIn = new BufferedReader(new FileReader(Path));

            data = new Vector();
            String tmp = fileIn.readLine();
            data.add(tmp);
            while (tmp != null) {
                tmp = fileIn.readLine();
                data.add(tmp);
            }
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
        }
    }
   public Vector getData(){
        return  data;
   }

}