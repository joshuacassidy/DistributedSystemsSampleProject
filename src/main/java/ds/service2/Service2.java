package ds.service2;

import java.io.IOException;

import ds.service2.GetAllTodosResponseMessage.Builder;
import ds.service2.Service2Grpc.Service2ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class Service2 extends Service2ImplBase{



	public static void main(String[] args) throws InterruptedException, IOException {
		Service2 service1 = new Service2();

		int port = 50052;

		Server server = ServerBuilder.forPort(port)
				.addService(service1)
				.build()
				.start();

		System.out.println("Service-2 started, listening on " + port);

		server.awaitTermination();
	}


	@Override
	public void service2Do(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {

		//prepare the value to be set back
		String text = request.getText();
		TodoList.getInstance().add(text);
		
		System.out.println(TodoList.getInstance());
		
		
		//preparing the response message
		try {
			String message = "Your todo has been created";
			boolean success = true;
			int status = 201;
			
			ResponseMessage reply = ResponseMessage.newBuilder()
					.setMessage(message)
					.setSuccess(success)
					.setStatus(status)
					.build();

			responseObserver.onNext( reply ); 

			responseObserver.onCompleted();

		} catch(Exception e) {
			String message = "An error occured";
			boolean success = false;
			int status = 500;
			
			ResponseMessage reply = ResponseMessage.newBuilder()
					.setMessage(message)
					.setSuccess(success)
					.setStatus(status)
					.build();

			responseObserver.onNext( reply ); 

			responseObserver.onCompleted();
		}
		
	}
	
	
	@Override
	public void getTodo(GetTodoRequestMessage request, StreamObserver<GetTodoResponseMessage> responseObserver) {

		
		//preparing the response message
		try {
			int index = request.getIndex();
			String text = TodoList.getInstance().get(index);
			
			int status = 200;
			
			GetTodoResponseMessage reply = GetTodoResponseMessage.newBuilder()
					.setStatus(status)
					.setText(text)
					.build();

			responseObserver.onNext( reply ); 

			responseObserver.onCompleted();

		}  catch(Exception e) {
			System.out.println(e);
			int status = 500;
			
			GetTodoResponseMessage reply = GetTodoResponseMessage.newBuilder()
					.setStatus(status)
					.build();

			responseObserver.onNext( reply ); 

			responseObserver.onCompleted();
		}
		
	}
	
	
	
	@Override
	public void getAllTodos(GetAllTodosRequestMessage request, StreamObserver<GetAllTodosResponseMessage> responseObserver) {

				
		
		//preparing the response message
		try {
			String message = "Your todo has been created";
			boolean success = true;
			int status = 200;
			
			Builder builderReply = GetAllTodosResponseMessage.newBuilder();
			for(String i : TodoList.getInstance()) {
				builderReply.addTodos(i);
			}
			builderReply.setStatus(status);
					
			GetAllTodosResponseMessage reply = builderReply.build();

			responseObserver.onNext( reply ); 

			responseObserver.onCompleted();

		} catch(Exception e) {
			String message = "An error occured";
			boolean success = false;
			int status = 500;
			
			GetAllTodosResponseMessage reply =GetAllTodosResponseMessage.newBuilder()
					.setMessage(message)
					.setStatus(status)
					.build();

			responseObserver.onNext( reply ); 

			responseObserver.onCompleted();
		}
		
	}
	
	
	
	
}
