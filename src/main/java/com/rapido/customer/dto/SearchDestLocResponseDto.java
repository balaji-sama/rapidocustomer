package com.rapido.customer.dto;

public class SearchDestLocResponseDto {

    private String name;
    private String address;

    public SearchDestLocResponseDto() {
    }

    public SearchDestLocResponseDto(String name, String address) {
        this.name = name;
        this.address = address;
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
}