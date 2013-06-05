package tos.fw.web.sandbox.bean;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "testBean")
@ViewScoped
public class TestBean {

	private String country;

	public List<String> completeCountries(String query) {
		return Arrays.asList("Belgium", "China", "India");
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
