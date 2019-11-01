package demo;

import demo.factory.RequestNext1Factory;
import demo.factory.RequestStartFactory;
import demo.factory.WebAppName;

public class FactoryDemoApp {

	public static void main(String[] args) {
		new RequestStartFactory().createRequestAsString("START APP1",WebAppName.APP1).printRequest();
		new RequestStartFactory().createRequestAsString("START APP2",WebAppName.APP2).printRequest();
		new RequestStartFactory().createRequestAsString("START APP3",WebAppName.APP3).printRequest();
		new RequestNext1Factory().createRequestAsString("NEXT1 APP1",WebAppName.APP1).printRequest();
		new RequestNext1Factory().createRequestAsString("NEXT1 APP2",WebAppName.APP2).printRequest();
		new RequestNext1Factory().createRequestAsString("NEXT1 APP3",WebAppName.APP3).printRequest();

	}
}
