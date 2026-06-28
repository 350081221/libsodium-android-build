package org.osmdroid.tileprovider.tilesource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes4.dex */
public class TileSourceFactory {
    public static final OnlineTileSourceBase BASE_OVERLAY_NL;
    public static final OnlineTileSourceBase CLOUDMADESMALLTILES;
    public static final OnlineTileSourceBase CLOUDMADESTANDARDTILES;
    public static final OnlineTileSourceBase ChartbundleENRH;
    public static final OnlineTileSourceBase ChartbundleENRL;
    public static final OnlineTileSourceBase ChartbundleWAC;
    public static final OnlineTileSourceBase DEFAULT_TILE_SOURCE;
    public static final OnlineTileSourceBase FIETS_OVERLAY_NL;
    public static final OnlineTileSourceBase HIKEBIKEMAP;
    public static final OnlineTileSourceBase MAPNIK;
    public static final OnlineTileSourceBase OPEN_SEAMAP;
    public static final OnlineTileSourceBase OpenTopo;
    public static final OnlineTileSourceBase PUBLIC_TRANSPORT;
    public static final OnlineTileSourceBase ROADS_OVERLAY_NL;
    public static final OnlineTileSourceBase USGS_SAT;
    public static final OnlineTileSourceBase USGS_TOPO;
    public static final OnlineTileSourceBase WIKIMEDIA;
    private static List<e> mTileSources;

    /* loaded from: classes4.dex */
    class a extends OnlineTileSourceBase {
        a(String str, int i5, int i6, int i7, String str2, String[] strArr, String str3) {
            super(str, i5, i6, i7, str2, strArr, str3);
        }

        @Override // org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
        public String getTileURLString(long j5) {
            return getBaseUrl() + MapTileIndex.getZoom(j5) + "/" + MapTileIndex.getY(j5) + "/" + MapTileIndex.getX(j5);
        }
    }

    /* loaded from: classes4.dex */
    class b extends OnlineTileSourceBase {
        b(String str, int i5, int i6, int i7, String str2, String[] strArr, String str3) {
            super(str, i5, i6, i7, str2, strArr, str3);
        }

        @Override // org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
        public String getTileURLString(long j5) {
            return getBaseUrl() + MapTileIndex.getZoom(j5) + "/" + MapTileIndex.getY(j5) + "/" + MapTileIndex.getX(j5);
        }
    }

