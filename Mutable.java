package assign;

public class Mutable {
	private String name;
   //This is a constructor
	Mutable(String name) {
		this.name = name;
	}
   //This is a getter
	public String getName() {
		return name;
	}

	// This setter can modify the name
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
        //This is object 
		Mutable obj = new Mutable("SANTOSHI");
		System.out.println(obj.getName());

		// Using setter we can update the name, this object is mutable
		obj.setName("San");
		System.out.println(obj.getName());

	}
}