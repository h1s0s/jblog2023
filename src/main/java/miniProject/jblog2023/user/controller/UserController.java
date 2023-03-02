package miniProject.jblog2023.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * packageName  : miniProject.jblog2023.user.controller
 * fileName     : UserController
 * author       : sshan
 * date         : 2023-03-02
 * description  :
 * ========================================================
 * DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-03-02          sshan            최초생성
 */
@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 회원가입 폼
     * @return
     */
    @RequestMapping("/joinForm")
    public String joinForm(){

        return "template/user/joinForm";
    }

    /**
     * 회원가입 성공 화면
     * @return
     */
    @RequestMapping("/joinSuccess")
    public String joinSuccess(){

        return "template/user/joinSuccess";
    }

    /**
     * 회원가입 폼
     * @return
     */
    @RequestMapping("/loginForm")
    public String loginForm(){

        return "template/user/loginForm";
    }
}
