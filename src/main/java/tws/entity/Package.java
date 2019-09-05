package tws.entity;

import java.util.Date;

public class Package {
    private String billNo;
    private String addressee;
    private String photo;
    private String status;
    private Date pickTime;

    public Package(String billNo, String addressee, String photo, String status, Date pickTime) {
        this.billNo = billNo;
        this.addressee = addressee;
        this.photo = photo;
        this.status = status;
        this.pickTime = pickTime;
    }

    public Package() {
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPickTime() {
        return pickTime;
    }

    public void setPickTime(Date pickTime) {
        this.pickTime = pickTime;
    }

    @Override
    public String toString() {
        return "Package{" +
                "billNo='" + billNo + '\'' +
                ", addressee='" + addressee + '\'' +
                ", photo='" + photo + '\'' +
                ", status='" + status + '\'' +
                ", pickTime=" + pickTime +
                '}';
    }
}
