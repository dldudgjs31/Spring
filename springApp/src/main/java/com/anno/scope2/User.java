package com.anno.scope2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//╫л╠шео
@Component
public class User {
	@Autowired
	private Movie movie;
	@Autowired
	private Music music;
	
	public void execute() {
		System.out.println("proxyMode = ScopedProxyMode.TARGET_CLASS");
		movie.play();
		music.play();
	}
}

