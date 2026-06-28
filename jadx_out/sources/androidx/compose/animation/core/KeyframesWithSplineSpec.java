package androidx.compose.animation.core;

import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@ExperimentalAnimationSpecApi
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u000eB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J,\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0001\u0010\n*\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\n0\rH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/animation/core/KeyframesWithSplineSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "config", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "(Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;)V", "getConfig", "()Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "vectorize", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "KeyframesWithSplineSpecConfig", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@r1({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesWithSplineSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,786:1\n382#2,4:787\n354#2,6:791\n364#2,3:798\n367#2,2:802\n387#2,2:804\n370#2,6:806\n389#2:812\n1810#3:797\n1672#3:801\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesWithSplineSpec\n*L\n618#1:787,4\n618#1:791,6\n618#1:798,3\n618#1:802,2\n618#1:804,2\n618#1:806,6\n618#1:812\n618#1:797\n618#1:801\n*E\n"})
/* loaded from: classes.dex */
public final class KeyframesWithSplineSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;

    @l
    private final KeyframesWithSplineSpecConfig<T> config;

    @StabilityInferred(parameters = 2)
    @ExperimentalAnimationSpecApi
    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00028\u0001H\u0010¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "T", "Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "()V", "createEntityFor", t0.b.f22420d, "createEntityFor$animation_core_release", "(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class KeyframesWithSplineSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframesSpec.KeyframeEntity<T>> {
        public static final int $stable = 0;

        public KeyframesWithSplineSpecConfig() {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity createEntityFor$animation_core_release(Object obj) {
            return createEntityFor$animation_core_release((KeyframesWithSplineSpecConfig<T>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        @l
        public KeyframesSpec.KeyframeEntity<T> createEntityFor$animation_core_release(T t5) {
            return new KeyframesSpec.KeyframeEntity<>(t5, null, 2, 0 == true ? 1 : 0);
        }
    }

    public KeyframesWithSplineSpec(@l KeyframesWithSplineSpecConfig<T> keyframesWithSplineSpecConfig) {
        this.config = keyframesWithSplineSpecConfig;
    }

    @l
    public final KeyframesWithSplineSpecConfig<T> getConfig() {
        return this.config;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @l
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(@l TwoWayConverter<T, V> twoWayConverter) {
        int i5 = 0;
        int i6 = 1;
        MutableIntList mutableIntList = new MutableIntList(0, 1, null);
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        MutableIntObjectMap<KeyframesSpec.KeyframeEntity<T>> keyframes$animation_core_release = this.config.getKeyframes$animation_core_release();
        int[] iArr = keyframes$animation_core_release.keys;
        Object[] objArr = keyframes$animation_core_release.values;
        long[] jArr = keyframes$animation_core_release.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j5 = jArr[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = i5;
                    while (i9 < i8) {
                        if (((255 & j5) < 128 ? i6 : i5) != 0) {
                            int i10 = (i7 << 3) + i9;
                            int i11 = iArr[i10];
                            KeyframesSpec.KeyframeEntity keyframeEntity = (KeyframesSpec.KeyframeEntity) objArr[i10];
                            mutableIntList.add(i11);
                            mutableIntObjectMap.set(i11, twoWayConverter.getConvertToVector().invoke(keyframeEntity.getValue$animation_core_release()));
                        }
                        j5 >>= 8;
                        i9++;
                        i5 = 0;
                        i6 = 1;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                i5 = 0;
                i6 = 1;
            }
        }
        mutableIntList.sort();
        return new VectorizedMonoSplineKeyframesSpec(mutableIntList, mutableIntObjectMap, this.config.getDurationMillis(), this.config.getDelayMillis());
    }
}
