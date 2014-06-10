
public class ShuffleCipher implements MessageEncoder {
	int n;
	
	public ShuffleCipher(int n) {
		this.n = n;
	}
	@Override
	public String encode(String plainText) {
		return null;
	}
	
	public String shuffler(String message) {
		String cipher="";
		String newMessage[];
	
		newMessage = message.split('\s',message.length()/2));
		System.out.println(newMessage.length);
		for(String temp:newMessage)
			System.out.println(temp);
		return cipher;
	}

}
