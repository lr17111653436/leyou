package com.leyou.common.advice;

import com.leyou.common.exception.LyException;
import com.leyou.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class LyExceptionAdvice {

    /**
     * 统一异常处理
     */
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handlerException(RuntimeException e){
        return ResponseEntity.status(400).body(e.getMessage());
    }

    @ExceptionHandler(LyException.class)
    public ResponseEntity<ExceptionResult> handlerLyException(LyException e){
        return ResponseEntity.status(e.getStatus()).body(new ExceptionResult(e));
    }
}
