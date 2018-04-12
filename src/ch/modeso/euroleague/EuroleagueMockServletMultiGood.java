package ch.modeso.euroleague;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class EuroleagueMockServletMultiGood extends HttpServlet {
	
	public static final String XML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n<games>\r\n\t<game>"
			+ "\r\n\t\t<gamecode>MST</gamecode>\r\n\t\t<homepts>0</homepts>\r\n\t\t<awaypts>0</awaypts>\r\n\t\t"
			+ "<fullscore>0-0</fullscore>\r\n\t\t<minute>00:00</minute>\r\n\t\t<status>off</status>\r\n\t\t<hour>"
			+ "20:00</hour>\r\n\t\t<team1>\r\n\t\t\t<![CDATA[]]>\r\n\t\t</team1>\r\n\t\t<team2>\r\n\t\t\t<![CDATA[]]>"
			+ "\r\n\t\t</team2>\r\n\t\t<liveUrl>http://www.euroleague.net/main/results/showgame?"
			+ "gamecode=1000&amp;seasoncode=2016&amp;disp=MST19F167A6DB14PWWAM2828K</liveUrl>\r\n\t\t<idgame>MST</idgame>\r\n\t\t"
			+ "<stat>10</stat>\r\n\t\t<disp>MST19F167A6DB14PWWAM2828K</disp>\r\n\t\t<z>0</z>\r\n\t\t<date>Nov 21, 2016</date>\r\n\t\t<codeteam1 />"
			+ "\r\n\t\t<codeteam2 />\r\n\t</game>\r\n\t<game>\r\n\t\t<gamecode>MST01</gamecode>\r\n\t\t<homepts>0</homepts>\r\n\t\t"
			+ "<awaypts>0</awaypts>\r\n\t\t<fullscore>0-0</fullscore>\r\n\t\t<minute>00:00</minute>\r\n\t\t<status>off</status>\r\n\t\t"
			+ "<hour>20:00</hour>\r\n\t\t<team1>\r\n\t\t\t<![CDATA[]]>\r\n\t\t</team1>\r\n\t\t<team2>\r\n\t\t\t<![CDATA[]]>\r\n\t\t</team2>"
			+ "\r\n\t\t<liveUrl>http://www.euroleague.net/main/results/showgame?gamecode=1500&amp;seasoncode=E2016&amp;disp=MST19F167A6DB14PWWAM2828K"
			+ "</liveUrl>\r\n\t\t<idgame>MST01</idgame>\r\n\t\t<stat>10</stat>\r\n\t\t<disp>MST19F167A6DB14PWWAM2828K</disp>\r\n\t\t<z>1</z>\r\n\t\t<date>"
			+ "Nov 21, 2016</date>\r\n\t\t<codeteam1 />\r\n\t\t<codeteam2 />\r\n\t</game>\r\n\t<game>\r\n\t\t<gamecode>MST02</gamecode>\r\n\t\t<homepts>0</homepts>\r\n\t\t"
			+ "<awaypts>0</awaypts>\r\n\t\t<fullscore>0-0</fullscore>\r\n\t\t<minute>00:00</minute>\r\n\t\t<status>off</status>\r\n\t\t<hour>12:40</hour>\r\n\t\t<team1>\r\n\t\t\t"
			+ "<![CDATA[]]>\r\n\t\t</team1>\r\n\t\t<team2>\r\n\t\t\t<![CDATA[]]>\r\n\t\t</team2>"
			+ "\r\n\t\t<liveUrl>http://www.euroleague.net/main/results/showgame?gamecode=1500&amp;seasoncode=E2016&amp;disp=MST19F167A6DB14PWWAM2828K</liveUrl>\r\n\t\t"
			+ "<idgame>MST02</idgame>\r\n\t\t<stat>10</stat>\r\n\t\t<disp>MST19F167A6DB14PWWAM2828K</disp>\r\n\t\t<z>0</z>\r\n\t\t<date>Nov 21, 2016</date>\r\n\t\t<codeteam1 />"
			+ "\r\n\t\t<codeteam2 />\r\n\t</game>\r\n\t<game>\r\n\t\t<gamecode>MST03</gamecode>\r\n\t\t<homepts>0</homepts>\r\n\t\t<awaypts>0</awaypts>\r\n\t\t"
			+ "<fullscore>0-0</fullscore>\r\n\t\t<minute>00:00</minute>\r\n\t\t<status>off</status>\r\n\t\t<hour>12:40</hour>\r\n\t\t<team1>\r\n\t\t\t<![CDATA[]]>\r\n\t\t</team1>"
			+ "\r\n\t\t<team2>\r\n\t\t\t<![CDATA[]]>\r\n\t\t</team2>\r\n\t\t"
			+ "<liveUrl>http://www.euroleague.net/main/results/showgame?gamecode=1500&amp;seasoncode=E2016&amp;disp=MST19F167A6DB14PWWAM2828K</liveUrl>\r\n\t\t"
			+ "<idgame>MST03</idgame>\r\n\t\t<stat>10</stat>\r\n\t\t<disp>MST19F167A6DB14PWWAM2828K</disp>\r\n\t\t<z>1</z>\r\n\t\t<date>Nov 21, 2016</date>"
			+ "\r\n\t\t<codeteam1 />\r\n\t\t<codeteam2 />\r\n\t</game>\r\n</games>  " ;
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("application/xml");
		resp.getWriter().println(XML);
	}
}
