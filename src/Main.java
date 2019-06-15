import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

//Nu este suficient timp pentru a rezolva problema asta. Foarte multe date si cerinte nerealiste.

public class Main {
    private static Logger logger = Logger.getLogger("Main");

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Pack> packs= new ArrayList<>();

        List<Pack> packs1=new ArrayList<>();

        logger.info("Load of the data from a file into a List");

        String fileName = "datafile.csv";
        InputStream inputStream = null;

        try {

            inputStream = new FileInputStream(fileName);

            DataFileParser parser = new DataFileParser();
            packs = parser.parseDataFileForPackages(inputStream);

            DataFileReader reader = new DataFileReader();


            packs1 = reader.readPacks(new FileReader(fileName));



        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }


    }
}
