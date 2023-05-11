package pack06.go.data;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;

public class JsoupAPI_Try {
	public static void main(String[] args) {
		// ?page=1&perPage=10&serviceKey=QpfwYHyS7mDS8quxzqyNRmwjxUhG9MP82I0GIyfoVbPl4EQ54aGpjm2Fuf6GZ1St3xvGkqAhOAw7vuJlBjghCg%3D%3D
		String url = "https://api.odcloud.kr/api/15012213/v1/uddi:97604798-c802-451d-9c32-dbeb0fe9e872";
		String doc = null;
		try {
			doc = Jsoup.connect(url).data("page", "1").data("perPage", "10")
			.data("serviceKey", "QpfwYHyS7mDS8quxzqyNRmwjxUhG9MP82I0GIyfoVbPl4EQ54aGpjm2Fuf6GZ1St3xvGkqAhOAw7vuJlBjghCg==")
			.timeout(1000 * 10)
			.userAgent("Chrome")
			.ignoreContentType(true)
			.execute().body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JSONParser parser = new JSONParser();
		try {	
			JSONObject jsonObj = (JSONObject) parser.parse(doc);
			JSONArray array = (JSONArray) jsonObj.get("data");
			for(int i=0; i<array.size(); i++) {
				JSONObject tempObj = (JSONObject) array.get(i);
				System.out.println("업체명: " + tempObj.get("업체명"));
				System.out.println("주소: " + tempObj.get("소재지도로명주소"));
				System.out.println();
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}

