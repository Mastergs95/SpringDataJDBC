package com.example.SpringDataJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import java.awt.desktop.SystemSleepEvent;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJdbcApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//CREATE
//		String query = "create table if not exists EmployeeDetails (\n" +
//				"\t\t\t\t employeeId int primary key, \n" +
//				"\t\t\t\t firstName varchar(100),\n" +
//				"\t\t\t\t lastName varchar(20),\n" +
//				"\t\t\t\t designation varchar(100));";

		//INSERT
//		String query="insert into EmployeeDetails values(?,?,?,?);";
//
//		jdbcTemplate.update(query,1102394,"James","Powell","Software Engineer");
//		jdbcTemplate.update(query,1102395,"Abby","Cruz","Senior Software Engineer");
//		jdbcTemplate.update(query,1102396,"Kathy","Jones","Software Engineer");

		//UPDATE
//		String query="Update EmployeeDetails set designation = ? where employeeId=?";
//
//
//		jdbcTemplate.update(query,"Senior Software Engineer",1102396);

		//SELECT
//		String query="Select * from EmployeeDetails";
//
//		System.out.println("\n***********\n");
//		System.out.println("List of employees: ");
//
//		List employeeList = jdbcTemplate.queryForList(query);
//		for(Object emp : employeeList){
//			System.out.println(emp.toString());
//		}
//		System.out.println("\n************\n");

		//DELETE
//		String query="Delete from EmployeeDetails where employeeId=?";
//
//		jdbcTemplate.update(query,1102395);
//
//		System.out.format("Delete of employee is complete");
//
//		query="Select * from EmployeeDetails";
//
//		System.out.println("\n***********\n");
//		System.out.println("List of employees: ");
//
//		List employeeList = jdbcTemplate.queryForList(query);
//		for(Object emp : employeeList){
//			System.out.println(emp.toString());
//		}
//		System.out.println("\n************\n");



	}

//	@Bean
//	ApplicationRunner applicationRunner (EmployeeDetailsRepository employeeDetailsRepository){
//		return args -> {
//
//			System.out.println("\n**************\n");
//
//			EmployeeDetails employeeRoger = EmployeeDetails.create(null,"Roger","Smith",1);
//			System.out.println(employeeDetailsRepository.save(employeeRoger));
//
//			EmployeeDetails employeeElla = EmployeeDetails.create(null,"Ella","Jenkins",2);
//			System.out.println(employeeDetailsRepository.save(employeeElla));
//
//			System.out.println("\n***************\n");
//		};
//	}
//
//	@Bean
//	ApplicationRunner technologyRunner (TechnologyDetailsRepository technologyDetailsRepository){
//		return args -> {
//
//
//			System.out.println("\n**************\n");
//
//			TechnologyDetails techJava = TechnologyDetails.addTech(null,"Java");
//			System.out.println(technologyDetailsRepository.save(techJava));
//
//			TechnologyDetails techPython = TechnologyDetails.addTech(null,"Python");
//			System.out.println(technologyDetailsRepository.save(techPython));
//
//			TechnologyDetails techAzure = TechnologyDetails.addTech(null,"Azure");
//			System.out.println(technologyDetailsRepository.save(techAzure));
//
//			System.out.println("\n********************\n");
//		};
//	}
//
//	@Bean
//	ApplicationRunner empTechRunner (EmployeeTechnologyRepository employeeTechnologyRepository){
//		return args -> {
//
//
//			System.out.println("\n**************\n");
//
//			Long technologyId = employeeTechnologyRepository.findTechnologyByName("Java").getTechnologyId();
//			Integer employeeId = employeeTechnologyRepository.findEmployeeByName("Roger","Smith").getEmployeeId();
//
//			EmployeeTechnology empTech = new EmployeeTechnology();
//			empTech.setEmployeeId(employeeId);
//			empTech.setTechnologyId(technologyId);
//
//			System.out.println("\n********************\n");
//
//			System.out.println(employeeTechnologyRepository.save(empTech));
//
//			System.out.println("\n********************\n");
//		};
//	}

	@Bean
	ApplicationRunner empTechRunner(EmployeeTechnologyRepository employeeTechnologyRepository){

		return args -> {

			Long technologyIdPython=employeeTechnologyRepository.findTechnologyByName("Python").getTechnologyId();
			Long technologyIdAzure=employeeTechnologyRepository.findTechnologyByName("Azure").getTechnologyId();

			Integer employeeRoger=employeeTechnologyRepository.findEmployeeByName("Roger","Smith").getEmployeeId();
			Integer employeeAbby=employeeTechnologyRepository.findEmployeeByName("Abby","Cruz").getEmployeeId();

			System.out.println("\n*******************\n");

			EmployeeTechnology empTech = new EmployeeTechnology();
			empTech.setEmployeeId(employeeRoger);
			empTech.setTechnologyId(technologyIdPython);

			System.out.println(employeeTechnologyRepository.save(empTech));

			empTech=new EmployeeTechnology();
			empTech.setEmployeeId(employeeAbby);
			empTech.setTechnologyId(technologyIdAzure);

			System.out.println(employeeTechnologyRepository.save(empTech));

			System.out.println("\n*******************\n");


		};
	}
}
