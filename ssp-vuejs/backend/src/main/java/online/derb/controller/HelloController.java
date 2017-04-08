package online.derb.controller;

import online.derb.model.Todo;
import online.derb.util.TodoGen;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @RequestMapping(value = "/api/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/api/todo")
    public @ResponseBody List<Todo> todo(){
        return TodoGen.TodoListcreate();
    }


}
