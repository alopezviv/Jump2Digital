package com.jump2digital.payment.dto;

public class AnaliticsDto {
    private double totalAmount;
    private int laptops;
    private int Pcs;
    private int phones;
    private int tablets;
    private int others;
    private int visaPayments;
    private int mastercardPayments;

    public AnaliticsDto(double totalAmount, int laptops, int pcs,
                        int phones, int tablets, int others,
                        int visaPayments, int mastercardPayments){
        this.totalAmount = totalAmount;
        this.laptops = laptops;
        Pcs = pcs;
        this.phones = phones;
        this.tablets = tablets;
        this.others = others;
        this.visaPayments = visaPayments;
        this.mastercardPayments = mastercardPayments;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setLaptops(int laptops) {
        this.laptops = laptops;
    }

    public void setPcs(int pcs) {
        Pcs = pcs;
    }

    public void setPhones(int phones) {
        this.phones = phones;
    }

    public void setTablets(int tablets) {
        this.tablets = tablets;
    }

    public void setOthers(int others) {
        this.others = others;
    }

    public void setVisaPayments(int visaPayments) {
        this.visaPayments = visaPayments;
    }

    public void setMastercardPayments(int mastercardPayments) {
        this.mastercardPayments = mastercardPayments;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getLaptops() {
        return laptops;
    }

    public int getPcs() {
        return Pcs;
    }

    public int getPhones() {
        return phones;
    }

    public int getTablets() {
        return tablets;
    }

    public int getOthers() {
        return others;
    }

    public int getVisaPayments() {
        return visaPayments;
    }

    public int getMastercardPayments() {
        return mastercardPayments;
    }
}
