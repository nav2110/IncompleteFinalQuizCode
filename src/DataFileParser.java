import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DataFileParser {
    public List<Pack> parseDataFileForPackages (InputStream csvInputStream) throws IOException {

    byte[] buffer = new byte[5];
    int readBytes = csvInputStream.read(buffer);
    StringBuilder builder = new StringBuilder();

    while (readBytes > 0) {
        builder.append(new String(buffer, 0, readBytes, "UTF-8"));
        readBytes = csvInputStream.read(buffer);
    }

    String readContent = builder.toString();
    String[] lines = readContent.split("\n");
    ArrayList<Pack> packages = new ArrayList<>();

    for (String line : lines) {
        String[] tokens = line.split(",");
        Pack pack = new Pack(
                tokens[0],
                Integer.parseInt(tokens[1]),
                Integer.parseInt(tokens[2]),
                tokens[3]);
        packages.add(pack);
    }

    return packages;
}
}