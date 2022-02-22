package _05_vault;

public class TryCode_Vault_Runner {

	public TryCode_Vault_Runner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Vault vault = new Vault();
		
		vault.tryCode(5);
		
		SecretAgent secretAgent = new SecretAgent();
		
		System.out.println(secretAgent.findCode(vault));
		
		
		
		
		
	}
	
	

	
	
}
