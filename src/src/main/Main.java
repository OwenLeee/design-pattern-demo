package src.main;

import java.util.Arrays;
import java.util.List;

import com.designpattern.abstractFactory.AppleFactory;
import com.designpattern.abstractFactory.Notebook;
import com.designpattern.abstractFactory.SamsungFactory;
import com.designpattern.abstractFactory.Smartphone;
import com.designpattern.abstractFactory.TechFactory;
import com.designpattern.factory.ConcreteCreatorRed;
import com.designpattern.factory.ConcreteCreatorYellow;
import com.designpattern.factory.Creator;

import src.designpattern.singleton.Singleton;

public class Main {

	public static void main(String[] args) {
		// 1. Factory Method
		Creator redFlowerCreator = new ConcreteCreatorRed();
		Creator yellowFlowerCreator = new ConcreteCreatorYellow();

		List<Creator> creators = Arrays.asList(redFlowerCreator, yellowFlowerCreator);

		for (Creator creator : creators) {
			creator.waterFlower();
		}

		// 2. Abstract Factory
		TechFactory appleFactory = new AppleFactory();
		TechFactory samsungFactory = new SamsungFactory();

		List<TechFactory> techFactories = Arrays.asList(appleFactory, samsungFactory);

		for (TechFactory techFactory : techFactories) {
			Notebook notebook = techFactory.createNotebook();
			notebook.cpuSpeed();
			notebook.monitorSize();

			Smartphone smartphone = techFactory.createSmartphone();
			smartphone.monitorResolution();
			smartphone.isSupport5G();
		}

		// 3. Singleton
		Singleton sg1 = Singleton.getInstance();
		Singleton sg2 = Singleton.getInstance();
		System.out.println(sg1 == sg2); //Return as true, confirm both instances are the same object

	}

}
