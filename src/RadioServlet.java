

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RadioServlet")
public class RadioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RadioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		// request.getParameter("") -> radio는 value를 값으로 받음
		String gender = request.getParameter("gender");
		String chk_mail = request.getParameter("chk_mail");
		String content = request.getParameter("content");
		String job = request.getParameter("job");
		String items[] = request.getParameterValues("item");
		String interests[] = request.getParameterValues("interest");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		
		out.println("당신이 입력한 정보입니다.<br><hr>");
		out.println("성별 : <b>");
		out.println(gender);
		out.println("</b><br> 메일 정보 수신 여부 : <b>");
		out.println(chk_mail);
		
		out.println("</b><br> 선택한 품목 : <b>");
		if(items == null) {
			out.print("선택한 항목이 없습니다");
		}else {
			for(String item : items) {
				out.print(item +" ");
			}
		}
		
		out.println("</b><br> 선택한 직업 : <b>");
		out.print(job);

		out.println("</b><br> 당신의 관심분야 : <b>");
		if(interests == null) {
			out.print("선택한 항목이 없습니다");
		}else {
			for(String interest : interests) {
				out.print(interest +" ");
			}
		}
		
		out.println("</b><br> 가입인사 : <b><pre>");
		out.println(content);
		
		out.println("</b><br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</html></body>");
		out.close();
	}

}
