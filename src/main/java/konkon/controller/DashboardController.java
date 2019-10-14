package konkon.controller;

import konkon.reponse.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class DashboardController {
  @GetMapping("/dashboard")
  public String showDashboard(){
    return "dashboard";
  }
}
