package com.yuanqi.master.tools;

import android.util.Log;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.tileprovider.tilesource.XYTileSource;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes3.dex */
public class u0 extends TileSourceFactory {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15254a = "tianditu.gov.cn";

    /* renamed from: b, reason: collision with root package name */
    public static OnlineTileSourceBase f15255b = new a("Tian Di Tu CIA", 0, 20, 256, "", new String[]{"http://t0.tianditu.gov.cn/DataServer?T=cia_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t1.tianditu.gov.cn/DataServer?T=cia_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t2.tianditu.gov.cn/DataServer?T=cia_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t3.tianditu.gov.cn/DataServer?T=cia_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t4.tianditu.gov.cn/DataServer?T=cia_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t5.tianditu.gov.cn/DataServer?T=cia_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t6.tianditu.gov.cn/DataServer?T=cia_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t7.tianditu.gov.cn/DataServer?T=cia_w&tk=93a9d4104ec84da5d1007e3bc510f636"});

    /* renamed from: c, reason: collision with root package name */
    public static final OnlineTileSourceBase f15256c = new b("Tian Di Tu IMG", 0, 20, 256, "", new String[]{"http://t0.tianditu.gov.cn/DataServer?T=img_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t1.tianditu.gov.cn/DataServer?T=img_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t2.tianditu.gov.cn/DataServer?T=img_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t3.tianditu.gov.cn/DataServer?T=img_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t4.tianditu.gov.cn/DataServer?T=img_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t5.tianditu.gov.cn/DataServer?T=img_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t6.tianditu.gov.cn/DataServer?T=img_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t7.tianditu.gov.cn/DataServer?T=img_w&tk=93a9d4104ec84da5d1007e3bc510f636"});

    /* renamed from: d, reason: collision with root package name */
    public static final OnlineTileSourceBase f15257d = new c("Tian Di Tu VEC", 0, 20, 256, "", new String[]{"http://t0.tianditu.gov.cn/DataServer?T=vec_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t1.tianditu.gov.cn/DataServer?T=vec_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t2.tianditu.gov.cn/DataServer?T=vec_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t3.tianditu.gov.cn/DataServer?T=vec_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t4.tianditu.gov.cn/DataServer?T=vec_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t5.tianditu.gov.cn/DataServer?T=vec_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t6.tianditu.gov.cn/DataServer?T=vec_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t7.tianditu.gov.cn/DataServer?T=vec_w&tk=93a9d4104ec84da5d1007e3bc510f636"});

    /* renamed from: e, reason: collision with root package name */
    public static final OnlineTileSourceBase f15258e = new d("Tian Di Tu TER", 0, 20, 256, "", new String[]{"http://t0.tianditu.gov.cn/DataServer?T=ter_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t1.tianditu.gov.cn/DataServer?T=ter_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t2.tianditu.gov.cn/DataServer?T=ter_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t3.tianditu.gov.cn/DataServer?T=ter_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t4.tianditu.gov.cn/DataServer?T=ter_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t5.tianditu.gov.cn/DataServer?T=ter_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t6.tianditu.gov.cn/DataServer?T=ter_w&tk=93a9d4104ec84da5d1007e3bc510f636", "http://t7.tianditu.gov.cn/DataServer?T=ter_w&tk=93a9d4104ec84da5d1007e3bc510f636"});

    /* loaded from: classes3.dex */
    class a extends XYTileSource {
        a(String str, int i5, int i6, int i7, String str2, String[] strArr) {
            super(str, i5, i6, i7, str2, strArr);
        }

        @Override // org.osmdroid.tileprovider.tilesource.XYTileSource, org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
        public String getTileURLString(long j5) {
            Log.d("url", getBaseUrl() + "&X=" + MapTileIndex.getX(j5) + "&Y=" + MapTileIndex.getY(j5) + "&L=" + MapTileIndex.getZoom(j5));
            return getBaseUrl() + "&X=" + MapTileIndex.getX(j5) + "&Y=" + MapTileIndex.getY(j5) + "&L=" + MapTileIndex.getZoom(j5);
        }
    }

    /* loaded from: classes3.dex */
    class b extends XYTileSource {
        b(String str, int i5, int i6, int i7, String str2, String[] strArr) {
            super(str, i5, i6, i7, str2, strArr);
        }

        @Override // org.osmdroid.tileprovider.tilesource.XYTileSource, org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
        public String getTileURLString(long j5) {
            return getBaseUrl() + "&X=" + MapTileIndex.getX(j5) + "&Y=" + MapTileIndex.getY(j5) + "&L=" + MapTileIndex.getZoom(j5);
        }
    }

    /* loaded from: classes3.dex */
    class c extends XYTileSource {
        c(String str, int i5, int i6, int i7, String str2, String[] strArr) {
            super(str, i5, i6, i7, str2, strArr);
        }

        @Override // org.osmdroid.tileprovider.tilesource.XYTileSource, org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
        public String getTileURLString(long j5) {
            return getBaseUrl() + "&X=" + MapTileIndex.getX(j5) + "&Y=" + MapTileIndex.getY(j5) + "&L=" + MapTileIndex.getZoom(j5);
        }
    }

    /* loaded from: classes3.dex */
    class d extends XYTileSource {
        d(String str, int i5, int i6, int i7, String str2, String[] strArr) {
            super(str, i5, i6, i7, str2, strArr);
        }

        @Override // org.osmdroid.tileprovider.tilesource.XYTileSource, org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
        public String getTileURLString(long j5) {
            return getBaseUrl() + "&X=" + MapTileIndex.getX(j5) + "&Y=" + MapTileIndex.getY(j5) + "&L=" + MapTileIndex.getZoom(j5);
        }
    }
}
