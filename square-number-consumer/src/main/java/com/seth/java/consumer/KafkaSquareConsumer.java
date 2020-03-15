/**
 * 
 */
package com.seth.java.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author heseth
 *
 */
@Component
public class KafkaSquareConsumer {

	@KafkaListener(topics = "${kafka.topic.even-output}")
    public void consume(Long number)  {
        System.out.println(String.format("Consumed :: %d", number));
    }
}
