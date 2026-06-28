package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SparseArrayCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010!J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J&\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0082\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006'"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;", "", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "start", "end", "", "interpolationPoint", "createInterpolatedTableBetween", "fontScale", "", "getKey", DatabaseFileArchive.COLUMN_KEY, "getScaleFromKey", "scaleKey", "fontScaleConverter", "Lkotlin/r2;", "put", "Landroidx/collection/SparseArrayCompat;", "table", "putInto", "get", "", "isNonLinearFontScalingActive", "forScale", "SCALE_KEY_MULTIPLIER", "F", "sLookupTables", "Landroidx/collection/SparseArrayCompat;", "getSLookupTables", "()Landroidx/collection/SparseArrayCompat;", "setSLookupTables", "(Landroidx/collection/SparseArrayCompat;)V", "getSLookupTables$annotations", "()V", "", "LOOKUP_TABLES_WRITE_LOCK", "[Ljava/lang/Object;", "sMinScaleBeforeCurvesApplied", "<init>", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class FontScaleConverterFactory {
    public static final int $stable;

    @l
    public static final FontScaleConverterFactory INSTANCE;

    @l
    private static final Object[] LOOKUP_TABLES_WRITE_LOCK;
    private static final float SCALE_KEY_MULTIPLIER = 100.0f;

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static volatile SparseArrayCompat<FontScaleConverter> sLookupTables;
    private static float sMinScaleBeforeCurvesApplied;

    static {
        FontScaleConverterFactory fontScaleConverterFactory = new FontScaleConverterFactory();
        INSTANCE = fontScaleConverterFactory;
        boolean z4 = false;
        sLookupTables = new SparseArrayCompat<>(0, 1, null);
        Object[] objArr = new Object[0];
        LOOKUP_TABLES_WRITE_LOCK = objArr;
        sMinScaleBeforeCurvesApplied = 1.05f;
        synchronized (objArr) {
            fontScaleConverterFactory.putInto(sLookupTables, 1.15f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.3f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.5f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.8f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            fontScaleConverterFactory.putInto(sLookupTables, 2.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            r2 r2Var = r2.f19517a;
        }
        float scaleFromKey = fontScaleConverterFactory.getScaleFromKey(sLookupTables.keyAt(0)) - 0.02f;
        sMinScaleBeforeCurvesApplied = scaleFromKey;
        if (scaleFromKey > 1.0f) {
            z4 = true;
        }
        if (z4) {
            $stable = 8;
            return;
        }
        throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1".toString());
    }

    private FontScaleConverterFactory() {
    }

    private final FontScaleConverter createInterpolatedTableBetween(FontScaleConverter fontScaleConverter, FontScaleConverter fontScaleConverter2, float f5) {
        float[] fArr = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        float[] fArr2 = new float[9];
        for (int i5 = 0; i5 < 9; i5++) {
            float f6 = fArr[i5];
            fArr2[i5] = MathUtils.INSTANCE.lerp(fontScaleConverter.convertSpToDp(f6), fontScaleConverter2.convertSpToDp(f6), f5);
        }
        return new FontScaleConverterTable(fArr, fArr2);
    }

    private final FontScaleConverter get(float f5) {
        return sLookupTables.get(getKey(f5));
    }

    private final int getKey(float f5) {
        return (int) (f5 * 100.0f);
    }

    @VisibleForTesting
    public static /* synthetic */ void getSLookupTables$annotations() {
    }

    private final float getScaleFromKey(int i5) {
        return i5 / 100.0f;
    }

    private final void put(float f5, FontScaleConverter fontScaleConverter) {
        synchronized (LOOKUP_TABLES_WRITE_LOCK) {
            SparseArrayCompat<FontScaleConverter> m26clone = sLookupTables.m26clone();
            INSTANCE.putInto(m26clone, f5, fontScaleConverter);
            sLookupTables = m26clone;
            r2 r2Var = r2.f19517a;
        }
    }

    private final void putInto(SparseArrayCompat<FontScaleConverter> sparseArrayCompat, float f5, FontScaleConverter fontScaleConverter) {
        sparseArrayCompat.put(getKey(f5), fontScaleConverter);
    }

    @AnyThread
    @m
    public final FontScaleConverter forScale(float f5) {
        if (!isNonLinearFontScalingActive(f5)) {
            return null;
        }
        FontScaleConverter fontScaleConverter = INSTANCE.get(f5);
        if (fontScaleConverter != null) {
            return fontScaleConverter;
        }
        int indexOfKey = sLookupTables.indexOfKey(getKey(f5));
        if (indexOfKey >= 0) {
            return sLookupTables.valueAt(indexOfKey);
        }
        int i5 = (-(indexOfKey + 1)) - 1;
        int i6 = i5 + 1;
        if (i5 >= 0 && i6 < sLookupTables.size()) {
            FontScaleConverter createInterpolatedTableBetween = createInterpolatedTableBetween(sLookupTables.valueAt(i5), sLookupTables.valueAt(i6), MathUtils.INSTANCE.constrainedMap(0.0f, 1.0f, getScaleFromKey(sLookupTables.keyAt(i5)), getScaleFromKey(sLookupTables.keyAt(i6)), f5));
            put(f5, createInterpolatedTableBetween);
            return createInterpolatedTableBetween;
        }
        FontScaleConverterTable fontScaleConverterTable = new FontScaleConverterTable(new float[]{1.0f}, new float[]{f5});
        put(f5, fontScaleConverterTable);
        return fontScaleConverterTable;
    }

    @l
    public final SparseArrayCompat<FontScaleConverter> getSLookupTables() {
        return sLookupTables;
    }

    @AnyThread
    public final boolean isNonLinearFontScalingActive(float f5) {
        return f5 >= sMinScaleBeforeCurvesApplied;
    }

    public final void setSLookupTables(@l SparseArrayCompat<FontScaleConverter> sparseArrayCompat) {
        sLookupTables = sparseArrayCompat;
    }
}
