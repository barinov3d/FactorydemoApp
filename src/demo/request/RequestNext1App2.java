package demo.request;

public class RequestNext1App2 implements IRequest {

	private String requestBody;
	
	@Override
	public void printRequest() {
		System.out.println(requestBody);
	}

	public RequestNext1App2(String requestBody, String maxSum) {
		super();
		this.requestBody = requestBody + " " + maxSum;
	}
}
