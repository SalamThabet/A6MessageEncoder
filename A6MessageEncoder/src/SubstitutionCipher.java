
public class SubstitutionCipher implements MessageEncoder {
	int shift;
	public SubstitutionCipher(int shift) {
		this.shift = shift;
	}
	
	@Override
	public String encode(String plainText) {
		// implement the logic to define the method encode so that each letter is shifted by the value in shift
		return null;
	}
	
	private char shifter(char letter) {
		return (char)(letter+this.shift);
	}
}
