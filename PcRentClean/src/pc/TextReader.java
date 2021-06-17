package pc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReader {

    public String textOut;

    public String getTextOut(String textIn) throws FileNotFoundException {

        File tekst = new File(textIn);
        Scanner snak = new Scanner(tekst);
        String print = snak.nextLine();
        print = print + snak.nextLine();

        this.textOut= print;




        return textOut;
    }

    @Override
    public String toString() {
        return "TekstReader{" +
                "textOut='" + textOut + '\'' +
                '}';
    }
}



