package mediator;

public class MediatorMain {

	public static void main(String[] args) {
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Petar");
		
		
		User user2 = new ChatUser(chat, "Martin");
		
		
		User user3 = new ChatUser(chat, "Stefan");
		
		user1.send("Hello, my friend!");
		
		
		user2.send("addBot");
		
		
		user3.send("cat");
		
		
		user3.send("I'm so sorry!");

	}

}
