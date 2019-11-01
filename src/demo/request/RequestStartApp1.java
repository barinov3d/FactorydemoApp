package demo.request;

public class RequestStartApp1 implements IRequest {

	private String requestBody;
	
	@Override
	public void printRequest() {
		System.out.println(requestBody);
	}

	public RequestStartApp1(String requestBody, String mobile, String sum) {
		super();
		this.requestBody = requestBody + " " + mobile + " " + sum;
	}
}
