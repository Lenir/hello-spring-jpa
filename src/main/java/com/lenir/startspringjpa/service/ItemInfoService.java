package com.lenir.startspringjpa.service;

import com.lenir.startspringjpa.entity.ItemInfo;
import com.lenir.startspringjpa.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemInfoService {
    @Autowired
    ItemRepository itemRepository;

    public ItemInfo insertItemInfo(ItemInfo itemInfo){
        return itemRepository.save(itemInfo);
    }

    public List<ItemInfo> selectItemInfo(Integer itemId){
        return itemRepository.findByItemId(itemId);
    }
}
