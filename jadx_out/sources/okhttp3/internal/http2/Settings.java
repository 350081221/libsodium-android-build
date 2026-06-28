package okhttp3.internal.http2;

import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0011\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0000R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/http2/Settings;", "", "Lkotlin/r2;", "clear", "", "id", b.f22420d, "set", "", "isSet", "get", "size", "defaultValue", "getEnablePush", "getMaxConcurrentStreams", "getMaxFrameSize", "getMaxHeaderListSize", "other", "merge", "I", "", "values", "[I", "getHeaderTableSize", "()I", "headerTableSize", "getInitialWindowSize", "initialWindowSize", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Settings {
    public static final int COUNT = 10;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;

    @l
    private final int[] values = new int[10];

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http2/Settings$Companion;", "", "()V", "COUNT", "", "DEFAULT_INITIAL_WINDOW_SIZE", "ENABLE_PUSH", "HEADER_TABLE_SIZE", "INITIAL_WINDOW_SIZE", "MAX_CONCURRENT_STREAMS", "MAX_FRAME_SIZE", "MAX_HEADER_LIST_SIZE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public final void clear() {
        this.set = 0;
        o.T1(this.values, 0, 0, 0, 6, null);
    }

    public final int get(int i5) {
        return this.values[i5];
    }

    public final boolean getEnablePush(boolean z4) {
        return (this.set & 4) != 0 ? this.values[2] == 1 : z4;
    }

    public final int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int getInitialWindowSize() {
        if ((this.set & 128) != 0) {
            return this.values[7];
        }
        return 65535;
    }

    public final int getMaxConcurrentStreams() {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int getMaxFrameSize(int i5) {
        return (this.set & 32) != 0 ? this.values[5] : i5;
    }

    public final int getMaxHeaderListSize(int i5) {
        return (this.set & 64) != 0 ? this.values[6] : i5;
    }

    public final boolean isSet(int i5) {
        return ((1 << i5) & this.set) != 0;
    }

    public final void merge(@l Settings other) {
        l0.p(other, "other");
        for (int i5 = 0; i5 < 10; i5++) {
            if (other.isSet(i5)) {
                set(i5, other.get(i5));
            }
        }
    }

    @l
    public final Settings set(int i5, int i6) {
        if (i5 >= 0) {
            int[] iArr = this.values;
            if (i5 < iArr.length) {
                this.set = (1 << i5) | this.set;
                iArr[i5] = i6;
            }
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.set);
    }
}
