package demo.request;

public class RequestStartApp2 implements IRequest {

	private String requestBody;
	
	@Override
	public void printRequest() {
		System.out.println(requestBody);
	}

	public RequestStartApp2(String requestBody) {
		super();
		this.requestBody = requestBody;
	}
}
