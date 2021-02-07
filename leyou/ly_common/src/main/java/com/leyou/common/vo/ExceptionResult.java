package com.leyou.common.vo;

import com.leyou.common.exception.LyException;
import lombok.Data;
import org.joda.time.DateTime;

@Data
public class ExceptionResult {

    private int status;
    private String message;
    private String date;

    public ExceptionResult(LyException e) {
        this.status = e.getStatus();
        this.message = e.getMessage();
        this.date = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
    }
}
