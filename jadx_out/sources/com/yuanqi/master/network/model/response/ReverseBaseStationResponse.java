package com.yuanqi.master.network.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.i0;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yuanqi/master/network/model/response/ReverseBaseStationResponse;", "Ljava/util/ArrayList;", "Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;", "Lkotlin/collections/ArrayList;", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReverseBaseStationResponse extends ArrayList<ReverseBaseStationItem> {
    public static final int $stable = 0;

    public /* bridge */ boolean contains(ReverseBaseStationItem reverseBaseStationItem) {
        return super.contains((Object) reverseBaseStationItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(ReverseBaseStationItem reverseBaseStationItem) {
        return super.indexOf((Object) reverseBaseStationItem);
    }

    public /* bridge */ int lastIndexOf(ReverseBaseStationItem reverseBaseStationItem) {
        return super.lastIndexOf((Object) reverseBaseStationItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ ReverseBaseStationItem remove(int i5) {
        return removeAt(i5);
    }

    public /* bridge */ ReverseBaseStationItem removeAt(int i5) {
        return (ReverseBaseStationItem) super.remove(i5);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ReverseBaseStationItem) {
            return contains((ReverseBaseStationItem) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ReverseBaseStationItem) {
            return indexOf((ReverseBaseStationItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ReverseBaseStationItem) {
            return lastIndexOf((ReverseBaseStationItem) obj);
        }
        return -1;
    }

    public /* bridge */ boolean remove(ReverseBaseStationItem reverseBaseStationItem) {
        return super.remove((Object) reverseBaseStationItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof ReverseBaseStationItem) {
            return remove((ReverseBaseStationItem) obj);
        }
        return false;
    }
}
