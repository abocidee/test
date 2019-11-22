package inversionofcontroller;

public class NotificationSystem {
 private EmailService service ;
	public NotificationSystem() {
		// TODO Auto-generated constructor stub
		service=new EmailService();
	}
  
	public void interestingEventhappend() {
		service.sendMessage();
	}
}
