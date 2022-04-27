package com.example.SpringDataJDBC;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Employee_Technology")
public class EmployeeTechnology {

    @Id
    private int id;
    @Column("employeeId")
    private Integer employeeId;
    @Column("technologyId")
    private Long technologyId;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public Long getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(Long technologyId) {
        this.technologyId = technologyId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "EmployeeTechnology{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", technologyId=" + technologyId +
                '}';
    }
}
