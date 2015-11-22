package test;

public class ReplaceBlankSpace {
	public String replace(String a){
		String b = a.replaceAll(" ","%20");
		return b;
	}
	public static void main(String[] args){
		ReplaceBlankSpace rep  = new ReplaceBlankSpace();
		String t = "We are happy";
		System.out.println(rep.replace(t));
	}
}
