package com.lenir.startspringjpa.repository;

import com.lenir.startspringjpa.entity.ItemInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<ItemInfo, Integer> {
    public List<ItemInfo> findByItemId(Integer itemId);
}
