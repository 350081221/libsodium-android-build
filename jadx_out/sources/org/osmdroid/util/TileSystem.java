package org.osmdroid.util;

import android.graphics.Point;
import android.graphics.Rect;

/* loaded from: classes4.dex */
public abstract class TileSystem {

    @Deprecated
    public static final double EarthRadius = 6378137.0d;

    @Deprecated
    public static final double MaxLatitude = 85.05112877980659d;

    @Deprecated
    public static final double MaxLongitude = 180.0d;

    @Deprecated
    public static final double MinLatitude = -85.05112877980659d;

    @Deprecated
    public static final double MinLongitude = -180.0d;
    private static int mMaxZoomLevel = 29;
    private static int mTileSize = 256;
    public static final int primaryKeyMaxZoomLevel = 29;

    @Deprecated
    public static final int projectionZoomLevel = 30;

    public static double Clip(double d5, double d6, double d7) {
        return Math.min(Math.max(d5, d6), d7);
    }

    public static long ClipToLong(double d5, double d6, boolean z4) {
        long floorToLong = MyMath.floorToLong(d5);
        if (!z4) {
            return floorToLong;
        }
        if (floorToLong <= 0) {
            return 0L;
        }
        long floorToLong2 = MyMath.floorToLong(d6 - 1.0d);
        if (floorToLong >= d6) {
            return floorToLong2;
        }
        return floorToLong;
    }

    public static double GroundResolution(double d5, int i5) {
        return GroundResolution(d5, i5);
    }

    public static double GroundResolutionMapSize(double d5, double d6) {
        return (((Math.cos((Clip(d5, -90.0d, 90.0d) * 3.141592653589793d) / 180.0d) * 2.0d) * 3.141592653589793d) * 6378137.0d) / d6;
    }

    public static double MapScale(double d5, int i5, int i6) {
        return (GroundResolution(d5, i5) * i6) / 0.0254d;
    }

    @Deprecated
    public static int MapSize(int i5) {
        return (int) Math.round(MapSize(i5));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0024. Please report as an issue. */
    public static Point QuadKeyToTileXY(String str, Point point) {
        if (point == null) {
            point = new Point();
        }
        if (str != null && str.length() != 0) {
            int length = str.length();
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = 1 << i7;
                switch (str.charAt((length - i7) - 1)) {
                    case '0':
                    case '1':
                        i5 += i8;
                    case '3':
                        i5 += i8;
                    case '2':
                        i6 += i8;
                    default:
                        throw new IllegalArgumentException("Invalid QuadKey: " + str);
                }
            }
            point.x = i5;
            point.y = i6;
            return point;
        }
        throw new IllegalArgumentException("Invalid QuadKey: " + str);
    }

    public static String TileXYToQuadKey(int i5, int i6, int i7) {
        char c5;
        char[] cArr = new char[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = 1 << i8;
            if ((i5 & i9) != 0) {
                c5 = (char) 49;
            } else {
                c5 = '0';
            }
            if ((i9 & i6) != 0) {
                c5 = (char) (((char) (c5 + 1)) + 1);
            }
            cArr[(i7 - i8) - 1] = c5;
        }
        return new String(cArr);
    }

    private int clipTile(int i5, int i6) {
        if (i5 < 0) {
            return 0;
        }
        int i7 = 1 << i6;
        return i5 >= i7 ? i7 - 1 : i5;
    }

    public static double getFactor(double d5) {
        return Math.pow(2.0d, d5);
    }

    public static int getInputTileZoomLevel(double d5) {
        return MyMath.floorToInt(d5);
    }

    public static int getMaximumZoomLevel() {
        return mMaxZoomLevel;
    }

    public static long getMercatorFromTile(int i5, double d5) {
        return Math.round(i5 * d5);
    }

    public static int getTileFromMercator(long j5, double d5) {
        return MyMath.floorToInt(j5 / d5);
    }

    public static int getTileSize() {
        return mTileSize;
    }

    public static void setTileSize(int i5) {
        mMaxZoomLevel = Math.min(29, (63 - ((int) ((Math.log(i5) / Math.log(2.0d)) + 0.5d))) - 1);
        mTileSize = i5;
    }

