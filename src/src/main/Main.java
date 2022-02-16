package src.main;

import java.util.Arrays;
import java.util.List;

import com.designpattern.abstractFactory.AppleFactory;
import com.designpattern.abstractFactory.Notebook;
import com.designpattern.abstractFactory.SamsungFactory;
import com.designpattern.abstractFactory.Smartphone;
import com.designpattern.abstractFactory.TechFactory;
import com.designpattern.adaptor.ConsumerClient;
import com.designpattern.adaptor.NewDataFormat;
import com.designpattern.adaptor.OldService;
import com.designpattern.adaptor.OldService2;
import com.designpattern.adaptor.OldService2Adaptor;
import com.designpattern.adaptor.OldServiceAdaptor;
import com.designpattern.factory.ConcreteCreatorRed;
import com.designpattern.factory.ConcreteCreatorYellow;
import com.designpattern.factory.Creator;
import com.designpattern.singleton.Singleton;

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
		System.out.println(sg1 == sg2); // Return as true, confirm both instances are the same object

		// 4. Adaptor
		ConsumerClient consumerClient = new ConsumerClient();
		NewDataFormat newData = new NewDataFormat();

		// In normal case, consumerClient can consume data under NewDataFormat
		System.out.println(consumerClient.consumeData(newData));

		OldService oldService = new OldService();
		OldService2 oldService2 = new OldService2();

		// Can't compile because oldService is returning int in getData() method
		// consumerClient.consumeData(oldService);
		// consumerClient.consumeData(oldService2);

		// Wrapped by a Adaptor class
		OldServiceAdaptor oldServiceAdaptor = new OldServiceAdaptor(oldService);
		OldService2Adaptor oldService2Adaptor = new OldService2Adaptor(oldService2);

		// Can compile and return true now
		System.out.println(consumerClient.consumeData(oldServiceAdaptor));
		System.out.println(consumerClient.consumeData(oldService2Adaptor));

	}

}
