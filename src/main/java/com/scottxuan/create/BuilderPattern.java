package com.scottxuan.create;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : zhaoxuan
 */
public class BuilderPattern {

    public static void main(String[] args) {
        Director director = new Director();
        Address address = director.createAddress(new ChinaBuilder());
        System.out.println(address.toString());
    }

    @Data
    static
    class Address {
        private String country;
        private String province;
        private String city;
        private String area;

        @Override
        public String toString() {
            return "Address{" +
                    "country='" + country + '\'' +
                    ", province='" + province + '\'' +
                    ", city='" + city + '\'' +
                    ", area='" + area + '\'' +
                    '}';
        }
    }
static
    abstract class Builder {
        protected Address address = new Address();

        abstract void buildCountry();

        abstract void buildProvince();

        abstract void buildCity();

        abstract void buildArea();

        public Address getResult() {
            return this.address;
        }
    }

    static class ChinaBuilder extends Builder {
        void buildCountry() {
            address.setCountry("中国");
        }

        void buildProvince() {
            address.setProvince("陕西");
        }

        void buildCity() {
            address.setCity("西安");
        }

        void buildArea() {
            address.setArea("雁塔区");
        }
    }

    @Data
    @NoArgsConstructor
    static
    class Director{
        Address createAddress(Builder builder){
            builder.buildCountry();
            builder.buildProvince();
            builder.buildCity();
            builder.buildArea();
            return builder.getResult();
        }
    }
}
