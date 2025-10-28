package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    //private ArrayList<City> list;
    /**
     * create a mocklist for citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    public int countCitiesMock(){
        return list.getCount();
    }


    /**
     * get the size of the list
     * increase list by adding new city
     * check f current size matches initial size plus 1
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize +1);
    }

    @Test
    public void testReturnSize(){
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), 1);
    }

    @Test
    public void testHasCity(){
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        City city = list.getCities().get(0);
        assertEquals(true, list.hasCity(city));
    }

    @Test
    public void testDeleteCity(){
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        City city = list.getCities().get(0);
        list.delete(city);
        assertEquals(0, cityList.getCities().size());
    }


}
