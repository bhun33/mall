package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String productId;
    private String address;
    private String status;
}


