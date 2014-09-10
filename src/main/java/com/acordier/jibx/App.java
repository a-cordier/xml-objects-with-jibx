package com.acordier.jibx;

import org.jibx.runtime.JiBXException;

import com.acordier.jibx.model.Employee;
import com.acordier.jibx.model.JibxHelper;

public class App {

	public static void main(String[] args) {
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Employee id=\"237871\"><name>Cisco</name><hiredate>Jan 03, 2011</hiredate></Employee>";
		JibxHelper jibx = new JibxHelper();
		try {
			Employee employee = jibx.unmarshallEmployee(xml);
			System.out.println(employee);
		} catch (JiBXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
