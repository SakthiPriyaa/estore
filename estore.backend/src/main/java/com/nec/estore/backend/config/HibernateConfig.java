package com.nec.estore.backend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

import com.nec.estore.backend.model.Cart;
import com.nec.estore.backend.model.CartItem;
import com.nec.estore.backend.model.Category;
import com.nec.estore.backend.model.Customer;
import com.nec.estore.backend.model.Product;
import com.nec.estore.backend.model.Supplier;

@Configuration
@ComponentScan({"com.nec.estore.backend"})
//@EnableTransactionManagement
public class HibernateConfig {
	@Autowired
	@Bean(name ="dataSource")
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:tcp://localhost/~/test");
		ds.setUsername("sa");
		ds.setPassword("");
		return ds;
	}

	private Properties getHibernateProperties() {
		Properties prop = new Properties();
		prop.put("hibernate.show_sql", "true");//not-a-must For console display
		prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");//To connect with H2 DB
		prop.put("hibernate.format_sql", "true");//not-a-must		
		prop.put("hibernate.hbm2ddl.auto", "update");
		return prop;
	}

	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory sessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHibernateProperties());
		builder.addAnnotatedClass(Customer.class);
		builder.addAnnotatedClass(Product.class);
		builder.addAnnotatedClass(Supplier.class);
		builder.addAnnotatedClass(Category.class);
		builder.addAnnotatedClass(CartItem.class);
		builder.addAnnotatedClass(Cart.class);		
		return builder.buildSessionFactory();
	}

	// Create a transaction manager
/*	@Bean
	@Autowired
	public HibernateTransactionManager txManager(SessionFactory sessionFactory) {
		return new HibernateTransactionManager(sessionFactory);
	}*/

}
