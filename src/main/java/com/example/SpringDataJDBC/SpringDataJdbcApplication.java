package com.example.SpringDataJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.xml.crypto.Data;
import java.awt.desktop.SystemSleepEvent;
import java.text.SimpleDateFormat;
import java.util.*;

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

//	@Bean
//	ApplicationRunner empTechRunner(EmployeeTechnologyRepository employeeTechnologyRepository){
//
//		return args -> {
//
//			Long technologyIdPython=employeeTechnologyRepository.findTechnologyByName("Python").getTechnologyId();
//			Long technologyIdAzure=employeeTechnologyRepository.findTechnologyByName("Azure").getTechnologyId();
//
//			Integer employeeRoger=employeeTechnologyRepository.findEmployeeByName("Roger","Smith").getEmployeeId();
//			Integer employeeAbby=employeeTechnologyRepository.findEmployeeByName("Abby","Cruz").getEmployeeId();
//
//			System.out.println("\n*******************\n");
//
//			EmployeeTechnology empTech = new EmployeeTechnology();
//			empTech.setEmployeeId(employeeRoger);
//			empTech.setTechnologyId(technologyIdPython);
//
//			System.out.println(employeeTechnologyRepository.save(empTech));
//
//			empTech=new EmployeeTechnology();
//			empTech.setEmployeeId(employeeAbby);
//			empTech.setTechnologyId(technologyIdAzure);
//
//			System.out.println(employeeTechnologyRepository.save(empTech));
//
//			System.out.println("\n*******************\n");
//
//
//		};
//	}

	@Bean
	ApplicationRunner officeRunner(OfficeRepository officeRepository){
		return args -> {

			System.out.println("\n**************\n");

//			System.out.println("Retrieving data for all offices:");
//			for(Office office : officeRepository.findAll()){
//				System.out.println(office);
//			}
//
//			System.out.println("\nRetrieving data for one office:");
//			System.out.println(officeRepository.findById(3L));
//
//			System.out.println("\nRetrieving data for many offices by ID:");
//			List<Long> idsList = new ArrayList<Long>(Arrays.asList(4L,3L,1L));
//			for(Office office : officeRepository.findAllById(idsList)){
//				System.out.println(office);
//			}
//
//			System.out.println("\nDoes an office with an ID for 2 exist?");
//			System.out.println(officeRepository.existsById(2L));
//
//			System.out.println("\nRetrieving count of offices:");
//			System.out.println(officeRepository.count());

			System.out.println("\n*******************\n");


//			System.out.println("\nRetrieving Data by city:");
//			System.out.println(officeRepository.findByCity("Munich, Germany"));
//
//			System.out.println("\nRetrieving Data by capacity:");
//			System.out.println(officeRepository.findByCapacity(90));
//
//			System.out.println("\nRetrieving Data by city and capacity:");
//			for(Office office: officeRepository.findByCityAndCapacity("Munich, Germany",30)){
//				System.out.println(office);
//			}
//
//			System.out.println("\nRetrieving Data by city or capacity:");
//			for(Office office : officeRepository.findByCityOrCapacity("Munich, Germany",90)){
//				System.out.println(office);
//			}

			System.out.println("\nUsing findByCapacityGreaterThan:");
			for(Office office:officeRepository.findByCapacityGreaterThan(80)){
				System.out.println(office);
			}

			System.out.println("\nUsing findByCapacityGreaterThanEqualOrderByCapacity:");
			for(Office office : officeRepository.findByCapacityGreaterThanEqualOrderByCapacity(80)){
				System.out.println(office);
			}

			System.out.println("\nUsing findByCapacityBetween(50, 100):");
			for(Office office: officeRepository.findByCapacityBetween(50,100)){
				System.out.println(office);
			}

			Date refDate= new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2025");

			System.out.println("\nUsing findByLeaseExpirationBefore:");
			for(Office office : officeRepository.findByLeaseExpirationBefore(refDate)){
				System.out.println(office);
			}

			System.out.println("\nUsing findByLeaseExpirationBetween:");
			Date endDate = new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2026");
			for(Office office : officeRepository.findByLeaseExpirationBetween(refDate,endDate)){
				System.out.println(office);
			}

			System.out.println("\nUsing findFirstByOrderByLeaseExpiration:");
			System.out.println(officeRepository.findFirstByOrderByLeaseExpiration());

			System.out.println("\nUsing findFirstByCityOrderByLeaseExpiration:");
			System.out.println(officeRepository.findFirstByCityOrderByLeaseExpiration("Munich, Germany"));



			System.out.println("\n*******************\n");
		};
	}
}
