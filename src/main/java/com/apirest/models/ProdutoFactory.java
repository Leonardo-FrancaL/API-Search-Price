/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.models;

import com.fasterxml.classmate.AnnotationConfiguration;
import java.io.File;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ProdutoFactory {
/*Classe não utilizada*/
    private static final SessionFactory sessionFactory;

		static {
			try {
				sessionFactory = new Configuration().configure(new File("src/main/resources/hibernate.cfg.xml"))
						.buildSessionFactory();
			} catch (Throwable ex) {
				System.err.println("Não foi possivel criar a SessionFactory." + ex);
				throw new ExceptionInInitializerError(ex);
			}
		}

		public static Session getSession() {
			return sessionFactory.openSession();
		}
}
