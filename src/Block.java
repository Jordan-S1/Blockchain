import java.util.Date;

public class Block {
  
	public String hash;
	public String previousHash; 
	private String data; //the data of the block.
	private long timeStamp; //the time of the block creation.
	private int nonce; //the number of times the hash was calculated.

	//Block Constructor.
	public Block(String data,String previousHash ) {
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash(); //This starts after the other values are set.
	}
    
	//Method that calculates the new hash based on blocks contents
	public String calculateHash() {
		String calculatedhash = StringUtil.applySha256( 
				previousHash + Long.toString(timeStamp) + 
				Integer.toString(nonce) + data);
		return calculatedhash;
	}

	//Increases nonce value until hash target is reached.
	//this is the proof of work in action.
	public void mineBlock(int difficulty) {
		String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0" 
		while(!hash.substring( 0, difficulty).equals(target)) {
			nonce ++; 
			hash = calculateHash();
		}
		System.out.println("Block Mined!!! : " + hash);
	}
}
