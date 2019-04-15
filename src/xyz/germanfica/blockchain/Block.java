package xyz.germanfica.blockchain;

public class Block {
	private int index;
	private long timestamp;
	private Object data;
	private String previousHash;
	private String hash;

	public Block(int index, long timestamp, Object data, String previousHash) {
		this.index = index;
		this.timestamp = timestamp;
		this.data = data;
		this.previousHash = previousHash;
		this.hash = this.calculateHash();
	}
	
	public int getIndex() {
		return index;
	}

	public long getTimestamp() {
		return timestamp;
	}
	
	public Object getData() {
		return data;
	}
	
	public String getPreviousHash() {
		return previousHash;
	}

	public String getHash() {
		return hash;
	}

	public void setPreviousHash(String previousHash) {
		this.previousHash = previousHash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}
	
	public String calculateHash() {
		return this.hash = Generator.generateHash(this.previousHash + this.timestamp + this.data.toString());
	}
}
