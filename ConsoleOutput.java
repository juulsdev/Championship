
/**
 * Write the messages to console
 *
 */
public class ConsoleOutput implements OutputClass {

    @Override
    public void finishWrite() {
        // acts like the original, does not modify anything

    }

    @Override
    public void write(String message) {
        System.out.println(message);
    }


}
