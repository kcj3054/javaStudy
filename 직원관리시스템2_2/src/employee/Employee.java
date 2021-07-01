package employee;

public class Employee {

		protected int id;
		protected String name;
		protected DepartmentEnum department;
		
		public void setID(int id) {
			this.id = id;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getID() {
			return id;
		}
		
		public String getName() {
			return name;
		}
		
}
