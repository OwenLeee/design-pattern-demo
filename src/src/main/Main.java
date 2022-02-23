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
import com.designpattern.bridge.JavaApplication;
import com.designpattern.bridge.MongoDB;
import com.designpattern.bridge.PostgreDB;
import com.designpattern.builder.Condo;
import com.designpattern.builder.CondoBuilder;
import com.designpattern.builder.Director;
import com.designpattern.builder.House;
import com.designpattern.builder.HouseBuilder;
import com.designpattern.command.Light;
import com.designpattern.command.LightOffCommand;
import com.designpattern.command.LightOnCommand;
import com.designpattern.command.RemoteControl;
import com.designpattern.factory.ConcreteCreatorRed;
import com.designpattern.factory.ConcreteCreatorYellow;
import com.designpattern.factory.Creator;
import com.designpattern.observer.EmailNotificationListener;
import com.designpattern.observer.MarketingOperator;
import com.designpattern.observer.MessageManager;
import com.designpattern.observer.SmsNotificationListener;
import com.designpattern.observer.SubscriptionType;
import com.designpattern.singleton.Singleton;
import com.designpattern.state.Girlfriend;

public class Main {

	public static void main(String[] args) {

		/******************** 1. Creational - Factory Method ********************/

		Creator redFlowerCreator = new ConcreteCreatorRed();
		Creator yellowFlowerCreator = new ConcreteCreatorYellow();

		List<Creator> creators = Arrays.asList(redFlowerCreator, yellowFlowerCreator);

		for (Creator creator : creators) {
			creator.waterFlower();
		}

		/******************** 2. Creational - Abstract Factory ********************/

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

		/******************** 3. Creational - Singleton ********************/

		Singleton sg1 = Singleton.getInstance();
		Singleton sg2 = Singleton.getInstance();
		System.out.println(sg1 == sg2); // Return as true, confirm both instances are the same object

		/******************** 4. Structural - Adaptor ********************/

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

		/******************** 5. Behavioral - Command ********************/

		Light light = new Light();

		// Create commands
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);

		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(lightOnCommand);
		remoteControl.pressButton();

		remoteControl.setCommand(lightOffCommand);
		remoteControl.pressButton();

		/******************** 6. Behavioral - Command ********************/
		MessageManager messageManager = new MessageManager();
		MarketingOperator marketingOperator = new MarketingOperator(messageManager);

		SmsNotificationListener smsNotificationListener1 = new SmsNotificationListener("Peter's");
		SmsNotificationListener smsNotificationListener2 = new SmsNotificationListener("Ken's");

		EmailNotificationListener emailNotificationListener1 = new EmailNotificationListener("Mary's");
		EmailNotificationListener emailNotificationListener2 = new EmailNotificationListener("Jane's");

		messageManager.subscribe(SubscriptionType.SMS, smsNotificationListener1);
		messageManager.subscribe(SubscriptionType.SMS, smsNotificationListener2);

		messageManager.subscribe(SubscriptionType.EMAIL, emailNotificationListener1);
		messageManager.subscribe(SubscriptionType.EMAIL, emailNotificationListener2);

		marketingOperator.sendSmsMsg("Testing Sms!");
		marketingOperator.sendEmailMsg("Testing Email!");

		messageManager.unsubscribe(SubscriptionType.EMAIL, emailNotificationListener1);

		marketingOperator.sendEmailMsg("Mary has unsubsribed Email!");

		/******************** 7. Creational - Builder ********************/
		CondoBuilder condoBuilder = new CondoBuilder();
		HouseBuilder houseBuilder = new HouseBuilder();

		Director director = new Director();
		director.setBuilder(condoBuilder);
		director.constructCondo();
		Condo newCondo = condoBuilder.getProduct();
		System.out
				.println("New Condo has " + newCondo.getWindows() + " windows, " + newCondo.getBalcony() + " balcony, "
						+ newCondo.getAirConditioner() + " air conditioner, " + newCondo.getHeater() + " heater.");

		director.setBuilder(houseBuilder);
		director.constructHouse();
		House newHouse = houseBuilder.getProduct();
		System.out
				.println("New House has " + newHouse.getWindows() + " windows, " + newHouse.getBalcony() + " balcony, "
						+ newHouse.getAirConditioner() + " air conditioner, " + newHouse.getHeater() + " heater.");
		
		/******************** 8. Structural - Bridge ********************/
		PostgreDB pg = new PostgreDB();
		MongoDB mongo = new MongoDB();
		JavaApplication javaAppWithPostgreDB = new JavaApplication(pg);
		javaAppWithPostgreDB.saveData("Save from pg");
		javaAppWithPostgreDB.getDataById(123);
		javaAppWithPostgreDB.updateDataById("New data saved");
		javaAppWithPostgreDB.deleteDataById(123);
		
		JavaApplication javaAppWithMongoDB = new JavaApplication(mongo);
		javaAppWithMongoDB.saveData("Save from mongo");
		javaAppWithMongoDB.getDataById(3321312);
		javaAppWithMongoDB.updateDataById("New object saved");
		javaAppWithMongoDB.deleteDataById(3321312);
		
		/******************** 9. Behavioral - State ********************/
		System.out.println("--------------------------");
		Girlfriend gf = new Girlfriend();
		gf.goToShoppoing();
		gf.getHungry();
		gf.goToWork();
		gf.goToShoppoing();
		gf.listenAJoke();
		gf.offWork();
		gf.listenAJoke();
		gf.goToShoppoing();
		
		
	
	}

}
