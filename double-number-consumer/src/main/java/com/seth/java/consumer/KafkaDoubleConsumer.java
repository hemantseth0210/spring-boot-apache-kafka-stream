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
public class KafkaDoubleConsumer {

	@KafkaListener(topics = "${kafka.topic.odd-output}")
    public void consume(Long number)  {
        System.out.println(String.format("Doubled Odd :: %d", number));
    }
}
