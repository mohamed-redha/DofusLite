package Api.DofusLite.DofusLite;

import org.springframework.beans.factory.annotation.Autowired;

public class StuffResource {
	
	@Autowired
	private StuffRepository stuffrepository;

	public StuffResource() {
		// TODO Auto-generated constructor stub
		stuffrepository.getClass();
	}

}
