package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.fiap.healthtrack.HealthTrackDB;

public class Teste {

	public static void main(String[] args) {
		
		Connection conexao = HealthTrackDB.obterConexao();
		
		System.out.println(conexao);

	}

}
