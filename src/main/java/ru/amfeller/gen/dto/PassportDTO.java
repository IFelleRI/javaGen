package ru.amfeller.gen.dto;

public class PassportDTO {
    private String name;
    private String surname;
    private String patronymic;
    private String series;
    private String number;
    private String date;

    public PassportDTO(String name, String surname, String patronymic, String series, String number, String date) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.series = series;
        this.number = number;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "PassportDTO{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
