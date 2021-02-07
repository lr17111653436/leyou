package com.leyou.common.threadlocals;

import com.leyou.common.auth.entity.UserInfo;


public class UserHolder {
    private static final ThreadLocal<UserInfo> TL = new ThreadLocal<>();

    public static void setUser(UserInfo user) {
        TL.set(user);
    }

    public static UserInfo getUser() {
        return TL.get();
    }

    public static void removeUser() {
        TL.remove();
    }
}