package fr.lernejo.chat;


import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {
    ChatMessageRepository chatMessageRepository = new ChatMessageRepository();

    void onMessage(String receivemessage){
        chatMessageRepository.addChatMessage(receivemessage);
        chatMessageRepository.getLastTenMessages();
        //System.out.println(receivemessage);
    }

}
