package br.com.fiap.carservice;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// entity database class persistence
@Entity
@EnableWebMvc
public class Car {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto generated increment
    private int id;

    // field attributes
    private String color;
    private String model;


    // get color return a color
    public String getColor() {
        return color;
    }

    // get model return a model
    public String getModel() {
        return model;
    }

    // set color
    public void setColor(String color) {
        // color from this object
        this.color = color;
    }

    // set model
    public void setModel(String model) {
        this.model = model;
    }


}
