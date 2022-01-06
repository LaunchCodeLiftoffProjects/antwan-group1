package org.launchcode.giftlist.controllers;

import org.launchcode.giftlist.models.dto.LoginFormDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/index")
  public String index(Model model) {
    model.addAttribute(new LoginFormDTO());
    return "index";
  }

}
