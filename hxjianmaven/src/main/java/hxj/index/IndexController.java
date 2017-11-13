package hxj.index;

import hxj.index.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/11/8.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/index")
    public String index(ModelMap model, HttpServletRequest request, RedirectAttributes attr) {
        userInfoService.selectUserInfo();
        return "/index/index.html";
    }

    @RequestMapping("/404NotFind")
    public String NotFind(ModelMap model, HttpServletRequest request, RedirectAttributes attr) {
        return "/error/404.html";
    }
}
