package es.sotero.nominas.business;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import es.sotero.nominas.business.entities.Empleado;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
@EnableJpaRepositories("es.sotero.nominas.business.repositories")
@EnableTransactionManagement
public class NominasBusinessConfig {

	@Autowired 
    private Environment env;
    
    @Bean
    public DataSource dataSource() {
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("db.driver"));
        dataSource.setUrl(env.getProperty("db.url"));
    	dataSource.setUsername(env.getProperty("db.username"));
    	dataSource.setPassword(env.getProperty("db.password"));
        return dataSource;
    }
    
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setDataSource(dataSource());
        emf.setPackagesToScan(Empleado.class.getPackage().getName());
        
        HibernateJpaVendorAdapter hibernateJpa = new HibernateJpaVendorAdapter();
        hibernateJpa.setDatabase(Database.ORACLE);
        hibernateJpa.setDatabasePlatform(env.getProperty("hibernate.dialect"));
        hibernateJpa.setGenerateDdl(env.getProperty("hibernate.generateDdl", Boolean.class));
        hibernateJpa.setShowSql(env.getProperty("hibernate.show_sql", Boolean.class));       
        emf.setJpaVendorAdapter(hibernateJpa);
        
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        jpaProperties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
        jpaProperties.put("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
        emf.setJpaProperties(jpaProperties);
        
        return emf;
    }
    
    @Bean
    public JpaTransactionManager transactionManager() {
        JpaTransactionManager txnMgr = new JpaTransactionManager();
        txnMgr.setEntityManagerFactory(entityManagerFactory().getObject());
        return txnMgr;
    }
}

//private static Double CHAIR_PRICE = new Double(20.50);
//private static String CHAIR_DESCRIPTION = "Chair";
//
//private static String TABLE_DESCRIPTION = "Table";
//private static Double TABLE_PRICE = new Double(150.10);
//
//@Bean
//public ProductManager loadProductManager() {
//    SimpleProductManager simpleProductManager = new SimpleProductManager();
//    
//    List<Product> products = new ArrayList<Product>();
//    Product product = new Product();
//    product.setDescription(CHAIR_DESCRIPTION);
//    product.setPrice(CHAIR_PRICE);
//    products.add(product);
//    product = new Product();
//    product.setDescription(TABLE_DESCRIPTION);
//    product.setPrice(TABLE_PRICE);
//    products.add(product);
//
//    simpleProductManager.setProducts(products);
//    return simpleProductManager;
//}