package com.leyou.common.exception;

import com.leyou.common.enums.LyExceptionEnum;
import lombok.Data;

@Data
public class LyException extends RuntimeException {

    private int status;

    public LyException(LyExceptionEnum em) {
        super(em.getMessage());
        this.status = em.getStatus();
    }

    public LyException( LyExceptionEnum em, Throwable cause) {
        super(em.getMessage(), cause);
        this.status = em.getStatus();
    }

    public LyException(int status,String message) {
        super(message);
        this.status = status;
    }
}
