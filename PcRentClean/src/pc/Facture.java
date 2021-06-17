package pc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Facture {
    public String printFacture(ArrayList list)throws IOException {

        File file = new File("Facture.txt");
        FileWriter writer = new FileWriter("Facture.txt");
        for(int i = 0; i<list.size();i++){
            writer.write(list.get(i).toString()+ "\n");
        }
        writer.close();



        return null;

    }
}
