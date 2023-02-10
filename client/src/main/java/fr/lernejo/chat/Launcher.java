package fr.lernejo.chat;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Launcher {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Launcher.class);
        RabbitTemplate rabbitTemplate = context.getBean(RabbitTemplate.class);
        System.out.println("Input a message, we will send it for you (q for quit)");
        try (
            Scanner scanner = new Scanner( System.in ) ) {

            while( true ) {

                String value = scanner.nextLine();


                if (value.equals( "q" )) {
                    System.out.println("Bye");
                    break;
                }
                else {
                    rabbitTemplate.convertAndSend("","chat_messages",value);
                    System.out.println("Message sent. Input a message, we will sent it for you");




                }
            }

        }



        //bean.run();
        context.close();



    }

}
