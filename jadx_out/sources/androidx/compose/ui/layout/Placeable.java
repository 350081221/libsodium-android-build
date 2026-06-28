package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import p4.m;
import t0.b;
import v3.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u00002\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J=\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0019\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0002\b\nH$ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R0\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR0\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u001f8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR*\u0010#\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00048\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u0014\u0010&\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0014\u0010(\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "Lkotlin/r2;", "onMeasuredSizeChanged", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/u;", "layerBlock", "placeAt-f8xVGno", "(JFLv3/l;)V", "placeAt", "", "<set-?>", "width", "I", "getWidth", "()I", "height", "getHeight", "Landroidx/compose/ui/unit/IntSize;", b.f22420d, "measuredSize", "J", "getMeasuredSize-YbymL2g", "()J", "setMeasuredSize-ozmzZPI", "(J)V", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "apparentToRealOffset", "getApparentToRealOffset-nOcc-ac", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "<init>", "()V", "PlacementScope", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private int width;
    private long measuredSize = IntSizeKt.IntSize(0, 0);
    private long measurementConstraints = PlaceableKt.access$getDefaultConstraints$p();
    private long apparentToRealOffset = IntOffset.Companion.m6182getZeronOccac();

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J&\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005J$\u0010\u000e\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005J&\u0010\u000e\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\tJA\u0010\u0016\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0002\b\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0016\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0002\b\u0012J?\u0010\u0017\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0002\b\u0012JA\u0010\u0017\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0002\b\u0012ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015JD\u0010\u001a\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u001b\b\b\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0015JD\u0010\u001c\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u001b\b\b\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8$X¤\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/r2;", "placeRelative-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "placeRelative", "", "x", "y", "place", "place-70tqf50", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/u;", "layerBlock", "placeRelativeWithLayer-aW-9-wM", "(Landroidx/compose/ui/layout/Placeable;JFLv3/l;)V", "placeRelativeWithLayer", "placeWithLayer", "placeWithLayer-aW-9-wM", "placeAutoMirrored-aW-9-wM$ui_release", "placeAutoMirrored", "placeApparentToRealOffset-aW-9-wM$ui_release", "placeApparentToRealOffset", "getParentWidth", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,404:1\n331#1,2:405\n348#1:407\n349#1:409\n334#1,2:410\n348#1,2:412\n340#1:414\n331#1,2:415\n348#1:417\n349#1:419\n334#1,2:420\n348#1,2:422\n340#1:424\n348#1:425\n349#1:427\n348#1:428\n349#1:430\n331#1,2:431\n348#1:433\n349#1:435\n334#1,2:436\n348#1,2:438\n340#1:440\n331#1,2:441\n348#1:443\n349#1:445\n334#1,2:446\n348#1,2:448\n340#1:450\n348#1:451\n349#1:453\n348#1:454\n349#1:456\n348#1:457\n349#1:459\n348#1:460\n349#1:462\n86#2:408\n86#2:418\n86#2:426\n86#2:429\n86#2:434\n86#2:444\n86#2:452\n86#2:455\n86#2:458\n86#2:461\n86#2:463\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n186#1:405,2\n186#1:407\n186#1:409\n186#1:410,2\n186#1:412,2\n186#1:414\n204#1:415,2\n204#1:417\n204#1:419\n204#1:420,2\n204#1:422,2\n204#1:424\n218#1:425\n218#1:427\n231#1:428\n231#1:430\n255#1:431,2\n255#1:433\n255#1:435\n255#1:436,2\n255#1:438,2\n255#1:440\n281#1:441,2\n281#1:443\n281#1:445\n281#1:446,2\n281#1:448,2\n281#1:450\n303#1:451\n303#1:453\n323#1:454\n323#1:456\n332#1:457\n332#1:459\n334#1:460\n334#1:462\n186#1:408\n204#1:418\n218#1:426\n231#1:429\n255#1:434\n281#1:444\n303#1:452\n323#1:455\n332#1:458\n334#1:461\n348#1:463\n*E\n"})
    /* loaded from: classes.dex */
    public static abstract class PlacementScope {
        public static final int $stable = 0;

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i5, int i6, float f5, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i7 & 4) != 0) {
                f5 = 0.0f;
            }
            placementScope.place(placeable, i5, i6, f5);
        }

        /* renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m5049place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j5, float f5, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i5 & 2) != 0) {
                f5 = 0.0f;
            }
            placementScope.m5053place70tqf50(placeable, j5, f5);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i5, int i6, float f5, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i7 & 4) != 0) {
                f5 = 0.0f;
            }
            placementScope.placeRelative(placeable, i5, i6, f5);
        }

        /* renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m5050placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j5, float f5, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i5 & 2) != 0) {
                f5 = 0.0f;
            }
            placementScope.m5056placeRelative70tqf50(placeable, j5, f5);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i5, int i6, float f5, l lVar, int i7, Object obj) {
            if (obj == null) {
                if ((i7 & 4) != 0) {
                    f5 = 0.0f;
                }
                float f6 = f5;
                if ((i7 & 8) != 0) {
                    lVar = PlaceableKt.access$getDefaultLayerBlock$p();
                }
                placementScope.placeRelativeWithLayer(placeable, i5, i6, f6, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m5051placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j5, float f5, l lVar, int i5, Object obj) {
            if (obj == null) {
                if ((i5 & 2) != 0) {
                    f5 = 0.0f;
                }
                float f6 = f5;
                if ((i5 & 4) != 0) {
                    lVar = PlaceableKt.access$getDefaultLayerBlock$p();
                }
                placementScope.m5057placeRelativeWithLayeraW9wM(placeable, j5, f6, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i5, int i6, float f5, l lVar, int i7, Object obj) {
            if (obj == null) {
                if ((i7 & 4) != 0) {
                    f5 = 0.0f;
                }
                float f6 = f5;
                if ((i7 & 8) != 0) {
                    lVar = PlaceableKt.access$getDefaultLayerBlock$p();
                }
                placementScope.placeWithLayer(placeable, i5, i6, f6, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m5052placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j5, float f5, l lVar, int i5, Object obj) {
            if (obj == null) {
                if ((i5 & 2) != 0) {
                    f5 = 0.0f;
                }
                float f6 = f5;
                if ((i5 & 4) != 0) {
                    lVar = PlaceableKt.access$getDefaultLayerBlock$p();
                }
                placementScope.m5058placeWithLayeraW9wM(placeable, j5, f6, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        @m
        public LayoutCoordinates getCoordinates() {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @p4.l
        public abstract LayoutDirection getParentLayoutDirection();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int getParentWidth();

        public final void place(@p4.l Placeable placeable, int i5, int i6, float f5) {
            long IntOffset = IntOffsetKt.IntOffset(i5, i6);
            long j5 = placeable.apparentToRealOffset;
            placeable.mo4999placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(IntOffset) + IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(IntOffset) + IntOffset.m6173getYimpl(j5)), f5, null);
        }

        /* renamed from: place-70tqf50, reason: not valid java name */
        public final void m5053place70tqf50(@p4.l Placeable placeable, long j5, float f5) {
            long j6 = placeable.apparentToRealOffset;
            placeable.mo4999placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(j5) + IntOffset.m6172getXimpl(j6), IntOffset.m6173getYimpl(j5) + IntOffset.m6173getYimpl(j6)), f5, null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m5054placeApparentToRealOffsetaW9wM$ui_release(@p4.l Placeable placeable, long j5, float f5, @m l<? super GraphicsLayerScope, r2> lVar) {
            long j6 = placeable.apparentToRealOffset;
            placeable.mo4999placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(j5) + IntOffset.m6172getXimpl(j6), IntOffset.m6173getYimpl(j5) + IntOffset.m6173getYimpl(j6)), f5, lVar);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m5055placeAutoMirroredaW9wM$ui_release(@p4.l Placeable placeable, long j5, float f5, @m l<? super GraphicsLayerScope, r2> lVar) {
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(j5));
                long j6 = placeable.apparentToRealOffset;
                placeable.mo4999placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(IntOffset) + IntOffset.m6172getXimpl(j6), IntOffset.m6173getYimpl(IntOffset) + IntOffset.m6173getYimpl(j6)), f5, lVar);
            } else {
                long j7 = placeable.apparentToRealOffset;
                placeable.mo4999placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(j5) + IntOffset.m6172getXimpl(j7), IntOffset.m6173getYimpl(j5) + IntOffset.m6173getYimpl(j7)), f5, lVar);
            }
        }

        public final void placeRelative(@p4.l Placeable placeable, int i5, int i6, float f5) {
            long IntOffset = IntOffsetKt.IntOffset(i5, i6);
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                long IntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6172getXimpl(IntOffset), IntOffset.m6173getYimpl(IntOffset));
                long j5 = placeable.apparentToRealOffset;
                placeable.mo4999placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(IntOffset2) + IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(IntOffset2) + IntOffset.m6173getYimpl(j5)), f5, null);
            } else {
                long j6 = placeable.apparentToRealOffset;
                placeable.mo4999placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(IntOffset) + IntOffset.m6172getXimpl(j6), IntOffset.m6173getYimpl(IntOffset) + IntOffset.m6173getYimpl(j6)), f5, null);
            }
        }

        /* renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m5056placeRelative70tqf50(@p4.l Placeable placeable, long j5, float f5) {
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(j5));
                long j6 = placeable.apparentToRealOffset;
                placeable.mo4999placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(IntOffset) + IntOffset.m6172getXimpl(j6), IntOffset.m6173getYimpl(IntOffset) + IntOffset.m6173getYimpl(j6)), f5, null);
            } else {
                long j7 = placeable.apparentToRealOffset;
                placeable.mo4999placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(j5) + IntOffset.m6172getXimpl(j7), IntOffset.m6173getYimpl(j5) + IntOffset.m6173getYimpl(j7)), f5, null);
            }
        }

        public final void placeRelativeWithLayer(@p4.l Placeable placeable, int i5, int i6, float f5, @p4.l l<? super GraphicsLayerScope, r2> lVar) {
            long IntOffset = IntOffsetKt.IntOffset(i5, i6);
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                long IntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6172getXimpl(IntOffset), IntOffset.m6173getYimpl(IntOffset));
                long j5 = placeable.apparentToRealOffset;
                placeable.mo4999placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(IntOffset2) + IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(IntOffset2) + IntOffset.m6173getYimpl(j5)), f5, lVar);
            } else {
                long j6 = placeable.apparentToRealOffset;
                placeable.mo4999placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(IntOffset) + IntOffset.m6172getXimpl(j6), IntOffset.m6173getYimpl(IntOffset) + IntOffset.m6173getYimpl(j6)), f5, lVar);
            }
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m5057placeRelativeWithLayeraW9wM(@p4.l Placeable placeable, long j5, float f5, @p4.l l<? super GraphicsLayerScope, r2> lVar) {
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(j5));
                long j6 = placeable.apparentToRealOffset;
                placeable.mo4999placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(IntOffset) + IntOffset.m6172getXimpl(j6), IntOffset.m6173getYimpl(IntOffset) + IntOffset.m6173getYimpl(j6)), f5, lVar);
            } else {
                long j7 = placeable.apparentToRealOffset;
                placeable.mo4999placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(j5) + IntOffset.m6172getXimpl(j7), IntOffset.m6173getYimpl(j5) + IntOffset.m6173getYimpl(j7)), f5, lVar);
            }
        }

        public final void placeWithLayer(@p4.l Placeable placeable, int i5, int i6, float f5, @p4.l l<? super GraphicsLayerScope, r2> lVar) {
            long IntOffset = IntOffsetKt.IntOffset(i5, i6);
            long j5 = placeable.apparentToRealOffset;
            placeable.mo4999placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(IntOffset) + IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(IntOffset) + IntOffset.m6173getYimpl(j5)), f5, lVar);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m5058placeWithLayeraW9wM(@p4.l Placeable placeable, long j5, float f5, @p4.l l<? super GraphicsLayerScope, r2> lVar) {
            long j6 = placeable.apparentToRealOffset;
            placeable.mo4999placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(j5) + IntOffset.m6172getXimpl(j6), IntOffset.m6173getYimpl(j5) + IntOffset.m6173getYimpl(j6)), f5, lVar);
        }
    }

    private final void onMeasuredSizeChanged() {
        int I;
        int I2;
        I = u.I(IntSize.m6214getWidthimpl(this.measuredSize), Constraints.m6002getMinWidthimpl(this.measurementConstraints), Constraints.m6000getMaxWidthimpl(this.measurementConstraints));
        this.width = I;
        I2 = u.I(IntSize.m6213getHeightimpl(this.measuredSize), Constraints.m6001getMinHeightimpl(this.measurementConstraints), Constraints.m5999getMaxHeightimpl(this.measurementConstraints));
        this.height = I2;
        this.apparentToRealOffset = IntOffsetKt.IntOffset((this.width - IntSize.m6214getWidthimpl(this.measuredSize)) / 2, (this.height - IntSize.m6213getHeightimpl(this.measuredSize)) / 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    public final long m5044getApparentToRealOffsetnOccac() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.m6213getHeightimpl(this.measuredSize);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: getMeasuredSize-YbymL2g, reason: not valid java name */
    public final long m5045getMeasuredSizeYbymL2g() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return IntSize.m6214getWidthimpl(this.measuredSize);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name */
    public final long m5046getMeasurementConstraintsmsEJaDk() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno */
    public abstract void mo4999placeAtf8xVGno(long j5, float f5, @m l<? super GraphicsLayerScope, r2> lVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m5047setMeasuredSizeozmzZPI(long j5) {
        if (!IntSize.m6212equalsimpl0(this.measuredSize, j5)) {
            this.measuredSize = j5;
            onMeasuredSizeChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m5048setMeasurementConstraintsBRTryo0(long j5) {
        if (!Constraints.m5993equalsimpl0(this.measurementConstraints, j5)) {
            this.measurementConstraints = j5;
            onMeasuredSizeChanged();
        }
    }
}
