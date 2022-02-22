package _05_vault;

public class SecretAgent {

	public SecretAgent() {
		// TODO Auto-generated constructor stub
	}

	public int findCode(Vault v){
	
		for(int i = 0; i < 1000001 ; i++) {
			
			if(v.tryCode(i)) {
				return i;
			}
			
		}
		
		return -1;
	}
	
}
