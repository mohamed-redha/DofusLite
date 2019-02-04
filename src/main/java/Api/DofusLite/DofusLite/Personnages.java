package Api.DofusLite.DofusLite;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personnages implements Serializable{


		private static final long serialVersionUID= 2000L;
		
		@Id
		@GeneratedValue(strategy= GenerationType.AUTO)
		private int id;
		private int idArmes;
		private int idEquipement;
		private int idTemplate;
		
		public Personnages() {

		}
		
		public void putPersonnages(int idArmes,int idEquipement,int idTemplate) {
			this.idArmes = idArmes;
			this.idEquipement = idEquipement;
			this.idTemplate = idTemplate;
		}

	

}
