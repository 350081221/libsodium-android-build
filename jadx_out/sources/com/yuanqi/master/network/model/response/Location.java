package com.yuanqi.master.network.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/yuanqi/master/network/model/response/Location;", "", "keyWord", "", d.C, "", "level", "lon", "score", "", "(Ljava/lang/String;DLjava/lang/String;DI)V", "getKeyWord", "()Ljava/lang/String;", "getLat", "()D", "getLevel", "getLon", "getScore", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Location {
    public static final int $stable = 0;

    @l
    private final String keyWord;
    private final double lat;

    @l
    private final String level;
    private final double lon;
    private final int score;

    public Location(@l String keyWord, double d5, @l String level, double d6, int i5) {
        l0.p(keyWord, "keyWord");
        l0.p(level, "level");
        this.keyWord = keyWord;
        this.lat = d5;
        this.level = level;
        this.lon = d6;
        this.score = i5;
    }

    public static /* synthetic */ Location copy$default(Location location, String str, double d5, String str2, double d6, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = location.keyWord;
        }
        if ((i6 & 2) != 0) {
            d5 = location.lat;
        }
        double d7 = d5;
        if ((i6 & 4) != 0) {
            str2 = location.level;
        }
        String str3 = str2;
        if ((i6 & 8) != 0) {
            d6 = location.lon;
        }
        double d8 = d6;
        if ((i6 & 16) != 0) {
            i5 = location.score;
        }
        return location.copy(str, d7, str3, d8, i5);
    }

    @l
    public final String component1() {
        return this.keyWord;
    }

    public final double component2() {
        return this.lat;
    }

    @l
    public final String component3() {
        return this.level;
    }

    public final double component4() {
        return this.lon;
    }

    public final int component5() {
        return this.score;
    }

    @l
    public final Location copy(@l String keyWord, double d5, @l String level, double d6, int i5) {
        l0.p(keyWord, "keyWord");
        l0.p(level, "level");
        return new Location(keyWord, d5, level, d6, i5);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return l0.g(this.keyWord, location.keyWord) && Double.compare(this.lat, location.lat) == 0 && l0.g(this.level, location.level) && Double.compare(this.lon, location.lon) == 0 && this.score == location.score;
    }

    @l
    public final String getKeyWord() {
        return this.keyWord;
    }

    public final double getLat() {
        return this.lat;
    }

    @l
    public final String getLevel() {
        return this.level;
    }

    public final double getLon() {
        return this.lon;
    }

    public final int getScore() {
        return this.score;
    }

    public int hashCode() {
        return (((((((this.keyWord.hashCode() * 31) + Double.hashCode(this.lat)) * 31) + this.level.hashCode()) * 31) + Double.hashCode(this.lon)) * 31) + Integer.hashCode(this.score);
    }

    @l
    public String toString() {
        return "Location(keyWord=" + this.keyWord + ", lat=" + this.lat + ", level=" + this.level + ", lon=" + this.lon + ", score=" + this.score + ')';
    }
}
