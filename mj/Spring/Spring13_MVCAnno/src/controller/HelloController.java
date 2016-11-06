package controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("greeting", getGreet());
		return mv;
	}
	private String getGreet() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(hour >=7 && hour <=11) {
			return "���� ��ħ~";
		}else if (hour >=12 && hour <3) {
			return "�Ļ� �ϼ̳���?";
		}else {
			return "�츮�� ������ ����";
		}
	}
}
