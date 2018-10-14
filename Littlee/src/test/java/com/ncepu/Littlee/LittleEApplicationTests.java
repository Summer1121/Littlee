package com.ncepu.Littlee;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LittleEApplicationTests {
	@Autowired
	DataSource dataSource;

	@Test
	public void contextLoads() {
		System.out.println(dataSource.getClass());
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println(conn);
		try {
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
