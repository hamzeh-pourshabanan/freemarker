package com.example.freemarker.controller;

@Controller
public class StudentList {

    @RequestMapping("/list")
    public String list(Model model) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Tom", 80.5));
        list.add(new Student(2, "Jerry", 90.4));
        list.add(new Student(3, "Paul", 77.5));
        model.addAttribute("list", list);
        return "list";
    }
}
