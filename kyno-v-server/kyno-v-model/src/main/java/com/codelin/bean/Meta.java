package com.codelin.bean;

/**
 * @author ISheep
 * @create 2020/10/26 13:43
 */
public class Meta {
    private Boolean keepalive;

    private Boolean requireAuth;

    public Boolean getKeepalive() {
        return keepalive;
    }

    public void setKeepalive(Boolean keepalive) {
        this.keepalive = keepalive;
    }

    public Boolean getRequireAuth() {
        return requireAuth;
    }

    public void setRequireAuth(Boolean requireAuth) {
        this.requireAuth = requireAuth;
    }
}
