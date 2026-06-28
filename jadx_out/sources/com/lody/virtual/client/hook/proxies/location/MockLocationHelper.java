package com.lody.virtual.client.hook.proxies.location;

import android.location.LocationManager;
import com.lody.virtual.client.env.VirtualGPSSatalines;
import com.lody.virtual.client.ipc.VLocationManager;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.remote.vloc.VLocation;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import mirror.RefMethod;
import mirror.RefObject;
import mirror.android.location.LocationManager;
import org.slf4j.d;

/* loaded from: classes3.dex */
public class MockLocationHelper {
    public static String checksum(String str) {
        String str2;
        if (str.startsWith("$")) {
            str2 = str.substring(1);
        } else {
            str2 = str;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < str2.length(); i6++) {
            i5 ^= (byte) str2.charAt(i6);
        }
        return str + d.ANY_MARKER + String.format("%02X", Integer.valueOf(i5)).toLowerCase();
    }

    public static void fakeGpsStatus(LocationManager locationManager) {
        fakeGpsStatusN(locationManager);
    }

    public static void fakeGpsStatusN(LocationManager locationManager) {
        RefObject<Map> refObject = mirror.android.location.LocationManager.mGpsStatusListeners;
        if (refObject == null) {
            return;
        }
        Iterator it = refObject.get(locationManager).values().iterator();
        if (it.hasNext()) {
            invokeSvStatusChanged(it.next());
        }
    }

    public static String getGPSLat(double d5) {
        int i5 = (int) d5;
        double d6 = (d5 - i5) * 60.0d;
        return i5 + leftZeroPad((int) d6, 2) + ":" + String.valueOf(d6).substring(2);
    }

    private static String getNorthWest(VLocation vLocation) {
        return vLocation.getLatitude() > 0.0d ? "N" : "S";
    }

    private static String getSouthEast(VLocation vLocation) {
        return vLocation.getLongitude() > 0.0d ? "E" : "W";
    }

