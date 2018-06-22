package com.harry.service.impl;

import com.harry.entity.Items;
import com.harry.mapper.ItemsMapper;
import com.harry.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemsMapper mapper;

//    @Autowired
//    public ItemServiceImpl(ItemsMapper mapper) {
//        this.mapper = mapper;
//    }

    public List<Items> getAllItems() {
        return mapper.getItems();
    }
}
