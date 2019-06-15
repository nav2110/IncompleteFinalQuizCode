import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class DataFileReader {

    public List<Pack> readPacks(Reader reader) throws IOException {

        ArrayList<Pack> packs = new ArrayList<>();

        BufferedReader bufReader = new BufferedReader(reader);

        String line = bufReader.readLine();
        while (line != null) {
            String[] tokens = line.split(",");
            Pack pack = new Pack(
                    tokens[0],
                    Integer.parseInt(tokens[1]),
                    Integer.parseInt(tokens[2]),
                    tokens[3]);
            packs.add(pack);
            line = bufReader.readLine();
        }

        return packs;
    }
}
