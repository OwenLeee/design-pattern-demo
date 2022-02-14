package src.main;

import com.designpattern.factory.ConcreteCreatorRed;
import com.designpattern.factory.ConcreteCreatorYellow;
import com.designpattern.factory.Creator;

public class Main {

	public static void main(String[] args) {
		// 1. Factory Method
		Creator redFlowerCreator = new ConcreteCreatorRed();
		redFlowerCreator.waterFlower();
		
		Creator yellowFlowerCreator = new ConcreteCreatorYellow();
		yellowFlowerCreator.waterFlower();
	}

}
