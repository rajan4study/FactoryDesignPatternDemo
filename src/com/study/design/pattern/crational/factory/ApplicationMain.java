package com.study.design.pattern.crational.factory;

import com.study.design.pattern.crational.factory.autoFactory.AutoFactory;
import com.study.design.pattern.crational.factory.model.Auto;

/**
 * @author rajan
 * 
 * This is demo for factory design pattern-creation pattern
 * 
 * @since 28Jun2021
 *
 */
public class ApplicationMain {
	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		AutoFactory autoFactory=new AutoFactory();
		Auto auto1= autoFactory.getAuto("zen");
		auto1.display();
		
		Auto auto2= autoFactory.getAuto("C-class-bmw");
		auto2.display();
		
		Auto auto3= autoFactory.getAuto("mycar");
		auto3.display();
	}
}
