package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveriedStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String productId;
    private String address;
    private String status;

    public DeliveriedStarted(Delivery aggregate){
        super(aggregate);
    }
    public DeliveriedStarted(){
        super();
    }
}
