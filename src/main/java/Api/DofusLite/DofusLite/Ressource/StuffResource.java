package Api.DofusLite.DofusLite.Ressource;

import org.springframework.beans.factory.annotation.Autowired;

import Api.DofusLite.DofusLite.Repository.StuffRepository;

public class StuffResource {
	
	@Autowired
	private StuffRepository stuffrepository;

	public StuffResource() {
		// TODO Auto-generated constructor stub
		stuffrepository.getClass();
	}

}
