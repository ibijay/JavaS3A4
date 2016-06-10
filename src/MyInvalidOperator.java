
public class MyInvalidOperator extends Exception {

    private String message = null;
    
    public MyInvalidOperator() {
        super();
    }
 
    public MyInvalidOperator(String message) {
        super(message);
        this.message = message;
    }
 
    public MyInvalidOperator(Throwable cause) {
        super(cause);
    }

	
}
