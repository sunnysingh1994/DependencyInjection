package sunny.springboot.program.DependencyInjection.serviceImpl;

import org.springframework.stereotype.Service;
import sunny.springboot.program.DependencyInjection.service.Shape;

@Service
public class CircleImpl implements Shape {
    @Override
    public String draw() {
        return "Drawing Circle..";
    }
}
