package com.study.design.pattern.crational.factory.autoFactory;

import com.study.design.pattern.crational.factory.model.Auto;
import com.study.design.pattern.crational.factory.model.impl.Bmw;
import com.study.design.pattern.crational.factory.model.impl.I20;
import com.study.design.pattern.crational.factory.model.impl.Zen;

/**
 * @author rajan
 * Factory class create car
 * @since 29Jun2021
 *
 */
public class AutoFactory {
	
	/**
	 * @param car
	 * @return
	 */
	public Auto getAuto(String  car) {
		if("C-class-bmw".equals(car)) {
			return new Bmw();
		}else if("zen".equals(car)) {
			return new Zen();
		}
		return new I20();
	}

}
