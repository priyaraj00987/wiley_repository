package ThreadsConcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RequestProcessors {
	private ExecutorService threadPool;
	private ThreadGroup databaseThreadGroup;
	private ThreadGroup reportThreadGroup;
	
	public RequestProcessors(){
		threadPool = Executors.newFixedThreadPool(0);
	}
	
	public void processRequest(Request request) {
		Runnable Task = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
}


enum RequestType{
	DATABASE_QUERY,
	REPORT_GENERATION
}

class Request{
	private RequestType type;
	private String data;
	public Request(RequestType type, String data) {
		super();
		this.type = type;
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}