package multi;

import org.springframework.stereotype.Component;

@Component("PrinterB")
public class PrinterB implements Printer {

	@Override
	public void print(String msg) {
		System.out.println("Printer B : " + msg);
	}

}
