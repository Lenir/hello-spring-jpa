package com.lenir.startspringjpa.controller;

import com.lenir.startspringjpa.entity.ItemInfo;
import com.lenir.startspringjpa.service.ItemInfoService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ItemController {
    @Autowired
    ItemInfoService itemInfoService;

    @GetMapping("/item/select")
    String selectItem(@Valid @NotNull @RequestParam Integer itemId){
        return itemInfoService.selectItemInfo(itemId).toString();
    }

    @GetMapping("/item/save")
    String saveItem(@Valid @NotNull @RequestParam String itemName, @Valid @NotNull @RequestParam Integer itemAmount){
        return itemInfoService.insertItemInfo(ItemInfo.builder()
                .itemName(itemName)
                .itemAmount(itemAmount)
                .build()).toString();
    }
}
