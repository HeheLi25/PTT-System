package View;

import javax.swing.table.DefaultTableModel;

class CustomModel extends DefaultTableModel {
	 
    public boolean isCellEditable(int row, int column) {
        if (column > 0) {
            return false;
        } else {
            return true;
        }
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}