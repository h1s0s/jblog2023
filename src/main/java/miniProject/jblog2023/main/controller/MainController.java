package miniProject.jblog2023.main.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * packageName  : miniProject.jblog2023.main.controller
 * fileName     : MainController
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
public class MainController {

    @RequestMapping("/jblog")
    public String Main(){
        return "template/main/index";
    }
}
