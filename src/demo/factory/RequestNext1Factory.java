package demo.factory;

import demo.request.IRequest;
import demo.request.RequestNext1App1;
import demo.request.RequestNext1App2;
import demo.request.RequestNext1App3;
import demo.request.RequestStartApp1;
import demo.request.RequestStartApp2;

public class RequestNext1Factory implements IRequestfactory {

	@Override
	public IRequest createRequestAsString(String pojoObject, WebAppName webAppName) {
		IRequest request = null;
		switch (webAppName) {
		case APP1:
			request =new RequestNext1App1(pojoObject, "9202923765", "600_000руб");
			break;
		case APP2:
			request =new RequestNext1App2(pojoObject, "1_000_000");
			break;
		case APP3:
			request =new RequestNext1App3(pojoObject);
			break;
		default:
			break;
		}
		return request;
	}
}
