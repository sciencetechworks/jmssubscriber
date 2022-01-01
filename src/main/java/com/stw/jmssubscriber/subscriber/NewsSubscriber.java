package com.stw.jmssubscriber.subscriber;

import com.stw.shared.News;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
@Slf4j
@EnableJms
public class NewsSubscriber {
	@JmsListener(destination = "spring", containerFactory = "jmsContainerFactory")
	public void receiveNews(News news) {
		log.info("Receiver1: " + news);
	}
}