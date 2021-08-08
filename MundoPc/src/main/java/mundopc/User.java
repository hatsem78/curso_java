/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

/**
 *
 * @author octavio
 */
public class User {

    private String name;
    private double price;
    private int identifier;
    private boolean isVatApplicable;

    public User(String name, double price, int identifier,
            boolean isVatApplicable) {
        super();
        this.name = name;
        this.price = price;
        this.identifier = identifier;
        this.isVatApplicable = isVatApplicable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public boolean isVatApplicable() {
        return isVatApplicable;
    }

    public void setVatApplicable(boolean isVatApplicable) {
        this.isVatApplicable = isVatApplicable;
    }
}
