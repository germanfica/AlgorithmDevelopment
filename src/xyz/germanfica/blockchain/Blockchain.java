package xyz.germanfica.blockchain;

import java.util.ArrayList;

public class Blockchain {
	ArrayList<Block> chain;
	
	public Blockchain() {
		this.chain = new ArrayList<>();
		chain.add(createGenesisBlock());
	}
	
	public Block createGenesisBlock() {
		return new Block(0, 14042019, "Genesis block", "0");
	}
	
	public Block getLatestBlock() {
		return this.chain.get(this.chain.size()-1);
	}
	
	public void addBlock(Block newBlock) {
		newBlock.setPreviousHash(getLatestBlock().getHash());
		newBlock.setHash(newBlock.calculateHash());
		chain.add(newBlock);
	}
	
	public String toString() {
		String planeText="";
		for (int i = 0; i <= chain.size()-1; i++) {
			String abrirLlave;
			String cerrarLlave = "\n}";
			if(i==0) {
				abrirLlave = "{\n";
			}else {
				abrirLlave = "\n{\n";
			}
			planeText = planeText + abrirLlave;
			planeText = planeText + " " + "\"previousHash\": " + chain.get(i).getPreviousHash() + ",\n";
			planeText = planeText + " " + "\"hash\": " + "\"" + chain.get(i).getHash() + "\"" + ",\n";
			planeText = planeText + " " + "\"data\": " + chain.get(i).getData();
			planeText = planeText + cerrarLlave;
		}
		return planeText;
	}
}
