package ch.modeso.euroleague;

import java.io.IOException;
import java.util.Random;

import javax.servlet.http.*;

@SuppressWarnings("serial")
/**
 * Good response
 * @author user
 *
 */
public class EuroleagueMockServlet4 extends HttpServlet {
	
	
	public static final String XML = "<games>"
			////////////////////////////////////////////////////////////////////
			//				Game 1
			///////////////////////////////////////////////////////////////////
			+ "<game>"
			+ "<gamecode>euro_156</gamecode>"
			+ "<homepts>%02d</homepts>"
			+ "<awaypts>%02d</awaypts>"
			+ "<fullscore>%s</fullscore>"
			+ "<minute>%02d:%02d</minute>"
			+ "<status>off</status>"
			+ "<hour>11:05</hour>"
			+ "<team1><![CDATA[Panathinaikos Superfoods Athens]]></team1>"
			+ "<team2><![CDATA[Zalgiris Kaunas]]></team2>"
			+ "<liveUrl>http://www.euroleague.net/main/results/showgame?gamecode=156&amp;seasoncode=E2017&amp;disp=VPV51F36D421719NVG587SWLS</liveUrl>"
			+ "<idgame>euro_156</idgame>"
			+ "<stat>10</stat>"
			+ "<disp>VPV51F36D421719NVG587SWLS</disp>"
			+ "<z>0</z>"
			+ "<date>Sep 29, 2017</date>"
			+ "<codeteam1>PAN</codeteam1>"
			+ "<codeteam2>ZAL</codeteam2>"
			+ "</game>"
			
			////////////////////////////////////////////////////////////////////
			//				Game 3
			///////////////////////////////////////////////////////////////////
			+ "<game>"
			+ "<gamecode>euro_156</gamecode>"
			+ "<homepts>%02d</homepts>"
			+ "<awaypts>%02d</awaypts>"
			+ "<fullscore>%s</fullscore>"
			+ "<minute>%02d:%02d</minute>"
			+ "<status>off</status>"
			+ "<hour>11:05</hour>"
			+ "<team1><![CDATA[Panathinaikos Superfoods Athens]]></team1>"
			+ "<team2><![CDATA[Zalgiris Kaunas]]></team2>"
			+ "<liveUrl>http://www.euroleague.net/main/results/showgame?gamecode=156&amp;seasoncode=E2017&amp;disp=VPV51F36D421719NVG587SWLS</liveUrl>"
			+ "<idgame>euro_156</idgame>"
			+ "<stat>30</stat>"
			+ "<disp>VPV51F36D421719NVG587SWLS</disp>"
			+ "<z>0</z>"
			+ "<date>Sep 29, 2017</date>"
			+ "<codeteam1>PAN</codeteam1>"
			+ "<codeteam2>ZAL</codeteam2>"
			+ "</game>"
			////////////////////////////////////////////////////////////////////
			//				Game 2
			///////////////////////////////////////////////////////////////////
			+ "<game>"
			+ "<gamecode>euro_156</gamecode>"
			+ "<homepts>%02d</homepts>"
			+ "<awaypts>%02d</awaypts>"
			+ "<fullscore>%s</fullscore>"
			+ "<minute>%02d:%02d</minute>"
			+ "<status>off</status>"
			+ "<hour>11:05</hour>"
			+ "<team1><![CDATA[Panathinaikos Superfoods Athens]]></team1>"
			+ "<team2><![CDATA[Zalgiris Kaunas]]></team2>"
			+ "<liveUrl>http://www.euroleague.net/main/results/showgame?gamecode=156&amp;seasoncode=E2017&amp;disp=VPV51F36D421719NVG587SWLS</liveUrl>"
			+ "<idgame>euro_156</idgame>"
			+ "<stat>20</stat>"
			+ "<disp>VPV51F36D421719NVG587SWLS</disp>"
			+ "<z>0</z>"
			+ "<date>Sep 29, 2017</date>"
			+ "<codeteam1>PAN</codeteam1>"
			+ "<codeteam2>ZAL</codeteam2>"
			+ "</game>"
			
			+ "</games>";
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//resp.setContentType("application/xml");//text/xml
		resp.setContentType("text/xml");
		int homePts = 10;//generateRandomScore(0,100);
		int awayPts = 15; //generateRandomScore(0,100);
		int minute =30; //generateRandomInt(0,60);
		int seconds =44; //generateRandomInt(0,60);
		
		int homePts2 = 20;//generateRandomScore(0,100);
		int awayPts2 = 30;//generateRandomScore(0,100);
		int minute2 = 55;//generateRandomInt(0,60);
		int seconds2 = 11;//generateRandomInt(0,60);
		
		int homePts3 = 30;//generateRandomScore(0,100);
		int awayPts3 = 45; //generateRandomScore(0,100);
		int minute3 = 33;//generateRandomInt(0,60);
		int seconds3 = 16; //generateRandomInt(0,60);
		
		String goodResponse =  String.format(XML, 
				homePts,awayPts,homePts+"-"+awayPts,
				minute,seconds,
				homePts2,awayPts2,homePts2+"-"+awayPts2,
				minute2,seconds2,
				homePts3,awayPts3,homePts3+"-"+awayPts3,
				minute3,seconds3);
		resp.getWriter().println(goodResponse);
	}	
	
	
	private int generateRandomScore(int min,int max){		
		return generateRandomInt( min, max);		
	}
	private int generateRandomInt(int min,int max){
		Random random = new  Random();	
		int ret = random.nextInt(max)+min;
		return Math.min(max-1, ret); 	
	}
}
