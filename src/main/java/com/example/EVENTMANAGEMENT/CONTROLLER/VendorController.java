package com.example.EVENTMANAGEMENT.CONTROLLER;

import com.example.EVENTMANAGEMENT.MODEL.ITEM;
import com.example.EVENTMANAGEMENT.REPOSITORY.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/vendor")
public class VendorController {

    @Autowired
    private ItemRepo itemRepo;


    @GetMapping("/add-item")
    public String showAddItemForm(Model model) {
        model.addAttribute("item", new ITEM());
        return "add-item";
    }


    @PostMapping("/save-item")
    public String saveItem(@ModelAttribute("item") ITEM item) {
        itemRepo.save(item);

        return "redirect:/vendor/view-inventory?success";
    }


    @GetMapping("/view-inventory")
    public String viewInventory(Model model) {
        List<ITEM> itemList = itemRepo.findAll();
        model.addAttribute("items", itemList);
        return "add-user-vendor";
    }
}