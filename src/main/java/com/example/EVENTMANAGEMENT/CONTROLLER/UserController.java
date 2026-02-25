package com.example.EVENTMANAGEMENT.CONTROLLER;

import com.example.EVENTMANAGEMENT.MODEL.ITEM;
import com.example.EVENTMANAGEMENT.REPOSITORY.ItemRepo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ItemRepo itemRepo;

    @GetMapping("/items")
    public String showCatalog(Model model) {
        List<ITEM> allItems = itemRepo.findAll();
        model.addAttribute("items", allItems);
        return "user-catalog";
    }

    @PostMapping("/add-to-cart")
    public String addToCart(@RequestParam("itemId") Long itemId, HttpSession session) {
        List<ITEM> cart = (List<ITEM>) session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
        }

        ITEM item = itemRepo.findById(itemId).orElse(null);
        if (item != null) {
            cart.add(item);
        }

        session.setAttribute("cart", cart);
        return "redirect:/user/items?added";
    }

    @GetMapping("/view-cart")
    public String viewCart(HttpSession session, Model model) {
        List<ITEM> cart = (List<ITEM>) session.getAttribute("cart");
        List<ITEM> cartItems = (cart != null) ? cart : new ArrayList<>();

        model.addAttribute("cartItems", cartItems);

        double total = cartItems.stream().mapToDouble(ITEM::getPrice).sum();
        model.addAttribute("totalPrice", total);

        return "cart-view";
    }

    @GetMapping("/checkout")
    public String checkout(HttpSession session) {
        session.removeAttribute("cart");
        return "checkout";
    }
}