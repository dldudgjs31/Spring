package com.scope2;

public class User2 {
	private Movie movie;
	private Music music;

	//생성자로 의존관계 설정
	public User2(Movie movie,Music music) {
		this.movie = movie;
		this.music = music;
	}

	
	public void execute() {
		movie.play();
		music.play();
	}
	
}
