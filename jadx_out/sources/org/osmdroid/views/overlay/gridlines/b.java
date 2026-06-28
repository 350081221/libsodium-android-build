package org.osmdroid.views.overlay.gridlines;

import android.content.Context;
import androidx.core.view.ViewCompat;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.FolderOverlay;
import org.osmdroid.views.overlay.Marker;
import org.osmdroid.views.overlay.Polyline;

@Deprecated
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    static final DecimalFormat f21930a = new DecimalFormat("#.#####");

    /* renamed from: b, reason: collision with root package name */
    public static int f21931b = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: c, reason: collision with root package name */
    public static int f21932c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static short f21933d = 24;

    /* renamed from: e, reason: collision with root package name */
    public static int f21934e = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: f, reason: collision with root package name */
    public static float f21935f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f21936g = false;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f21937h = false;

    /* renamed from: i, reason: collision with root package name */
    private static float f21938i = 1.0f;

    private static void a(Marker marker) {
        marker.setTextLabelBackgroundColor(f21934e);
        marker.setTextLabelFontSize(f21933d);
        marker.setTextLabelForegroundColor(f21932c);
    }

    private static double b(int i5) {
        double d5;
        double d6;
        switch (i5) {
            case 0:
            case 1:
                d5 = f21938i;
                d6 = 30.0d;
                break;
            case 2:
                d5 = f21938i;
                d6 = 15.0d;
                break;
            case 3:
                d5 = f21938i;
                d6 = 9.0d;
                break;
            case 4:
                d5 = f21938i;
                d6 = 6.0d;
                break;
            case 5:
                d5 = f21938i;
                d6 = 3.0d;
                break;
            case 6:
                d5 = f21938i;
                d6 = 2.0d;
                break;
            case 7:
                d5 = f21938i;
                d6 = 1.0d;
                break;
            case 8:
                d5 = f21938i;
                d6 = 0.5d;
                break;
            case 9:
                d5 = f21938i;
                d6 = 0.25d;
                break;
            case 10:
                d5 = f21938i;
                d6 = 0.1d;
                break;
            case 11:
                d5 = f21938i;
                d6 = 0.05d;
                break;
            case 12:
                d5 = f21938i;
                d6 = 0.025d;
                break;
            case 13:
                d5 = f21938i;
                d6 = 0.0125d;
                break;
            case 14:
                d5 = f21938i;
                d6 = 0.00625d;
                break;
            case 15:
                d5 = f21938i;
                d6 = 0.003125d;
                break;
            case 16:
                d5 = f21938i;
                d6 = 0.0015625d;
                break;
            case 17:
                d5 = f21938i;
                d6 = 7.8125E-4d;
                break;
            case 18:
                d5 = f21938i;
                d6 = 3.90625E-4d;
                break;
            case 19:
                d5 = f21938i;
                d6 = 1.953125E-4d;
                break;
            case 20:
                d5 = f21938i;
                d6 = 9.765625E-5d;
                break;
            case 21:
                d5 = f21938i;
                d6 = 4.8828125E-5d;
                break;
            default:
                d5 = f21938i;
                d6 = 2.44140625E-5d;
                break;
        }
        return d5 * d6;
    }

    public static FolderOverlay c(Context context, MapView mapView) {
        boolean z4;
        double d5;
        double d6;
        double d7;
        double d8;
        String str;
        MapView mapView2 = mapView;
        BoundingBox boundingBox = mapView.getBoundingBox();
        int zoomLevel = mapView.getZoomLevel();
        if (f21936g) {
            System.out.println("######### getLatLonGrid ");
        }
        FolderOverlay folderOverlay = new FolderOverlay();
        if (zoomLevel >= 2) {
            double latNorth = boundingBox.getLatNorth();
            double latSouth = boundingBox.getLatSouth();
            double lonEast = boundingBox.getLonEast();
            double lonWest = boundingBox.getLonWest();
            if (latNorth < latSouth) {
                return folderOverlay;
            }
            if (f21936g) {
                System.out.println("N " + latNorth + " S " + latSouth + ", 0.0");
            }
            boolean z5 = lonEast < 0.0d && lonWest > 0.0d;
            if (f21936g) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                z4 = z5;
                sb.append("delta ");
                sb.append(0.0d);
                printStream.println(sb.toString());
            } else {
                z4 = z5;
            }
            double b5 = b(zoomLevel);
            double[] d9 = d(latNorth, latSouth, zoomLevel);
            double d10 = d9[0];
            double d11 = d9[1];
            double d12 = d10;
            while (true) {
                d5 = latSouth;
                d6 = latNorth;
                if (d12 > d11) {
                    break;
                }
                Polyline polyline = new Polyline();
                double d13 = b5;
                polyline.getOutlinePaint().setStrokeWidth(f21935f);
                polyline.getOutlinePaint().setColor(f21931b);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new GeoPoint(d12, lonEast));
                arrayList.add(new GeoPoint(d12, lonWest));
                if (f21936g) {
                    System.out.println("drawing NS " + d12 + "," + lonEast + " to " + d12 + "," + lonWest + ", zoom " + zoomLevel);
                }
                polyline.setPoints(arrayList);
                folderOverlay.add(polyline);
                Marker marker = new Marker(mapView);
                a(marker);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f21930a.format(d12));
                sb2.append(d12 > 0.0d ? "N" : "S");
                String sb3 = sb2.toString();
                marker.setTitle(sb3);
                marker.setTextIcon(sb3);
                marker.setPosition(new GeoPoint(d12, lonWest + d13));
                folderOverlay.add(marker);
                d12 += d13;
                mapView2 = mapView;
                latSouth = d5;
                latNorth = d6;
                b5 = d13;
            }
            MapView mapView3 = mapView2;
            double d14 = b5;
            double[] e5 = e(lonWest, lonEast, zoomLevel);
            double d15 = e5[1];
            double d16 = e5[0];
            double d17 = d15;
            while (d17 <= d16) {
                Polyline polyline2 = new Polyline();
                polyline2.getOutlinePaint().setStrokeWidth(f21935f);
                polyline2.getOutlinePaint().setColor(f21931b);
                ArrayList arrayList2 = new ArrayList();
                double d18 = d16;
                double d19 = d6;
                arrayList2.add(new GeoPoint(d19, d17));
                double d20 = d15;
                double d21 = d5;
                arrayList2.add(new GeoPoint(d21, d17));
                polyline2.setPoints(arrayList2);
                if (f21936g) {
                    PrintStream printStream2 = System.err;
                    StringBuilder sb4 = new StringBuilder();
                    str = "W";
                    sb4.append("drawing EW ");
                    sb4.append(d21);
                    sb4.append(",");
                    sb4.append(d17);
                    sb4.append(" to ");
                    sb4.append(d19);
                    sb4.append(",");
                    sb4.append(d17);
                    sb4.append(", zoom ");
                    sb4.append(zoomLevel);
                    printStream2.println(sb4.toString());
                } else {
                    str = "W";
                }
                folderOverlay.add(polyline2);
                Marker marker2 = new Marker(mapView3);
                a(marker2);
                marker2.setRotation(-90.0f);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(f21930a.format(d17));
                sb5.append(d17 > 0.0d ? "E" : str);
                String sb6 = sb5.toString();
                marker2.setTitle(sb6);
                marker2.setTextIcon(sb6);
                marker2.setPosition(new GeoPoint(d21 + d14, d17));
                folderOverlay.add(marker2);
                d17 += d14;
                d5 = d21;
                d15 = d20;
                d6 = d19;
                d16 = d18;
            }
            double d22 = d16;
            double d23 = d6;
            double d24 = d15;
            double d25 = d5;
            if (z4) {
                if (f21936g) {
                    PrintStream printStream3 = System.out;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("DATELINE zoom ");
                    sb7.append(zoomLevel);
                    sb7.append(" ");
                    sb7.append(d24);
                    sb7.append(" ");
                    d7 = d22;
                    sb7.append(d7);
                    printStream3.println(sb7.toString());
                } else {
                    d7 = d22;
                }
                double d26 = d24;
                while (d26 <= 180.0d) {
                    Polyline polyline3 = new Polyline();
                    polyline3.getOutlinePaint().setStrokeWidth(f21935f);
                    polyline3.getOutlinePaint().setColor(f21931b);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new GeoPoint(d23, d26));
                    arrayList3.add(new GeoPoint(d25, d26));
                    polyline3.setPoints(arrayList3);
                    if (f21937h) {
                        PrintStream printStream4 = System.out;
                        StringBuilder sb8 = new StringBuilder();
                        d8 = d7;
                        sb8.append("DATELINE drawing NS");
                        sb8.append(d25);
                        sb8.append(",");
                        sb8.append(d26);
                        sb8.append(" to ");
                        sb8.append(d23);
                        sb8.append(",");
                        sb8.append(d26);
                        sb8.append(", zoom ");
                        sb8.append(zoomLevel);
                        printStream4.println(sb8.toString());
                    } else {
                        d8 = d7;
                    }
                    folderOverlay.add(polyline3);
                    d26 += d14;
                    d7 = d8;
                }
                double d27 = d7;
                double d28 = -180.0d;
                while (d28 <= d27) {
                    Polyline polyline4 = new Polyline();
                    polyline4.getOutlinePaint().setStrokeWidth(f21935f);
                    polyline4.getOutlinePaint().setColor(f21931b);
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new GeoPoint(d23, d28));
                    arrayList4.add(new GeoPoint(d25, d28));
                    polyline4.setPoints(arrayList4);
                    if (f21937h) {
                        System.out.println("DATELINE drawing EW" + d25 + "," + d28 + " to " + d23 + "," + d28 + ", zoom " + zoomLevel);
                    }
                    folderOverlay.add(polyline4);
                    Marker marker3 = new Marker(mapView);
                    a(marker3);
                    marker3.setRotation(-90.0f);
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(f21930a.format(d28));
                    sb9.append(d28 > 0.0d ? "E" : "W");
                    String sb10 = sb9.toString();
                    marker3.setTitle(sb10);
                    marker3.setTextIcon(sb10);
                    marker3.setPosition(new GeoPoint(d25 + d14, d28));
                    folderOverlay.add(marker3);
                    d28 += d14;
                }
                double d29 = d24;
                while (d29 < 180.0d) {
                    Marker marker4 = new Marker(mapView);
                    a(marker4);
                    marker4.setRotation(-90.0f);
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(f21930a.format(d29));
                    sb11.append(d29 > 0.0d ? "E" : "W");
                    String sb12 = sb11.toString();
                    marker4.setTitle(sb12);
                    marker4.setTextIcon(sb12);
                    marker4.setPosition(new GeoPoint(d25 + d14, d29));
                    folderOverlay.add(marker4);
                    d29 += d14;
                }
            }
        }
        return folderOverlay;
    }

    private static double[] d(double d5, double d6, int i5) {
        double d7 = 90.0d;
        double d8 = -90.0d;
        if (i5 < 10) {
            double floor = Math.floor(d6);
            double b5 = b(i5);
            double d9 = -90.0d;
            while (d9 < floor) {
                d9 += b5;
            }
            double d10 = 90.0d;
            while (d10 > Math.ceil(d5)) {
                d10 -= b5;
            }
            if (d10 <= 90.0d) {
                d7 = d10;
            }
            if (d9 >= -90.0d) {
                d8 = d9;
            }
            return new double[]{d8, d7};
        }
        if (d6 > 0.0d) {
            d8 = 0.0d;
        }
        if (d5 < 0.0d) {
            d7 = 0.0d;
        }
        for (int i6 = 2; i6 <= i5; i6++) {
            double b6 = b(i6);
            while (d8 < d6 - b6) {
                d8 += b6;
                if (f21936g) {
                    System.out.println("south " + d8);
                }
            }
            while (d7 > d5 + b6) {
                d7 -= b6;
                if (f21936g) {
                    System.out.println("north " + d7);
                }
            }
        }
        return new double[]{d8, d7};
    }

    private static double[] e(double d5, double d6, int i5) {
        double b5 = b(i5);
        double d7 = 180.0d;
        double d8 = -180.0d;
        if (i5 < 10) {
            double d9 = 180.0d;
            while (d9 > Math.floor(d5)) {
                d9 -= b5;
            }
            double ceil = Math.ceil(d6);
            for (double d10 = -180.0d; d10 < ceil; d10 += b5) {
            }
            if (d9 >= -180.0d) {
                d8 = d9;
            }
            if (ceil <= 180.0d) {
                d7 = ceil;
            }
            return new double[]{d7, d8};
        }
        if (d5 > 0.0d) {
            d8 = 0.0d;
        }
        if (d6 < 0.0d) {
            d7 = 0.0d;
        }
        for (int i6 = 2; i6 <= i5; i6++) {
            double b6 = b(i6);
            while (d7 > d6 + b6) {
                d7 -= b6;
            }
            while (d8 < d5 - b6) {
                d8 += b6;
                if (f21936g) {
                    System.out.println("west " + d8);
                }
            }
        }
        if (f21936g) {
            System.out.println("return EW set as " + d8 + " " + d7);
        }
        return new double[]{d7, d8};
    }

    public static void f() {
        f21931b = ViewCompat.MEASURED_STATE_MASK;
        f21932c = -1;
        f21934e = ViewCompat.MEASURED_STATE_MASK;
        f21935f = 1.0f;
        f21933d = (short) 32;
        f21936g = false;
        f21937h = false;
    }
}
