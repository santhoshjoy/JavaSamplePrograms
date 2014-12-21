/**
 * 
 */
package com.test.java;

import java.awt.Component;

import javax.swing.JTable;

/**
 * @author snatara
 * 
 */

public class MyCustomizedTableCellEditor extends DefaultTableCellEditor {
	@Override
	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {
				return table;

		// My customized functionality goes here.
	}
}