    public static int truncateToInt(long j5) {
        return (int) Math.max(Math.min(j5, 2147483647L), -2147483648L);
    }

    private static double wrap(double d5, double d6, double d7, double d8) {
        if (d6 <= d7) {
            if (d8 <= (d7 - d6) + 1.0d) {
                while (d5 < d6) {
                    d5 += d8;
                }
                while (d5 > d7) {
                    d5 -= d8;
                }
                return d5;
            }
            throw new IllegalArgumentException("interval must be equal or smaller than maxValue-minValue: min: " + d6 + " max:" + d7 + " int:" + d8);
        }
        throw new IllegalArgumentException("minValue must be smaller than maxValue: " + d6 + ">" + d7);
    }

    @Deprecated
    public Point LatLongToPixelXY(double d5, double d6, int i5, Point point) {
        if (point == null) {
            point = new Point();
        }
        double MapSize = MapSize(i5);
        point.x = truncateToInt(getMercatorXFromLongitude(d6, MapSize, true));
        point.y = truncateToInt(getMercatorYFromLatitude(d5, MapSize, true));
        return point;
    }

    @Deprecated
    public PointL LatLongToPixelXYMapSize(double d5, double d6, double d7, PointL pointL) {
        return getMercatorFromGeo(d5, d6, d7, pointL, true);
    }

    @Deprecated
    public GeoPoint PixelXYToLatLong(int i5, int i6, int i7, GeoPoint geoPoint) {
        return getGeoFromMercator(i5, i6, MapSize(i7), geoPoint, true, true);
    }

    @Deprecated
    public GeoPoint PixelXYToLatLongMapSize(int i5, int i6, double d5, GeoPoint geoPoint, boolean z4, boolean z5) {
        return getGeoFromMercator(i5, i6, d5, geoPoint, z4, z5);
    }

    public GeoPoint PixelXYToLatLongMapSizeWithoutWrap(int i5, int i6, double d5, GeoPoint geoPoint) {
        if (geoPoint == null) {
            geoPoint = new GeoPoint(0.0d, 0.0d);
        }
        geoPoint.setLatitude(90.0d - ((Math.atan(Math.exp(((-(0.5d - (i6 / d5))) * 2.0d) * 3.141592653589793d)) * 360.0d) / 3.141592653589793d));
        geoPoint.setLongitude(((i5 / d5) - 0.5d) * 360.0d);
        return geoPoint;
    }

    public GeoPoint PixelXYToLatLongWithoutWrap(int i5, int i6, double d5, GeoPoint geoPoint) {
        return PixelXYToLatLongMapSizeWithoutWrap(i5, i6, MapSize(d5), geoPoint);
    }

    @Deprecated
    public Point PixelXYToTileXY(int i5, int i6, Point point) {
        return PixelXYToTileXY(i5, i6, getTileSize(), point);
    }

    @Deprecated
    public Point TileXYToPixelXY(int i5, int i6, Point point) {
        if (point == null) {
            point = new Point();
        }
        double tileSize = getTileSize();
        point.x = truncateToInt(getMercatorFromTile(i5, tileSize));
        point.y = truncateToInt(getMercatorFromTile(i6, tileSize));
        return point;
    }

    public double cleanLatitude(double d5) {
        return Clip(d5, getMinLatitude(), getMaxLatitude());
    }

    public double cleanLongitude(double d5) {
        while (d5 < -180.0d) {
            d5 += 360.0d;
        }
        while (d5 > 180.0d) {
            d5 -= 360.0d;
        }
        return Clip(d5, getMinLongitude(), getMaxLongitude());
    }

    public double getBoundingBoxZoom(BoundingBox boundingBox, int i5, int i6) {
        double longitudeZoom = getLongitudeZoom(boundingBox.getLonEast(), boundingBox.getLonWest(), i5);
        double latitudeZoom = getLatitudeZoom(boundingBox.getLatNorth(), boundingBox.getLatSouth(), i6);
        if (longitudeZoom == Double.MIN_VALUE) {
            return latitudeZoom;
        }
        if (latitudeZoom == Double.MIN_VALUE) {
            return longitudeZoom;
        }
        return Math.min(latitudeZoom, longitudeZoom);
    }

    public long getCleanMercator(long j5, double d5, boolean z4) {
        return ClipToLong(z4 ? wrap(j5, 0.0d, d5, d5) : j5, d5, z4);
    }

