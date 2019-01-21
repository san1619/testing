package latestspringmvc;

	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import org.springframework.web.servlet.ModelAndView;
	import org.springframework.web.servlet.mvc.Controller;

	public class LoginController implements Controller {

		@Override
		public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse arg1) 
				throws Exception {
			// TODO Auto-generated method stub
			
			
			System.out.println("!!!!!!!!!!!!!"+req.getParameter("userName"));
			ModelAndView mv = new ModelAndView("Home");
			mv.addObject("name", req.getParameter("userName"));
			return mv;
		}

	} 




