import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        JOptionPane.showMessageDialog(null, "WELCOME");

        
        Directory directory = new Directory();

        Object[] options = {"Add", "View List", "Delete", "Edit" ,"Exit"};
        
        int choose = 0;
        int id = 0;

    do{
        choose = JOptionPane.showOptionDialog(null, "Choose an option", "Advice",
        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        switch(choose){
        case 0:
            Contact contact = new Contact();
            contact.setName(JOptionPane.showInputDialog(null, "Type Contact Name"));
            contact.setPhoneNumber(JOptionPane.showInputDialog(null, "Type Contact Number"));
            directory.addContact(contact);

            break;

        case 1:
            JOptionPane.showMessageDialog(null, directory.viewList());
            break;

        case 2:
        id = Integer.parseInt(JOptionPane.showInputDialog(null, 
        directory.viewList() + "Type in the ID you want to Delete"));
        directory.deleteContact(id);
        break;

        case 3:
        id = Integer.parseInt(JOptionPane.showInputDialog(null, 
                directory.viewList() + "Type in the ID you want to Edit"));
                Contact contactEdit = new Contact();
                contactEdit.setName(JOptionPane.showInputDialog(null, "Type Contact Name"));
                contactEdit.setPhoneNumber(JOptionPane.showInputDialog(null, "Type Contact Number"));
       
                directory.updateContact(id, contactEdit);
        break;
        
        default:
            break;


        }

    }while(choose !=4);   

       
    }
}
