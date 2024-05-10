import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("nikhilnikk","pizza");
		logininfo.put("Biriyani","we haveit");
		logininfo.put("Money","getlost");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}