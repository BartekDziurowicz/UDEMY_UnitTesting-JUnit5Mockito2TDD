package testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.*;

class OrderStatusTest {

    @ParameterizedTest
    @EnumSource(OrderStatus.class)
    void allOrderStatusShouldBeShorterThan15Characters(OrderStatus orderstatus){
        assertThat(orderstatus.toString().length(), lessThan(15));
    }

}