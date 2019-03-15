package sample;

import java.util.HashMap;

public class validation {
HashMap cardinfos;
public validation ()
{ cardinfos = new HashMap();
 cardinfos.put("53455505", "5230066");
}

public boolean validate (String username,String password)
{boolean validation_result= false;
String fetchedPassword = (String) cardinfos.get(username);
if (fetchedPassword !=  null) {
    validation_result= fetchedPassword.equals(password);
}
    return validation_result;
}
}
