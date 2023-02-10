package fr.lernejo.chat;


import java.util.*;

public class ChatMessageRepository {

    static List<String> listapp = new ArrayList<>();


    void addChatMessage(String message) {
        listapp.add(message);
    }

    List<String> getLastTenMessages(){
        //Deque<String> addmessage = new ArrayDeque<>();
        int lastIdx = listapp.size();
        List<String> repolist = new ArrayList<>(10);
        if(listapp.size()>10) {
            for (int counter = 1; counter<10; counter++) {
                repolist.add(listapp.get(lastIdx - counter));
            }
        }else{
            for(int counter2=1; counter2<=lastIdx;counter2++){
                repolist.add(listapp.get(lastIdx-counter2));
            }
        }
        return repolist;
    }

    // Source aider par les camarades de classe


}

