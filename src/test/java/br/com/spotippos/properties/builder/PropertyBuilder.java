package br.com.spotippos.properties.builder;

import br.com.spotippos.properties.model.Property;
import br.com.spotippos.properties.model.Province;

import java.util.Arrays;

public class PropertyBuilder {

    private Property property;

    public PropertyBuilder() {
        property = new Property();
        property.setX(580);
        property.setY(939);
        property.setSquareMeters(56);
        property.setPrice(200000L);
        property.setBaths(3);
        property.setBeds(3);
        property.setDescription("Imovel de testes");
        property.setTitle("Test sweet test");
        property.setProvinces(Arrays.asList(Province.Gode, Province.Ruja));
    }

    public PropertyBuilder x(Integer x) {
        property.setX(x);
        return this;
    }

    public PropertyBuilder y(Integer y) {
        property.setY(y);
        return this;
    }

    public PropertyBuilder beds(Integer beds) {
        property.setBeds(beds);
        return this;
    }

    public PropertyBuilder baths(Integer baths) {
        property.setBaths(baths);
        return this;
    }

    public PropertyBuilder squareMeters(Integer squareMeters) {
        property.setSquareMeters(squareMeters);
        return this;
    }

    public Property build(){
        return property;
    }
}
