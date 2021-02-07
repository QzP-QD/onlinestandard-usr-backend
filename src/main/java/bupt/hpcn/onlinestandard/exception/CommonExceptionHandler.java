package bupt.hpcn.onlinestandard.exception;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public JSONObject exceptionHandler(Exception e){
        JSONObject myerror = new JSONObject();
        myerror.put("code", 200);
        return myerror;
    }
}
