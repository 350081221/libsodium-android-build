package org.osmdroid.tileprovider;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.a;
import org.osmdroid.util.MapTileArea;
import org.osmdroid.util.MapTileAreaComputer;
import org.osmdroid.util.MapTileAreaList;
import org.osmdroid.util.MapTileContainer;
import org.osmdroid.util.MapTileList;

/* loaded from: classes4.dex */
public class MapTileCache {
    private final MapTileAreaList mAdditionalMapTileList;
    private boolean mAutoEnsureCapacity;
    private final HashMap<Long, Drawable> mCachedTiles;
    private int mCapacity;
    private final List<MapTileAreaComputer> mComputers;
    private final MapTileList mGC;
    private final MapTileArea mMapTileArea;
    private final MapTilePreCache mPreCache;
    private final List<MapTileContainer> mProtectors;
    private boolean mStressedMemory;
    private TileRemovedListener mTileRemovedListener;

    /* loaded from: classes4.dex */
    public interface TileRemovedListener {
        void onTileRemoved(long j5);
    }

    public MapTileCache() {
        this(a.a().C());
    }

    private void populateSyncCachedTiles(MapTileList mapTileList) {
        synchronized (this.mCachedTiles) {
            mapTileList.ensureCapacity(this.mCachedTiles.size());
            mapTileList.clear();
            Iterator<Long> it = this.mCachedTiles.keySet().iterator();
            while (it.hasNext()) {
                mapTileList.put(it.next().longValue());
            }
        }
    }

    private void refreshAdditionalLists() {
        MapTileArea mapTileArea;
        int i5 = 0;
        for (MapTileAreaComputer mapTileAreaComputer : this.mComputers) {
            if (i5 < this.mAdditionalMapTileList.getList().size()) {
                mapTileArea = this.mAdditionalMapTileList.getList().get(i5);
            } else {
                mapTileArea = new MapTileArea();
                this.mAdditionalMapTileList.getList().add(mapTileArea);
            }
            mapTileAreaComputer.computeFromSource(this.mMapTileArea, mapTileArea);
            i5++;
        }
        while (i5 < this.mAdditionalMapTileList.getList().size()) {
            this.mAdditionalMapTileList.getList().remove(this.mAdditionalMapTileList.getList().size() - 1);
        }
    }

    private boolean shouldKeepTile(long j5) {
        if (this.mMapTileArea.contains(j5) || this.mAdditionalMapTileList.contains(j5)) {
            return true;
        }
        Iterator<MapTileContainer> it = this.mProtectors.iterator();
        while (it.hasNext()) {
            if (it.next().contains(j5)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        MapTileList mapTileList = new MapTileList();
        populateSyncCachedTiles(mapTileList);
        for (int i5 = 0; i5 < mapTileList.getSize(); i5++) {
            remove(mapTileList.get(i5));
        }
        this.mCachedTiles.clear();
    }

    public boolean containsTile(long j5) {
        boolean containsKey;
        synchronized (this.mCachedTiles) {
            containsKey = this.mCachedTiles.containsKey(Long.valueOf(j5));
        }
        return containsKey;
    }

    public boolean ensureCapacity(int i5) {
        if (this.mCapacity < i5) {
            Log.i(IMapView.LOGTAG, "Tile cache increased from " + this.mCapacity + " to " + i5);
            this.mCapacity = i5;
            return true;
        }
        return false;
    }

    public void garbageCollection() {
        int i5;
        int size = this.mCachedTiles.size();
        if (!this.mStressedMemory) {
            i5 = size - this.mCapacity;
            if (i5 <= 0) {
                return;
            }
        } else {
            i5 = Integer.MAX_VALUE;
        }
        refreshAdditionalLists();
        if (this.mAutoEnsureCapacity && ensureCapacity(this.mMapTileArea.size() + this.mAdditionalMapTileList.size()) && !this.mStressedMemory && (i5 = size - this.mCapacity) <= 0) {
            return;
        }
        populateSyncCachedTiles(this.mGC);
        for (int i6 = 0; i6 < this.mGC.getSize(); i6++) {
            long j5 = this.mGC.get(i6);
            if (!shouldKeepTile(j5)) {
                remove(j5);
                i5--;
                if (i5 == 0) {
                    return;
                }
            }
        }
    }

    public MapTileAreaList getAdditionalMapTileList() {
        return this.mAdditionalMapTileList;
    }

    public Drawable getMapTile(long j5) {
        Drawable drawable;
        synchronized (this.mCachedTiles) {
            drawable = this.mCachedTiles.get(Long.valueOf(j5));
        }
        return drawable;
    }

    public MapTileArea getMapTileArea() {
        return this.mMapTileArea;
    }

    public MapTilePreCache getPreCache() {
        return this.mPreCache;
    }

    public List<MapTileAreaComputer> getProtectedTileComputers() {
        return this.mComputers;
    }

    public List<MapTileContainer> getProtectedTileContainers() {
        return this.mProtectors;
    }

    public int getSize() {
        return this.mCachedTiles.size();
    }

    public TileRemovedListener getTileRemovedListener() {
        return this.mTileRemovedListener;
    }

    public void maintenance() {
        garbageCollection();
        this.mPreCache.fill();
    }

    public void putTile(long j5, Drawable drawable) {
        if (drawable != null) {
            synchronized (this.mCachedTiles) {
                this.mCachedTiles.put(Long.valueOf(j5), drawable);
            }
        }
    }

    protected void remove(long j5) {
        Drawable remove;
        synchronized (this.mCachedTiles) {
            remove = this.mCachedTiles.remove(Long.valueOf(j5));
        }
        if (getTileRemovedListener() != null) {
            getTileRemovedListener().onTileRemoved(j5);
        }
        BitmapPool.getInstance().asyncRecycle(remove);
    }

    public void setAutoEnsureCapacity(boolean z4) {
        this.mAutoEnsureCapacity = z4;
    }

    public void setStressedMemory(boolean z4) {
        this.mStressedMemory = z4;
    }

    public void setTileRemovedListener(TileRemovedListener tileRemovedListener) {
        this.mTileRemovedListener = tileRemovedListener;
    }

    public MapTileCache(int i5) {
        this.mCachedTiles = new HashMap<>();
        this.mMapTileArea = new MapTileArea();
        this.mAdditionalMapTileList = new MapTileAreaList();
        this.mGC = new MapTileList();
        this.mComputers = new ArrayList();
        this.mProtectors = new ArrayList();
        ensureCapacity(i5);
        this.mPreCache = new MapTilePreCache(this);
    }
}
