package com.modeush.amazon.entity;

public class AzTimeEntity {
    private Integer id;

    private String country;

    private String state;

    private String city;

    private String timeZone;

    private String daylightSavingTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone == null ? null : timeZone.trim();
    }

    public String getDaylightSavingTime() {
        return daylightSavingTime;
    }

    public void setDaylightSavingTime(String daylightSavingTime) {
        this.daylightSavingTime = daylightSavingTime == null ? null : daylightSavingTime.trim();
    }
}