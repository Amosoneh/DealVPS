package com.amoscode.dealvpsassignment.controllers;

import com.amoscode.dealvpsassignment.datas.dtos.AddItemRequest;
import com.amoscode.dealvpsassignment.datas.models.Item;
import com.amoscode.dealvpsassignment.services.ItemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@Validated
@RequiredArgsConstructor
@RequestMapping("/")
public class ItemController {

    private final ItemServiceImpl itemService;

    // THIS IS THE ENDPOINT FOR CREATING AN ITEM AND IT REQUIRES REQUEST BODY
    @PostMapping("/addItem")
    public ResponseEntity<?> addItem(@RequestBody @Valid AddItemRequest request){
            var res = itemService.addItem(request);
            if (res != null) {
                return ResponseEntity.status(HttpStatus.CREATED).body(res);
            }
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Item with already exist with that name");

    }

    //THIS ENDPOINT IS FOR GETTING A SINGLE ITEM FROM THE DATABASE AND REQUIRES AN ITEM ID AN A PARAMETER

    @GetMapping("/getItem")
    public ResponseEntity<?> getItem(@RequestParam int itemId){
        var res = itemService.getItem(itemId);
        if(res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Item not found");
    }

    //THIS ENDPOINT IS USE TO GET ALL THE ITEM IN THE DATABASE
    @GetMapping("/getAllItem")
    public ResponseEntity<?> getAllItem(){
        return ResponseEntity.ok(itemService.getAllItems());
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model){
        List<Item> items = itemService.getAllItems();
        model.addAttribute("items", items);
        model.addAttribute("item", new Item());
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addNewItem(Model model, @ModelAttribute Item itemDe) {
        Item item = itemService.addItem(itemDe);
        return "redirect:/";
    }

}
