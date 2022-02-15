package com.android.uraall.taxiapp.findRouteClasses;

public class Route {

    private OverviewPolyline overview_polyline;

    public Route(OverviewPolyline overviewPolyline) {
        this.overview_polyline = overviewPolyline;
    }

    public OverviewPolyline getOverviewPolyline() {
        return overview_polyline;
    }
}
