import java.util.List;
import java.util.Map;

import com.avaje.ebean.Ebean;

import models.Contact;
import play.Application;
import play.GlobalSettings;
import play.libs.Yaml;
import util.RenderDbToDatatable;

public class Global extends GlobalSettings {

	@Override
	public void onStart(Application app) {

		/**
		 * Here we load the initial data into the database
		 */
		if (Ebean.find(Contact.class).findRowCount() == 0) {
			RenderDbToDatatable renderDb = new RenderDbToDatatable();
			@SuppressWarnings("unchecked")
			Map<String, List<Contact>> all = (Map<String, List<Contact>>) Yaml.load("initial-data.yml");

			List<Contact> constacs = all.get("contacts");
			String te = constacs.get(0).toString();
			System.out.println(te);
			for (Contact contact : constacs) {
				Ebean.save(contact);
			}
			for (int i = 0; i < 1000; i++) {
				Ebean.save(renderDb.randomContact());
			}
		}
	}
}