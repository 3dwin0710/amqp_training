package fr.lernejo.chat;


import java.util.*;

public class ChatMessageRepository {

    static List<String> listapp = new ArrayList<>();


    void addChatMessage(String message) {
        listapp.add(message);
    }

    List<String> getLastTenMessages() {
        //Deque<String> addmessage = new ArrayDeque<>();
        int lastIdx = listapp.size() - 1;
        int limit =0;
        //System.out.println(listapp.get(lastIdx));

        List<String> repolist = new ArrayList<>(10);
        if (listapp.size() == 1) {
            return listapp;
        } else {
            for (int counter = lastIdx ; counter > 0; counter--) {

                repolist.add(listapp.get(counter));
                //System.out.println(counter);
                limit+=1;

                if(limit==10){
                    break;
                }


               /* if(repolist.size()-1==9){
                    counter= lastIdx;
                }
*/


            }
            return repolist;

        }
    }
}

