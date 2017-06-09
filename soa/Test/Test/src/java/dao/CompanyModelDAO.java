/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Company;
import model.Employee;



public class CompanyModelDAO {

    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/?user=root";
    private String username = "root";
    private String password = "tulips";

    public ArrayList<Company> getAllList() {
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("Error creating connection to database: " + e);
            System.exit(-1);
        }

        String query = "SELECT * FROM trucking.companyname;";
        ArrayList<Company> companylist = new ArrayList<Company>();

        try (PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Company bh = new Company();

                bh.setCustomerID(resultSet.getInt("CustomerID"));
                bh.setCompany_Name(resultSet.getString("Company_Name"));
                companylist.add(bh);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error on Building Data");
        }
        return companylist;
    }
    
    public  ArrayList<Employee> postAllEmployee(){
           try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("Error creating connection to database: " + e);
            System.exit(-1);
        }
         String query = ");" +
                 "create table sys.Employees (\n" +
                 "EmployeeID int primary key," +
                 "FirstName varchar(25), " +
                 "LastName varchar(25)," +
                 "Email varchar(25)," +
                 "Extension int, " +
                 "HomePhone int," +
                 "CellPhone int," +
                 "JobTitle varchar(15)," +
                 "SocialSecurityNumber varchar(25)," +
                 "DriverLicenseNumber int,Address varchar(25)," +
                 "City varchar(15)," +
                 "State varchar(15)," +
                 "PostalCode int," +
                 "Birthdate int," +
                 "DateHired int," +
                 "Salary int," +
                 "Notes varchar(25)";
         
        
        return null;
    }
     
}
