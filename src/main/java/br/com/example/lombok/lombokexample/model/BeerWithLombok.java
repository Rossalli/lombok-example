package br.com.example.lombok.lombokexample.model;

import java.io.Serializable;

import br.com.example.lombok.lombokexample.model.constants.Glass;
import br.com.example.lombok.lombokexample.model.constants.Style;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(of = {"name", "style"})
@ToString
@Builder
public class BeerWithLombok implements Serializable {

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Style style;
    @Getter
    private String alcohol;
    @Getter
    private Glass glass;
    @Getter
    private Long ibu;
}