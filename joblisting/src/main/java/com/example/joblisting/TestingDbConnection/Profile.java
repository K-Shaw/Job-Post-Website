package com.example.joblisting.TestingDbConnection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "JobPost")
public class Profile {

    @Id
    private String id;
    private String desc;
    private int exp;
    private List<String> techs;

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getDesc() { return desc; }
    public void setDesc(String desc) { this.desc = desc; }

    public int getExp() { return exp; }
    public void setExp(int exp) { this.exp = exp; }

    public List<String> getTechs() { return techs; }
    public void setTechs(List<String> techs) { this.techs = techs; }
}