    static {
        XYTileSource xYTileSource = new XYTileSource("Mapnik", 0, 19, 256, ".png", new String[]{"https://tile.openstreetmap.org/"}, "© OpenStreetMap contributors", new j(2, 15));
        MAPNIK = xYTileSource;
        XYTileSource xYTileSource2 = new XYTileSource("Wikimedia", 1, 19, 256, ".png", new String[]{"https://maps.wikimedia.org/osm-intl/"}, "Wikimedia maps | Map data © OpenStreetMap contributors", new j(1, 15));
        WIKIMEDIA = xYTileSource2;
        XYTileSource xYTileSource3 = new XYTileSource("OSMPublicTransport", 0, 17, 256, ".png", new String[]{"http://openptmap.org/tiles/"}, "© OpenStreetMap contributors");
        PUBLIC_TRANSPORT = xYTileSource3;
        DEFAULT_TILE_SOURCE = xYTileSource;
        CLOUDMADESTANDARDTILES = new org.osmdroid.tileprovider.tilesource.b("CloudMadeStandardTiles", 0, 18, 256, ".png", new String[]{"http://a.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s", "http://b.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s", "http://c.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s"});
        CLOUDMADESMALLTILES = new org.osmdroid.tileprovider.tilesource.b("CloudMadeSmallTiles", 0, 21, 64, ".png", new String[]{"http://a.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s", "http://b.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s", "http://c.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s"});
        FIETS_OVERLAY_NL = new XYTileSource("Fiets", 3, 18, 256, ".png", new String[]{"https://overlay.openstreetmap.nl/openfietskaart-overlay/"}, "© OpenStreetMap contributors");
        BASE_OVERLAY_NL = new XYTileSource("BaseNL", 0, 18, 256, ".png", new String[]{"https://overlay.openstreetmap.nl/basemap/"});
        ROADS_OVERLAY_NL = new XYTileSource("RoadsNL", 0, 18, 256, ".png", new String[]{"https://overlay.openstreetmap.nl/roads/"}, "© OpenStreetMap contributors");
        XYTileSource xYTileSource4 = new XYTileSource("HikeBikeMap", 0, 18, 256, ".png", new String[]{"https://tiles.wmflabs.org/hikebike/"});
        HIKEBIKEMAP = xYTileSource4;
        OPEN_SEAMAP = new XYTileSource("OpenSeaMap", 3, 18, 256, ".png", new String[]{"https://tiles.openseamap.org/seamark/"}, "OpenSeaMap");
        a aVar = new a("USGS National Map Topo", 0, 15, 256, "", new String[]{"https://basemap.nationalmap.gov/arcgis/rest/services/USGSTopo/MapServer/tile/"}, "USGS");
        USGS_TOPO = aVar;
        b bVar = new b("USGS National Map Sat", 0, 15, 256, "", new String[]{"https://basemap.nationalmap.gov/arcgis/rest/services/USGSImageryTopo/MapServer/tile/"}, "USGS");
        USGS_SAT = bVar;
        XYTileSource xYTileSource5 = new XYTileSource("ChartbundleWAC", 4, 12, 256, ".png?type=google", new String[]{"https://wms.chartbundle.com/tms/v1.0/wac/"}, "chartbundle.com");
        ChartbundleWAC = xYTileSource5;
        XYTileSource xYTileSource6 = new XYTileSource("ChartbundleENRH", 4, 12, 256, ".png?type=google", new String[]{"https://wms.chartbundle.com/tms/v1.0/enrh/", "chartbundle.com"});
        ChartbundleENRH = xYTileSource6;
        XYTileSource xYTileSource7 = new XYTileSource("ChartbundleENRL", 4, 12, 256, ".png?type=google", new String[]{"https://wms.chartbundle.com/tms/v1.0/enrl/", "chartbundle.com"});
        ChartbundleENRL = xYTileSource7;
        XYTileSource xYTileSource8 = new XYTileSource("OpenTopoMap", 0, 17, 256, ".png", new String[]{"https://a.tile.opentopomap.org/", "https://b.tile.opentopomap.org/", "https://c.tile.opentopomap.org/"}, "Kartendaten: © OpenStreetMap-Mitwirkende, SRTM | Kartendarstellung: © OpenTopoMap (CC-BY-SA)");
        OpenTopo = xYTileSource8;
        ArrayList arrayList = new ArrayList();
        mTileSources = arrayList;
        arrayList.add(xYTileSource);
        mTileSources.add(xYTileSource2);
        mTileSources.add(xYTileSource3);
        mTileSources.add(xYTileSource4);
        mTileSources.add(aVar);
        mTileSources.add(bVar);
        mTileSources.add(xYTileSource5);
        mTileSources.add(xYTileSource6);
        mTileSources.add(xYTileSource7);
        mTileSources.add(xYTileSource8);
    }

    public static void addTileSource(e eVar) {
        mTileSources.add(eVar);
    }

    public static boolean containsTileSource(String str) {
        Iterator<e> it = mTileSources.iterator();
        while (it.hasNext()) {
            if (it.next().name().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static e getTileSource(String str) throws IllegalArgumentException {
        for (e eVar : mTileSources) {
            if (eVar.name().equals(str)) {
                return eVar;
            }
        }
        throw new IllegalArgumentException("No such tile source: " + str);
    }

    public static List<e> getTileSources() {
        return mTileSources;
    }

    public static int removeTileSources(String str) {
        int i5 = 0;
        for (int size = mTileSources.size() - 1; size >= 0; size--) {
            if (mTileSources.get(size).name().matches(str)) {
                mTileSources.remove(size);
                i5++;
            }
        }
        return i5;
    }

    @Deprecated
    public static e getTileSource(int i5) throws IllegalArgumentException {
        for (e eVar : mTileSources) {
            if (eVar.ordinal() == i5) {
                return eVar;
            }
        }
        throw new IllegalArgumentException("No tile source at position: " + i5);
    }
}