    public static void invokeNmeaReceived(Object obj) {
        if (obj != null) {
            VirtualGPSSatalines virtualGPSSatalines = VirtualGPSSatalines.get();
            try {
                VLocation curAppLocation = VLocationManager.get().getCurAppLocation();
                if (curAppLocation != null) {
                    String format = new SimpleDateFormat("HHmmss:SS", Locale.US).format(new Date());
                    String gPSLat = getGPSLat(curAppLocation.getLatitude());
                    String gPSLat2 = getGPSLat(curAppLocation.getLongitude());
                    String northWest = getNorthWest(curAppLocation);
                    String southEast = getSouthEast(curAppLocation);
                    String checksum = checksum(String.format("$GPGGA,%s,%s,%s,%s,%s,1,%s,692,.00,M,.00,M,,,", format, gPSLat, northWest, gPSLat2, southEast, Integer.valueOf(virtualGPSSatalines.getSvCount())));
                    String checksum2 = checksum(String.format("$GPRMC,%s,A,%s,%s,%s,%s,0,0,260717,,,A,", format, gPSLat, northWest, gPSLat2, southEast));
                    RefMethod<Void> refMethod = LocationManager.GnssStatusListenerTransport.onNmeaReceived;
                    if (refMethod != null) {
                        refMethod.call(obj, Long.valueOf(System.currentTimeMillis()), "$GPGSV,1,1,04,12,05,159,36,15,41,087,15,19,38,262,30,31,56,146,19,*73");
                        LocationManager.GnssStatusListenerTransport.onNmeaReceived.call(obj, Long.valueOf(System.currentTimeMillis()), checksum);
                        LocationManager.GnssStatusListenerTransport.onNmeaReceived.call(obj, Long.valueOf(System.currentTimeMillis()), "$GPVTG,0,T,0,M,0,N,0,K,A,*25");
                        LocationManager.GnssStatusListenerTransport.onNmeaReceived.call(obj, Long.valueOf(System.currentTimeMillis()), checksum2);
                        LocationManager.GnssStatusListenerTransport.onNmeaReceived.call(obj, Long.valueOf(System.currentTimeMillis()), "$GPGSA,A,2,12,15,19,31,,,,,,,,,604,712,986,*27");
                    } else {
                        RefMethod<Void> refMethod2 = LocationManager.GpsStatusListenerTransport.onNmeaReceived;
                        if (refMethod2 != null) {
                            refMethod2.call(obj, Long.valueOf(System.currentTimeMillis()), "$GPGSV,1,1,04,12,05,159,36,15,41,087,15,19,38,262,30,31,56,146,19,*73");
                            LocationManager.GpsStatusListenerTransport.onNmeaReceived.call(obj, Long.valueOf(System.currentTimeMillis()), checksum);
                            LocationManager.GpsStatusListenerTransport.onNmeaReceived.call(obj, Long.valueOf(System.currentTimeMillis()), "$GPVTG,0,T,0,M,0,N,0,K,A,*25");
                            LocationManager.GpsStatusListenerTransport.onNmeaReceived.call(obj, Long.valueOf(System.currentTimeMillis()), checksum2);
                            LocationManager.GpsStatusListenerTransport.onNmeaReceived.call(obj, Long.valueOf(System.currentTimeMillis()), "$GPGSA,A,2,12,15,19,31,,,,,,,,,604,712,986,*27");
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void invokeSvStatusChanged(Object obj) {
        if (obj != null) {
            VirtualGPSSatalines virtualGPSSatalines = VirtualGPSSatalines.get();
            try {
                Class<?> cls = obj.getClass();
                if (cls == LocationManager.GnssStatusListenerTransport.TYPE) {
                    int svCount = virtualGPSSatalines.getSvCount();
                    int[] prnWithFlags = virtualGPSSatalines.getPrnWithFlags();
                    float[] snrs = virtualGPSSatalines.getSnrs();
                    float[] elevations = virtualGPSSatalines.getElevations();
                    float[] azimuths = virtualGPSSatalines.getAzimuths();
                    if (BuildCompat.isOreo()) {
                        try {
                            LocationManager.GnssStatusListenerTransportO.onSvStatusChanged.call(obj, Integer.valueOf(svCount), prnWithFlags, snrs, elevations, azimuths, virtualGPSSatalines.getCarrierFreqs());
                            return;
                        } catch (NullPointerException unused) {
                            return;
                        }
                    }
                    LocationManager.GnssStatusListenerTransport.onSvStatusChanged.call(obj, Integer.valueOf(svCount), prnWithFlags, snrs, elevations, azimuths);
                    return;
                }
                if (cls == LocationManager.GpsStatusListenerTransport.TYPE) {
                    int svCount2 = virtualGPSSatalines.getSvCount();
                    int[] prns = virtualGPSSatalines.getPrns();
                    float[] snrs2 = virtualGPSSatalines.getSnrs();
                    float[] elevations2 = virtualGPSSatalines.getElevations();
                    float[] azimuths2 = virtualGPSSatalines.getAzimuths();
                    int ephemerisMask = virtualGPSSatalines.getEphemerisMask();
                    int almanacMask = virtualGPSSatalines.getAlmanacMask();
                    int usedInFixMask = virtualGPSSatalines.getUsedInFixMask();
                    RefMethod<Void> refMethod = LocationManager.GpsStatusListenerTransport.onSvStatusChanged;
                    if (refMethod != null) {
                        refMethod.call(obj, Integer.valueOf(svCount2), prns, snrs2, elevations2, azimuths2, Integer.valueOf(ephemerisMask), Integer.valueOf(almanacMask), Integer.valueOf(usedInFixMask));
                        return;
                    }
                    RefMethod<Void> refMethod2 = LocationManager.GpsStatusListenerTransportVIVO.onSvStatusChanged;
                    if (refMethod2 != null) {
                        refMethod2.call(obj, Integer.valueOf(svCount2), prns, snrs2, elevations2, azimuths2, Integer.valueOf(ephemerisMask), Integer.valueOf(almanacMask), Integer.valueOf(usedInFixMask), new long[svCount2]);
                        return;
                    }
                    RefMethod<Void> refMethod3 = LocationManager.GpsStatusListenerTransportSumsungS5.onSvStatusChanged;
                    if (refMethod3 != null) {
                        refMethod3.call(obj, Integer.valueOf(svCount2), prns, snrs2, elevations2, azimuths2, Integer.valueOf(ephemerisMask), Integer.valueOf(almanacMask), Integer.valueOf(usedInFixMask), new int[svCount2]);
                        return;
                    }
                    if (LocationManager.GpsStatusListenerTransportOPPO_R815T.onSvStatusChanged != null) {
                        int length = prns.length;
                        int[] iArr = new int[length];
                        for (int i5 = 0; i5 < length; i5++) {
                            iArr[i5] = virtualGPSSatalines.getEphemerisMask();
                        }
                        int[] iArr2 = new int[length];
                        for (int i6 = 0; i6 < length; i6++) {
                            iArr2[i6] = virtualGPSSatalines.getAlmanacMask();
                        }
                        int[] iArr3 = new int[length];
                        for (int i7 = 0; i7 < length; i7++) {
                            iArr3[i7] = virtualGPSSatalines.getUsedInFixMask();
                        }
                        LocationManager.GpsStatusListenerTransportOPPO_R815T.onSvStatusChanged.call(obj, Integer.valueOf(svCount2), prns, snrs2, elevations2, azimuths2, iArr, iArr2, iArr3, Integer.valueOf(svCount2));
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static String leftZeroPad(int i5, int i6) {
        return leftZeroPad(String.valueOf(i5), i6);
    }

    private static String leftZeroPad(String str, int i5) {
        StringBuilder sb = new StringBuilder(i5);
        int i6 = 0;
        if (str == null) {
            while (i6 < i5) {
                sb.append('0');
                i6++;
            }
        } else {
            while (i6 < i5 - str.length()) {
                sb.append('0');
                i6++;
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
