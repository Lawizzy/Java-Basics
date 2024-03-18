package exercise_Film;

public class FeatureFilm {
	
	private String title;
	private Actor actor;
	private String topic;
	
	public void update(Actor a, String title) {
		
	}
	
	public void update(Actor a, Actor b, String title) {
		
	}
	
	public void update(String topic, String title) {
		
	}
	
	//Which of the following will be allowed
	
	//error: duplicate method
	//public boolean update(String category, String theater) {} //Out
	
	//error: must return a boolean
	//public boolean update(String title, Actor a) {} //In if add a return type so IN
	
	//error: duplicate method
	//public boolean update(Actor a, Actor b, String title) {} //Out
	
	//error: must return a boolean
	//public boolean update(Actor a, Actor b) {} ////In if add a return type so IN

}
