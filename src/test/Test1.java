package test;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import services.TwisterDB;

public class Test1 {
	public static void main(String [] args) {
		GregorianCalendar c = new GregorianCalendar();
		//TwisterDB.addMessage(13, c.getTime(), "mesa");
		List<Integer> a = new ArrayList<Integer> ();
		a.add(12);
		a.add(13);
		List<JSONObject> json = TwisterDB.getMessage(a);
		for (JSONObject j : json) {
			try {
				System.out.println(j.getString("content"));
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}