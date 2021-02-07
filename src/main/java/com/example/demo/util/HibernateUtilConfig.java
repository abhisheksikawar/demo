/*
 * package com.example.demo.util;
 * 
 * import javax.persistence.EntityManagerFactory;
 * 
 * import org.hibernate.SessionFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.context.annotation.Lazy;
 * 
 * @Configuration public class HibernateUtilConfig {
 * 
 * @Autowired EntityManagerFactory entityManagerFactory;
 * 
 * @Bean
 * 
 * @Lazy public SessionFactory getSessionFactory() {
 * if(entityManagerFactory.unwrap(SessionFactory.class)==null) { throw new
 * NullPointerException("factiry is not hibernate"); } return
 * entityManagerFactory.unwrap(SessionFactory.class); } }
 */