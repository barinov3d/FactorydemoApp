package demo.request;

public class RequestNext1App3 implements IRequest {

	private String requestBody;
	
	@Override
	public void printRequest() {
		System.out.println(requestBody);
	}

	public RequestNext1App3(String requestBody) {
		super();
		this.requestBody = requestBody + "!!!";
	}
}
