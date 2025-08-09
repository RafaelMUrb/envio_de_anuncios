package anuncios_ml;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerFormulario {

    @GetMapping("/home")
    public String home() {
      return "contentHome";
    }

    @RequestMapping("/register")
    public ModelAndView productRegister(){
        return new ModelAndView("productRegister");
    }
}
