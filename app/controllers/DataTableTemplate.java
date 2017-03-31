package controllers;

import java.util.Map;

import com.avaje.ebean.PagedList;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.Contact;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class DataTableTemplate extends Controller{

	 	public  Result index() {
	        return ok(views.html.dataTable.index.render("Your new application is ready."));
	    }
	    public  Result list() {
	        /**
	         * Get needed params
	         */
	        Map<String, String[]> params = request().queryString();

	        Integer iTotalRecords = Contact.find.findRowCount();
	        String filter = params.get("search[value]")[0];

	        Integer pageSize = Integer.valueOf(params.get("length")[0]);
	        Integer page = Integer.valueOf(params.get("start")[0]) / pageSize;

	        /**
	         * Get sorting order and column
	         */
	        String sortBy = "name";
	        String order = params.get("order[0][dir]")[0];

	        switch (Integer.valueOf(params.get("order[0][column]")[0])) {
	            case 0 :  sortBy = "name"; break;
	            case 1 :  sortBy = "title"; break;
	            case 2 :  sortBy = "email"; break;
	        }
	        /**
	         * Get page to show from database
	         * It is important to set setFetchAhead to false, since it doesn't benefit a stateless application at all.
	         */
	        PagedList<Contact> contactsPage = Contact.find.where()
	        		.like("name", "%" + filter + "%")
	                .orderBy(sortBy + " " + order + ", id " + order)
	                .findPagedList(page,pageSize);

	        Integer iTotalDisplayRecords = contactsPage.getTotalRowCount();

	        /**
	         * Construct the JSON to return
	         */
	        ObjectNode result = Json.newObject();

	        result.put("draw",Integer.valueOf(params.get("draw")[0]));
	        result.put("recordsTotal", iTotalRecords);
	        result.put("recordsFilter", iTotalDisplayRecords);
	        
	        ArrayNode an = result.putArray("data");

	        for (Contact c : contactsPage.getList()) {
	            ObjectNode row = Json.newObject();
	            row.put("0", c.name);
	            row.put("1", c.title);
	            row.put("2", "<a href='/adminCareer/member/detail/118'>"+c.email+"</a>");
	            row.put("3", "<button type='button' class='btn btn-default'>編集</button>");
	            an.add(row);
	        }
	        return ok(result);
	    }

}
