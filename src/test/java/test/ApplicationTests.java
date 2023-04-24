package test;

import org.feather.kafka.producer.KafkaProducerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @projectName: kafka-consumer
 * @package: org.feather.kafka.producer.test
 * @className: ApplicationTests
 * @author: feather(杜雪松)
 * @description: TODO
 * @since: 2023-04-24 14:06
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @Test
    public void  send() throws InterruptedException {
        String topic="topic02";
        for (int i = 0; i < 10; i++) {
            kafkaProducerService.sendMessage(topic,"hello kafka"+i);
            Thread.sleep(5);
        }
       // Thread.sleep(Integer.MAX_VALUE);
    }

}
