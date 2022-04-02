package org.system;
//Assignment1:
//===========
//     Package   :
//     Class        :Computer
//     Methods   :computerModel()
//
//     Class        :Desktop
//     Methods   :desktopSize()
//
//Description:
//create above 2 class and call all your class methods into the Desktop using single inheritance.
//

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("Desktop size is normal");
	}
	public static void main(String[] args) {
		
		Desktop desktop= new Desktop();
		desktop.computerModel();
		desktop.desktopSize();

	}

}
