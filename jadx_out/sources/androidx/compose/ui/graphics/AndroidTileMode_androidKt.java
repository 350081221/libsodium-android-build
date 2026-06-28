package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.TileMode;

@kotlin.i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0002*\u00020\u0006¢\u0006\u0002\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/TileMode;", "isSupported-0vamqd0", "(I)Z", "toAndroidTileMode", "Landroid/graphics/Shader$TileMode;", "toAndroidTileMode-0vamqd0", "(I)Landroid/graphics/Shader$TileMode;", "toComposeTileMode", "(Landroid/graphics/Shader$TileMode;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTileMode_androidKt {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            try {
                iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-0vamqd0, reason: not valid java name */
    public static final boolean m3638isSupported0vamqd0(int i5) {
        return Build.VERSION.SDK_INT >= 31 || !TileMode.m4101equalsimpl0(i5, TileMode.Companion.m4106getDecal3opZhB0());
    }

    @p4.l
    /* renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m3639toAndroidTileMode0vamqd0(int i5) {
        TileMode.Companion companion = TileMode.Companion;
        if (TileMode.m4101equalsimpl0(i5, companion.m4105getClamp3opZhB0())) {
            return Shader.TileMode.CLAMP;
        }
        if (TileMode.m4101equalsimpl0(i5, companion.m4108getRepeated3opZhB0())) {
            return Shader.TileMode.REPEAT;
        }
        if (TileMode.m4101equalsimpl0(i5, companion.m4107getMirror3opZhB0())) {
            return Shader.TileMode.MIRROR;
        }
        if (TileMode.m4101equalsimpl0(i5, companion.m4106getDecal3opZhB0())) {
            if (Build.VERSION.SDK_INT >= 31) {
                return TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal();
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(@p4.l Shader.TileMode tileMode) {
        Shader.TileMode tileMode2;
        int i5 = WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        tileMode2 = Shader.TileMode.DECAL;
                        if (tileMode == tileMode2) {
                            return TileModeVerificationHelper.INSTANCE.m4109getComposeTileModeDecal3opZhB0();
                        }
                    }
                    return TileMode.Companion.m4105getClamp3opZhB0();
                }
                return TileMode.Companion.m4108getRepeated3opZhB0();
            }
            return TileMode.Companion.m4107getMirror3opZhB0();
        }
        return TileMode.Companion.m4105getClamp3opZhB0();
    }
}
