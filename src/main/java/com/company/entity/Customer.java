package com.company.entity;

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String address;
    private int noOfCard;
    private int noOfBankAccount;

    public Customer() {

    }
    public Customer(int id,
                    String surname,
                    String name,
                    String address,
                    int noOfCard,
                    int noOfBankAccount) {
        setId(id);
        setSurname(surname);
        setName(name);
        setAddress(address);
        setNoOfCard(noOfCard);
        setNoOfBankAccount(noOfBankAccount);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", noOfCard=" + noOfCard +
                ", noOfBankAccount=" + noOfBankAccount +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Customer customer = (Customer) object;
        return  id == customer.id &&
                noOfCard == customer.noOfCard &&
                noOfBankAccount == customer.noOfBankAccount &&
                surname.equals(customer.surname) &&
                name.equals(customer.name) &&
                address.equals(customer.address);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + noOfCard;
        result = prime * result + noOfBankAccount;
        result = prime * result + surname.hashCode();
        result = prime * result + name.hashCode();
        result = prime * result + address.hashCode();
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNoOfCard() {
        return noOfCard;
    }

    public void setNoOfCard(int noOfCard) {
        this.noOfCard = noOfCard;
    }

    public int getNoOfBankAccount() {
        return noOfBankAccount;
    }

    public void setNoOfBankAccount(int noOfBankAccount) {
        this.noOfBankAccount = noOfBankAccount;
    }
}
