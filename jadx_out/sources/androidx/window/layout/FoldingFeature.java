package androidx.window.layout;

import com.lody.virtual.client.hook.providers.DownloadProviderHook;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import u3.e;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/FoldingFeature;", "Landroidx/window/layout/DisplayFeature;", "isSeparating", "", "()Z", "occlusionType", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "getOcclusionType", "()Landroidx/window/layout/FoldingFeature$OcclusionType;", "orientation", "Landroidx/window/layout/FoldingFeature$Orientation;", "getOrientation", "()Landroidx/window/layout/FoldingFeature$Orientation;", "state", "Landroidx/window/layout/FoldingFeature$State;", "getState", "()Landroidx/window/layout/FoldingFeature$State;", "OcclusionType", "Orientation", "State", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface FoldingFeature extends DisplayFeature {

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/FoldingFeature$OcclusionType;", "", DownloadProviderHook.COLUMN_DESCRIPTION, "", "(Ljava/lang/String;)V", "toString", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class OcclusionType {

        @l
        private final String description;

        @l
        public static final Companion Companion = new Companion(null);

        @l
        @e
        public static final OcclusionType NONE = new OcclusionType("NONE");

        @l
        @e
        public static final OcclusionType FULL = new OcclusionType("FULL");

        @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/FoldingFeature$OcclusionType$Companion;", "", "()V", "FULL", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "NONE", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }
        }

        private OcclusionType(String str) {
            this.description = str;
        }

        @l
        public String toString() {
            return this.description;
        }
    }

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/FoldingFeature$Orientation;", "", DownloadProviderHook.COLUMN_DESCRIPTION, "", "(Ljava/lang/String;)V", "toString", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Orientation {

        @l
        private final String description;

        @l
        public static final Companion Companion = new Companion(null);

        @l
        @e
        public static final Orientation VERTICAL = new Orientation("VERTICAL");

        @l
        @e
        public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL");

        @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/FoldingFeature$Orientation$Companion;", "", "()V", "HORIZONTAL", "Landroidx/window/layout/FoldingFeature$Orientation;", "VERTICAL", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }
        }

        private Orientation(String str) {
            this.description = str;
        }

        @l
        public String toString() {
            return this.description;
        }
    }

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/FoldingFeature$State;", "", DownloadProviderHook.COLUMN_DESCRIPTION, "", "(Ljava/lang/String;)V", "toString", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class State {

        @l
        public static final Companion Companion = new Companion(null);

        @l
        @e
        public static final State FLAT = new State("FLAT");

        @l
        @e
        public static final State HALF_OPENED = new State("HALF_OPENED");

        @l
        private final String description;

        @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/FoldingFeature$State$Companion;", "", "()V", "FLAT", "Landroidx/window/layout/FoldingFeature$State;", "HALF_OPENED", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }
        }

        private State(String str) {
            this.description = str;
        }

        @l
        public String toString() {
            return this.description;
        }
    }

    @l
    OcclusionType getOcclusionType();

    @l
    Orientation getOrientation();

    @l
    State getState();

    boolean isSeparating();
}
