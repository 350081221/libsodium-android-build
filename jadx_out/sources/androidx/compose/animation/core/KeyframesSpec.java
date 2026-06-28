package androidx.compose.animation.core;

import androidx.annotation.IntRange;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.LinkedHashMap;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u000e\u000fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J,\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0001\u0010\n*\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\n0\rH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "config", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;)V", "getConfig", "()Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "vectorize", "Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "KeyframeEntity", "KeyframesSpecConfig", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@r1({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,786:1\n382#2,4:787\n354#2,6:791\n364#2,3:798\n367#2,2:802\n387#2,2:804\n370#2,6:806\n389#2:812\n1810#3:797\n1672#3:801\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n*L\n560#1:787,4\n560#1:791,6\n560#1:798,3\n560#1:802,2\n560#1:804,2\n560#1:806,6\n560#1:812\n560#1:797\n560#1:801\n*E\n"})
/* loaded from: classes.dex */
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;

    @l
    private final KeyframesSpecConfig<T> config;

    @StabilityInferred(parameters = 2)
    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0004\u001a\u00028\u0001H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0004¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\u0006\u0010\r\u001a\u00020\fH\u0096\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0087\u0004¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "T", "Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", t0.b.f22420d, "createEntityFor$animation_core_release", "(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "createEntityFor", "", "timeStamp", "at", "(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "", "fraction", "atFraction", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "Landroidx/compose/animation/core/Easing;", "easing", "Lkotlin/r2;", "with", "<init>", "()V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class KeyframesSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframeEntity<T>> {
        public static final int $stable = 0;

        public KeyframesSpecConfig() {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity at(Object obj, int i5) {
            return at((KeyframesSpecConfig<T>) obj, i5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity atFraction(Object obj, float f5) {
            return atFraction((KeyframesSpecConfig<T>) obj, f5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity createEntityFor$animation_core_release(Object obj) {
            return createEntityFor$animation_core_release((KeyframesSpecConfig<T>) obj);
        }

        @k(message = "Use version that returns an instance of the entity so it can be re-used in other keyframe builders.", replaceWith = @b1(expression = "this using easing", imports = {}))
        public final void with(@l KeyframeEntity<T> keyframeEntity, @l Easing easing) {
            keyframeEntity.setEasing$animation_core_release(easing);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        @l
        public KeyframeEntity<T> at(T t5, @IntRange(from = 0) int i5) {
            KeyframeEntity<T> keyframeEntity = new KeyframeEntity<>(t5, null, 2, 0 == true ? 1 : 0);
            getKeyframes$animation_core_release().set(i5, keyframeEntity);
            return keyframeEntity;
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        @l
        public KeyframeEntity<T> atFraction(T t5, float f5) {
            int L0;
            L0 = kotlin.math.d.L0(getDurationMillis() * f5);
            return at((KeyframesSpecConfig<T>) t5, L0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        @l
        public KeyframeEntity<T> createEntityFor$animation_core_release(T t5) {
            return new KeyframeEntity<>(t5, null, 2, 0 == true ? 1 : 0);
        }
    }

    public KeyframesSpec(@l KeyframesSpecConfig<T> keyframesSpecConfig) {
        this.config = keyframesSpecConfig;
    }

    @l
    public final KeyframesSpecConfig<T> getConfig() {
        return this.config;
    }

    @StabilityInferred(parameters = 2)
    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "T", "Landroidx/compose/animation/core/KeyframeBaseEntity;", t0.b.f22420d, "easing", "Landroidx/compose/animation/core/Easing;", "(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;)V", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class KeyframeEntity<T> extends KeyframeBaseEntity<T> {
        public static final int $stable = 0;

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i5, w wVar) {
            this(obj, (i5 & 2) != 0 ? EasingKt.getLinearEasing() : easing);
        }

        public boolean equals(@m Object obj) {
            if (obj instanceof KeyframeEntity) {
                KeyframeEntity keyframeEntity = (KeyframeEntity) obj;
                if (l0.g(keyframeEntity.getValue$animation_core_release(), getValue$animation_core_release()) && l0.g(keyframeEntity.getEasing$animation_core_release(), getEasing$animation_core_release())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            T value$animation_core_release = getValue$animation_core_release();
            return ((value$animation_core_release != null ? value$animation_core_release.hashCode() : 0) * 31) + getEasing$animation_core_release().hashCode();
        }

        public KeyframeEntity(T t5, @l Easing easing) {
            super(t5, easing, null);
        }
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @l
    public <V extends AnimationVector> VectorizedKeyframesSpec<V> vectorize(@l TwoWayConverter<T, V> twoWayConverter) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        MutableIntObjectMap<KeyframeEntity<T>> keyframes$animation_core_release = this.config.getKeyframes$animation_core_release();
        int[] iArr = keyframes$animation_core_release.keys;
        Object[] objArr = keyframes$animation_core_release.values;
        long[] jArr = keyframes$animation_core_release.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            int i8 = (i5 << 3) + i7;
                            linkedHashMap.put(Integer.valueOf(iArr[i8]), ((KeyframeEntity) objArr[i8]).toPair$animation_core_release(twoWayConverter.getConvertToVector()));
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        return new VectorizedKeyframesSpec<>(linkedHashMap, this.config.getDurationMillis(), this.config.getDelayMillis());
    }
}
