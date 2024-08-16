package jp.ac.u_tokai.cc.javaadvanced.screen;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 画面表示を制御する
 */
@Controller
public class MyController {

    /**
     * ブラウザからトップページのリクエストが来た場合の処理
     * @param model HTMLファイルに渡すパラメーター
     * @return resources/templates内のHTMLファイルの名前（.htmlを取った部分）
     */
    @GetMapping("/person")
    public String start(Model model) {
        final var person = new Person();
        model.addAttribute("obj", person);
        return "person"; // HTMLファイルがsample.htmlの場合
    } 

    /**
     * ブラウザからformリクエストが来た場合の処理
     * @param person リクエストパラメーター
     * @param model HTMLファイルに渡すパラメーター
     * @return resources/templates内のHTMLファイルの名前（.htmlを取った部分）
     */
    @PostMapping("/person")
    public String end(Person person, Model model) {
        final int newAge = person.getAge() + 1;// データの加工ができることを示すために１加える
        person.setAge(newAge); 
        model.addAttribute("obj", person);
        return "person";
    } 
}
