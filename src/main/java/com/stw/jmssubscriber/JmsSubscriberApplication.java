package com.stw.jmssubscriber;

import com.stw.jmssubscriber.subscriber.NewsSubscriber;
import java.io.IOException;
import javax.jms.JMSException;
import javax.jms.Topic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
@EnableJms
@Slf4j
public class JmsSubscriberApplication {

	public static void main(String[] args) throws IOException, JMSException {
		ConfigurableApplicationContext context = SpringApplication.run(JmsSubscriberApplication.class, args);
                System.in.read();
	}

}
