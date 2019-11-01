package demo.request;

public class RequestStartApp3 implements IRequest {

	private String requestBody;
	
	@Override
	public void printRequest() {
		System.out.println(requestBody);
	}

	public RequestStartApp3(String requestBody) {
		super();
		this.requestBody = requestBody + "33333";
	}
}
