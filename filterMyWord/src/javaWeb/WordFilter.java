package javaWeb;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;


@WebFilter("/*")
public class WordFilter implements Filter {

   
    public WordFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
request.setCharacterEncoding("utf-8");

		//�ڹ���������װ��ģʽ�� ԭװrequest�Ĺ�����ǿ��
		//---���غ�̨���õ�getParamter()����

		MyRequest req = new MyRequest((HttpServletRequest)request);
		chain.doFilter(req, response);
	}

	class MyRequest extends HttpServletRequestWrapper{
		
		public MyRequest(HttpServletRequest request) {
			super(request);
		}
		
		public String getParameter(String name) {
			String str = super.getParameter(name);
			List<String> list = WordsUtil.getWords();
			for(String word : list){
				str = str.replaceAll(word, "*");
			}
			return str;
		}
		}
	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	

	
}
