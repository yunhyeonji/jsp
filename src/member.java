

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MemberServlet")
public class member extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public member() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		//변수 선언
		String name = request.getParameter("name");
		String jumin = request.getParameter("jumin_1") + "-"+ request.getParameter("jumin_2");
		String id = request.getParameter("id");
		String password = request.getParameter("pwd");
		
		String email = request.getParameter("email");
		if(request.getParameter("email_dns").trim() == "") {
			email += "@" + request.getParameter("emailaddr");
		}else {
			email += "@" + request.getParameter("email_dns");
		}
		
		String zip = request.getParameter("zip");
		String addr = request.getParameter("addr1") + request.getParameter("addr2");
		String phone = request.getParameter("phone");
		String job = request.getParameter("job");
		String chk = request.getParameter("chk_mail");
		
		String interests[] = request.getParameterValues("interest");

		//홈페이지에 나타나는 부분
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		
		out.println("당신이 입력한 정보입니다.<br><hr>");
		
		out.println("이름 : <b>");
		out.println(name);
		
		out.println("</b><br> 주민번호 : <b>");
		out.println(jumin);
		
		out.println("</b><br> 아이디 : <b>");
		out.println(id);
		
		out.println("</b><br> 비밀번호 : <b>");
		out.println(password);
		
		out.println("</b><br> 이메일 : <b>");
		out.println(email);
		
		out.println("</b><br> 우편번호 : <b>");
		out.println(zip);
		
		out.println("</b><br> 주소: <b>");
		out.println(addr);
		
		out.println("</b><br> 핸드폰번호 : <b>");
		out.println(phone);
		
		out.println("</b><br> 메일 정보 수신 여부 : <b>");
		out.println(chk);
		
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
		
		//뒤로 가기
		out.println("</b><br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</html></body>");
		out.close();
	}

}
