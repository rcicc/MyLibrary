package be.iccbxl.poo;

import java.util.ArrayList;
import java.util.Iterator;

import be.iccbxl.poo.ui.IUi;
import be.iccbxl.poo.ui.UiConsole;

public class App {

	public static void main(String[] args) {
		IUi ui = new UiConsole();
		
		ui.run();
	}

}
