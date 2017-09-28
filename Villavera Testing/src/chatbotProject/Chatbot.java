package chatbotProject;

public class Chatbot {

	private String userName;
	private Topic erik;
	private boolean chatting;
	
	public Chatbot() {
		erik = new ChatbotErik();
		userName = "unknown user";
		chatting = true;
	}
	
	public void startTalking() {
		ChatbotMain.print("Welcome to our chatbot! What is your name?");
		userName = ChatbotMain.getInput();
		while(chatting) {
			ChatbotMain.print("What do you want to talk about?");
			String response = ChatbotMain.getInput();
			if(erik.isTriggered(response)) {
				chatting = false;
				erik.startChatting;
			}else {
				ChatbotMain.print("I'm sorry. I don't understand.");
			}
		}
	}

}
