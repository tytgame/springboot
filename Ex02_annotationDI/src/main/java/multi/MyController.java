package multi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/*
 * @Controller : bean으로 등록
 				 어떠한 기능을 수행하는 경우에 붙여줌
 				 주입되어 사용되는 경우 @Component를 붙여줌
 * 
 */
@Controller
public class MyController {
	/*
	 * @RequestMapping("/") // get, post의 method를 모두 받음 public @ResponseBody String
	 * root() { // @ResponseBody : html이 아닌 일반 문자를 반환할 때 return "Annotation 사용하기"; }
	 * 임포트 안되는 이유는 프로젝트 만들때 와르로 안만들고 자르로 만들어서 그런것 같음 LSP 오류는 둘다 뜨는데 찾아봐야함
	 */
	
//	@RequestMapping("/")

	@Autowired
	Person Person1;

	@Autowired
	@Qualifier("printerB")
	Printer printer;

	@Autowired
	Person Person2;
	/*
	 * @RequestMapping("/") public @ResponseBody String root() { Person1.print();
	 * 
	 * Person1.setPrinter(printer); return "Annotaiton 사용하기"; }
	 */
}
