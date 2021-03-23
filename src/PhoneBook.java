import java.util.*;

public class PhoneBook {
    private String name;
    private String number;
    Map<String, ArrayList<String>> m = new HashMap<>();

    public PhoneBook() {
    }

    public void add (String name, String phone){
        if(m.containsKey(name)){
            ArrayList <String> al = m.get(name);
            al.add(phone);
            m.put(name,al);
        } else {
            m.put(name, new ArrayList<String>(Arrays.asList(phone)));
        }
    }

    public List get (String name){
        if(m.containsKey(name)){
            return m.get(name);
        }
        return Arrays.asList("Такой фамилии в базе нет");
    }
}
