package java_io.serialize;

import java.io.Serializable;

public class Address implements Serializable {

    private static final long serialVersionUID = -201008311558L;
    private String mobile;
    private String address;
    
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}