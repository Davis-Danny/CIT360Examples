package citbyui.cit360.davisdanny.json;

import java.io.Serializable;
import java.util.HashMap;

public class TestBean implements Serializable {

	private static final long serialVersionUID = 8991112393868993664L;

	private String name;
	private int id;

	public TestBean(String name, int id) {
		setName(name);
		setId(id);
	}

	public TestBean(HashMap<?, ?> aMap) {
		setName((String) aMap.get("name"));
		setId((int) (long) aMap.get("id"));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
