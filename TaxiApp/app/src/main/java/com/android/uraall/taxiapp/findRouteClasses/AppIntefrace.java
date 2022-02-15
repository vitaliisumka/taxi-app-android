package com.android.uraall.taxiapp.findRouteClasses;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AppIntefrace {
    @GET("maps/api/directions/json")
    Single<Result> getDirection(@Query("mode") String mode,
                                @Query("transit_routing_preferance") String preferance,
                                @Query("origin") String origin,
                                @Query("destination") String destination,
                                @Query("key") String key
                              );
}
