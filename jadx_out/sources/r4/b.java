package r4;

import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.PointL;
import org.osmdroid.util.TileSystem;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;

@Deprecated
/* loaded from: classes4.dex */
public class b {
    public static Path a(Projection projection, List<? extends GeoPoint> list, Path path) {
        return b(projection, list, path, true);
    }

    public static Path b(Projection projection, List<? extends GeoPoint> list, Path path, boolean z4) throws IllegalArgumentException {
        Path path2;
        PointF relativePositionOfGeoPointInBoundingBoxWithLinearInterpolation;
        if (list.size() >= 2) {
            if (path != null) {
                path2 = path;
            } else {
                path2 = new Path();
            }
            path2.incReserve(list.size());
            TileSystem tileSystem = MapView.getTileSystem();
            Iterator<? extends GeoPoint> it = list.iterator();
            boolean z5 = true;
            while (it.hasNext()) {
                GeoPoint next = it.next();
                Point point = new Point();
                double MapSize = TileSystem.MapSize(projection.getZoomLevel());
                PointL mercatorFromGeo = tileSystem.getMercatorFromGeo(next.getLatitude(), next.getLongitude(), MapSize, null, true);
                point.x = projection.getTileFromMercator(mercatorFromGeo.f21839x);
                point.y = projection.getTileFromMercator(mercatorFromGeo.f21840y);
                PointL pointL = new PointL(projection.getMercatorFromTile(point.x), projection.getMercatorFromTile(point.y));
                PointL pointL2 = new PointL(projection.getMercatorFromTile(point.x + TileSystem.getTileSize()), projection.getMercatorFromTile(point.y + TileSystem.getTileSize()));
                Iterator<? extends GeoPoint> it2 = it;
                GeoPoint geoFromMercator = tileSystem.getGeoFromMercator(pointL.f21839x, pointL.f21840y, MapSize, null, true, true);
                GeoPoint geoFromMercator2 = tileSystem.getGeoFromMercator(pointL2.f21839x, pointL2.f21840y, MapSize, null, true, true);
                BoundingBox boundingBox = new BoundingBox(geoFromMercator.getLatitude(), geoFromMercator.getLongitude(), geoFromMercator2.getLatitude(), geoFromMercator2.getLongitude());
                if (z4 && projection.getZoomLevel() < 7.0d) {
                    relativePositionOfGeoPointInBoundingBoxWithLinearInterpolation = boundingBox.getRelativePositionOfGeoPointInBoundingBoxWithExactGudermannInterpolation(next.getLatitude(), next.getLongitude(), null);
                } else {
                    relativePositionOfGeoPointInBoundingBoxWithLinearInterpolation = boundingBox.getRelativePositionOfGeoPointInBoundingBoxWithLinearInterpolation(next.getLatitude(), next.getLongitude(), null);
                }
                Rect screenRect = projection.getScreenRect();
                Point point2 = new Point(projection.getTileFromMercator(screenRect.centerX()), projection.getTileFromMercator(screenRect.centerY()));
                PointL pointL3 = new PointL(projection.getMercatorFromTile(point2.x), projection.getMercatorFromTile(point2.y));
                int i5 = point2.x - point.x;
                int i6 = point2.y - point.y;
                long tileSize = pointL3.f21839x - (TileSystem.getTileSize() * i5);
                long tileSize2 = tileSize + (relativePositionOfGeoPointInBoundingBoxWithLinearInterpolation.x * TileSystem.getTileSize());
                long tileSize3 = (pointL3.f21840y - (TileSystem.getTileSize() * i6)) + (relativePositionOfGeoPointInBoundingBoxWithLinearInterpolation.y * TileSystem.getTileSize());
                if (z5) {
                    path2.moveTo((float) tileSize2, (float) tileSize3);
                } else {
                    path2.lineTo((float) tileSize2, (float) tileSize3);
                }
                z5 = false;
                it = it2;
            }
            return path2;
        }
        throw new IllegalArgumentException("List of GeoPoints needs to be at least 2.");
    }
}
