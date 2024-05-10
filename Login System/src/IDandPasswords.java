import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Nikhil","pizza");
		logininfo.put("Rohith","PASSWORD");
		logininfo.put("Nikki","abc123");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}