package nanomsg.exceptions;

public class IOException extends java.io.IOException {
    public IOException(String message) {
        super(message);
    }

    public IOException(Throwable cause) {
        super(cause);
    }
}
