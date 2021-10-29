package com.example.image_example;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class GetRequest extends StringRequest {
    // set server url
    final static private String URL = "http://125.141.27.3/test/get.php";
    private Map<String, String> map;

    public GetRequest(String ID, int number, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("ID", ID);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
