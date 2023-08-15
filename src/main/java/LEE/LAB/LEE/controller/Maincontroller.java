package LEE.LAB.LEE.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class Maincontroller {

    // 메인 페이지
    @GetMapping (value = "/")
    public String Main(){
        return "Mainpage/Main";
    }








}
