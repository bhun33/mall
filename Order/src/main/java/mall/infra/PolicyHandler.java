package mall.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import mall.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import mall.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired OrderRepository orderRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryCanceled'")
    public void wheneverDeliveryCanceled_UpdateStatus(@Payload DeliveryCanceled deliveryCanceled){

        DeliveryCanceled event = deliveryCanceled;
        System.out.println("\n\n##### listener UpdateStatus : " + deliveryCanceled + "\n\n");


        

        // Sample Logic //
        Order.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryReturned'")
    public void wheneverDeliveryReturned_UpdateStatus(@Payload DeliveryReturned deliveryReturned){

        DeliveryReturned event = deliveryReturned;
        System.out.println("\n\n##### listener UpdateStatus : " + deliveryReturned + "\n\n");


        

        // Sample Logic //
        Order.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveriedStarted'")
    public void wheneverDeliveriedStarted_UpdateStatus(@Payload DeliveriedStarted deliveriedStarted){

        DeliveriedStarted event = deliveriedStarted;
        System.out.println("\n\n##### listener UpdateStatus : " + deliveriedStarted + "\n\n");


        

        // Sample Logic //
        Order.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryCompleted'")
    public void wheneverDeliveryCompleted_UpdateStatus(@Payload DeliveryCompleted deliveryCompleted){

        DeliveryCompleted event = deliveryCompleted;
        System.out.println("\n\n##### listener UpdateStatus : " + deliveryCompleted + "\n\n");


        

        // Sample Logic //
        Order.updateStatus(event);
        

        

    }

}


