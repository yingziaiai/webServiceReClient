package com.webservice.soap;

import java.rmi.RemoteException;
//http://blog.sina.com.cn/s/blog_7003af290101gykd.html

//http://localhost:8080/webService/services/CalculateService?wsdl
//http://localhost:8080/webService/services/CalculateService
public class Test {
public static void main(String[] args) {
	CalculateServiceProxy csp = new CalculateServiceProxy("http://localhost:8080/webService/services/CalculateService");
    try {
		System.out.println(csp.plus(100, 23));
	} catch (RemoteException e) {
		e.printStackTrace();
	}

}
}
