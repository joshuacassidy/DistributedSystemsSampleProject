package ds.client;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.google.protobuf.ProtocolStringList;

import ds.service1.Service1Grpc;
import ds.service2.Service2Grpc;
import ds.service3.Service3Grpc;
import ds.service4.Service4Grpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class ControllerGUI implements ActionListener{


	private JTextField entry1, otherEntry1, reply1;
	private JTextField entry2;
	private JTextField entry3, reply3;
	private JTextField entry4, reply4;


	private JTextField getTodoEntry;
	
	
	private JPanel getService1JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry1 = new JTextField("",10);
		panel.add(entry1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		
		JLabel label2 = new JLabel("Enter second value")	;
		panel.add(label2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		otherEntry1 = new JTextField("",10);
		panel.add(otherEntry1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 1");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply1 = new JTextField("", 10);
		reply1 .setEditable(false);
		panel.add(reply1 );

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService2JPanel() {

		

		
		JPanel panel = new JPanel();
		
		
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);	
		
		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry2 = new JTextField("",10);
		panel.add(entry2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 2");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		panel.setLayout(boxlayout);
		

		
		

		return panel;

	}

	private JPanel getService3JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry3 = new JTextField("",10);
		panel.add(entry3);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 3");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply3 = new JTextField("", 10);
		reply3 .setEditable(false);
		panel.add(reply3 );

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService4JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry4 = new JTextField("",10);
		panel.add(entry4);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 4");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply4 = new JTextField("", 10);
		reply4 .setEditable(false);
		panel.add(reply4 );

		panel.setLayout(boxlayout);

		return panel;

	}
	
	
	private JPanel getTodoJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Index of todo list")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		getTodoEntry = new JTextField("",10);
		panel.add(getTodoEntry);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Get Single Todo");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));


		panel.setLayout(boxlayout);

		return panel;

	}
	
	private JPanel getAllTodos() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		

		JButton button = new JButton("Get All Todos");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));


		panel.setLayout(boxlayout);

		return panel;

	}
	
	
	
	
	public static void main(String[] args) {

		ControllerGUI gui = new ControllerGUI();

		gui.build();
	}

	private void build() { 

		JFrame frame = new JFrame("Service Controller Sample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
	
		panel.add( getService1JPanel() );
		panel.add( getService2JPanel() );
		panel.add( getService3JPanel() );
		panel.add( getService4JPanel() );
		
		panel.add( getTodoJPanel() );
		panel.add( getAllTodos() );

		
		

		// Set size for the frame
		frame.setSize(300, 300);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		String label = button.getActionCommand();  

		if (label.equals("Invoke Service 1")) {
			System.out.println("service 1 to be invoked ...");

		
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			Service1Grpc.Service1BlockingStub blockingStub = Service1Grpc.newBlockingStub(channel);

			//preparing message to send
			System.out.println(entry1.getText());
			System.out.println(otherEntry1.getText());
			try {
				Integer number = Integer.parseInt(otherEntry1.getText());
				ds.service1.RequestMessage request = ds.service1.RequestMessage.newBuilder().setText(entry1.getText()).setNumber(number).build();

				//retreving reply from service
				ds.service1.ResponseMessage response = blockingStub.service1Do(request);

				reply1.setText( String.valueOf( response.getLength()) );
			} catch(Exception error) {
				 JOptionPane.showMessageDialog(null, "Please specify a number for the second input field");
			}
			
			
		
		}else if (label.equals("Invoke Service 2")) {
			System.out.println("service 2 to be invoked ...");

		
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
			Service2Grpc.Service2BlockingStub blockingStub = Service2Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service2.RequestMessage request = ds.service2.RequestMessage.newBuilder().setText(entry2.getText()).build();

			//retreving reply from service
			ds.service2.ResponseMessage response = blockingStub.service2Do(request);
			
			
			
			
			if(response.getStatus() == 201) {
				JOptionPane.showMessageDialog(null, String.valueOf( "Your todo: " + entry2.getText() + " has been added to the todo list"));
				
			} else {
				JOptionPane.showMessageDialog(null, String.valueOf( response.getMessage()));
				
			}
			
			
		}else if (label.equals("Invoke Service 3")) {
			System.out.println("service 3 to be invoked ...");

		
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
			Service3Grpc.Service3BlockingStub blockingStub = Service3Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service3.RequestMessage request = ds.service3.RequestMessage.newBuilder().setText(entry3.getText()).build();

			//retreving reply from service
			ds.service3.ResponseMessage response = blockingStub.service3Do(request);

			reply3.setText( String.valueOf( response.getLength()) );
		
		}else if (label.equals("Invoke Service 4")) {
			System.out.println("service 4 to be invoked ...");

		
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50054).usePlaintext().build();
			Service4Grpc.Service4BlockingStub blockingStub = Service4Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service4.RequestMessage request = ds.service4.RequestMessage.newBuilder().setText(entry4.getText()).build();

			//retreving reply from service
			ds.service4.ResponseMessage response = blockingStub.service4Do(request);

			reply4.setText( String.valueOf( response.getLength()) );
		
		} else if (label.equals("Get Single Todo")) {
			
		
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
			Service2Grpc.Service2BlockingStub blockingStub = Service2Grpc.newBlockingStub(channel);

			//preparing message to send
			try {
				int index = Integer.parseInt(getTodoEntry.getText());
				ds.service2.GetTodoRequestMessage request = ds.service2.GetTodoRequestMessage.newBuilder().setIndex(index).build();

				//retreving reply from service
				ds.service2.GetTodoResponseMessage response = blockingStub.getTodo(request);


				
				
				
				
				if(response.getStatus() == 200) {
					JOptionPane.showMessageDialog(null, String.valueOf( "The todo at index " +index  +" is: " + entry2.getText()));
					
				} else {
					JOptionPane.showMessageDialog(null, String.valueOf( response.getMessage()));
			
				}

				
			} catch(Exception error) {
					JOptionPane.showMessageDialog(null, "Please specify a numerical index for the todo ");
				
			}
				
			
		} else if(label.equals("Get All Todos")) {
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
			Service2Grpc.Service2BlockingStub blockingStub = Service2Grpc.newBlockingStub(channel);
			ProtocolStringList todos = blockingStub.getAllTodos(ds.service2.GetAllTodosRequestMessage.newBuilder().build()).getTodosList();
			// https://stackoverflow.com/questions/13334198/java-custom-buttons-in-showinputdialog if you want to add more options to your joption pane dialog
			for(int i = 0; i < todos.size(); i++) {
				JOptionPane.showMessageDialog(null, "The todo at index: " + i + " is: " + todos.get(i));
			}
			

		}else{
		}
			
		

	}

}
