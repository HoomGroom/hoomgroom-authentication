package id.ac.ui.cs.advprog.hoomgroomauthentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {
  @GetMapping("/")
  public String homepage() {
    return "homepage";
  }
}