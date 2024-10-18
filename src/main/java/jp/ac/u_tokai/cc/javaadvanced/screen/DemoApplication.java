package jp.ac.u_tokai.cc.javaadvanced.screen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * クラスと画面の対応をとるサンプルプログラム
 */
@SpringBootApplication
public class DemoApplication {

	/**
	 * Spring Bootを用いたWebアプリケーションの起動
	 * @param args Spring Applicationの引数
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
