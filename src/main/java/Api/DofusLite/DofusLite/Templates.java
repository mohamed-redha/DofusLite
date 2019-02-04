package Api.DofusLite.DofusLite;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Templates implements Serializable{


		private static final long serialVersionUID= 1000L;
		
		@Id
		@GeneratedValue(strategy= GenerationType.AUTO)
		private int id;
		private String nom;
		private String url;
		private String description;
		
		
		public Templates() {
			
		}
		
		public void getTemplates(int id) {
			
			this.id = id;
			this.url = url;
			this.description= description;
			
		}
		

	

}
