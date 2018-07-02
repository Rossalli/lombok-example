package br.com.example.lombok.lombokexample.model;

import java.util.Objects;

import br.com.example.lombok.lombokexample.model.constants.Glass;
import br.com.example.lombok.lombokexample.model.constants.Style;

public class BeerWithoutLombok {

    private String name;
    private Style style;
    private String alcohol;
    private Glass glass;
    private Long ibu;

    private BeerWithoutLombok() {
    }

    public BeerWithoutLombok(String name, Style style, String alcohol,
            Glass glass, Long ibu) {
        this.name = name;
        this.style = style;
        this.alcohol = alcohol;
        this.glass = glass;
        this.ibu = ibu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public Glass getGlass() {
        return glass;
    }

    public void setGlass(Glass glass) {
        this.glass = glass;
    }

    public Long getIbu() {
        return ibu;
    }

    public void setIbu(Long ibu) {
        this.ibu = ibu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeerWithoutLombok that = (BeerWithoutLombok) o;
        return Objects.equals(name, that.name) &&
                style == that.style;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, style);
    }

    @Override
    public String toString() {
        return "BeerWithoutLombok{" +
                "name='" + name + '\'' +
                ", style=" + style +
                ", alcohol='" + alcohol + '\'' +
                ", glass=" + glass +
                ", ibu=" + ibu +
                '}';
    }
}
