
public class MessageEncoderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstitutionCipher aCipher = new SubstitutionCipher(3);
		ShuffleCipher sCipher = new ShuffleCipher(1); 
		//System.out.println(aCipher.shifter('a'));
		System.out.println(sCipher.shuffler("tanes kanchanawanchai"));
	}

}
