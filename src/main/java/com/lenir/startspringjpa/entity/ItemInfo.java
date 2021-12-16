package com.lenir.startspringjpa.entity;

import lombok.*;
import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Data
@Entity(name = "tb_item_info")
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Setter
@Getter
public class ItemInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemId;

    private String itemName;

    private Integer itemAmount;
}
