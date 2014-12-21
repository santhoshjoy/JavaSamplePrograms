/**
 * 
 */
package com.test.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author snatara
 *
 */
public class GenericClass {
	
	Map contacts = new HashMap();
	contacts.put(new Long(9912345678L), "Jenny");
	contacts.put(new Long(9912345679L),"Johny");

	Set<Map.Entry> contactValues = contacts.entrySet();
	Iterator&lt;Map.Entry&gt; contactIterator = contactValues.iterator();

	while (contactIterator.hasNext())
	{
	    Map.Entry anEntry = contactIterator.next();
	    Long number = anEntry.getKey();
	    String name =  anEntry.getValue();
	    System.out.println(number + &quot;:&quot; + name);
	}

}
