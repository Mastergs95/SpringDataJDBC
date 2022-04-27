package com.example.SpringDataJDBC;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("TechnologyDetails")
public class TechnologyDetails {

    @Id
    @Column("technologyId")
    private Long technologyId;

    @Column("technologyName")
    private String technologyName;

    public TechnologyDetails(Long technologyId, String technologyName){
        this.technologyId=technologyId;
        this.technologyName=technologyName;
    }

    public Long getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(Long technologyId) {
        this.technologyId = technologyId;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    static TechnologyDetails addTech(Long technologyId,String technologyName){
        return new TechnologyDetails(technologyId,technologyName);
    }

    @Override
    public String toString() {
        return "TechnologyDetails{" +
                "technologyId=" + technologyId +
                ", technologyName='" + technologyName + '\'' +
                '}';
    }
}
