package model;

public class Login {
	 private String Id;
	    private String pass;

	    public Login(String Id, String pass) {
	        this.Id = Id;
	        this.pass = pass;
	    }

	    public String getId() {
	        return Id;
	    }

	    public String getPass() {
	        return pass;
	    }
}
