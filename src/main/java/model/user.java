package model;

public class user {
        int id;
        String name;
        String email;
        String password;
        
        
		public user() {
			super();
			// TODO Auto-generated constructor stub
		}
		public user(int id, String name, String email, String password) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.password = password;
		}
		public int getId() {vv
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "user [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";}
}
