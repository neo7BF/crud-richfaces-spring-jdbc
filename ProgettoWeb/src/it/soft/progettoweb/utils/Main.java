package it.soft.progettoweb.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import it.soft.progettoweb.beans.Dipendente;

public class Main {

	public static void main(String[] args) {
		//testNamedParameterTemplate();
		testJdbcTemplate();
	}

	private static void testJdbcTemplate() {
		try (ClassPathXmlApplicationContext context 
				= new ClassPathXmlApplicationContext("file:C:\\ProgettoWeb\\workspace\\ProgettoWeb\\WebContent\\WEB-INF\\spring-web-config.xml")) {

			  JdbcTemplate jdbc = (JdbcTemplate) context.getBean("jdbcTemplate");
			  
			  List<Dipendente> dipendenti = 			  
			  jdbc.query("SELECT ID,COGNOME,NOME,DATA_ASSUNZIONE FROM DIPENDENTI", new RowMapper<Dipendente>() {
				@Override
				public Dipendente mapRow(ResultSet arg0, int arg1) throws SQLException {
					  Dipendente dip = new Dipendente();
					  dip.setId(arg0.getInt("ID"));
					  dip.setCognome(arg0.getString("COGNOME"));
					  dip.setNome(arg0.getString("NOME"));
					  dip.setDataAssunzione(arg0.getBigDecimal("DATA_ASSUNZIONE"));
					  return dip;
				}
			  });
			  			  
			  System.out.println(dipendenti.size() > 0 ? dipendenti.get(0) : "");
		}
	}

	private static void testNamedParameterTemplate() {
		try (ClassPathXmlApplicationContext context 
				= new ClassPathXmlApplicationContext("file:C:\\ProgettoWeb\\workspace\\ProgettoWeb\\WebContent\\WEB-INF\\spring-web-config.xml")) {

			  NamedParameterJdbcTemplate jdbc = (NamedParameterJdbcTemplate) context.getBean("namedParameterJdbcTemplate");
			  			  
			  List<Dipendente> dipendenti = 			  
			  jdbc.query("SELECT ID,COGNOME,NOME,DATA_ASSUNZIONE FROM DIPENDENTI", new RowMapper<Dipendente>() {
				@Override
				public Dipendente mapRow(ResultSet arg0, int arg1) throws SQLException {
					  Dipendente dip = new Dipendente();
					  dip.setId(arg0.getInt("ID"));
					  dip.setCognome(arg0.getString("COGNOME"));
					  dip.setNome(arg0.getString("NOME"));
					  dip.setDataAssunzione(arg0.getBigDecimal("DATA_ASSUNZIONE"));
					  return dip;
				}
			  });
			  			  
			  System.out.println(dipendenti.size() > 0 ? dipendenti.get(0) : "");
		}
	}
}

/**
@Component // Main is a Spring-managed bean too, since it have @Autowired property
public class Main {
    @Autowired SampleService sampleService;
    public static void main(String [] args) {
        ApplicationContext ctx = 
            new AnnotationConfigApplicationContext("package"); // Use annotated beans from the specified package

        Main main = ctx.getBean(Main.class);
        main.sampleService.getHelloWorld();
    }
}
**/

