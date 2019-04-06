package pl.bykowski.springbootjdbcthymeleaf;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentGui {

//    @PostMapping("/gui")
//    public String getGui(Model model,
//                         @RequestBody Student student) {
//        model.addAttribute("student", student);
//        return "gui";
//    }

    @GetMapping("/gui")
    public String showGui(Model model) {
        model.addAttribute("student", new Student());
        return "gui";
    }

    @PostMapping("/add")
    public String showId(@ModelAttribute Student student) {
        return "result";
    }

}