    public GeoPoint getGeoFromMercator(long j5, long j6, double d5, GeoPoint geoPoint, boolean z4, boolean z5) {
        if (geoPoint == null) {
            geoPoint = new GeoPoint(0.0d, 0.0d);
        }
        geoPoint.setLatitude(getLatitudeFromY01(getXY01FromMercator(j6, d5, z5), z5));
        geoPoint.setLongitude(getLongitudeFromX01(getXY01FromMercator(j5, d5, z4), z4));
        return geoPoint;
    }

    public double getLatitudeFromTileY(int i5, int i6) {
        return getLatitudeFromY01(clipTile(i5, i6) / (1 << i6));
    }

    public abstract double getLatitudeFromY01(double d5);

    public double getLatitudeFromY01(double d5, boolean z4) {
        if (z4) {
            d5 = Clip(d5, 0.0d, 1.0d);
        }
        double latitudeFromY01 = getLatitudeFromY01(d5);
        if (z4) {
            return Clip(latitudeFromY01, getMinLatitude(), getMaxLatitude());
        }
        return latitudeFromY01;
    }

    public double getLatitudeZoom(double d5, double d6, int i5) {
        double y01FromLatitude = getY01FromLatitude(d6, true) - getY01FromLatitude(d5, true);
        if (y01FromLatitude <= 0.0d) {
            return Double.MIN_VALUE;
        }
        return Math.log((i5 / y01FromLatitude) / getTileSize()) / Math.log(2.0d);
    }

    public double getLongitudeFromTileX(int i5, int i6) {
        return getLongitudeFromX01(clipTile(i5, i6) / (1 << i6));
    }

    public abstract double getLongitudeFromX01(double d5);

    public double getLongitudeFromX01(double d5, boolean z4) {
        if (z4) {
            d5 = Clip(d5, 0.0d, 1.0d);
        }
        double longitudeFromX01 = getLongitudeFromX01(d5);
        if (z4) {
            return Clip(longitudeFromX01, getMinLongitude(), getMaxLongitude());
        }
        return longitudeFromX01;
    }

    public double getLongitudeZoom(double d5, double d6, int i5) {
        double x01FromLongitude = getX01FromLongitude(d5, true) - getX01FromLongitude(d6, true);
        if (x01FromLongitude < 0.0d) {
            x01FromLongitude += 1.0d;
        }
        if (x01FromLongitude == 0.0d) {
            return Double.MIN_VALUE;
        }
        return Math.log((i5 / x01FromLongitude) / getTileSize()) / Math.log(2.0d);
    }

    public abstract double getMaxLatitude();

    public abstract double getMaxLongitude();

    public PointL getMercatorFromGeo(double d5, double d6, double d7, PointL pointL, boolean z4) {
        if (pointL == null) {
            pointL = new PointL();
        }
        pointL.f21839x = getMercatorXFromLongitude(d6, d7, z4);
        pointL.f21840y = getMercatorYFromLatitude(d5, d7, z4);
        return pointL;
    }

    public long getMercatorFromXY01(double d5, double d6, boolean z4) {
        return ClipToLong(d5 * d6, d6, z4);
    }

    public long getMercatorXFromLongitude(double d5, double d6, boolean z4) {
        return getMercatorFromXY01(getX01FromLongitude(d5, z4), d6, z4);
    }

    public long getMercatorYFromLatitude(double d5, double d6, boolean z4) {
        return getMercatorFromXY01(getY01FromLatitude(d5, z4), d6, z4);
    }

    public abstract double getMinLatitude();

    public abstract double getMinLongitude();

    public double getRandomLatitude(double d5, double d6) {
        return (d5 * (getMaxLatitude() - d6)) + d6;
    }

    public double getRandomLongitude(double d5) {
        return (d5 * (getMaxLongitude() - getMinLongitude())) + getMinLongitude();
    }

    public int getTileXFromLongitude(double d5, int i5) {
        return clipTile((int) Math.floor(getX01FromLongitude(d5) * (1 << i5)), i5);
    }

    public int getTileYFromLatitude(double d5, int i5) {
        return clipTile((int) Math.floor(getY01FromLatitude(d5) * (1 << i5)), i5);
    }

