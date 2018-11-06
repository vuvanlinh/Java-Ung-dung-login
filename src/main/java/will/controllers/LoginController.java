package will.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import will.dao.UserDao;
import will.model.Login;
import will.model.User;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public ModelAndView login(@ModelAttribute("login")Login login){
        User user = UserDao.checkLogin(login);
        if (user == null){
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("user",user);
            return modelAndView;
        }

    }
}
