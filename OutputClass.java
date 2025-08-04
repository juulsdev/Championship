 

/**
 * Visitor pattern. Interface that need to be implemented by the output writers.
 */
public interface OutputClass {
    /**
     * Does the necessary operations to finish writing
     */
    void finishWrite();

    /**
     * Write the message.
     *
     * @param message Message
     */
    void write(String message);

}
