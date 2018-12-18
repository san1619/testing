package assign;

//Set the class final so this class cannot to extended
public final class Immutable {
	
	private String name;
	   //This is a constructor
		Immutable(String name) {
			this.name = name;
		}
	   //This is a getter
		public String getName() {
			return name;
		}

		
		public static void main(String[] args) {
	        //This is object 
			Immutable obj = new Immutable("SANTOSHI");
			System.out.println(obj.getName());

			// Now in this case we cannot change the object
	
		}
	}

