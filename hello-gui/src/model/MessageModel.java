package model;

public class MessageModel {
    private String msg;

    public MessageModel() { this.msg = "Hi Everyone!"; }

    public void setMsg(String newMsg) { this.msg = newMsg; }

    public String getMsg() { return msg; }

    public void reverseMsg() {
        this.msg = new StringBuilder(msg).reverse().toString();
    }

    @Override public String toString() { return msg; }
}
