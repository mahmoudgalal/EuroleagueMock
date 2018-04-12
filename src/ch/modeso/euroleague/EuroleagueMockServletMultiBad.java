package ch.modeso.euroleague;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class EuroleagueMockServletMultiBad extends HttpServlet {
	
	public static final String XML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n<games>\r\n\t"
			+ "<game>\r\n\t\t<gamecode>MST</gamecode>\r\n\t\t<homepts>0</homepts>\r\n\t\t<awaypts>0</awaypts>"
			+ "\r\n\t\t<fullscore>0-0</fullscore>\r\n\t\t<minute>00:00</minute>\r\n\t\t<status>off</status>\r\n\t\t"
			+ "<hour>20:00</hour>\r\n\t\t<team1>\r\n\t\t\t<![CDATA[]]>\r\n\t\t</team1>\r\n\t\t<team2>\r\n\t\t\t<![CDATA[]]>"
			+ "\r\n\t\t</team2>\r\n\t\t<liveUrl>http://www.euroleague.net/main/results/showgame?gamecode=1000&amp;seasoncode=2016&amp;disp=MST19F167A6DB14PWWAM2828K"
			+ "</liveUrl>\r\n\t\t<idgame>MST</idgame>\r\n\t\t<stat>10</stat>\r\n\t\t<disp>MST19F167A6DB14PWWAM2828K</disp>"
			+ "\r\n\t\t<z>0</z>\r\n\t\t<date>Nov 21, 2016</date>\r\n\t\t<codeteam1 />\r\n\t\t<codeteam2 />\r\n\t</game>"
			+ "\r\n\t<game>\r\n\t\t<gamecode>uleb_186</gamecode>\r\n\t\t<homepts>58</homepts>\r\n\t\t<awaypts>63</awaypts>"
			+ "\r\n\t\t<fullscore>58-63</fullscore>\r\n\t\t<minute>40:00</minute>\r\n\t\t<status>on</status>\r\n\t\t<hour>20:30</hour>"
			+ "\r\n\t\t<team1>\r\n\t\t<![CDATA[ Valencia Basket ]]>\r\n\t\t</team1>\r\n\t\t<team2>\r\n\t\t<![CDATA[ Unicaja Malaga ]]>"
			+ "\r\n\t\t</team2>\r\n\t\t<liveUrl>\r\n\t\thttp://www.eurocupbasketball.com/eurocup/games/results/showgame?gamecode=186&seasoncode=U2016&disp=TICASF36D412317F224845ZWV\r\n\t\t"
			+ "</liveUrl>\r\n\t\t<idgame>uleb_186</idgame>\r\n\t\t<stat>20</stat>\r\n\t\t<disp>TICASF36D412317F224845ZWV</disp>"
			+ "\r\n\t\t<z>0</z>\r\n\t\t<date>Apr 05, 2017</date>\r\n\t\t<codeteam1>PAM</codeteam1>\r\n\t\t<codeteam2>MAL</codeteam2>\r\n\t\t</game>\r\n</games>" ;
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("application/xml");
		resp.getWriter().println(XML);
	}
}
