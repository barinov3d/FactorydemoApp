package demo.factory;

import demo.request.IRequest;

public interface IRequestfactory {
	IRequest createRequestAsString(String pojoObject, WebAppName webAppName);
}
