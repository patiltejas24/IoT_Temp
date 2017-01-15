package kali.root.com.iottemp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Belal on 9/22/2015.
 */
public class JSON {
    public static String name;

    public static String classs;



    public static final String JSON_ARRAY = "result";

    public static  String KEY_NAME ;





    private JSONArray users = null;

    private String json;

    public JSON(String json){
        this.json = json;
    }

    protected void JSON(){

        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);


            KEY_NAME="success";
            JSONObject jo = users.getJSONObject(0);
            name = jo.getString(KEY_NAME);


//            jo=users.getJSONObject(0);

//            KEY_NAME="clas";
//            jo = users.getJSONObject(1);
//            classs = jo.getString(KEY_NAME);


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }



}