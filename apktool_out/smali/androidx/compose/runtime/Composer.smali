.class public interface abstract Landroidx/compose/runtime/Composer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/Composer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000c\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u0000 \u0085\u00012\u00020\u0001:\u0002\u0085\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u0008\u0010\u0006\u001a\u00020\u0004H\'J\u001a\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\'J\u0008\u0010\t\u001a\u00020\u0004H\'J\u0008\u0010\n\u001a\u00020\u0004H\'J\u0008\u0010\u000b\u001a\u00020\u0004H\'J\u0010\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\'J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\'J\u001e\u0010\u0012\u001a\u00020\u00042\n\u0010\u0010\u001a\u0006\u0012\u0002\u0008\u00030\u000f2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\'J$\u0010\u0017\u001a\u00020\u00042\u001a\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H\'J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0008\u0010\u001b\u001a\u00020\u0004H&J\u0008\u0010\u001c\u001a\u00020\u0004H\'J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\'J\u0008\u0010 \u001a\u00020\u0004H\'J\u0008\u0010!\u001a\u00020\u0004H\'J\u0008\u0010\"\u001a\u00020\u0004H\'J\u001c\u0010&\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010#2\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00028\u00000$H\'J\u0008\u0010\'\u001a\u00020\u0004H\'J\u0008\u0010(\u001a\u00020\u0004H\'J\u001a\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\'J\u0008\u0010*\u001a\u00020\u0004H\'J\u0008\u0010+\u001a\u00020\u0004H\'J\u0008\u0010,\u001a\u00020\u0004H\'J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H\'JB\u00103\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010/\"\u0004\u0008\u0001\u0010#2\u0006\u0010\u0010\u001a\u00028\u00002\u001d\u00102\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000400\u00a2\u0006\u0002\u00081H\'\u00a2\u0006\u0004\u00083\u00104J\u001c\u00107\u001a\u00020\u00012\u0008\u00105\u001a\u0004\u0018\u00010\u00012\u0008\u00106\u001a\u0004\u0018\u00010\u0001H\'J\n\u00108\u001a\u0004\u0018\u00010\u0001H\'J\u0012\u00109\u001a\u00020\u00042\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\'J\u0012\u0010\u001e\u001a\u00020\u001d2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\'J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u001dH\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020:H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020;H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020<H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u0002H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020=H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020>H\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020?H\u0017J\u0012\u0010@\u001a\u00020\u001d2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0017J\u0010\u0010C\u001a\u00020\u00042\u0006\u0010B\u001a\u00020AH\'J\u0016\u0010E\u001a\u00020\u00042\u000c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u00040$H\'J#\u0010G\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010#2\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000FH\'\u00a2\u0006\u0004\u0008G\u0010HJ#\u0010L\u001a\u00020\u00042\u0012\u0010K\u001a\u000e\u0012\n\u0008\u0001\u0012\u0006\u0012\u0002\u0008\u00030J0IH\'\u00a2\u0006\u0004\u0008L\u0010MJ\u0008\u0010N\u001a\u00020\u0004H\'J\u0014\u0010O\u001a\u00020\u00042\n\u0010\u0010\u001a\u0006\u0012\u0002\u0008\u00030JH\'J\u0008\u0010P\u001a\u00020\u0004H\'J\u0008\u0010Q\u001a\u00020\u0004H&J\u0008\u0010S\u001a\u00020RH\'J\u0008\u0010T\u001a\u00020\u0004H\'R\u001e\u0010Z\u001a\u0006\u0012\u0002\u0008\u00030U8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008X\u0010Y\u001a\u0004\u0008V\u0010WR\u001a\u0010^\u001a\u00020\u001d8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008]\u0010Y\u001a\u0004\u0008[\u0010\\R\u001a\u0010a\u001a\u00020\u001d8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008`\u0010Y\u001a\u0004\u0008_\u0010\\R\u001a\u0010d\u001a\u00020\u001d8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008c\u0010Y\u001a\u0004\u0008b\u0010\\R\u001c\u0010h\u001a\u0004\u0018\u00010A8&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008g\u0010Y\u001a\u0004\u0008e\u0010fR\u001c\u0010l\u001a\u0004\u0018\u00010\u00018&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008k\u0010Y\u001a\u0004\u0008i\u0010jR\u001a\u0010p\u001a\u00020\u00028&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008o\u0010Y\u001a\u0004\u0008m\u0010nR\u001a\u0010s\u001a\u00020\u00028&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008r\u0010Y\u001a\u0004\u0008q\u0010nR\u0014\u0010w\u001a\u00020t8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008u\u0010vR\u0014\u0010{\u001a\u00020x8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008y\u0010zR\u001b\u0010\u0080\u0001\u001a\u00020|8gX\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u007f\u0010Y\u001a\u0004\u0008}\u0010~R\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018gX\u00a6\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001\u0082\u0001\u0002\u0086\u0001\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0087\u0001\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/runtime/Composer;",
        "",
        "",
        "key",
        "Lkotlin/r2;",
        "startReplaceableGroup",
        "endReplaceableGroup",
        "dataKey",
        "startMovableGroup",
        "endMovableGroup",
        "startDefaults",
        "endDefaults",
        "startRestartGroup",
        "Landroidx/compose/runtime/ScopeUpdateScope;",
        "endRestartGroup",
        "Landroidx/compose/runtime/MovableContent;",
        "value",
        "parameter",
        "insertMovableContent",
        "",
        "Lkotlin/u0;",
        "Landroidx/compose/runtime/MovableContentStateReference;",
        "references",
        "insertMovableContentReferences",
        "",
        "sourceInformation",
        "sourceInformationMarkerStart",
        "sourceInformationMarkerEnd",
        "skipToGroupEnd",
        "",
        "changed",
        "deactivateToEndGroup",
        "skipCurrentGroup",
        "startNode",
        "startReusableNode",
        "T",
        "Lkotlin/Function0;",
        "factory",
        "createNode",
        "useNode",
        "endNode",
        "startReusableGroup",
        "endReusableGroup",
        "disableReusing",
        "enableReusing",
        "marker",
        "endToMarker",
        "V",
        "Lkotlin/Function2;",
        "Lkotlin/u;",
        "block",
        "apply",
        "(Ljava/lang/Object;Lv3/p;)V",
        "left",
        "right",
        "joinKey",
        "rememberedValue",
        "updateRememberedValue",
        "",
        "",
        "",
        "",
        "",
        "",
        "changedInstance",
        "Landroidx/compose/runtime/RecomposeScope;",
        "scope",
        "recordUsed",
        "effect",
        "recordSideEffect",
        "Landroidx/compose/runtime/CompositionLocal;",
        "consume",
        "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;",
        "",
        "Landroidx/compose/runtime/ProvidedValue;",
        "values",
        "startProviders",
        "([Landroidx/compose/runtime/ProvidedValue;)V",
        "endProviders",
        "startProvider",
        "endProvider",
        "collectParameterInformation",
        "Landroidx/compose/runtime/CompositionContext;",
        "buildContext",
        "disableSourceInformation",
        "Landroidx/compose/runtime/Applier;",
        "getApplier",
        "()Landroidx/compose/runtime/Applier;",
        "getApplier$annotations",
        "()V",
        "applier",
        "getInserting",
        "()Z",
        "getInserting$annotations",
        "inserting",
        "getSkipping",
        "getSkipping$annotations",
        "skipping",
        "getDefaultsInvalid",
        "getDefaultsInvalid$annotations",
        "defaultsInvalid",
        "getRecomposeScope",
        "()Landroidx/compose/runtime/RecomposeScope;",
        "getRecomposeScope$annotations",
        "recomposeScope",
        "getRecomposeScopeIdentity",
        "()Ljava/lang/Object;",
        "getRecomposeScopeIdentity$annotations",
        "recomposeScopeIdentity",
        "getCompoundKeyHash",
        "()I",
        "getCompoundKeyHash$annotations",
        "compoundKeyHash",
        "getCurrentMarker",
        "getCurrentMarker$annotations",
        "currentMarker",
        "Landroidx/compose/runtime/CompositionLocalMap;",
        "getCurrentCompositionLocalMap",
        "()Landroidx/compose/runtime/CompositionLocalMap;",
        "currentCompositionLocalMap",
        "Landroidx/compose/runtime/tooling/CompositionData;",
        "getCompositionData",
        "()Landroidx/compose/runtime/tooling/CompositionData;",
        "compositionData",
        "Lkotlin/coroutines/g;",
        "getApplyCoroutineContext",
        "()Lkotlin/coroutines/g;",
        "getApplyCoroutineContext$annotations",
        "applyCoroutineContext",
        "Landroidx/compose/runtime/ControlledComposition;",
        "getComposition",
        "()Landroidx/compose/runtime/ControlledComposition;",
        "composition",
        "Companion",
        "Landroidx/compose/runtime/ComposerImpl;",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/compose/runtime/Composer$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/compose/runtime/Composer$Companion;->$$INSTANCE:Landroidx/compose/runtime/Composer$Companion;

    sput-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    return-void
