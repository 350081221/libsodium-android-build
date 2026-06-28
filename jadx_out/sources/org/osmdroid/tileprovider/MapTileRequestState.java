package org.osmdroid.tileprovider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;

/* loaded from: classes4.dex */
public class MapTileRequestState {
    private int index;
    private final IMapTileProviderCallback mCallback;
    private MapTileModuleProviderBase mCurrentProvider;
    private final long mMapTileIndex;
    private final List<MapTileModuleProviderBase> mProviderQueue;

    @Deprecated
    public MapTileRequestState(long j5, MapTileModuleProviderBase[] mapTileModuleProviderBaseArr, IMapTileProviderCallback iMapTileProviderCallback) {
        ArrayList arrayList = new ArrayList();
        this.mProviderQueue = arrayList;
        Collections.addAll(arrayList, mapTileModuleProviderBaseArr);
        this.mMapTileIndex = j5;
        this.mCallback = iMapTileProviderCallback;
    }

    public IMapTileProviderCallback getCallback() {
        return this.mCallback;
    }

    public MapTileModuleProviderBase getCurrentProvider() {
        return this.mCurrentProvider;
    }

    public long getMapTile() {
        return this.mMapTileIndex;
    }

    public MapTileModuleProviderBase getNextProvider() {
        MapTileModuleProviderBase mapTileModuleProviderBase;
        if (isEmpty()) {
            mapTileModuleProviderBase = null;
        } else {
            List<MapTileModuleProviderBase> list = this.mProviderQueue;
            int i5 = this.index;
            this.index = i5 + 1;
            mapTileModuleProviderBase = list.get(i5);
        }
        this.mCurrentProvider = mapTileModuleProviderBase;
        return mapTileModuleProviderBase;
    }

    public boolean isEmpty() {
        List<MapTileModuleProviderBase> list = this.mProviderQueue;
        return list == null || this.index >= list.size();
    }

    public MapTileRequestState(long j5, List<MapTileModuleProviderBase> list, IMapTileProviderCallback iMapTileProviderCallback) {
        this.mProviderQueue = list;
        this.mMapTileIndex = j5;
        this.mCallback = iMapTileProviderCallback;
    }
}
