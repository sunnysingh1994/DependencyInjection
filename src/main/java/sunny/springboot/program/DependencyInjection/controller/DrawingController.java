package sunny.springboot.program.DependencyInjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sunny.springboot.program.DependencyInjection.serviceImpl.DrawImpl;

@RestController
public class DrawingController {
    @Autowired
    private DrawImpl draw;

    @RequestMapping("/drawing")
    public String drawIt(){
        return draw.drawshape();
    }
}
