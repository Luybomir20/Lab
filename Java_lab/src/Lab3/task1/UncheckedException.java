package Lab3.task1;

public class UncheckedException  extends RuntimeException{
    CodeHTTP codeHTTP;

    UncheckedException(final String message,final CodeHTTP codeHTTP){
        super(message);
        this.codeHTTP=codeHTTP;
    }

    UncheckedException(final CodeHTTP codeHTTP){
        this.codeHTTP=codeHTTP;
    }

    public CodeHTTP getCodeHTTP() {
        return codeHTTP;
    }

    public void setCodeHTTP(final CodeHTTP codeHTTP) {
        this.codeHTTP = codeHTTP;
    }
}
