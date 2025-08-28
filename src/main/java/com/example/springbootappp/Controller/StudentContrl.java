package com.example.springbootappp.Controller;
import com.example.springbootappp.Entity.Studentable;
import com.example.springbootappp.Repo.Sturepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.Optional;
@Controller
@RequestMapping("/stu")
public class StudentContrl {

    @Autowired
    Sturepo sturepo;
    @GetMapping("/reg")
    public String reg()
    {
        return "view";
    }
    @GetMapping("/num")
    public String studentdetail(@RequestParam int reg, Model model)
    {
    Studentable data= sturepo.findById(reg).orElse(null);

      model.addAttribute("data",data);

        return "studetail";
    }
}
