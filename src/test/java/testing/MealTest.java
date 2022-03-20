package testing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void shouldReturnDiscountedPrice() {
        //given + when
        Meal meal = new Meal(35);
        //then
        assertEquals(28, meal.getDiscountedPrice(7));
        //then cd...     hamcrest matchery
        assertThat(meal.getDiscountedPrice(7), is(28));
    }

    @Test
    void referencesToTheSameObjectShouldBeEqual(){
        //given + when
        Meal meal1 = new Meal(10);
        Meal meal2 = meal1;
        //then
        assertSame(meal1, meal2);
        //then cd...     hamcrest matchery
        assertThat(meal1, sameInstance(meal2));
    }

    @Test
    void referencesToTheSameObjectShouldNotBeEqual(){
        //given + when
        Meal meal1 = new Meal(10);
        Meal meal2 = new Meal(20);
        //then
        assertNotSame(meal1, meal2);
        //then cd...     hamcrest matchery
        assertThat(meal1, not(sameInstance(meal2)));
    }

    @Test
    void twoMealsShouldBeEqualWhenPriceAndNameAreTheSame(){
        //given + when
        Meal meal1 = new Meal(10, "Pizza");
        Meal meal2 = new Meal(10, "Pizza");
        //then
        assertEquals(meal1, meal2);
    }

    @Test
    void exceptionShouldBeThrownIfDiscountIsHigherThanPrice(){

        //given
        Meal meal = new Meal(8, "Soup");

        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> meal.getDiscountedPrice(40));
    }
}