package com.harry.service.impl;

import com.harry.entity.Items;
import com.harry.mapper.ItemsMapper;
import com.harry.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemsMapper mapper;

    @Autowired
    public ItemServiceImpl(ItemsMapper mapper) {
        this.mapper = mapper;
    }

//    @Autowired
//    public ItemServiceImpl(ItemsMapper mapper) {
//        this.mapper = mapper;
//    }

    public List<Items> getAllItems() {
        return mapper.selectAll();
    }

    public Items getItemsById(Integer id) {
        return mapper.select(id);
    }

    public int updateItem(Items items) {
        return mapper.update(items);
    }

    public int insertItem(Items items) {
        return mapper.insert(items);
    }

    public int deleteItem(Integer id) {
        return mapper.delete(id);
    }
}
