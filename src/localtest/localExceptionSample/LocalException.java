package localtest.localExceptionSample;

class LocalException extends Exception {
    private static final long serialVersionId = 2L;

    public LocalException() {
    }

    public LocalException(String message) {
        super(message);
    }

    public LocalException(String message, Throwable cause) {
        super(message, cause);
    }

    public LocalException(Throwable cause) {
        super(cause);
    }

    public LocalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