.end method

.method public static synthetic getApplier$annotations()V
    .locals 0
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    return-void
.end method

.method public static synthetic getApplyCoroutineContext$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    return-void
.end method

.method public static synthetic getCompoundKeyHash$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    return-void
.end method

.method public static synthetic getCurrentMarker$annotations()V
    .locals 0
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    return-void
.end method

.method public static synthetic getDefaultsInvalid$annotations()V
    .locals 0
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    return-void
.end method

.method public static synthetic getInserting$annotations()V
    .locals 0
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    return-void
.end method

.method public static synthetic getRecomposeScope$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    return-void
.end method

.method public static synthetic getRecomposeScopeIdentity$annotations()V
    .locals 0
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    return-void
.end method

.method public static synthetic getSkipping$annotations()V
    .locals 0
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    return-void
.end method


# virtual methods
.method public abstract apply(Ljava/lang/Object;Lv3/p;)V
    .param p2    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(TV;",
            "Lv3/p<",
            "-TT;-TV;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract buildContext()Landroidx/compose/runtime/CompositionContext;
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public changed(B)Z
    .locals 0
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .line 3
    invoke-interface {p0, p1}, Landroidx/compose/runtime/Composer;->changed(B)Z

    move-result p1

    return p1
.end method

.method public changed(C)Z
    .locals 0
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .line 2
    invoke-interface {p0, p1}, Landroidx/compose/runtime/Composer;->changed(C)Z

    move-result p1

    return p1
.end method

.method public changed(D)Z
    .locals 0
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .line 8
    invoke-interface {p0, p1, p2}, Landroidx/compose/runtime/Composer;->changed(D)Z

    move-result p1

    return p1
.end method

.method public changed(F)Z
    .locals 0
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .line 6
    invoke-interface {p0, p1}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result p1

    return p1
.end method

.method public changed(I)Z
    .locals 0
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .line 5
    invoke-interface {p0, p1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result p1

    return p1
.end method

.method public changed(J)Z
    .locals 0
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .line 7
    invoke-interface {p0, p1, p2}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result p1

    return p1
.end method

.method public abstract changed(Ljava/lang/Object;)Z
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public changed(S)Z
    .locals 0
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .line 4
    invoke-interface {p0, p1}, Landroidx/compose/runtime/Composer;->changed(S)Z

    move-result p1

    return p1
.end method

.method public changed(Z)Z
    .locals 0
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result p1

    return p1
.end method

.method public changedInstance(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    invoke-interface {p0, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public abstract collectParameterInformation()V
.end method

.method public abstract consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
    .param p1    # Landroidx/compose/runtime/CompositionLocal;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/CompositionLocal<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract createNode(Lv3/a;)V
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lv3/a<",
            "+TT;>;)V"
        }
    .end annotation
.end method

.method public abstract deactivateToEndGroup(Z)V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract disableReusing()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract disableSourceInformation()V
    .annotation build Lp4/p;
    .end annotation
.end method

.method public abstract enableReusing()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract endDefaults()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract endMovableGroup()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract endNode()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract endProvider()V
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation
.end method

.method public abstract endProviders()V
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation
.end method

.method public abstract endReplaceableGroup()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract endReusableGroup()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract endToMarker(I)V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract getApplier()Landroidx/compose/runtime/Applier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/Applier<",
            "*>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getApplyCoroutineContext()Lkotlin/coroutines/g;
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lp4/p;
    .end annotation
.end method

.method public abstract getComposition()Landroidx/compose/runtime/ControlledComposition;
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lp4/p;
    .end annotation
.end method

.method public abstract getCompositionData()Landroidx/compose/runtime/tooling/CompositionData;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getCompoundKeyHash()I
.end method

.method public abstract getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getCurrentMarker()I
.end method

.method public abstract getDefaultsInvalid()Z
.end method

.method public abstract getInserting()Z
.end method

.method public abstract getRecomposeScope()Landroidx/compose/runtime/RecomposeScope;
    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract getRecomposeScopeIdentity()Ljava/lang/Object;
    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract getSkipping()Z
.end method

.method public abstract insertMovableContent(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;)V
    .param p1    # Landroidx/compose/runtime/MovableContent;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MovableContent<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation
.end method

.method public abstract insertMovableContentReferences(Ljava/util/List;)V
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lkotlin/u0<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public abstract joinKey(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract recordSideEffect(Lv3/a;)V
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract recordUsed(Landroidx/compose/runtime/RecomposeScope;)V
    .param p1    # Landroidx/compose/runtime/RecomposeScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation
.end method

.method public abstract rememberedValue()Ljava/lang/Object;
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract skipCurrentGroup()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract skipToGroupEnd()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract sourceInformation(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract sourceInformationMarkerEnd()V
.end method

.method public abstract sourceInformationMarkerStart(ILjava/lang/String;)V
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract startDefaults()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract startMovableGroup(ILjava/lang/Object;)V
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract startNode()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract startProvider(Landroidx/compose/runtime/ProvidedValue;)V
    .param p1    # Landroidx/compose/runtime/ProvidedValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/ProvidedValue<",
            "*>;)V"
        }
    .end annotation
.end method

.method public abstract startProviders([Landroidx/compose/runtime/ProvidedValue;)V
    .param p1    # [Landroidx/compose/runtime/ProvidedValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/InternalComposeApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Landroidx/compose/runtime/ProvidedValue<",
            "*>;)V"
        }
    .end annotation
.end method

.method public abstract startReplaceableGroup(I)V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract startRestartGroup(I)Landroidx/compose/runtime/Composer;
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract startReusableGroup(ILjava/lang/Object;)V
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract startReusableNode()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract updateRememberedValue(Ljava/lang/Object;)V
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method

.method public abstract useNode()V
    .annotation runtime Landroidx/compose/runtime/ComposeCompilerApi;
    .end annotation
.end method
