package com.example.EVENTMANAGEMENT.CONTROLLER;

import com.example.EVENTMANAGEMENT.MODEL.Membership;
import com.example.EVENTMANAGEMENT.REPOSITORY.MembershipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class Admin {

    @Autowired
    private MembershipRepo membershipRepo;

    @GetMapping("/maintenance")
    public String showMaintenanceMenu() {
        return "maintenance-menu";
    }

    @GetMapping("/add-membership")
    public String showAddMembershipForm(Model model) {
        model.addAttribute("membership", new Membership());
        return "add-membership";
    }

    @PostMapping("/save-membership")
    public String saveMembership(@ModelAttribute("membership") Membership membership) {
        membershipRepo.save(membership);
        return "redirect:/admin/maintenance";
    }

    @GetMapping("/update-membership")
    public String showUpdateForm(Model model) {
        model.addAttribute("membership", new Membership());
        return "update-membership";
    }

    @PostMapping("/fetch-membership")
    public String fetchMembership(@RequestParam("membershipNumber") Long id, Model model) {
        Optional<Membership> optionalMembership = membershipRepo.findById(id);
        if (optionalMembership.isPresent()) {
            Membership m = optionalMembership.get();
            m.setDuration("6 months extension");
            model.addAttribute("membership", m);
        } else {
            model.addAttribute("error", "Membership Number not found!");
            model.addAttribute("membership", new Membership());
        }
        return "update-membership";
    }

    @GetMapping("/view-users")
    public String viewUsers() {
        return "redirect:/user/items";
    }

    @GetMapping("/view-vendors")
    public String viewVendors() {
        return "redirect:/vendor/add-item";
    }

    @GetMapping("/add-user-vendor")
    public String showAddUserVendorForm() {
        return "add-user-vendor";
    }

    @PostMapping("/save-user")
    public String saveUser(@RequestParam String username, @RequestParam String role) {
        System.out.println("User Created -> Name: " + username + ", Role: " + role);
        return "redirect:/admin/maintenance";
    }
}