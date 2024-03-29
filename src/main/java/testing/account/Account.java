package testing.account;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Account {

    private boolean active;
    @Setter
    private Address defaultDeliveryAddress;

    public Account(){
        this.active=false;
    }

    public Account(Address defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
        if(defaultDeliveryAddress != null){
            active();
        } else {
            this.active=false;
        }
    }

    public void active(){
        this.active=true;
    }

}
