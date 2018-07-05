package com.pachong.utils;

/**
 * @wtk
 **/
public class ProxyInfo {
    private String userName = "";
    private String ip;
    private String password = "";
    private String type;
    private String port;
    private int is_internet = 1;
    public ProxyInfo(String ip, String port, String type) {
        this.ip = ip;
        this.type = type;
        this.port = port;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getPort() {
        return port;
    }
    public void setPort(String port) {
        this.port = port;
    }
    public int getIs_internet() {
        return is_internet;
    }
    public void setIs_internet(int is_internet) {
        this.is_internet = is_internet;
    }
}
