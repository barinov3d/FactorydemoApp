package demo.request;

public class RequestNext1App1 implements IRequest {

	private String requestBody;
	
	@Override
	public void printRequest() {
		System.out.println(requestBody);
	}

	public RequestNext1App1(String requestBody, String mobile, String sum) {
		super();
		this.requestBody = requestBody + " " + mobile + " " + sum;
	}
}
