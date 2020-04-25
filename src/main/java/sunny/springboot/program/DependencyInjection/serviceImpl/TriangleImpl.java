package sunny.springboot.program.DependencyInjection.serviceImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import sunny.springboot.program.DependencyInjection.service.Shape;

@Scope("prototype")
@Service
public class TriangleImpl implements Shape {
    private int num = 5;

    @Override
    public String draw() {
        return "Drawing Triangle.."+num++;
    }
}
