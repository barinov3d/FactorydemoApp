package demo.factory;

import demo.request.IRequest;
import demo.request.RequestNext1App1;
import demo.request.RequestNext1App2;
import demo.request.RequestStartApp1;
import demo.request.RequestStartApp2;
import demo.request.RequestStartApp3;

public class RequestStartFactory implements IRequestfactory {

	@Override
	public IRequest createRequestAsString(String pojoObject, WebAppName webAppName) {
		IRequest request = null;
		switch (webAppName) {
		case APP1:
			request =new RequestStartApp1(pojoObject, "9200229668", "200_000");
			break;
		case APP2:
			request =new RequestStartApp2(pojoObject);
			break;
		case APP3:
			request =new RequestStartApp3(pojoObject);
			break;
		default:
			break;
		}
		return request;
	}
}
