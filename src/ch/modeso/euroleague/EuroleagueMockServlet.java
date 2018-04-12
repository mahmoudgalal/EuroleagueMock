package ch.modeso.euroleague;

import java.io.IOException;
import java.util.Random;

import javax.servlet.http.*;

@SuppressWarnings("serial")
/**
 * Bad response 
 * @author user
 *
 */
public class EuroleagueMockServlet extends HttpServlet {
	public static final String XML = "<games>\n<game>\r\n<gamecode>uleb_186</gamecode>\r\n<homepts>%d</homepts>\r\n<awaypts>%d</awaypts>\r\n"
			+ "<fullscore>%s</fullscore>\r\n<minute>40:00</minute>\r\n<status>on</status>\r\n<hour>20:30"
			+ "</hour>\r\n<team1>\r\n<![CDATA[ Valencia Basket ]]>\r\n</team1>\r\n<team2>\r\n<![CDATA[ Unicaja Malaga ]]>"
			+ "\r\n</team2>\r\n<liveUrl>\r\nhttp://www.eurocupbasketball.com/eurocup/games/results/showgame?gamecode=186&seasoncode=U2016&"
			+ "disp=TICASF36D412317F224845ZWV\r\n</liveUrl>\r\n<idgame>uleb_186</idgame>\r\n<stat>20</stat>\r\n<disp>TICASF36D412317F224845ZWV"
			+ "</disp>\r\n<z>0</z>\r\n<date>Apr 05, 2017</date>\r\n<codeteam1>PAM</codeteam1>\r\n<codeteam2>MAL</codeteam2>\r\n</game>\n</games>" ;
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("application/xml");
		String badResponse =  String.format(XML, 
				generateRandomScore(),generateRandomScore(),generateRandomFullScore());
		resp.getWriter().println(badResponse);
	}
	private String generateRandomFullScore(){
		String ret = "0-0";
		Random random = new  Random();		
		int homeScore = random.nextInt(100); 
		int awayScore = random.nextInt(100); 
		ret = String.format("%d-%d", homeScore,awayScore);
		return ret;
	}
	
	private int generateRandomScore(){		
		Random random = new  Random();		
		return random.nextInt(100); 		
	}
}
