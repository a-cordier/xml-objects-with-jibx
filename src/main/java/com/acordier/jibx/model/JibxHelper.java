package com.acordier.jibx.model;

import java.io.StringReader;
import java.io.StringWriter;

import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IMarshallingContext;
import org.jibx.runtime.IUnmarshallingContext;
import org.jibx.runtime.JiBXException;

public class JibxHelper {
	
	public String marshallEmployee(Employee employee) throws JiBXException{
		IBindingFactory bFactory = BindingDirectory.getFactory(Employee.class);
		IMarshallingContext mContext = bFactory.createMarshallingContext();
		mContext.setIndent(2);
		StringWriter stringWriter = new StringWriter();
		mContext.setOutput(stringWriter);
		mContext.marshalDocument(employee, "UTF-8", null);
		String output = stringWriter.toString();
		return output;
	}
	
	public Employee unmarshallEmployee(String xml) throws JiBXException{
		IBindingFactory bFactory = BindingDirectory.getFactory(Employee.class);
		IUnmarshallingContext uContext = bFactory.createUnmarshallingContext();
		StringReader stringReader = new StringReader(xml);
		Employee employee =  (Employee)uContext.unmarshalDocument(stringReader, null);
		return employee;
	}
}
