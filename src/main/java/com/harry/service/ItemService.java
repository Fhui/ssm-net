package com.harry.service;

import com.harry.entity.Items;
import com.harry.entity.User;

import java.util.List;

public interface ItemService {

    List<Items> getAllItems();

    Items getItemsById(Integer id);

    int updateItem(Items items);

    int insertItem(Items items);

    int deleteItem(Integer id);

}