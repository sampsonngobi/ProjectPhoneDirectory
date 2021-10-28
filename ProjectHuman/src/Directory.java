import java.util.ArrayList;

public class Directory {

    private ArrayList<Contact> contactList;

    public Directory(){
        contactList = new ArrayList<>();

    }    

    public void addContact(Contact c) {
        contactList.add(c);
            
    }

    public void updateContact(int id, Contact c) {
        contactList.set(id,c);
        
    }

    public void deleteContact(int id) {
        contactList.remove(id);
        
    }

    public String viewList() {
        String text ="";
        int i =0;
        for(Contact c : contactList){
            text += "[" + i + "] " + "Name: " + c.getName() + " Phone Number: " + c.getPhoneNumber() +"\n";
            i++;
        }
        return text;
        
    }

    
    
}
