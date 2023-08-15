package LEE.LAB.LEE.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.ui.Model;


@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/excel")
public class Excelcontroller {

    @GetMapping("/")
    public String openExcelpage(){
        return "/Excel/excel";
    }

    @PostMapping("/read")
    public String readExcelData(@RequestParam("file") MultipartFile file, Model model){


        // DB화된 엑셀 로드
        excelService.loadExcel();
        model.addAttribute("datas", dataList); // 5

        return "/Excel/excelResult";
    }

}
