package org.zcy.tester.gson;

import com.google.gson.Gson;
import org.apache.commons.collections.MapUtils;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by chunyang.zcy on 2014/8/18.
 */
public class GsonTester {

	public static void main(String args[]) {

		Gson gson = new Gson();

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("11", "22");
		map.put("22", "33");
		System.out.println(gson.toJson(map));

//		MapUtils.invertMap(map);


//		byte a = 1;
//		byte b = 2;
//		System.out.println(a+b);
//		a += b;
//		System.out.println(a);

//		System.out.println(3*0.1 == 0.3);
//		System.out.println(0.3);
//		System.out.println(3*0.1);

//		Attendance att = new Attendance();
//		att.setState(true);
//		att.setCreated(new Timestamp(System.currentTimeMillis()));
//		att.setModified(new Timestamp(System.currentTimeMillis()));
//		att.setDeviceId("dd");
//		att.setDriverId("ddd");
//		att.setRouteId("fff");
//		GsonBuilder builder = new GsonBuilder();
//		builder.registerTypeAdapter(Timestamp.class, new JsonSerializer<Timestamp>() {
//					private final DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//					@Override
//					public JsonElement serialize(Timestamp date, Type type, JsonSerializationContext arg2) {
//						return new JsonPrimitive(date.getTime());
//					}
//					@Override
//					public Timestamp deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
//						if (!(jsonElement instanceof JsonPrimitive)) {
//							throw new JsonParseException("The date should be a string value");
//						}
//
//						try {
//							Date date = format.parse(jsonElement.getAsString());
//							return new Timestamp(date.getTime());
//						} catch (ParseException e) {
//							throw new JsonParseException(e);
//						}
//					}
//				}
//		);
//		Gson gson = builder.create();
//		System.out.println(gson.toJson(att));


		//递归解析
//		String json = "";
//		Gson gson = new Gson();
//		List<HashMap<String, String>> list = gson.fromJson(json, HashMap.class);

	}
}
