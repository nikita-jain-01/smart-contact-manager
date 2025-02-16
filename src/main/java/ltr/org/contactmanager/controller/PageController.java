package ltr.org.contactmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String homePage(Model model) {
        System.out.println("Home Page Handler");
        model.addAttribute("serviceType", "Macro Service");
        model.addAttribute("name", "Smart Contact Manager");
        model.addAttribute("github", "https://github.com/nikita-jain-01");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("wantToPassMarkup", true); // Even we comment this or not false will pass in wantToPassMarkup,
                                                                              // because after that it is calling about template
        model.addAttribute("wantToPassMarkup", false);
        System.out.println("About Page Loading...");
        return "about";
    }

    @RequestMapping("/service")
    public String servicePage() {
        System.out.println("Service Page Loading...");
        return "service";
    }

    @RequestMapping("/layout")
    public String layoutPage() {
        System.out.println("Layout Page Loading...");
        return "layout";
    }
}
