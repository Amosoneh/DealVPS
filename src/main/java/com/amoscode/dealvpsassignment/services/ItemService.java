package com.amoscode.dealvpsassignment.services;

import com.amoscode.dealvpsassignment.datas.dtos.AddItemRequest;
import com.amoscode.dealvpsassignment.datas.models.Item;

public interface ItemService {
    Item addItem(AddItemRequest request);
    Item addItem(Item item);
    Item getItem(int itemId);


}
