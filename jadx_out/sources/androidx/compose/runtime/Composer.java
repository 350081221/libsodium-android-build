package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.i0;
import kotlin.r2;
import kotlin.u0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import v3.p;

@i0(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\f\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u0085\u00012\u00020\u0001:\u0002\u0085\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0004H'J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H'J\b\u0010\t\u001a\u00020\u0004H'J\b\u0010\n\u001a\u00020\u0004H'J\b\u0010\u000b\u001a\u00020\u0004H'J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH'J\u001e\u0010\u0012\u001a\u00020\u00042\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H'J$\u0010\u0017\u001a\u00020\u00042\u001a\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H'J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H&J\b\u0010\u001b\u001a\u00020\u0004H&J\b\u0010\u001c\u001a\u00020\u0004H'J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH'J\b\u0010 \u001a\u00020\u0004H'J\b\u0010!\u001a\u00020\u0004H'J\b\u0010\"\u001a\u00020\u0004H'J\u001c\u0010&\u001a\u00020\u0004\"\u0004\b\u0000\u0010#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H'J\b\u0010'\u001a\u00020\u0004H'J\b\u0010(\u001a\u00020\u0004H'J\u001a\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H'J\b\u0010*\u001a\u00020\u0004H'J\b\u0010+\u001a\u00020\u0004H'J\b\u0010,\u001a\u00020\u0004H'J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H'JB\u00103\u001a\u00020\u0004\"\u0004\b\u0000\u0010/\"\u0004\b\u0001\u0010#2\u0006\u0010\u0010\u001a\u00028\u00002\u001d\u00102\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000400¢\u0006\u0002\b1H'¢\u0006\u0004\b3\u00104J\u001c\u00107\u001a\u00020\u00012\b\u00105\u001a\u0004\u0018\u00010\u00012\b\u00106\u001a\u0004\u0018\u00010\u0001H'J\n\u00108\u001a\u0004\u0018\u00010\u0001H'J\u0012\u00109\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H'J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H'J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u001dH\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020:H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020;H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020<H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u0002H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020=H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020>H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020?H\u0017J\u0012\u0010@\u001a\u00020\u001d2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0017J\u0010\u0010C\u001a\u00020\u00042\u0006\u0010B\u001a\u00020AH'J\u0016\u0010E\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040$H'J#\u0010G\u001a\u00028\u0000\"\u0004\b\u0000\u0010#2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000FH'¢\u0006\u0004\bG\u0010HJ#\u0010L\u001a\u00020\u00042\u0012\u0010K\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030J0IH'¢\u0006\u0004\bL\u0010MJ\b\u0010N\u001a\u00020\u0004H'J\u0014\u0010O\u001a\u00020\u00042\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030JH'J\b\u0010P\u001a\u00020\u0004H'J\b\u0010Q\u001a\u00020\u0004H&J\b\u0010S\u001a\u00020RH'J\b\u0010T\u001a\u00020\u0004H'R\u001e\u0010Z\u001a\u0006\u0012\u0002\b\u00030U8&X§\u0004¢\u0006\f\u0012\u0004\bX\u0010Y\u001a\u0004\bV\u0010WR\u001a\u0010^\u001a\u00020\u001d8&X§\u0004¢\u0006\f\u0012\u0004\b]\u0010Y\u001a\u0004\b[\u0010\\R\u001a\u0010a\u001a\u00020\u001d8&X§\u0004¢\u0006\f\u0012\u0004\b`\u0010Y\u001a\u0004\b_\u0010\\R\u001a\u0010d\u001a\u00020\u001d8&X§\u0004¢\u0006\f\u0012\u0004\bc\u0010Y\u001a\u0004\bb\u0010\\R\u001c\u0010h\u001a\u0004\u0018\u00010A8&X§\u0004¢\u0006\f\u0012\u0004\bg\u0010Y\u001a\u0004\be\u0010fR\u001c\u0010l\u001a\u0004\u0018\u00010\u00018&X§\u0004¢\u0006\f\u0012\u0004\bk\u0010Y\u001a\u0004\bi\u0010jR\u001a\u0010p\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\bo\u0010Y\u001a\u0004\bm\u0010nR\u001a\u0010s\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\br\u0010Y\u001a\u0004\bq\u0010nR\u0014\u0010w\u001a\u00020t8&X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u001b\u0010\u0080\u0001\u001a\u00020|8gX§\u0004¢\u0006\f\u0012\u0004\b\u007f\u0010Y\u001a\u0004\b}\u0010~R\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018gX¦\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\u0082\u0001\u0002\u0086\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0087\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/r2;", "startReplaceableGroup", "endReplaceableGroup", "dataKey", "startMovableGroup", "endMovableGroup", "startDefaults", "endDefaults", "startRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "Landroidx/compose/runtime/MovableContent;", b.f22420d, "parameter", "insertMovableContent", "", "Lkotlin/u0;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentReferences", "", "sourceInformation", "sourceInformationMarkerStart", "sourceInformationMarkerEnd", "skipToGroupEnd", "", "changed", "deactivateToEndGroup", "skipCurrentGroup", "startNode", "startReusableNode", "T", "Lkotlin/Function0;", "factory", "createNode", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "marker", "endToMarker", "V", "Lkotlin/Function2;", "Lkotlin/u;", "block", "apply", "(Ljava/lang/Object;Lv3/p;)V", "left", "right", "joinKey", "rememberedValue", "updateRememberedValue", "", "", "", "", "", "", "changedInstance", "Landroidx/compose/runtime/RecomposeScope;", "scope", "recordUsed", "effect", "recordSideEffect", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "startProvider", "endProvider", "collectParameterInformation", "Landroidx/compose/runtime/CompositionContext;", "buildContext", "disableSourceInformation", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "getApplier$annotations", "()V", "applier", "getInserting", "()Z", "getInserting$annotations", "inserting", "getSkipping", "getSkipping$annotations", "skipping", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope$annotations", "recomposeScope", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "getRecomposeScopeIdentity$annotations", "recomposeScopeIdentity", "getCompoundKeyHash", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "getCurrentMarker", "getCurrentMarker$annotations", "currentMarker", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalMap", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Lkotlin/coroutines/g;", "getApplyCoroutineContext", "()Lkotlin/coroutines/g;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "composition", "Companion", "Landroidx/compose/runtime/ComposerImpl;", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface Composer {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "Landroidx/compose/runtime/CompositionTracer;", "tracer", "Lkotlin/r2;", "setTracer", "Empty", "Ljava/lang/Object;", "getEmpty", "()Ljava/lang/Object;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            @l
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        @l
        public final Object getEmpty() {
            return Empty;
        }

        @InternalComposeTracingApi
        public final void setTracer(@l CompositionTracer compositionTracer) {
            ComposerKt.access$setCompositionTracer$p(compositionTracer);
        }
    }

    @ComposeCompilerApi
    static /* synthetic */ void getApplier$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getApplyCoroutineContext$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getCurrentMarker$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getInserting$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getRecomposeScope$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getRecomposeScopeIdentity$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getSkipping$annotations() {
    }

    @ComposeCompilerApi
    <V, T> void apply(V v4, @l p<? super T, ? super V, r2> pVar);

    @l
    @InternalComposeApi
    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(@m Object obj);

    @ComposeCompilerApi
    default boolean changed(boolean z4) {
        return changed(z4);
    }

    @ComposeCompilerApi
    default boolean changedInstance(@m Object obj) {
        return changed(obj);
    }

    void collectParameterInformation();

    @InternalComposeApi
    <T> T consume(@l CompositionLocal<T> compositionLocal);

    @ComposeCompilerApi
    <T> void createNode(@l v3.a<? extends T> aVar);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean z4);

    @ComposeCompilerApi
    void disableReusing();

    @p4.p
    void disableSourceInformation();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    @InternalComposeApi
    void endProvider();

    @InternalComposeApi
    void endProviders();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    @m
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @ComposeCompilerApi
    void endToMarker(int i5);

    @l
    Applier<?> getApplier();

    @l
    @p4.p
    g getApplyCoroutineContext();

    @l
    @p4.p
    ControlledComposition getComposition();

    @l
    CompositionData getCompositionData();

    int getCompoundKeyHash();

    @l
    CompositionLocalMap getCurrentCompositionLocalMap();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    @m
    RecomposeScope getRecomposeScope();

    @m
    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    @InternalComposeApi
    void insertMovableContent(@l MovableContent<?> movableContent, @m Object obj);

    @InternalComposeApi
    void insertMovableContentReferences(@l List<u0<MovableContentStateReference, MovableContentStateReference>> list);

    @l
    @ComposeCompilerApi
    Object joinKey(@m Object obj, @m Object obj2);

    @InternalComposeApi
    void recordSideEffect(@l v3.a<r2> aVar);

    @InternalComposeApi
    void recordUsed(@l RecomposeScope recomposeScope);

    @ComposeCompilerApi
    @m
    Object rememberedValue();

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(@l String str);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int i5, @l String str);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int i5, @m Object obj);

    @ComposeCompilerApi
    void startNode();

    @InternalComposeApi
    void startProvider(@l ProvidedValue<?> providedValue);

    @InternalComposeApi
    void startProviders(@l ProvidedValue<?>[] providedValueArr);

    @ComposeCompilerApi
    void startReplaceableGroup(int i5);

    @l
    @ComposeCompilerApi
    Composer startRestartGroup(int i5);

    @ComposeCompilerApi
    void startReusableGroup(int i5, @m Object obj);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(@m Object obj);

    @ComposeCompilerApi
    void useNode();

    @ComposeCompilerApi
    default boolean changed(char c5) {
        return changed(c5);
    }

    @ComposeCompilerApi
    default boolean changed(byte b5) {
        return changed(b5);
    }

    @ComposeCompilerApi
    default boolean changed(short s5) {
        return changed(s5);
    }

    @ComposeCompilerApi
    default boolean changed(int i5) {
        return changed(i5);
    }

    @ComposeCompilerApi
    default boolean changed(float f5) {
        return changed(f5);
    }

    @ComposeCompilerApi
    default boolean changed(long j5) {
        return changed(j5);
    }

    @ComposeCompilerApi
    default boolean changed(double d5) {
        return changed(d5);
    }
}
