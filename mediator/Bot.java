package mediator;

public class Bot {
	
	private static Bot instance;

	private Bot() {

	}
	
	public void addBot() {
		
		System.out.println("Bot added!");
		
	}
	
	
	public static Bot getInstance() {
		
		if(instance == null) {
			
			instance = new Bot();
		}
		
		return instance;
	}
	
	
	public boolean expurgation(String message, User user, Chat chat ) {
		
		if(message.equals("cat")) {
			
			chat.removeUser(message, user);
			
			System.out.println(user.getName() + " is excluded from chat!");

			return true;
			
		}
		return false;
	}

}
