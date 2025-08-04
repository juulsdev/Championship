
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Write the messages to a file.
 */
public class FileOutput implements OutputClass {

    /** Output address where the file is written. */
    private String outputAdress;

    /** input / output handler to create and write to the file. */
    private BufferedWriter writer;

    /**
     * Create a FileOutput providing the address where write the log.
     *
     * @param filename address where the file will be created. It can be absolute or
     *                 relative
     */
    public FileOutput(String filename) {
        outputAdress = filename;
        File file = new File(outputAdress);
        if (file.exists())
            file.delete();
        try {
            writer = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Finish write.
     */
    @Override
    public void finishWrite() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Write.
     *
     * @param message the message
     */
    @Override
    public void write(String message) {
        try {
            writer.write(message + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
