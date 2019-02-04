package Api.DofusLite.DofusLite;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Armes implements Serializable{


		private static final long serialVersionUID= 2000L;
		
		@Id
		@GeneratedValue(strategy= GenerationType.AUTO)
		private Long id;
		private String name;
		private float dmg;

		
		public Armes() {

		}
		
		public void getArmes(Long id) {
			this.id = id;
			this.name = name;
			this.dmg = dmg;
		}

	

}
