package com.example.image_example;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class ImageRequest extends StringRequest {
    // set server url
    final static private String URL = "http://125.141.27.3/test/send.php";
    private Map<String, String> map;

    public ImageRequest(String ID, int num, String image, Response .Listener<String> listener){
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("ID", ID);
        map.put("number", num + "");
        map.put("Image", image);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
