package com.sp.app.blog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("blog.blogController")
@RequestMapping("/blog/*")
public class BlogController {
	
	@ModelAttribute("blogList")
	public List<Blog> blogList(){
		List<Blog> list = new ArrayList<>();
		
		list.add(new Blog(111, "aaa", "가가가", "영헌이의 블로그", "프로그래밍"));
		list.add(new Blog(222, "bbb", "나나나", "주영이의 블로그", "자바"));
		list.add(new Blog(333, "ccc", "다다다", "혜리의 블로그", "파이썬"));
		list.add(new Blog(444, "ddd", "라라라", "성원이의 블로그", "오라클"));
		list.add(new Blog(555, "eee", "마마마", "채현이의 블로그", "자바스크립트"));
		return list;
	}
	
	
	@RequestMapping("main")
	public String main() throws Exception{
		return "blog/main";
	}
	
// @PathVariable
	/*
	 * -url 템플릿을 이용하여 rest 방식의 url 매핑처리를 위한 어노테이션
	 *  -블로그, 카페, sns등 유저별 페이지 구축시 편리
	 *  - @RequestMapping 어노태이션 값으로 {템플릿변수} 사용
	 *  - @PathVariable을 이용하여 {템플릿 변수} 와 같은 동일한 이름을 갖는 파라미터 추가
	 *  
	 * -rest(Representational State Transfer) 
	 * -url을 통해 자원을 명시하고, http 메소드를 통해 해당 자원을 조작할 수 있는 기법
	 * -RESTful 웹서비스는 리소스  uri를 알면 웹서버와 웹클라이언트의 종류와 상관없이 http 프로토콜만으로 접근 가능한 서비스
	 * -HTTP 프로토콜만으로 접근 가능한 서비스
	 * -rest는 기본 http 프로토콜 메소드인 get/put/post/delete를 이용하여 서비스 제공자에게 서비를 요청하는 방식
	 * 서비스 제공자는 요청받은 서비스의 리소스를 다양한 형태(JSON, XML 등) 으로 변환해준다.
	 * 예약생성 : /TEST/202001?cmd=insert
	 * 예약취소 : /TEST/202001?cmd=delete
	 * 와 같은 표현은 restful 설계라 할 수 없다.
	 * 
	 * /TEST/202001/delete
	 * /TEST/202001/insert
	 */
	@RequestMapping("{idx}/home")
	public String blog(
			@PathVariable long idx,
			Model model) throws Exception{
		
		Blog dto=null;
		for(Blog vo : blogList()) {
			if(vo.getBlogIdx()== idx) {
				dto=vo;
				break;
			}
		}
		model.addAttribute("dto",dto);
		return "blog/home";
	}
}
