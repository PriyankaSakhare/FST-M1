package activities;

class CustomException extends Exception {
    private String msg = null;
 
    public CustomException(String msg) {
        this.msg = msg;
    }
 
    @Override
    public String getMessage() {
        return msg;
    }
}
 
public class Activity8 {
	public static void main(String[] args){
	 try {
        Activity8.exceptionTest("Test String");
        Activity8.exceptionTest(null); 
        Activity8.exceptionTest("Test string two- will not execute");
        } catch(CustomException exp) {
        System.out.println("catch block: " + exp.getMessage());
    }
}

static void exceptionTest(String str) throws CustomException {
    if(str == null) {
        throw new CustomException("String value is null");
    } else {
        System.out.println(str);
    }
}

}
