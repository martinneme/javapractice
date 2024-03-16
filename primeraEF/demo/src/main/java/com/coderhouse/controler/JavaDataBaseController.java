package com.coderhouse.controler;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.coderhouse.Entities.Client;

public class JavaDataBaseController {

	private static final String DATA_BASE = "coderhouse";
	private static final String URL = "jdbc:mysql://localhost:3306/" + DATA_BASE;
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	private Connection connection;
	
	public Connection getConnection() {
		if(connection == null) {
		try {
				connection = DriverManager.getConnection(URL,USER,PASSWORD);
		
		}catch(SQLException e) {
			System.out.println("Error al conectarse a "+ e.getMessage());
		}
	}
		return connection;
	}
	
	public void closeConnection() {
		if(connection !=null) {
			try {
				connection.close();
				System.out.println("Coneccion cerrada");
			}catch(SQLException e) {
				System.out.println("Error al cerrar la coneccion "+ e.getMessage());
			}
			
		}
	}
	
	public void insertClient(Client client) {

		PreparedStatement statement = null;
		String query = "INSERT INTO Clients (dni, apellido, nombre) VALUES (?, ?, ?)";

		try {
			statement = connection.prepareStatement(query);
			statement.setInt(1, client.getDni());
			statement.setString(2, client.getApellido());
			statement.setString(3, client.getNombre());
			int rowsAffected = statement.executeUpdate();

			if (rowsAffected == 0) {
				throw new SQLException(
						"No se pudo insertar el cliente: " + client.getNombre() + " " + client.getApellido());
			}
			System.out.println(
					"El cliente " + client.getNombre() + " " + client.getApellido() + " fue insertado correctamente");

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				System.err.println("Error al cerrar el statement: " + e.getMessage());
			}
		}
	}
	
	
	public void getAllClients() {
		Statement statement = null;
		ResultSet resultSet = null;

		String query = "SELECT dni, nombre, apellido, FROM Clients";
		try {

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				Integer dni = resultSet.getInt("dni");
				String nombre = resultSet.getString("nombre");
				String apellido = resultSet.getString("apellido");

				System.out.println("Alumno con DNI Nro " + dni + " es " + nombre + " " + apellido);
			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				System.err.println("Error al cerrar el statement o el resultSet: " + e.getMessage());
			}
		}

	}
	
	public void getClient(Integer dni) {
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		String query = "SELECT dni, nombre, apellido, FROM Clients WHERE dni = ?";
		try {

			statement = connection.prepareStatement(query);
			statement.setInt(1, dni);
			
			resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				Integer cli_dni = resultSet.getInt("dni");
				String nombre = resultSet.getString("nombre");
				String apellido = resultSet.getString("apellido");

				System.out.println("Alumno con DNI Nro " + cli_dni + " es " + nombre + " " + apellido);
			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				System.err.println("Error al cerrar el statement o el resultSet: " + e.getMessage());
			}
		}

	}
	
}
