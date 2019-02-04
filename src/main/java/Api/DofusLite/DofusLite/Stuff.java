package Api.DofusLite.DofusLite;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stuff implements Serializable{


		private static final long serialVersionUID= 2000L;
		   
		@Id
		@GeneratedValue(strategy= GenerationType.AUTO)
		private Long id;
		private String name;
		private int vie;
		

		
		public Stuff() {

		}
		
		public void getStuff(Long id) {
			this.id = id;
			this.name = name;
			this.vie = vie;
		}
		
	
	

}
