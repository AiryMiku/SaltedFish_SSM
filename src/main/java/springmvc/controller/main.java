package springmvc.controller;

import domain.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import util.ResultUtil;

/**
 * Created by Airy on 2018/7/13
 */
@Controller
public class main {

    @RequestMapping("/")
    @ResponseBody
    public Result index(){
        String data = "hello airy";
        return ResultUtil.success(data);
    }

}
