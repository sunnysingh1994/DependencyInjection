package sunny.springboot.program.DependencyInjection.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import sunny.springboot.program.DependencyInjection.service.Drawing;
import sunny.springboot.program.DependencyInjection.service.Shape;

@Service
public class DrawImpl implements Drawing {
    @Qualifier("triangleImpl")
    @Autowired
    private Shape shape;

    @Override
    public String drawshape() {
        return this.shape.draw();
    }
}
