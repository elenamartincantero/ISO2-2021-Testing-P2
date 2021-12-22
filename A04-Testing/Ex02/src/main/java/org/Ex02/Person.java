package org.Ex02;

public class Person {

	private boolean isIll;
	private int age;
	private boolean hasContact;
	private boolean passport;
	private boolean hasSymptoms;
	public Person(boolean isIll, int age, boolean hasContact, boolean passport, boolean hasSymptoms) {
		this.isIll = isIll;
		this.age = age;
		this.hasContact = hasContact;
		this.passport = passport;
		this.hasSymptoms = hasSymptoms;
	}
	public boolean isIll() {
		return isIll;
	}
	public void setIll(boolean isIll) {
		this.isIll = isIll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isHasContact() {
		return hasContact;
	}
	public void setHasContact(boolean hasContact) {
		this.hasContact = hasContact;
	}
	public boolean isPassport() {
		return passport;
	}
	public void setPassport(boolean passport) {
		this.passport = passport;
	}
	public boolean isHasSymptoms() {
		return hasSymptoms;
	}
	public void setHasSymptoms(boolean hasSymptoms) {
		this.hasSymptoms = hasSymptoms;
	}
	
	
}
