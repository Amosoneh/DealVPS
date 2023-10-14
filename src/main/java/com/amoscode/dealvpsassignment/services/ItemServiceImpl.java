package com.amoscode.dealvpsassignment.services;

import com.amoscode.dealvpsassignment.datas.dtos.AddItemRequest;
import com.amoscode.dealvpsassignment.datas.models.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{
    private final List <Item> items = new ArrayList<>();
    private int count = 1;

    // THIS METHOD IS USE TO ADD AN ITEM TO THE ITEM LIST
    @Override
    public Item addItem(AddItemRequest request) {
        Item item = Item.builder()
                .description(request.getDescription())
                .name(request.getName())
                .build();
        // CHECK IF THERE IS DUPLICATE WITH SAME NAME
        var noDuplicate = items.stream().noneMatch(item1 -> item1.getName().equals(item.getName()));
        if(noDuplicate){
            item.setId(count++);
            items.add(item);
            return item;
        }
        return null;
    }
    @Override
    public Item addItem(Item item) {
        // CHECK IF THERE IS DUPLICATE WITH SAME NAME
        var noDuplicate = items.stream().noneMatch(item1 -> item1.getName().equals(item.getName()));
        if(noDuplicate){
            item.setId(count++);
            items.add(item);
            return item;
        }
        return null;
    }

    // THIS METHOD RETURNS A SINGLE ITEM FROM THE LIST OF ITEMS
    @Override
    public Item getItem(int itemId) {
        return searchItem(items, itemId);

    }

    /* THIS METHOD IS USE TO QUERY THE LIST WITH A PARTICULAR ID
         AND RETURN NULL IF THE ITEM WITH THE ID IS NOT FOUND
     */
    public static Item searchItem(List<Item> itemList, int itemId){
        for (Item item : itemList) {
            if (item.getId() == itemId) {
                return item;
            }
        }return null;
    }


    // THIS METHOD RETURNS ALL THE ITEM IN THE LIST
    public List<Item> getAllItems(){
        return items;
    }
}
