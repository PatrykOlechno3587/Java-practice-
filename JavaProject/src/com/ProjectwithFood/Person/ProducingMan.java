package com.ProjectwithFood.Person;

import com.ProjectwithFood.Product.Food;

public interface ProducingMan {

    Food produce(String productName, ConsumingMan consumingMan);
}
