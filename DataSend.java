//package jpabook.start;

import java.io.Serializable;

public class DataSend implements Serializable {
    int command = 37;
    int size = 124;
    int result;
    int checkcode;
    int reserved1;
    int reserved2;
    String url;


    public int getCommand() {
        return command;
    }

    public void setCommand(int command) {
        this.command = command;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getReserved1() {
        return reserved1;
    }

    public void setReserved1(int reserved1) {
        this.reserved1 = reserved1;
    }

    public int getReserved2() {
        return reserved2;
    }

    public void setReserved2(int reserved2) {
        this.reserved2 = reserved2;
    }

    public int getCheckcode() {
        return checkcode;
    }

    public void setCheckcode(int checkcode) {
        this.checkcode = checkcode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
