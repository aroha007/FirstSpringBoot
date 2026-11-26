package com.example.firstspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;





@Controller  // http:인터넷 서버주소

public class HomeController {

    // 이서버의 최상위 루트의 문서를 주세요
    // 루트문서는 기본값이 index.html

    @GetMapping("/") // 메소드 하나 1:1 대응
    @ResponseBody 
    // 문서파일로 만들어 응답해야함
    // 정식 문서파일로 만들어 보내줌
    public String home() {
        
        return "안녕하세요";
    }

    // 인터넷서버/game을 하면
    // index.html 문서를 웹브라우저에게 반환
    // 1. /game과 연결되는 매핑함수 정의
    // helloGame() 정의
    // 2. GET 요청이므로 @GetMapping("/game")
    // 3. index.html 홈페이지를 리턴
    // 전부 스프링부트가 해주므로
    // 홈페이지 파일 이름만 주면
    @GetMapping("/game")
    public String helloGame () {
        return "index";     // 스프링이 알아서 처리
                            // 문서 이름만 주면 됨
                            // 확장자는 안붙임
    }
}
