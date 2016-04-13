package com.accenture.andreipietrusel.scjp6playground.formattingparsingapi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6333068909854595353L;
	transient private Collar theCollar; // we can't serialize this
	private int dogSize;

	public Dog(Collar collar, int size) {
		theCollar = collar;
		dogSize = size;
	}

	public Collar getCollar() {
		return theCollar;
	}

	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.writeInt(theCollar.getSize());
		oos.defaultWriteObject();
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		int collarSize = ois.readInt();
		this.theCollar = new Collar(collarSize);
		ois.defaultReadObject();
	}

	@Override
	public String toString() {
		return "Dog [theCollar=" + theCollar + ", dogSize=" + dogSize + "]";
	}

}

class Collar {
	int size;

	public Collar(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Collar [size=" + size + "]";
	}

}

public class SerializationExperiments {

	public static void main(String... args) throws Exception {
		Dog dog = new Dog(new Collar(4), 1);

		String filePath = System.getProperty("java.io.tmpdir").concat(File.separator).concat("Dog.ser");

		FileOutputStream fos = new FileOutputStream(filePath);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(dog);
		oos.close();

		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog deserializedDog = (Dog) ois.readObject();
		ois.close();

		System.out.println(deserializedDog);
	}

}