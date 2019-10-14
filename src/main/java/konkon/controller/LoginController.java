package konkon.controller;

import konkon.reponse.User;
import konkon.request.Credential;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("user")
public class LoginController {
  @GetMapping("/login")
  public String showLoginForm(@ModelAttribute("credential") Credential credential){

    return "login";
  }
  @PostMapping("/login")
  public String login(@ModelAttribute("credential") Credential credential, Model model){
    User user = new User();
    user.setUserName(credential.getUsername());
    model.addAttribute("user",user );
    return "redirect:/dashboard";
  }
}
