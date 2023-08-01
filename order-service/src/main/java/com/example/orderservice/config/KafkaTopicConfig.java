package com.example.orderservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration // By giving @configuration now the class becomes spring base java configuration class
public class KafkaTopicConfig {


    @Value("${spring.kafka.topic.name}") // taking the topic name from spring bean
    private String topicName;
    @Bean // spring bean will reconginse this will as spring bean
    public NewTopic topic(){
        return TopicBuilder.name(topicName)
                .build();

    }

}
