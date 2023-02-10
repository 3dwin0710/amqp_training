package fr.lernejo.chat;

import org.json.simple.JSONArray;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatMessageController {
    @GetMapping("api/message")
    String displaymessage(ChatMessageRepository chatMessageRepository){
        //System.out.println(chatMessageRepository.getLastTenMessages());
        return JSONArray.toJSONString(chatMessageRepository.getLastTenMessages());
    }
}
