package util;

import domain.Result;

/**
 * Created by Airy on 2018/7/13
 */

public class ResultUtil {

    public static Result success(Object o){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(o);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
