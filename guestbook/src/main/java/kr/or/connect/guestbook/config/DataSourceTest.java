package kr.or.connect.guestbook.config;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DataSourceTest {
	public static void main(String[] args) {
		ApplicationContext ac =  new AnnotationConfigApplicationContext(ApplicationConfig.class);
		DataSource ds = ac.getBean(DataSource.class);
		
		try(Connection conn = ds.getConnection()){
			if(conn != null){
				System.out.println("접속성공!");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
				try(Connection conn = ds.getConnection()){
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
}
