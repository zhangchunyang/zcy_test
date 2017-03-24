package com.ge.chun.concurrent;

/**
 * Created by 春哥 on 16/11/11.
 */
public class WaitNotifyTester {

//    class MyLatLngCallback {
//
//        LonLat coords = null;
//        boolean gotAnswer = false;
//
//        public synchronized void onFailure() {
//            gotAnswer = true;
//            notify();
//        }
//
//        @Override
//        public synchronized void onSuccess(LatLng point) {
//            gotCoords = true;
//            coords = new LonLat(point.getLongitude(), point.getLatitude());
//            notify();
//        }
//    };
//
//    public LonLat convert(String address) {
//
//        MyLatLngCallback cb = new MyLatLngCallback();
//
//        geocoder.getLatLng(address, cb);
//
//        synchronized (cb) {
//            while (!cb.gotAnswer) // while instead of if due to "spurious wakeups"
//                cb.wait();
//        }
//
//        // if cb.coords is null then failure!
//
//        return cb.coords;
//    }
}
