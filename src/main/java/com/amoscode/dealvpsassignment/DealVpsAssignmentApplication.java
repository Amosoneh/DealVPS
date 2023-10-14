package com.amoscode.dealvpsassignment;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DealVpsAssignmentApplication {

//    private static final Scanner input = new Scanner(System.in);
//    private static final ItemServiceImpl itemService = new ItemServiceImpl();

    public static void main(String[] args) {
        SpringApplication.run(DealVpsAssignmentApplication.class, args);
//        displayMenu();
    }

//    private static void displayMenu() {
//        String mainMenuPrompt = """
//                Welcome
//                1 -> Add Item
//                2 -> Get Item
//                """;
//
//        String userInput = input(mainMenuPrompt);
//        switch (userInput.charAt(0)) {
//            case '1' -> AddItem();
//            case '2' -> GetItem();
//        }
//    }

//    private static void AddItem() {
//        AddItemRequest request = AddItemRequest.builder()
//                .description(input("Enter description"))
//                .name(input("Enter name")).build();
//        var res =  itemService.addItem(request);
//        String msg = res.toString();
//        display(msg);
//        displayMenu();
//    }

//    private static void GetItem(){
//        String enter_item_id = input("Enter item id");
//        Item item = itemService.getItem(Integer.parseInt(enter_item_id));
//        display(item.toString());
//        displayMenu();
//    }

//    private static void display(String message) {
//        System.out.println(message);
//    }

//    public static String input(String prompt) {
//        System.out.println(prompt);
//        return input.nextLine();
//    }

}
