package com.meass.universityclass;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface RetrofitInterface {

    @Streaming
    @GET
    Call<ResponseBody> downloadFileByUrl(@Url String fileUrl);

}