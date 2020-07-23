package com.example.slick;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("slick")
public class SlickApplicationProperties {

	private String foo;
	private String bar;

	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}

	public String getBar() {
		return bar;
	}

	public void setBar(String bar) {
		this.bar = bar;
	}

	@Override
	public String toString() {
		return "SlickApplicationProperties{" + "foo='" + foo + '\'' + ", bar='" + bar + '\'' + '}';
	}
}
