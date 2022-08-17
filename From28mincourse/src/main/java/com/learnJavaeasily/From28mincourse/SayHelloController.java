package com.learnJavaeasily.From28mincourse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController 
{
	@RequestMapping("/say-hello")
	@ResponseBody
	public String Hello()
	{
		return "Hello, what are you learning today?";
	}
	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String Hi()
	{
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>");
		sb.append("Hello Page");
		sb.append("</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append(" Welcome to the hello page ");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}

}
