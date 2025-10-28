package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    //private CustomList list;
    private ArrayList<City> list;
    /**
     * create a mocklist for citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    public int countCitiesMock(){
        return list.size();
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
        assertEquals(1, countCitiesMock());
    }



}