    public abstract double getX01FromLongitude(double d5);

    public double getX01FromLongitude(double d5, boolean z4) {
        if (z4) {
            d5 = Clip(d5, getMinLongitude(), getMaxLongitude());
        }
        double x01FromLongitude = getX01FromLongitude(d5);
        if (z4) {
            return Clip(x01FromLongitude, 0.0d, 1.0d);
        }
        return x01FromLongitude;
    }

    public double getXY01FromMercator(long j5, double d5, boolean z4) {
        double d6 = j5;
        return z4 ? Clip(d6 / d5, 0.0d, 1.0d) : d6 / d5;
    }

    public abstract double getY01FromLatitude(double d5);

    public double getY01FromLatitude(double d5, boolean z4) {
        if (z4) {
            d5 = Clip(d5, getMinLatitude(), getMaxLatitude());
        }
        double y01FromLatitude = getY01FromLatitude(d5);
        if (z4) {
            return Clip(y01FromLatitude, 0.0d, 1.0d);
        }
        return y01FromLatitude;
    }

    public boolean isValidLatitude(double d5) {
        return d5 >= getMinLatitude() && d5 <= getMaxLatitude();
    }

    public boolean isValidLongitude(double d5) {
        return d5 >= getMinLongitude() && d5 <= getMaxLongitude();
    }

    public String toStringLatitudeSpan() {
        return "[" + getMinLatitude() + "," + getMaxLatitude() + "]";
    }

    public String toStringLongitudeSpan() {
        return "[" + getMinLongitude() + "," + getMaxLongitude() + "]";
    }

    @Deprecated
    public static long Clip(long j5, long j6, long j7) {
        return Math.min(Math.max(j5, j6), j7);
    }

    public static double GroundResolution(double d5, double d6) {
        return GroundResolutionMapSize(wrap(d5, -90.0d, 90.0d, 180.0d), MapSize(d6));
    }

    public static double MapSize(double d5) {
        return getTileSize() * getFactor(d5);
    }

    public static Rect getTileFromMercator(RectL rectL, double d5, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        rect.left = getTileFromMercator(rectL.left, d5);
        rect.top = getTileFromMercator(rectL.top, d5);
        rect.right = getTileFromMercator(rectL.right, d5);
        rect.bottom = getTileFromMercator(rectL.bottom, d5);
        return rect;
    }

    public static double getTileSize(double d5) {
        return MapSize(d5 - getInputTileZoomLevel(d5));
    }

    @Deprecated
    public GeoPoint PixelXYToLatLong(int i5, int i6, double d5, GeoPoint geoPoint) {
        return getGeoFromMercator(i5, i6, MapSize(d5), geoPoint, true, true);
    }

    @Deprecated
    public Point PixelXYToTileXY(int i5, int i6, double d5, Point point) {
        if (point == null) {
            point = new Point();
        }
        point.x = getTileFromMercator(i5, d5);
        point.y = getTileFromMercator(i6, d5);
        return point;
    }

    public double getRandomLatitude(double d5) {
        return getRandomLatitude(d5, getMinLatitude());
    }

    @Deprecated
    public PointL LatLongToPixelXY(double d5, double d6, double d7, PointL pointL) {
        return LatLongToPixelXYMapSize(wrap(d5, -90.0d, 90.0d, 180.0d), wrap(d6, -180.0d, 180.0d, 360.0d), MapSize(d7), pointL);
    }

    @Deprecated
    public Rect PixelXYToTileXY(Rect rect, double d5, Rect rect2) {
        if (rect2 == null) {
            rect2 = new Rect();
        }
        rect2.left = getTileFromMercator(rect.left, d5);
        rect2.top = getTileFromMercator(rect.top, d5);
        rect2.right = getTileFromMercator(rect.right, d5);
        rect2.bottom = getTileFromMercator(rect.bottom, d5);
        return rect2;
    }

    @Deprecated
    public PointL TileXYToPixelXY(int i5, int i6, double d5, PointL pointL) {
        if (pointL == null) {
            pointL = new PointL();
        }
        pointL.f21839x = getMercatorFromTile(i5, d5);
        pointL.f21840y = getMercatorFromTile(i6, d5);
        return pointL;
    }
}
