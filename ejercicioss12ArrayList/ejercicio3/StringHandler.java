package ejercicioss12ArrayList.ejercicio3;

import java.util.ArrayList;

public class StringHandler {

    ArrayList<String> stringList = new ArrayList<String>();

    public StringHandler(ArrayList<String> stringList) {
	this.stringList = stringList;
    }

    public void newList() {
	stringList.clear();
    }

    public int getAmount() {
	return stringList.size();
    }

    public void addString(String string) {
	stringList.add(string);
    }

    public void delLastString(String string) {
	stringList.removeLast();
    }

    public boolean containsString(String string) {
	return stringList.contains(string);
    }

    public void showList() {
	System.out.println(stringList);
    }

    public void exit() {
	System.exit(0);
    }

}
