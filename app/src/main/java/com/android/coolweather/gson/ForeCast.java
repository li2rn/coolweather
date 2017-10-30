package com.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/10/26.
 */

public class ForeCast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;

        public String min;
    }

    public class More {

        @SerializedName("text_d")
        public String info;
    }
}
