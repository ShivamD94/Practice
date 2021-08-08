package payload;

public class UpdatePlace {
	public static String updateAdd(String add) {
		return "{\r\n" + 
				"\"place_id\":\""+add+"\",\r\n" + 
				"\"address\":\"70 newman tootsie walk, Tokyo\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}\r\n" + 
				"";
	}

}
