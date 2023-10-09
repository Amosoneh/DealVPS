package com.amoscode.dealvpsassignment.services;

import com.amoscode.dealvpsassignment.datas.dtos.AddItemRequest;
import com.amoscode.dealvpsassignment.datas.models.Item;

public interface ItemService {
    Item addItem(AddItemRequest request);
    Item getItem(int itemId);


}
