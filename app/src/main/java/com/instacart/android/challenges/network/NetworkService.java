package com.instacart.android.challenges.network;

import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {
  private Retrofit retrofit = null;
  private NetworkApi api = null;

  private Retrofit getRetrofit() {
    if (retrofit == null) {
      retrofit = new Builder()
          .baseUrl("http://boiling-dusk-12902.herokuapp.com/")
          .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
          .addConverterFactory(GsonConverterFactory.create())
          .build();
    }
    return retrofit;
  }

  public NetworkApi getApi() {
    if (api == null) {
      api = getRetrofit().create(NetworkApi.class);
    }
    return api;
  }
}