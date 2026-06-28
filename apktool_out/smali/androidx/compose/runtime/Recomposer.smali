.class public final Landroidx/compose/runtime/Recomposer;
.super Landroidx/compose/runtime/CompositionContext;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/Recomposer$Companion;,
        Landroidx/compose/runtime/Recomposer$HotReloadable;,
        Landroidx/compose/runtime/Recomposer$RecomposerErrorState;,
        Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;,
        Landroidx/compose/runtime/Recomposer$State;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u00a2\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0008\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0007\u0018\u0000 \u00d1\u00012\u00020\u0001:\n\u00d1\u0001\u00d2\u0001\u00d3\u0001\u00d4\u0001\u00d5\u0001B\u0012\u0012\u0007\u0010\u00a4\u0001\u001a\u00020A\u00a2\u0006\u0006\u0008\u00cf\u0001\u0010\u00d0\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u0008\u0010\u0006\u001a\u00020\u0005H\u0002J\u001d\u0010\u0006\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00030\u0007H\u0082\u0008J\u0010\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J*\u0010\u0012\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0005H\u0002J\u0008\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0008H\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0008H\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J\u0008\u0010\u0019\u001a\u00020\u0003H\u0002J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008 \u0010!JN\u0010*\u001a\u00020\u00032<\u0010)\u001a8\u0008\u0001\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u001a\u00a2\u0006\u000c\u0008$\u0012\u0008\u0008%\u0012\u0004\u0008\u0008(\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030&\u0012\u0006\u0012\u0004\u0018\u00010\'0\"\u00a2\u0006\u0002\u0008(H\u0082@\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0008H\u0002J\"\u0010/\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0014\u001a\u00020\u00082\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010-H\u0002J,\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u0008002\u000c\u00102\u001a\u0008\u0012\u0004\u0012\u000201002\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010-H\u0002J\u0008\u00104\u001a\u00020\u0003H\u0002J\u001c\u00105\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0014\u001a\u00020\u0008H\u0002J,\u00106\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0014\u001a\u00020\u00082\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010-H\u0002J<\u00109\u001a\u00028\u0000\"\u0004\u0008\u0000\u001072\u0006\u0010\u0014\u001a\u00020\u00082\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010-2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00028\u000008H\u0082\u0008\u00a2\u0006\u0004\u00089\u0010:J\u0010\u0010=\u001a\u00020\u00032\u0006\u0010<\u001a\u00020;H\u0002J\u0006\u0010?\u001a\u00020>J\u0010\u0010@\u001a\u00020\u0003H\u0086@\u00a2\u0006\u0004\u0008@\u0010!J\u0018\u0010C\u001a\u00020\u00032\u0006\u0010B\u001a\u00020AH\u0087@\u00a2\u0006\u0004\u0008C\u0010DJ\u0006\u0010E\u001a\u00020\u0003J\u0006\u0010F\u001a\u00020\u0003J\u0010\u0010G\u001a\u00020\u0003H\u0086@\u00a2\u0006\u0004\u0008G\u0010!J*\u0010L\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00082\u0011\u0010I\u001a\r\u0012\u0004\u0012\u00020\u000308\u00a2\u0006\u0002\u0008HH\u0010\u00a2\u0006\u0004\u0008J\u0010KJ\u0010\u0010M\u001a\u00020\u0003H\u0086@\u00a2\u0006\u0004\u0008M\u0010!J\u0006\u0010N\u001a\u00020\u0003J\u0006\u0010O\u001a\u00020\u0003J\u001d\u0010U\u001a\u00020\u00032\u000c\u0010R\u001a\u0008\u0012\u0004\u0012\u00020Q0PH\u0010\u00a2\u0006\u0004\u0008S\u0010TJ\u0017\u0010X\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0008H\u0010\u00a2\u0006\u0004\u0008V\u0010WJ\u0017\u0010Z\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0008H\u0010\u00a2\u0006\u0004\u0008Y\u0010WJ\u0017\u0010\\\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0008H\u0010\u00a2\u0006\u0004\u0008[\u0010WJ\u0017\u0010a\u001a\u00020\u00032\u0006\u0010^\u001a\u00020]H\u0010\u00a2\u0006\u0004\u0008_\u0010`J\u0017\u0010e\u001a\u00020\u00032\u0006\u0010b\u001a\u000201H\u0010\u00a2\u0006\u0004\u0008c\u0010dJ\u0017\u0010g\u001a\u00020\u00032\u0006\u0010b\u001a\u000201H\u0010\u00a2\u0006\u0004\u0008f\u0010dJ\u001f\u0010l\u001a\u00020\u00032\u0006\u0010b\u001a\u0002012\u0006\u0010i\u001a\u00020hH\u0010\u00a2\u0006\u0004\u0008j\u0010kJ\u0017\u0010n\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0008H\u0010\u00a2\u0006\u0004\u0008m\u0010WJ\u0019\u0010q\u001a\u0004\u0018\u00010h2\u0006\u0010b\u001a\u000201H\u0010\u00a2\u0006\u0004\u0008o\u0010pR$\u0010t\u001a\u00020r2\u0006\u0010s\u001a\u00020r8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008t\u0010u\u001a\u0004\u0008v\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008y\u0010zR\u0014\u0010{\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008{\u0010|R\u0018\u0010}\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008}\u0010~R\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001R\u001e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\u00080\u0082\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001R!\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u0001008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0085\u0001\u0010\u0084\u0001R\u001f\u0010\u0086\u0001\u001a\u0008\u0012\u0004\u0012\u00020\'0-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0086\u0001\u0010\u0087\u0001R\u001e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\u00080\u0082\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0088\u0001\u0010\u0084\u0001R\u001e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u00080\u0082\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0089\u0001\u0010\u0084\u0001R\u001e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u0002010\u0082\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008a\u0001\u0010\u0084\u0001R4\u0010\u008d\u0001\u001a\u001f\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\'0\u008c\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002010\u0082\u00010\u008b\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008d\u0001\u0010\u008e\u0001R$\u0010\u008f\u0001\u001a\u000f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020h0\u008b\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008f\u0001\u0010\u008e\u0001R\"\u0010\u0090\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0090\u0001\u0010\u0084\u0001R!\u0010\u0091\u0001\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010P8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0091\u0001\u0010\u0092\u0001R!\u0010\u0093\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001R\u001a\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0098\u0001\u0010\u0099\u0001R\u001b\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009c\u0001\u0010\u0099\u0001R\u001f\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u00030\u009e\u00010\u009d\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009f\u0001\u0010\u00a0\u0001R\u0018\u0010\u00a2\u0001\u001a\u00030\u00a1\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001R\u001f\u0010\u00a4\u0001\u001a\u00020A8\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001\u001a\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001R\u001c\u0010\u00a9\u0001\u001a\u00070\u00a8\u0001R\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001R\u001d\u0010\u00ad\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u0008008BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001R\u0017\u0010\u00b0\u0001\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00ae\u0001\u0010\u00af\u0001R\u0017\u0010\u00b2\u0001\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b1\u0001\u0010\u00af\u0001R\u0017\u0010\u00b4\u0001\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b3\u0001\u0010\u00af\u0001R\u0017\u0010\u00b6\u0001\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b5\u0001\u0010\u00af\u0001R\u0017\u0010\u00b8\u0001\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b7\u0001\u0010\u00af\u0001R\u0017\u0010\u00ba\u0001\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b9\u0001\u0010\u00af\u0001R\u0016\u0010B\u001a\u00020A8PX\u0090\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00bb\u0001\u0010\u00a7\u0001R\'\u0010\u00c1\u0001\u001a\n\u0012\u0005\u0012\u00030\u009e\u00010\u00bc\u00018FX\u0087\u0004\u00a2\u0006\u0010\u0012\u0006\u0008\u00bf\u0001\u0010\u00c0\u0001\u001a\u0006\u0008\u00bd\u0001\u0010\u00be\u0001R\u001c\u0010\u00c5\u0001\u001a\n\u0012\u0005\u0012\u00030\u009e\u00010\u00c2\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u00c3\u0001\u0010\u00c4\u0001R\u0014\u0010\u00c7\u0001\u001a\u00020\u00058F\u00a2\u0006\u0008\u001a\u0006\u0008\u00c6\u0001\u0010\u00af\u0001R\u0018\u0010\u00ca\u0001\u001a\u00030\u0095\u00018PX\u0090\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00c8\u0001\u0010\u00c9\u0001R\u0017\u0010\u00cc\u0001\u001a\u00020\u00058PX\u0090\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00cb\u0001\u0010\u00af\u0001R\u0017\u0010\u00ce\u0001\u001a\u00020\u00058PX\u0090\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00cd\u0001\u0010\u00af\u0001\u00a8\u0006\u00d6\u0001"
    }
    d2 = {
        "Landroidx/compose/runtime/Recomposer;",
        "Landroidx/compose/runtime/CompositionContext;",
        "Lkotlinx/coroutines/p;",
        "Lkotlin/r2;",
        "deriveStateLocked",
        "",
        "recordComposerModifications",
        "Lkotlin/Function1;",
        "Landroidx/compose/runtime/ControlledComposition;",
        "onEachInvalidComposition",
        "Lkotlinx/coroutines/l2;",
        "callingJob",
        "registerRunnerJob",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "e",
        "failedInitialComposition",
        "recoverable",
        "processCompositionError",
        "clearKnownCompositionsLocked",
        "composition",
        "removeKnownCompositionLocked",
        "addKnownCompositionLocked",
        "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;",
        "resetErrorState",
        "retryFailedCompositions",
        "Landroidx/compose/runtime/MonotonicFrameClock;",
        "parentFrameClock",
        "Landroidx/compose/runtime/ProduceFrameSignal;",
        "frameSignal",
        "runFrameLoop",
        "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "awaitWorkAvailable",
        "(Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "Lkotlin/Function3;",
        "Lkotlinx/coroutines/s0;",
        "Lkotlin/v0;",
        "name",
        "Lkotlin/coroutines/d;",
        "",
        "Lkotlin/u;",
        "block",
        "recompositionRunner",
        "(Lv3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "performInitialMovableContentInserts",
        "Landroidx/compose/runtime/collection/IdentityArraySet;",
        "modifiedValues",
        "performRecompose",
        "",
        "Landroidx/compose/runtime/MovableContentStateReference;",
        "references",
        "performInsertValues",
        "discardUnusedValues",
        "readObserverOf",
        "writeObserverOf",
        "T",
        "Lkotlin/Function0;",
        "composing",
        "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;Lv3/a;)Ljava/lang/Object;",
        "Landroidx/compose/runtime/snapshots/MutableSnapshot;",
        "snapshot",
        "applyAndCheck",
        "Landroidx/compose/runtime/RecomposerInfo;",
        "asRecomposerInfo",
        "runRecomposeAndApplyChanges",
        "Lkotlin/coroutines/g;",
        "recomposeCoroutineContext",
        "runRecomposeConcurrentlyAndApplyChanges",
        "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "cancel",
        "close",
        "join",
        "Landroidx/compose/runtime/Composable;",
        "content",
        "composeInitial$runtime_release",
        "(Landroidx/compose/runtime/ControlledComposition;Lv3/p;)V",
        "composeInitial",
        "awaitIdle",
        "pauseCompositionFrameClock",
        "resumeCompositionFrameClock",
        "",
        "Landroidx/compose/runtime/tooling/CompositionData;",
        "table",
        "recordInspectionTable$runtime_release",
        "(Ljava/util/Set;)V",
        "recordInspectionTable",
        "registerComposition$runtime_release",
        "(Landroidx/compose/runtime/ControlledComposition;)V",
        "registerComposition",
        "unregisterComposition$runtime_release",
        "unregisterComposition",
        "invalidate$runtime_release",
        "invalidate",
        "Landroidx/compose/runtime/RecomposeScopeImpl;",
        "scope",
        "invalidateScope$runtime_release",
        "(Landroidx/compose/runtime/RecomposeScopeImpl;)V",
        "invalidateScope",
        "reference",
        "insertMovableContent$runtime_release",
        "(Landroidx/compose/runtime/MovableContentStateReference;)V",
        "insertMovableContent",
        "deletedMovableContent$runtime_release",
        "deletedMovableContent",
        "Landroidx/compose/runtime/MovableContentState;",
        "data",
        "movableContentStateReleased$runtime_release",
        "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V",
        "movableContentStateReleased",
        "reportRemovedComposition$runtime_release",
        "reportRemovedComposition",
        "movableContentStateResolve$runtime_release",
        "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;",
        "movableContentStateResolve",
        "",
        "<set-?>",
        "changeCount",
        "J",
        "getChangeCount",
        "()J",
        "Landroidx/compose/runtime/BroadcastFrameClock;",
        "broadcastFrameClock",
        "Landroidx/compose/runtime/BroadcastFrameClock;",
        "stateLock",
        "Ljava/lang/Object;",
        "runnerJob",
        "Lkotlinx/coroutines/l2;",
        "",
        "closeCause",
        "Ljava/lang/Throwable;",
        "",
        "_knownCompositions",
        "Ljava/util/List;",
        "_knownCompositionsCache",
        "snapshotInvalidations",
        "Landroidx/compose/runtime/collection/IdentityArraySet;",
        "compositionInvalidations",
        "compositionsAwaitingApply",
        "compositionValuesAwaitingInsert",
        "",
        "Landroidx/compose/runtime/MovableContent;",
        "compositionValuesRemoved",
        "Ljava/util/Map;",
        "compositionValueStatesAvailable",
        "failedCompositions",
        "compositionsRemoved",
        "Ljava/util/Set;",
        "workContinuation",
        "Lkotlinx/coroutines/p;",
        "",
        "concurrentCompositionsOutstanding",
        "I",
        "isClosed",
        "Z",
        "errorState",
        "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;",
        "frameClockPaused",
        "Lkotlinx/coroutines/flow/e0;",
        "Landroidx/compose/runtime/Recomposer$State;",
        "_state",
        "Lkotlinx/coroutines/flow/e0;",
        "Lkotlinx/coroutines/b0;",
        "effectJob",
        "Lkotlinx/coroutines/b0;",
        "effectCoroutineContext",
        "Lkotlin/coroutines/g;",
        "getEffectCoroutineContext",
        "()Lkotlin/coroutines/g;",
        "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;",
        "recomposerInfo",
        "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;",
        "getKnownCompositions",
        "()Ljava/util/List;",
        "knownCompositions",
        "getHasBroadcastFrameClockAwaitersLocked",
        "()Z",
        "hasBroadcastFrameClockAwaitersLocked",
        "getHasBroadcastFrameClockAwaiters",
        "hasBroadcastFrameClockAwaiters",
        "getShouldKeepRecomposing",
        "shouldKeepRecomposing",
        "getHasSchedulingWork",
        "hasSchedulingWork",
        "getHasFrameWorkLocked",
        "hasFrameWorkLocked",
        "getHasConcurrentFrameWorkLocked",
        "hasConcurrentFrameWorkLocked",
        "getRecomposeCoroutineContext$runtime_release",
        "Lkotlinx/coroutines/flow/i;",
        "getState",
        "()Lkotlinx/coroutines/flow/i;",
        "getState$annotations",
        "()V",
        "state",
        "Lkotlinx/coroutines/flow/t0;",
        "getCurrentState",
        "()Lkotlinx/coroutines/flow/t0;",
        "currentState",
        "getHasPendingWork",
        "hasPendingWork",
        "getCompoundHashKey$runtime_release",
        "()I",
        "compoundHashKey",
        "getCollectingParameterInformation$runtime_release",
        "collectingParameterInformation",
        "getCollectingSourceInformation$runtime_release",
        "collectingSourceInformation",
        "<init>",
        "(Lkotlin/coroutines/g;)V",
        "Companion",
        "HotReloadable",
        "RecomposerErrorState",
        "RecomposerInfoImpl",
        "State",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1564:1\n1220#1,5:1613\n1226#1:1623\n1220#1,5:1636\n1226#1:1646\n1220#1,5:1667\n1226#1:1688\n82#2:1565\n82#2:1566\n82#2:1569\n82#2:1571\n82#2:1578\n82#2:1579\n82#2:1592\n82#2:1593\n82#2:1594\n82#2:1595\n82#2:1596\n82#2:1597\n82#2:1598\n82#2:1608\n82#2:1611\n82#2:1612\n82#2:1624\n82#2:1625\n82#2:1675\n82#2:1689\n82#2:1712\n82#2:1713\n82#2:1714\n82#2:1715\n82#2:1716\n82#2:1717\n82#2:1718\n82#2:1719\n82#2:1720\n82#2:1721\n82#2:1722\n82#2:1723\n1229#3,2:1567\n1#4:1570\n33#5,6:1572\n33#5,6:1580\n33#5,6:1586\n93#5,2:1626\n33#5,4:1628\n95#5,2:1632\n38#5:1634\n97#5:1635\n120#5,3:1647\n33#5,4:1650\n123#5,2:1654\n125#5,2:1663\n38#5:1665\n127#5:1666\n82#5,3:1676\n33#5,4:1679\n85#5,2:1683\n38#5:1685\n87#5:1686\n82#5,3:1690\n33#5,4:1693\n85#5,2:1697\n38#5:1699\n87#5:1700\n33#5,6:1701\n314#6,9:1599\n323#6,2:1609\n129#7,5:1618\n129#7,5:1641\n129#7,3:1672\n133#7:1687\n129#7,5:1707\n361#8,7:1656\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n1070#1:1613,5\n1070#1:1623\n1147#1:1636,5\n1147#1:1646\n1167#1:1667,5\n1167#1:1688\n292#1:1565\n342#1:1566\n436#1:1569\n440#1:1571\n461#1:1578\n466#1:1579\n492#1:1592\n705#1:1593\n743#1:1594\n774#1:1595\n786#1:1596\n803#1:1597\n939#1:1598\n951#1:1608\n1035#1:1611\n1051#1:1612\n1083#1:1624\n1114#1:1625\n1170#1:1675\n1183#1:1689\n1250#1:1712\n1287#1:1713\n1302#1:1714\n1331#1:1715\n1339#1:1716\n1348#1:1717\n1355#1:1718\n1362#1:1719\n1371#1:1720\n1377#1:1721\n1389#1:1722\n1120#1:1723\n343#1:1567,2\n446#1:1572,6\n479#1:1580,6\n484#1:1586,6\n1115#1:1626,2\n1115#1:1628,4\n1115#1:1632,2\n1115#1:1634\n1115#1:1635\n1164#1:1647,3\n1164#1:1650,4\n1164#1:1654,2\n1164#1:1663,2\n1164#1:1665\n1164#1:1666\n1171#1:1676,3\n1171#1:1679,4\n1171#1:1683,2\n1171#1:1685\n1171#1:1686\n1187#1:1690,3\n1187#1:1693,4\n1187#1:1697,2\n1187#1:1699\n1187#1:1700\n1194#1:1701,6\n950#1:1599,9\n950#1:1609,2\n1070#1:1618,5\n1147#1:1641,5\n1167#1:1672,3\n1167#1:1687\n1224#1:1707,5\n1164#1:1656,7\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/runtime/Recomposer$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final _hotReloadEnabled:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final _runningRecomposers:Lkotlinx/coroutines/flow/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/e0<",
            "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet<",
            "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final _knownCompositions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private _knownCompositionsCache:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private final _state:Lkotlinx/coroutines/flow/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/e0<",
            "Landroidx/compose/runtime/Recomposer$State;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final broadcastFrameClock:Landroidx/compose/runtime/BroadcastFrameClock;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private changeCount:J

.field private closeCause:Ljava/lang/Throwable;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final compositionInvalidations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final compositionValueStatesAvailable:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            "Landroidx/compose/runtime/MovableContentState;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final compositionValuesAwaitingInsert:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final compositionValuesRemoved:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/compose/runtime/MovableContent<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final compositionsAwaitingApply:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private compositionsRemoved:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private concurrentCompositionsOutstanding:I

.field private final effectCoroutineContext:Lkotlin/coroutines/g;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final effectJob:Lkotlinx/coroutines/b0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private failedCompositions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private frameClockPaused:Z

.field private isClosed:Z

.field private final recomposerInfo:Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private runnerJob:Lkotlinx/coroutines/l2;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final stateLock:Ljava/lang/Object;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private workContinuation:Lkotlinx/coroutines/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/p<",
            "-",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/runtime/Recomposer$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/runtime/Recomposer$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/runtime/Recomposer;->Companion:Landroidx/compose/runtime/Recomposer$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Landroidx/compose/runtime/Recomposer;->$stable:I

    .line 12
    .line 13
    invoke-static {}, Landroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt;->persistentSetOf()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lkotlinx/coroutines/flow/v0;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Landroidx/compose/runtime/Recomposer;->_runningRecomposers:Lkotlinx/coroutines/flow/e0;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    .line 25
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Landroidx/compose/runtime/Recomposer;->_hotReloadEnabled:Ljava/util/concurrent/atomic/AtomicReference;

    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public constructor <init>(Lkotlin/coroutines/g;)V
    .locals 3
    .param p1    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/CompositionContext;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/compose/runtime/BroadcastFrameClock;

    .line 5
    .line 6
    new-instance v1, Landroidx/compose/runtime/Recomposer$broadcastFrameClock$1;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Landroidx/compose/runtime/Recomposer$broadcastFrameClock$1;-><init>(Landroidx/compose/runtime/Recomposer;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Landroidx/compose/runtime/BroadcastFrameClock;-><init>(Lv3/a;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->broadcastFrameClock:Landroidx/compose/runtime/BroadcastFrameClock;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/Object;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer;->_knownCompositions:Ljava/util/List;

    .line 29
    .line 30
    new-instance v1, Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 31
    .line 32
    invoke-direct {v1}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 36
    .line 37
    new-instance v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    .line 43
    .line 44
    new-instance v1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    .line 50
    .line 51
    new-instance v1, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    .line 57
    .line 58
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesRemoved:Ljava/util/Map;

    .line 64
    .line 65
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 66
    .line 67
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionValueStatesAvailable:Ljava/util/Map;

    .line 71
    .line 72
    sget-object v1, Landroidx/compose/runtime/Recomposer$State;->Inactive:Landroidx/compose/runtime/Recomposer$State;

    .line 73
    .line 74
    invoke-static {v1}, Lkotlinx/coroutines/flow/v0;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e0;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/e0;

    .line 79
    .line 80
    sget-object v1, Lkotlinx/coroutines/l2;->U:Lkotlinx/coroutines/l2$b;

    .line 81
    .line 82
    invoke-interface {p1, v1}, Lkotlin/coroutines/g;->get(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Lkotlinx/coroutines/l2;

    .line 87
    .line 88
    invoke-static {v1}, Lkotlinx/coroutines/p2;->a(Lkotlinx/coroutines/l2;)Lkotlinx/coroutines/b0;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    new-instance v2, Landroidx/compose/runtime/Recomposer$effectJob$1$1;

    .line 93
    .line 94
    invoke-direct {v2, p0}, Landroidx/compose/runtime/Recomposer$effectJob$1$1;-><init>(Landroidx/compose/runtime/Recomposer;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v1, v2}, Lkotlinx/coroutines/l2;->t0(Lv3/l;)Lkotlinx/coroutines/n1;

    .line 98
    .line 99
    .line 100
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer;->effectJob:Lkotlinx/coroutines/b0;

    .line 101
    .line 102
    invoke-interface {p1, v0}, Lkotlin/coroutines/g;->plus(Lkotlin/coroutines/g;)Lkotlin/coroutines/g;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-interface {p1, v1}, Lkotlin/coroutines/g;->plus(Lkotlin/coroutines/g;)Lkotlin/coroutines/g;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->effectCoroutineContext:Lkotlin/coroutines/g;

    .line 111
    .line 112
    new-instance p1, Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;

    .line 113
    .line 114
    invoke-direct {p1, p0}, Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;-><init>(Landroidx/compose/runtime/Recomposer;)V

    .line 115
    .line 116
    .line 117
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->recomposerInfo:Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;

    .line 118
    .line 119
    return-void
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
.end method

.method public static final synthetic access$awaitWorkAvailable(Landroidx/compose/runtime/Recomposer;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/runtime/Recomposer;->awaitWorkAvailable(Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$deriveStateLocked(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/p;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$discardUnusedValues(Landroidx/compose/runtime/Recomposer;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->discardUnusedValues()V

    return-void
.end method

.method public static final synthetic access$getBroadcastFrameClock$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/BroadcastFrameClock;
    .locals 0

    iget-object p0, p0, Landroidx/compose/runtime/Recomposer;->broadcastFrameClock:Landroidx/compose/runtime/BroadcastFrameClock;

    return-object p0
.end method

.method public static final synthetic access$getCloseCause$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Throwable;
    .locals 0

    iget-object p0, p0, Landroidx/compose/runtime/Recomposer;->closeCause:Ljava/lang/Throwable;

    return-object p0
.end method

.method public static final synthetic access$getCompositionInvalidations$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getCompositionValuesAwaitingInsert$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getCompositionsAwaitingApply$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getConcurrentCompositionsOutstanding$p(Landroidx/compose/runtime/Recomposer;)I
    .locals 0

    iget p0, p0, Landroidx/compose/runtime/Recomposer;->concurrentCompositionsOutstanding:I

    return p0
.end method

.method public static final synthetic access$getErrorState$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/Recomposer$RecomposerErrorState;
    .locals 0

    iget-object p0, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    return-object p0
.end method

.method public static final synthetic access$getHasBroadcastFrameClockAwaiters(Landroidx/compose/runtime/Recomposer;)Z
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaiters()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getHasConcurrentFrameWorkLocked(Landroidx/compose/runtime/Recomposer;)Z
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasConcurrentFrameWorkLocked()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getHasSchedulingWork(Landroidx/compose/runtime/Recomposer;)Z
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasSchedulingWork()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getKnownCompositions(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getKnownCompositions()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getRecomposerInfo$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;
    .locals 0

    iget-object p0, p0, Landroidx/compose/runtime/Recomposer;->recomposerInfo:Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;

    return-object p0
.end method

.method public static final synthetic access$getRunnerJob$p(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/l2;
    .locals 0

    iget-object p0, p0, Landroidx/compose/runtime/Recomposer;->runnerJob:Lkotlinx/coroutines/l2;

    return-object p0
.end method

.method public static final synthetic access$getShouldKeepRecomposing(Landroidx/compose/runtime/Recomposer;)Z
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getShouldKeepRecomposing()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getSnapshotInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/IdentityArraySet;
    .locals 0

    iget-object p0, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    return-object p0
.end method

.method public static final synthetic access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic access$getWorkContinuation$p(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/p;
    .locals 0

    iget-object p0, p0, Landroidx/compose/runtime/Recomposer;->workContinuation:Lkotlinx/coroutines/p;

    return-object p0
.end method

.method public static final synthetic access$get_hotReloadEnabled$cp()Ljava/util/concurrent/atomic/AtomicReference;
    .locals 1

    sget-object v0, Landroidx/compose/runtime/Recomposer;->_hotReloadEnabled:Ljava/util/concurrent/atomic/AtomicReference;

    return-object v0
.end method

.method public static final synthetic access$get_runningRecomposers$cp()Lkotlinx/coroutines/flow/e0;
    .locals 1

    sget-object v0, Landroidx/compose/runtime/Recomposer;->_runningRecomposers:Lkotlinx/coroutines/flow/e0;

    return-object v0
.end method

.method public static final synthetic access$get_state$p(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/flow/e0;
    .locals 0

    iget-object p0, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/e0;

    return-object p0
.end method

.method public static final synthetic access$isClosed$p(Landroidx/compose/runtime/Recomposer;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/runtime/Recomposer;->isClosed:Z

    return p0
.end method

.method public static final synthetic access$performInsertValues(Landroidx/compose/runtime/Recomposer;Ljava/util/List;Landroidx/compose/runtime/collection/IdentityArraySet;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/Recomposer;->performInsertValues(Ljava/util/List;Landroidx/compose/runtime/collection/IdentityArraySet;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$performRecompose(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Landroidx/compose/runtime/ControlledComposition;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/Recomposer;->performRecompose(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Landroidx/compose/runtime/ControlledComposition;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$recompositionRunner(Landroidx/compose/runtime/Recomposer;Lv3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/Recomposer;->recompositionRunner(Lv3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$recordComposerModifications(Landroidx/compose/runtime/Recomposer;)Z
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->recordComposerModifications()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$registerRunnerJob(Landroidx/compose/runtime/Recomposer;Lkotlinx/coroutines/l2;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/runtime/Recomposer;->registerRunnerJob(Lkotlinx/coroutines/l2;)V

    return-void
.end method

.method public static final synthetic access$resetErrorState(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/Recomposer$RecomposerErrorState;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->resetErrorState()Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$retryFailedCompositions(Landroidx/compose/runtime/Recomposer;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->retryFailedCompositions()V

    return-void
.end method

.method public static final synthetic access$runFrameLoop(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/runtime/Recomposer;->runFrameLoop(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setChangeCount$p(Landroidx/compose/runtime/Recomposer;J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/runtime/Recomposer;->changeCount:J

    return-void
.end method

.method public static final synthetic access$setCloseCause$p(Landroidx/compose/runtime/Recomposer;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->closeCause:Ljava/lang/Throwable;

    return-void
.end method

.method public static final synthetic access$setCompositionsRemoved$p(Landroidx/compose/runtime/Recomposer;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->compositionsRemoved:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic access$setConcurrentCompositionsOutstanding$p(Landroidx/compose/runtime/Recomposer;I)V
    .locals 0

    iput p1, p0, Landroidx/compose/runtime/Recomposer;->concurrentCompositionsOutstanding:I

    return-void
.end method

.method public static final synthetic access$setRunnerJob$p(Landroidx/compose/runtime/Recomposer;Lkotlinx/coroutines/l2;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->runnerJob:Lkotlinx/coroutines/l2;

    return-void
.end method

.method public static final synthetic access$setSnapshotInvalidations$p(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/collection/IdentityArraySet;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    return-void
.end method

.method public static final synthetic access$setWorkContinuation$p(Landroidx/compose/runtime/Recomposer;Lkotlinx/coroutines/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->workContinuation:Lkotlinx/coroutines/p;

    return-void
.end method

.method private final addKnownCompositionLocked(Landroidx/compose/runtime/ControlledComposition;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->_knownCompositions:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Collection;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->_knownCompositionsCache:Ljava/util/List;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method private final applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->apply()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Failure;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->dispose()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v1, "Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition."

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->dispose()V

    .line 27
    .line 28
    .line 29
    throw v0
    .line 30
    .line 31
    .line 32
.end method

.method private final awaitWorkAvailable(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasSchedulingWork()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    new-instance v0, Lkotlinx/coroutines/q;

    .line 8
    .line 9
    invoke-static {p1}, Lkotlin/coroutines/intrinsics/b;->e(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/q;-><init>(Lkotlin/coroutines/d;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lkotlinx/coroutines/q;->B()V

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Landroidx/compose/runtime/Recomposer;->access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    monitor-enter v1

    .line 25
    :try_start_0
    invoke-static {p0}, Landroidx/compose/runtime/Recomposer;->access$getHasSchedulingWork(Landroidx/compose/runtime/Recomposer;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    move-object v2, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {p0, v0}, Landroidx/compose/runtime/Recomposer;->access$setWorkContinuation$p(Landroidx/compose/runtime/Recomposer;Lkotlinx/coroutines/p;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    :goto_0
    monitor-exit v1

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    sget-object v1, Lkotlin/d1;->Companion:Lkotlin/d1$a;

    .line 41
    .line 42
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 43
    .line 44
    invoke-static {v1}, Lkotlin/d1;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v2, v1}, Lkotlin/coroutines/d;->resumeWith(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {v0}, Lkotlinx/coroutines/q;->E()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-ne v0, v1, :cond_2

    .line 60
    .line 61
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lkotlin/coroutines/d;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne v0, p1, :cond_3

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_3
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 72
    .line 73
    return-object p1

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    monitor-exit v1

    .line 76
    throw p1

    .line 77
    :cond_4
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 78
    .line 79
    return-object p1
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private final clearKnownCompositionsLocked()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->_knownCompositions:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->_knownCompositionsCache:Ljava/util/List;

    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method private final composing(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;Lv3/a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/ControlledComposition;",
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "Ljava/lang/Object;",
            ">;",
            "Lv3/a<",
            "+TT;>;)TT;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/compose/runtime/Recomposer;->readObserverOf(Landroidx/compose/runtime/ControlledComposition;)Lv3/l;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/Recomposer;->writeObserverOf(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Lv3/l;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0, v1, p1}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->takeMutableSnapshot(Lv3/l;Lv3/l;)Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 p2, 0x1

    .line 16
    :try_start_0
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 17
    .line 18
    .line 19
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    :try_start_1
    invoke-interface {p3}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    :try_start_2
    invoke-static {p2}, Lkotlin/jvm/internal/i0;->d(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, Lkotlin/jvm/internal/i0;->c(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 31
    .line 32
    .line 33
    invoke-static {p2}, Lkotlin/jvm/internal/i0;->d(I)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, p1}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p2}, Lkotlin/jvm/internal/i0;->c(I)V

    .line 40
    .line 41
    .line 42
    return-object p3

    .line 43
    :catchall_0
    move-exception p3

    .line 44
    :try_start_3
    invoke-static {p2}, Lkotlin/jvm/internal/i0;->d(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p2}, Lkotlin/jvm/internal/i0;->c(I)V

    .line 51
    .line 52
    .line 53
    throw p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 54
    :catchall_1
    move-exception p3

    .line 55
    invoke-static {p2}, Lkotlin/jvm/internal/i0;->d(I)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, p1}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p2}, Lkotlin/jvm/internal/i0;->c(I)V

    .line 62
    .line 63
    .line 64
    throw p3
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method private final deriveStateLocked()Lkotlinx/coroutines/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/p<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/e0;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/flow/e0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/runtime/Recomposer$State;

    .line 8
    .line 9
    sget-object v1, Landroidx/compose/runtime/Recomposer$State;->ShuttingDown:Landroidx/compose/runtime/Recomposer$State;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-gtz v0, :cond_1

    .line 18
    .line 19
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->clearKnownCompositionsLocked()V

    .line 20
    .line 21
    .line 22
    new-instance v0, Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 23
    .line 24
    invoke-direct {v0}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    .line 45
    .line 46
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->workContinuation:Lkotlinx/coroutines/p;

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/p$a;->a(Lkotlinx/coroutines/p;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_0
    iput-object v2, p0, Landroidx/compose/runtime/Recomposer;->workContinuation:Lkotlinx/coroutines/p;

    .line 54
    .line 55
    iput-object v2, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    .line 56
    .line 57
    return-object v2

    .line 58
    :cond_1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    sget-object v0, Landroidx/compose/runtime/Recomposer$State;->Inactive:Landroidx/compose/runtime/Recomposer$State;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->runnerJob:Lkotlinx/coroutines/l2;

    .line 66
    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    new-instance v0, Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 70
    .line 71
    invoke-direct {v0}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 75
    .line 76
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 79
    .line 80
    .line 81
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaitersLocked()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    sget-object v0, Landroidx/compose/runtime/Recomposer$State;->InactivePendingWork:Landroidx/compose/runtime/Recomposer$State;

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    sget-object v0, Landroidx/compose/runtime/Recomposer$State;->Inactive:Landroidx/compose/runtime/Recomposer$State;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    .line 94
    .line 95
    check-cast v0, Ljava/util/Collection;

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    xor-int/2addr v0, v1

    .line 102
    if-nez v0, :cond_6

    .line 103
    .line 104
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 105
    .line 106
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/IdentityArraySet;->isNotEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_6

    .line 111
    .line 112
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    .line 113
    .line 114
    check-cast v0, Ljava/util/Collection;

    .line 115
    .line 116
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    xor-int/2addr v0, v1

    .line 121
    if-nez v0, :cond_6

    .line 122
    .line 123
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    .line 124
    .line 125
    check-cast v0, Ljava/util/Collection;

    .line 126
    .line 127
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    xor-int/2addr v0, v1

    .line 132
    if-nez v0, :cond_6

    .line 133
    .line 134
    iget v0, p0, Landroidx/compose/runtime/Recomposer;->concurrentCompositionsOutstanding:I

    .line 135
    .line 136
    if-gtz v0, :cond_6

    .line 137
    .line 138
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaitersLocked()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_5

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_5
    sget-object v0, Landroidx/compose/runtime/Recomposer$State;->Idle:Landroidx/compose/runtime/Recomposer$State;

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_6
    :goto_0
    sget-object v0, Landroidx/compose/runtime/Recomposer$State;->PendingWork:Landroidx/compose/runtime/Recomposer$State;

    .line 149
    .line 150
    :goto_1
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/e0;

    .line 151
    .line 152
    invoke-interface {v1, v0}, Lkotlinx/coroutines/flow/e0;->setValue(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    sget-object v1, Landroidx/compose/runtime/Recomposer$State;->PendingWork:Landroidx/compose/runtime/Recomposer$State;

    .line 156
    .line 157
    if-ne v0, v1, :cond_7

    .line 158
    .line 159
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->workContinuation:Lkotlinx/coroutines/p;

    .line 160
    .line 161
    iput-object v2, p0, Landroidx/compose/runtime/Recomposer;->workContinuation:Lkotlinx/coroutines/p;

    .line 162
    .line 163
    move-object v2, v0

    .line 164
    :cond_7
    return-object v2
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
.end method

.method private final discardUnusedValues()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesRemoved:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    xor-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesRemoved:Ljava/util/Map;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/lang/Iterable;

    .line 22
    .line 23
    invoke-static {v1}, Lkotlin/collections/u;->a0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesRemoved:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 30
    .line 31
    .line 32
    new-instance v3, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    move v5, v2

    .line 46
    :goto_0
    if-ge v5, v4, :cond_0

    .line 47
    .line 48
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    check-cast v6, Landroidx/compose/runtime/MovableContentStateReference;

    .line 53
    .line 54
    iget-object v7, p0, Landroidx/compose/runtime/Recomposer;->compositionValueStatesAvailable:Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-static {v6, v7}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    add-int/lit8 v5, v5, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionValueStatesAvailable:Ljava/util/Map;

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    :goto_1
    monitor-exit v0

    .line 81
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    :goto_2
    if-ge v2, v0, :cond_3

    .line 86
    .line 87
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Lkotlin/u0;

    .line 92
    .line 93
    invoke-virtual {v1}, Lkotlin/u0;->component1()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, Landroidx/compose/runtime/MovableContentStateReference;

    .line 98
    .line 99
    invoke-virtual {v1}, Lkotlin/u0;->component2()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Landroidx/compose/runtime/MovableContentState;

    .line 104
    .line 105
    if-eqz v1, :cond_2

    .line 106
    .line 107
    invoke-virtual {v4}, Landroidx/compose/runtime/MovableContentStateReference;->getComposition$runtime_release()Landroidx/compose/runtime/ControlledComposition;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-interface {v4, v1}, Landroidx/compose/runtime/ControlledComposition;->disposeUnusedMovableContent(Landroidx/compose/runtime/MovableContentState;)V

    .line 112
    .line 113
    .line 114
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    return-void

    .line 118
    :catchall_0
    move-exception v1

    .line 119
    monitor-exit v0

    .line 120
    throw v1
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
.end method

.method private final getHasBroadcastFrameClockAwaiters()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaitersLocked()Z

    .line 5
    .line 6
    .line 7
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit v0

    .line 9
    return v1

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    monitor-exit v0

    .line 12
    throw v1
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method private final getHasBroadcastFrameClockAwaitersLocked()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/runtime/Recomposer;->frameClockPaused:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->broadcastFrameClock:Landroidx/compose/runtime/BroadcastFrameClock;

    invoke-virtual {v0}, Landroidx/compose/runtime/BroadcastFrameClock;->getHasAwaiters()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final getHasConcurrentFrameWorkLocked()Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-nez v0, :cond_1

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaitersLocked()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method private final getHasFrameWorkLocked()Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-nez v0, :cond_1

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaitersLocked()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method private final getHasSchedulingWork()Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/IdentityArraySet;->isNotEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    .line 14
    .line 15
    check-cast v1, Ljava/util/Collection;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    xor-int/2addr v1, v2

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaitersLocked()Z

    .line 25
    .line 26
    .line 27
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v2, 0x0

    .line 32
    :cond_1
    :goto_0
    monitor-exit v0

    .line 33
    return v2

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    monitor-exit v0

    .line 36
    throw v1
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method private final getKnownCompositions()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->_knownCompositionsCache:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->_knownCompositions:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    check-cast v0, Ljava/util/Collection;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 23
    .line 24
    .line 25
    move-object v0, v1

    .line 26
    :goto_0
    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->_knownCompositionsCache:Ljava/util/List;

    .line 27
    .line 28
    :cond_1
    return-object v0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method private final getShouldKeepRecomposing()Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Landroidx/compose/runtime/Recomposer;->isClosed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    xor-int/2addr v1, v2

    .line 8
    monitor-exit v0

    .line 9
    if-nez v1, :cond_3

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->effectJob:Lkotlinx/coroutines/b0;

    .line 12
    .line 13
    invoke-interface {v0}, Lkotlinx/coroutines/l2;->o()Lkotlin/sequences/m;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Lkotlin/sequences/m;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v3, 0x0

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lkotlinx/coroutines/l2;

    .line 33
    .line 34
    invoke-interface {v1}, Lkotlinx/coroutines/l2;->isActive()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    move v0, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move v0, v3

    .line 43
    :goto_0
    if-eqz v0, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move v2, v3

    .line 47
    :cond_3
    :goto_1
    return v2

    .line 48
    :catchall_0
    move-exception v1

    .line 49
    monitor-exit v0

    .line 50
    throw v1
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public static synthetic getState$annotations()V
    .locals 0
    .annotation runtime Lkotlin/k;
        message = "Replaced by currentState as a StateFlow"
        replaceWith = .subannotation Lkotlin/b1;
            expression = "currentState"
            imports = {}
        .end subannotation
    .end annotation

    return-void
.end method

.method private final performInitialMovableContentInserts(Landroidx/compose/runtime/ControlledComposition;)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x0

    .line 11
    move v4, v3

    .line 12
    :goto_0
    const/4 v5, 0x1

    .line 13
    if-ge v4, v2, :cond_1

    .line 14
    .line 15
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    check-cast v6, Landroidx/compose/runtime/MovableContentStateReference;

    .line 20
    .line 21
    invoke-virtual {v6}, Landroidx/compose/runtime/MovableContentStateReference;->getComposition$runtime_release()Landroidx/compose/runtime/ControlledComposition;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-static {v6, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    move v3, v5

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    :goto_1
    if-nez v3, :cond_2

    .line 37
    .line 38
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :cond_2
    :try_start_1
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    monitor-exit v0

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, p0, p1}, Landroidx/compose/runtime/Recomposer;->performInitialMovableContentInserts$fillToInsert(Ljava/util/List;Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/ControlledComposition;)V

    .line 49
    .line 50
    .line 51
    :goto_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    xor-int/2addr v1, v5

    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-direct {p0, v0, v1}, Landroidx/compose/runtime/Recomposer;->performInsertValues(Ljava/util/List;Landroidx/compose/runtime/collection/IdentityArraySet;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    invoke-static {v0, p0, p1}, Landroidx/compose/runtime/Recomposer;->performInitialMovableContentInserts$fillToInsert(Ljava/util/List;Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/ControlledComposition;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    return-void

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    monitor-exit v0

    .line 69
    throw p1
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private static final performInitialMovableContentInserts$fillToInsert(Ljava/util/List;Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/ControlledComposition;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;",
            "Landroidx/compose/runtime/Recomposer;",
            "Landroidx/compose/runtime/ControlledComposition;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object p1, p1, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroidx/compose/runtime/MovableContentStateReference;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroidx/compose/runtime/MovableContentStateReference;->getComposition$runtime_release()Landroidx/compose/runtime/ControlledComposition;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2, p2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    sget-object p0, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    monitor-exit v0

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    monitor-exit v0

    .line 48
    throw p0
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method private final performInsertValues(Ljava/util/List;Landroidx/compose/runtime/collection/IdentityArraySet;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;",
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    move-object v5, v4

    .line 23
    check-cast v5, Landroidx/compose/runtime/MovableContentStateReference;

    .line 24
    .line 25
    invoke-virtual {v5}, Landroidx/compose/runtime/MovableContentStateReference;->getComposition$runtime_release()Landroidx/compose/runtime/ControlledComposition;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    if-nez v6, :cond_0

    .line 34
    .line 35
    new-instance v6, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_0
    check-cast v6, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/util/Map$Entry;

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Landroidx/compose/runtime/ControlledComposition;

    .line 76
    .line 77
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v3}, Landroidx/compose/runtime/ControlledComposition;->isComposing()Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    xor-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->runtimeCheck(Z)V

    .line 90
    .line 91
    .line 92
    sget-object v4, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 93
    .line 94
    invoke-direct {p0, v3}, Landroidx/compose/runtime/Recomposer;->readObserverOf(Landroidx/compose/runtime/ControlledComposition;)Lv3/l;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-direct {p0, v3, p2}, Landroidx/compose/runtime/Recomposer;->writeObserverOf(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Lv3/l;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v4, v5, v6}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->takeMutableSnapshot(Lv3/l;Lv3/l;)Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    :try_start_0
    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 107
    .line 108
    .line 109
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 110
    :try_start_1
    iget-object v6, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 111
    .line 112
    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 113
    :try_start_2
    new-instance v7, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    move v9, v2

    .line 127
    :goto_2
    if-ge v9, v8, :cond_2

    .line 128
    .line 129
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    check-cast v10, Landroidx/compose/runtime/MovableContentStateReference;

    .line 134
    .line 135
    iget-object v11, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesRemoved:Ljava/util/Map;

    .line 136
    .line 137
    invoke-virtual {v10}, Landroidx/compose/runtime/MovableContentStateReference;->getContent$runtime_release()Landroidx/compose/runtime/MovableContent;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    invoke-static {v11, v12}, Landroidx/compose/runtime/RecomposerKt;->removeLastMultiValue(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    invoke-static {v10, v11}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    invoke-interface {v7, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 150
    .line 151
    .line 152
    add-int/lit8 v9, v9, 0x1

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_2
    :try_start_3
    monitor-exit v6

    .line 156
    invoke-interface {v3, v7}, Landroidx/compose/runtime/ControlledComposition;->insertMovableContent(Ljava/util/List;)V

    .line 157
    .line 158
    .line 159
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 160
    .line 161
    :try_start_4
    invoke-virtual {v4, v5}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 162
    .line 163
    .line 164
    invoke-direct {p0, v4}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :catchall_0
    move-exception p1

    .line 169
    :try_start_5
    monitor-exit v6

    .line 170
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 171
    :catchall_1
    move-exception p1

    .line 172
    :try_start_6
    invoke-virtual {v4, v5}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 173
    .line 174
    .line 175
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 176
    :catchall_2
    move-exception p1

    .line 177
    invoke-direct {p0, v4}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V

    .line 178
    .line 179
    .line 180
    throw p1

    .line 181
    :cond_3
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    check-cast p1, Ljava/lang/Iterable;

    .line 186
    .line 187
    invoke-static {p1}, Lkotlin/collections/u;->S5(Ljava/lang/Iterable;)Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    return-object p1
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
.end method

.method private final performRecompose(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Landroidx/compose/runtime/ControlledComposition;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/ControlledComposition;",
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "Ljava/lang/Object;",
            ">;)",
            "Landroidx/compose/runtime/ControlledComposition;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Landroidx/compose/runtime/ControlledComposition;->isComposing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    invoke-interface {p1}, Landroidx/compose/runtime/Composition;->isDisposed()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_5

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->compositionsRemoved:Ljava/util/Set;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-ne v0, v2, :cond_0

    .line 25
    .line 26
    move v0, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v0, v3

    .line 29
    :goto_0
    if-eqz v0, :cond_1

    .line 30
    .line 31
    goto :goto_4

    .line 32
    :cond_1
    sget-object v0, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 33
    .line 34
    invoke-direct {p0, p1}, Landroidx/compose/runtime/Recomposer;->readObserverOf(Landroidx/compose/runtime/ControlledComposition;)Lv3/l;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/Recomposer;->writeObserverOf(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Lv3/l;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v0, v4, v5}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->takeMutableSnapshot(Lv3/l;Lv3/l;)Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 47
    .line 48
    .line 49
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    :try_start_1
    invoke-virtual {p2}, Landroidx/compose/runtime/collection/IdentityArraySet;->isNotEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-ne v5, v2, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    goto :goto_3

    .line 61
    :cond_2
    move v2, v3

    .line 62
    :goto_1
    if-eqz v2, :cond_3

    .line 63
    .line 64
    new-instance v2, Landroidx/compose/runtime/Recomposer$performRecompose$1$1;

    .line 65
    .line 66
    invoke-direct {v2, p2, p1}, Landroidx/compose/runtime/Recomposer$performRecompose$1$1;-><init>(Landroidx/compose/runtime/collection/IdentityArraySet;Landroidx/compose/runtime/ControlledComposition;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, v2}, Landroidx/compose/runtime/ControlledComposition;->prepareCompose(Lv3/a;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-interface {p1}, Landroidx/compose/runtime/ControlledComposition;->recompose()Z

    .line 73
    .line 74
    .line 75
    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    :try_start_2
    invoke-virtual {v0, v4}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 77
    .line 78
    .line 79
    invoke-direct {p0, v0}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V

    .line 80
    .line 81
    .line 82
    if-eqz p2, :cond_4

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    move-object p1, v1

    .line 86
    :goto_2
    return-object p1

    .line 87
    :goto_3
    :try_start_3
    invoke-virtual {v0, v4}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 88
    .line 89
    .line 90
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 91
    :catchall_1
    move-exception p1

    .line 92
    invoke-direct {p0, v0}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_5
    :goto_4
    return-object v1
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
.end method

.method private final processCompositionError(Ljava/lang/Exception;Landroidx/compose/runtime/ControlledComposition;Z)V
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/runtime/Recomposer;->_hotReloadEnabled:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    instance-of v0, p1, Landroidx/compose/runtime/ComposeRuntimeError;

    .line 16
    .line 17
    if-nez v0, :cond_3

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    const-string v1, "Error was captured in composition while live edit was enabled."

    .line 23
    .line 24
    invoke-static {v1, p1}, Landroidx/compose/runtime/ActualAndroid_androidKt;->logError(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 35
    .line 36
    .line 37
    new-instance v1, Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 38
    .line 39
    invoke-direct {v1}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 43
    .line 44
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesRemoved:Ljava/util/Map;

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionValueStatesAvailable:Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 57
    .line 58
    .line 59
    new-instance v1, Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    .line 60
    .line 61
    invoke-direct {v1, p3, p1}, Landroidx/compose/runtime/Recomposer$RecomposerErrorState;-><init>(ZLjava/lang/Exception;)V

    .line 62
    .line 63
    .line 64
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    .line 65
    .line 66
    if-eqz p2, :cond_2

    .line 67
    .line 68
    iget-object p1, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    .line 69
    .line 70
    if-nez p1, :cond_0

    .line 71
    .line 72
    new-instance p1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    .line 78
    .line 79
    :cond_0
    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    if-nez p3, :cond_1

    .line 84
    .line 85
    check-cast p1, Ljava/util/Collection;

    .line 86
    .line 87
    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_1
    invoke-direct {p0, p2}, Landroidx/compose/runtime/Recomposer;->removeKnownCompositionLocked(Landroidx/compose/runtime/ControlledComposition;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    .line 96
    monitor-exit v0

    .line 97
    return-void

    .line 98
    :catchall_0
    move-exception p1

    .line 99
    monitor-exit v0

    .line 100
    throw p1

    .line 101
    :cond_3
    iget-object p2, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 102
    .line 103
    monitor-enter p2

    .line 104
    :try_start_1
    iget-object p3, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    .line 105
    .line 106
    if-nez p3, :cond_4

    .line 107
    .line 108
    new-instance p3, Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    invoke-direct {p3, v0, p1}, Landroidx/compose/runtime/Recomposer$RecomposerErrorState;-><init>(ZLjava/lang/Exception;)V

    .line 112
    .line 113
    .line 114
    iput-object p3, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    .line 115
    .line 116
    sget-object p3, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 117
    .line 118
    monitor-exit p2

    .line 119
    throw p1

    .line 120
    :cond_4
    :try_start_2
    invoke-virtual {p3}, Landroidx/compose/runtime/Recomposer$RecomposerErrorState;->getCause()Ljava/lang/Exception;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 125
    :catchall_1
    move-exception p1

    .line 126
    monitor-exit p2

    .line 127
    throw p1
    .line 128
.end method

.method static synthetic processCompositionError$default(Landroidx/compose/runtime/Recomposer;Ljava/lang/Exception;Landroidx/compose/runtime/ControlledComposition;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/runtime/Recomposer;->processCompositionError(Ljava/lang/Exception;Landroidx/compose/runtime/ControlledComposition;Z)V

    return-void
.end method

.method private final readObserverOf(Landroidx/compose/runtime/ControlledComposition;)Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/ControlledComposition;",
            ")",
            "Lv3/l<",
            "Ljava/lang/Object;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/compose/runtime/Recomposer$readObserverOf$1;

    invoke-direct {v0, p1}, Landroidx/compose/runtime/Recomposer$readObserverOf$1;-><init>(Landroidx/compose/runtime/ControlledComposition;)V

    return-object v0
.end method

.method private final recompositionRunner(Lv3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/q<",
            "-",
            "Lkotlinx/coroutines/s0;",
            "-",
            "Landroidx/compose/runtime/MonotonicFrameClock;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lkotlin/coroutines/d;->getContext()Lkotlin/coroutines/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/compose/runtime/MonotonicFrameClockKt;->getMonotonicFrameClock(Lkotlin/coroutines/g;)Landroidx/compose/runtime/MonotonicFrameClock;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->broadcastFrameClock:Landroidx/compose/runtime/BroadcastFrameClock;

    .line 10
    .line 11
    new-instance v2, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v2, p0, p1, v0, v3}, Landroidx/compose/runtime/Recomposer$recompositionRunner$2;-><init>(Landroidx/compose/runtime/Recomposer;Lv3/q;Landroidx/compose/runtime/MonotonicFrameClock;Lkotlin/coroutines/d;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2, p2}, Lkotlinx/coroutines/i;->h(Lkotlin/coroutines/g;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-ne p1, p2, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 29
    .line 30
    return-object p1
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method private final recordComposerModifications(Lv3/l;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/runtime/ControlledComposition;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-static {p0}, Landroidx/compose/runtime/Recomposer;->access$getSnapshotInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/IdentityArraySet;

    move-result-object v0

    .line 32
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/IdentityArraySet;->isNotEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 33
    invoke-static {p0}, Landroidx/compose/runtime/Recomposer;->access$getKnownCompositions(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;

    move-result-object v1

    .line 34
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_0

    .line 35
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 36
    check-cast v5, Landroidx/compose/runtime/ControlledComposition;

    .line 37
    invoke-interface {v5, v0}, Landroidx/compose/runtime/ControlledComposition;->recordModificationsOf(Ljava/util/Set;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 38
    :cond_0
    new-instance v0, Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-direct {v0}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    invoke-static {p0, v0}, Landroidx/compose/runtime/Recomposer;->access$setSnapshotInvalidations$p(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/collection/IdentityArraySet;)V

    .line 39
    :cond_1
    invoke-static {p0}, Landroidx/compose/runtime/Recomposer;->access$getCompositionInvalidations$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;

    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    if-ge v2, v1, :cond_2

    .line 41
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 42
    invoke-interface {p1, v3}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 43
    :cond_2
    invoke-static {p0}, Landroidx/compose/runtime/Recomposer;->access$getCompositionInvalidations$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 44
    invoke-static {p0}, Landroidx/compose/runtime/Recomposer;->access$deriveStateLocked(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/p;

    move-result-object p1

    if-nez p1, :cond_3

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "called outside of runRecomposeAndApplyChanges"

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final recordComposerModifications()Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-virtual {v1}, Landroidx/compose/runtime/collection/IdentityArraySet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasFrameWorkLocked()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    monitor-exit v0

    return v1

    .line 4
    :cond_0
    :try_start_1
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    new-instance v2, Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-direct {v2}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    iput-object v2, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 5
    monitor-exit v0

    .line 6
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 7
    monitor-enter v0

    .line 8
    :try_start_2
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getKnownCompositions()Ljava/util/List;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 9
    monitor-exit v0

    .line 10
    :try_start_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    .line 11
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 12
    check-cast v4, Landroidx/compose/runtime/ControlledComposition;

    .line 13
    invoke-interface {v4, v1}, Landroidx/compose/runtime/ControlledComposition;->recordModificationsOf(Ljava/util/Set;)V

    .line 14
    iget-object v4, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/e0;

    invoke-interface {v4}, Lkotlinx/coroutines/flow/e0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/runtime/Recomposer$State;

    sget-object v5, Landroidx/compose/runtime/Recomposer$State;->ShuttingDown:Landroidx/compose/runtime/Recomposer$State;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-lez v4, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 15
    :cond_1
    new-instance v0, Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-direct {v0}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    iput-object v0, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 16
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 17
    monitor-enter v0

    .line 18
    :try_start_4
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/p;

    move-result-object v1

    if-nez v1, :cond_2

    .line 19
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasFrameWorkLocked()Z

    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 20
    monitor-exit v0

    return v1

    .line 21
    :cond_2
    :try_start_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "called outside of runRecomposeAndApplyChanges"

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception v1

    .line 23
    monitor-exit v0

    throw v1

    :catchall_1
    move-exception v0

    .line 24
    iget-object v2, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 25
    monitor-enter v2

    .line 26
    :try_start_6
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    invoke-virtual {v3, v1}, Landroidx/compose/runtime/collection/IdentityArraySet;->addAll(Ljava/util/Collection;)V

    .line 27
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 28
    monitor-exit v2

    throw v0

    :catchall_2
    move-exception v0

    monitor-exit v2

    throw v0

    :catchall_3
    move-exception v1

    .line 29
    monitor-exit v0

    throw v1

    :catchall_4
    move-exception v1

    .line 30
    monitor-exit v0

    throw v1
.end method

.method private final registerRunnerJob(Lkotlinx/coroutines/l2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->closeCause:Ljava/lang/Throwable;

    .line 5
    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/e0;

    .line 9
    .line 10
    invoke-interface {v1}, Lkotlinx/coroutines/flow/e0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Landroidx/compose/runtime/Recomposer$State;

    .line 15
    .line 16
    sget-object v2, Landroidx/compose/runtime/Recomposer$State;->ShuttingDown:Landroidx/compose/runtime/Recomposer$State;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-lez v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->runnerJob:Lkotlinx/coroutines/l2;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->runnerJob:Lkotlinx/coroutines/l2;

    .line 29
    .line 30
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    monitor-exit v0

    .line 34
    return-void

    .line 35
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string v1, "Recomposer already running"

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v1, "Recomposer shut down"

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    monitor-exit v0

    .line 62
    throw p1
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private final removeKnownCompositionLocked(Landroidx/compose/runtime/ControlledComposition;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->_knownCompositions:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Collection;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Landroidx/compose/runtime/Recomposer;->_knownCompositionsCache:Ljava/util/List;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method private final resetErrorState()Landroidx/compose/runtime/Recomposer$RecomposerErrorState;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput-object v2, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;

    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    :cond_0
    monitor-exit v0

    .line 15
    return-object v1

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    monitor-exit v0

    .line 18
    throw v1
    .line 19
.end method

.method private final retryFailedCompositions()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-object v2, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_1
    move-object v0, v1

    .line 14
    check-cast v0, Ljava/util/Collection;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    xor-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/collections/u;->L0(Ljava/util/List;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroidx/compose/runtime/ControlledComposition;

    .line 29
    .line 30
    instance-of v2, v0, Landroidx/compose/runtime/CompositionImpl;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-interface {v0}, Landroidx/compose/runtime/ControlledComposition;->invalidateAll()V

    .line 35
    .line 36
    .line 37
    move-object v2, v0

    .line 38
    check-cast v2, Landroidx/compose/runtime/CompositionImpl;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroidx/compose/runtime/CompositionImpl;->getComposable()Lv3/p;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composition;->setContent(Lv3/p;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->errorState:Landroidx/compose/runtime/Recomposer$RecomposerErrorState;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    :cond_1
    move-object v0, v1

    .line 52
    check-cast v0, Ljava/util/Collection;

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    xor-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 63
    .line 64
    monitor-enter v0

    .line 65
    :try_start_2
    iget-object v2, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    .line 66
    .line 67
    if-eqz v2, :cond_2

    .line 68
    .line 69
    check-cast v1, Ljava/util/Collection;

    .line 70
    .line 71
    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 72
    .line 73
    .line 74
    move-object v1, v2

    .line 75
    :cond_2
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    .line 76
    .line 77
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    .line 79
    monitor-exit v0

    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception v1

    .line 82
    monitor-exit v0

    .line 83
    throw v1

    .line 84
    :cond_3
    :goto_0
    return-void

    .line 85
    :catchall_1
    move-exception v0

    .line 86
    move-object v2, v1

    .line 87
    check-cast v2, Ljava/util/Collection;

    .line 88
    .line 89
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    xor-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    iget-object v2, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 98
    .line 99
    monitor-enter v2

    .line 100
    :try_start_3
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    .line 101
    .line 102
    if-eqz v3, :cond_4

    .line 103
    .line 104
    check-cast v1, Ljava/util/Collection;

    .line 105
    .line 106
    invoke-interface {v3, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 107
    .line 108
    .line 109
    move-object v1, v3

    .line 110
    :cond_4
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer;->failedCompositions:Ljava/util/List;

    .line 111
    .line 112
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 113
    .line 114
    monitor-exit v2

    .line 115
    goto :goto_1

    .line 116
    :catchall_2
    move-exception v0

    .line 117
    monitor-exit v2

    .line 118
    throw v0

    .line 119
    :cond_5
    :goto_1
    throw v0

    .line 120
    :catchall_3
    move-exception v1

    .line 121
    monitor-exit v0

    .line 122
    throw v1
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
.end method

.method private final runFrameLoop(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MonotonicFrameClock;",
            "Landroidx/compose/runtime/ProduceFrameSignal;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;-><init>(Landroidx/compose/runtime/Recomposer;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v4, :cond_3

    .line 38
    .line 39
    if-ne v2, v3, :cond_2

    .line 40
    .line 41
    iget-object p1, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$4:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Ljava/util/List;

    .line 44
    .line 45
    iget-object p2, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$3:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p2, Ljava/util/List;

    .line 48
    .line 49
    iget-object v2, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Landroidx/compose/runtime/ProduceFrameSignal;

    .line 52
    .line 53
    iget-object v5, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Landroidx/compose/runtime/MonotonicFrameClock;

    .line 56
    .line 57
    iget-object v6, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Landroidx/compose/runtime/Recomposer;

    .line 60
    .line 61
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    move-object p3, p2

    .line 65
    move-object p2, v2

    .line 66
    move-object v2, p1

    .line 67
    move-object p1, v5

    .line 68
    move-object v5, v6

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_3
    iget-object p1, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$4:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, Ljava/util/List;

    .line 81
    .line 82
    iget-object p2, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$3:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p2, Ljava/util/List;

    .line 85
    .line 86
    iget-object v2, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$2:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Landroidx/compose/runtime/ProduceFrameSignal;

    .line 89
    .line 90
    iget-object v5, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$1:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v5, Landroidx/compose/runtime/MonotonicFrameClock;

    .line 93
    .line 94
    iget-object v6, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v6, Landroidx/compose/runtime/Recomposer;

    .line 97
    .line 98
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    new-instance p3, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    new-instance v2, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 113
    .line 114
    .line 115
    move-object v5, p0

    .line 116
    :goto_1
    iget-object v6, v5, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v5, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object p1, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$1:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object p2, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$2:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object p3, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$3:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v2, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$4:Ljava/lang/Object;

    .line 127
    .line 128
    iput v4, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->label:I

    .line 129
    .line 130
    invoke-virtual {p2, v6, v0}, Landroidx/compose/runtime/ProduceFrameSignal;->awaitFrameRequest(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    if-ne v6, v1, :cond_5

    .line 135
    .line 136
    return-object v1

    .line 137
    :cond_5
    move-object v6, v5

    .line 138
    move-object v5, p1

    .line 139
    move-object p1, v2

    .line 140
    move-object v2, p2

    .line 141
    move-object p2, p3

    .line 142
    :goto_2
    new-instance p3, Landroidx/compose/runtime/Recomposer$runFrameLoop$2;

    .line 143
    .line 144
    invoke-direct {p3, v6, p2, p1, v2}, Landroidx/compose/runtime/Recomposer$runFrameLoop$2;-><init>(Landroidx/compose/runtime/Recomposer;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/ProduceFrameSignal;)V

    .line 145
    .line 146
    .line 147
    iput-object v6, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$0:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v5, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$1:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object v2, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$2:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object p2, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$3:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object p1, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->L$4:Ljava/lang/Object;

    .line 156
    .line 157
    iput v3, v0, Landroidx/compose/runtime/Recomposer$runFrameLoop$1;->label:I

    .line 158
    .line 159
    invoke-interface {v5, p3, v0}, Landroidx/compose/runtime/MonotonicFrameClock;->withFrameNanos(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p3

    .line 163
    if-ne p3, v1, :cond_1

    .line 164
    .line 165
    return-object v1
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
.end method

.method private final writeObserverOf(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/ControlledComposition;",
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "Ljava/lang/Object;",
            ">;)",
            "Lv3/l<",
            "Ljava/lang/Object;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/compose/runtime/Recomposer$writeObserverOf$1;

    invoke-direct {v0, p1, p2}, Landroidx/compose/runtime/Recomposer$writeObserverOf$1;-><init>(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)V

    return-object v0
.end method


# virtual methods
.method public final asRecomposerInfo()Landroidx/compose/runtime/RecomposerInfo;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->recomposerInfo:Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;

    return-object v0
.end method

.method public final awaitIdle(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/runtime/Recomposer;->getCurrentState()Lkotlinx/coroutines/flow/t0;

    move-result-object v0

    new-instance v1, Landroidx/compose/runtime/Recomposer$awaitIdle$2;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroidx/compose/runtime/Recomposer$awaitIdle$2;-><init>(Lkotlin/coroutines/d;)V

    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/k;->V1(Lkotlinx/coroutines/flow/i;Lv3/p;)Lkotlinx/coroutines/flow/i;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlinx/coroutines/flow/k;->x(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final cancel()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/e0;

    .line 5
    .line 6
    invoke-interface {v1}, Lkotlinx/coroutines/flow/e0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Landroidx/compose/runtime/Recomposer$State;

    .line 11
    .line 12
    sget-object v2, Landroidx/compose/runtime/Recomposer$State;->Idle:Landroidx/compose/runtime/Recomposer$State;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ltz v1, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/e0;

    .line 21
    .line 22
    sget-object v2, Landroidx/compose/runtime/Recomposer$State;->ShuttingDown:Landroidx/compose/runtime/Recomposer$State;

    .line 23
    .line 24
    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/e0;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    monitor-exit v0

    .line 30
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->effectJob:Lkotlinx/coroutines/b0;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/l2$a;->b(Lkotlinx/coroutines/l2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception v1

    .line 39
    monitor-exit v0

    .line 40
    throw v1
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->effectJob:Lkotlinx/coroutines/b0;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/b0;->complete()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    const/4 v1, 0x1

    .line 13
    :try_start_0
    iput-boolean v1, p0, Landroidx/compose/runtime/Recomposer;->isClosed:Z

    .line 14
    .line 15
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit v0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    monitor-exit v0

    .line 21
    throw v1

    .line 22
    :cond_0
    :goto_0
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public composeInitial$runtime_release(Landroidx/compose/runtime/ControlledComposition;Lv3/p;)V
    .locals 6
    .param p1    # Landroidx/compose/runtime/ControlledComposition;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/ControlledComposition;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Landroidx/compose/runtime/ControlledComposition;->isComposing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    :try_start_0
    sget-object v2, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Landroidx/compose/runtime/Recomposer;->readObserverOf(Landroidx/compose/runtime/ControlledComposition;)Lv3/l;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-direct {p0, p1, v4}, Landroidx/compose/runtime/Recomposer;->writeObserverOf(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Lv3/l;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {v2, v3, v4}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->takeMutableSnapshot(Lv3/l;Lv3/l;)Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 18
    .line 19
    .line 20
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 21
    :try_start_1
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 22
    .line 23
    .line 24
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 25
    :try_start_2
    invoke-interface {p1, p2}, Landroidx/compose/runtime/ControlledComposition;->composeContent(Lv3/p;)V

    .line 26
    .line 27
    .line 28
    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 29
    .line 30
    :try_start_3
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 31
    .line 32
    .line 33
    :try_start_4
    invoke-direct {p0, v3}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 34
    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->notifyObjectsInitialized()V

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object p2, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 42
    .line 43
    monitor-enter p2

    .line 44
    :try_start_5
    iget-object v3, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/e0;

    .line 45
    .line 46
    invoke-interface {v3}, Lkotlinx/coroutines/flow/e0;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Landroidx/compose/runtime/Recomposer$State;

    .line 51
    .line 52
    sget-object v4, Landroidx/compose/runtime/Recomposer$State;->ShuttingDown:Landroidx/compose/runtime/Recomposer$State;

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-lez v3, :cond_1

    .line 59
    .line 60
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getKnownCompositions()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-interface {v3, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_1

    .line 69
    .line 70
    invoke-direct {p0, p1}, Landroidx/compose/runtime/Recomposer;->addKnownCompositionLocked(Landroidx/compose/runtime/ControlledComposition;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 71
    .line 72
    .line 73
    :cond_1
    monitor-exit p2

    .line 74
    :try_start_6
    invoke-direct {p0, p1}, Landroidx/compose/runtime/Recomposer;->performInitialMovableContentInserts(Landroidx/compose/runtime/ControlledComposition;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 75
    .line 76
    .line 77
    :try_start_7
    invoke-interface {p1}, Landroidx/compose/runtime/ControlledComposition;->applyChanges()V

    .line 78
    .line 79
    .line 80
    invoke-interface {p1}, Landroidx/compose/runtime/ControlledComposition;->applyLateChanges()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 81
    .line 82
    .line 83
    if-nez v0, :cond_2

    .line 84
    .line 85
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->notifyObjectsInitialized()V

    .line 86
    .line 87
    .line 88
    :cond_2
    return-void

    .line 89
    :catch_0
    move-exception p1

    .line 90
    move-object v1, p1

    .line 91
    const/4 v2, 0x0

    .line 92
    const/4 v3, 0x0

    .line 93
    const/4 v4, 0x6

    .line 94
    const/4 v5, 0x0

    .line 95
    move-object v0, p0

    .line 96
    invoke-static/range {v0 .. v5}, Landroidx/compose/runtime/Recomposer;->processCompositionError$default(Landroidx/compose/runtime/Recomposer;Ljava/lang/Exception;Landroidx/compose/runtime/ControlledComposition;ZILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :catch_1
    move-exception p2

    .line 101
    invoke-direct {p0, p2, p1, v1}, Landroidx/compose/runtime/Recomposer;->processCompositionError(Ljava/lang/Exception;Landroidx/compose/runtime/ControlledComposition;Z)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :catchall_0
    move-exception p1

    .line 106
    monitor-exit p2

    .line 107
    throw p1

    .line 108
    :catchall_1
    move-exception p2

    .line 109
    :try_start_8
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 110
    .line 111
    .line 112
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 113
    :catchall_2
    move-exception p2

    .line 114
    :try_start_9
    invoke-direct {p0, v3}, Landroidx/compose/runtime/Recomposer;->applyAndCheck(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V

    .line 115
    .line 116
    .line 117
    throw p2
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2

    .line 118
    :catch_2
    move-exception p2

    .line 119
    invoke-direct {p0, p2, p1, v1}, Landroidx/compose/runtime/Recomposer;->processCompositionError(Ljava/lang/Exception;Landroidx/compose/runtime/ControlledComposition;Z)V

    .line 120
    .line 121
    .line 122
    return-void
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
.end method

.method public deletedMovableContent$runtime_release(Landroidx/compose/runtime/MovableContentStateReference;)V
    .locals 3
    .param p1    # Landroidx/compose/runtime/MovableContentStateReference;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesRemoved:Ljava/util/Map;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/compose/runtime/MovableContentStateReference;->getContent$runtime_release()Landroidx/compose/runtime/MovableContent;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-static {v1, v2, p1}, Landroidx/compose/runtime/RecomposerKt;->addMultiValue(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    monitor-exit v0

    .line 17
    throw p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final getChangeCount()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/runtime/Recomposer;->changeCount:J

    return-wide v0
.end method

.method public getCollectingParameterInformation$runtime_release()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getCollectingSourceInformation$runtime_release()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getCompoundHashKey$runtime_release()I
    .locals 1

    const/16 v0, 0x3e8

    return v0
.end method

.method public final getCurrentState()Lkotlinx/coroutines/flow/t0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/t0<",
            "Landroidx/compose/runtime/Recomposer$State;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->_state:Lkotlinx/coroutines/flow/e0;

    return-object v0
.end method

.method public getEffectCoroutineContext()Lkotlin/coroutines/g;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->effectCoroutineContext:Lkotlin/coroutines/g;

    return-object v0
.end method

.method public final getHasPendingWork()Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/IdentityArraySet;->isNotEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    .line 14
    .line 15
    check-cast v1, Ljava/util/Collection;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    xor-int/2addr v1, v2

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    iget v1, p0, Landroidx/compose/runtime/Recomposer;->concurrentCompositionsOutstanding:I

    .line 25
    .line 26
    if-gtz v1, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    .line 29
    .line 30
    check-cast v1, Ljava/util/Collection;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    xor-int/2addr v1, v2

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->getHasBroadcastFrameClockAwaitersLocked()Z

    .line 40
    .line 41
    .line 42
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v2, 0x0

    .line 47
    :cond_1
    :goto_0
    monitor-exit v0

    .line 48
    return v2

    .line 49
    :catchall_0
    move-exception v1

    .line 50
    monitor-exit v0

    .line 51
    throw v1
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public getRecomposeCoroutineContext$runtime_release()Lkotlin/coroutines/g;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    return-object v0
.end method

.method public final getState()Lkotlinx/coroutines/flow/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/i<",
            "Landroidx/compose/runtime/Recomposer$State;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/runtime/Recomposer;->getCurrentState()Lkotlinx/coroutines/flow/t0;

    move-result-object v0

    return-object v0
.end method

.method public insertMovableContent$runtime_release(Landroidx/compose/runtime/MovableContentStateReference;)V
    .locals 2
    .param p1    # Landroidx/compose/runtime/MovableContentStateReference;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionValuesAwaitingInsert:Ljava/util/List;

    .line 5
    .line 6
    check-cast v1, Ljava/util/Collection;

    .line 7
    .line 8
    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/p;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit v0

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    sget-object v0, Lkotlin/d1;->Companion:Lkotlin/d1$a;

    .line 19
    .line 20
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/d1;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p1, v0}, Lkotlin/coroutines/d;->resumeWith(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    monitor-exit v0

    .line 32
    throw p1
.end method

.method public invalidate$runtime_release(Landroidx/compose/runtime/ControlledComposition;)V
    .locals 2
    .param p1    # Landroidx/compose/runtime/ControlledComposition;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    .line 13
    .line 14
    check-cast v1, Ljava/util/Collection;

    .line 15
    .line 16
    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/p;

    .line 20
    .line 21
    .line 22
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    monitor-exit v0

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    sget-object v0, Lkotlin/d1;->Companion:Lkotlin/d1$a;

    .line 29
    .line 30
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 31
    .line 32
    invoke-static {v0}, Lkotlin/d1;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {p1, v0}, Lkotlin/coroutines/d;->resumeWith(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    monitor-exit v0

    .line 42
    throw p1
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public invalidateScope$runtime_release(Landroidx/compose/runtime/RecomposeScopeImpl;)V
    .locals 2
    .param p1    # Landroidx/compose/runtime/RecomposeScopeImpl;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->snapshotInvalidations:Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroidx/compose/runtime/collection/IdentityArraySet;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/p;

    .line 10
    .line 11
    .line 12
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit v0

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget-object v0, Lkotlin/d1;->Companion:Lkotlin/d1$a;

    .line 17
    .line 18
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/d1;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v0}, Lkotlin/coroutines/d;->resumeWith(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    monitor-exit v0

    .line 30
    throw p1
    .line 31
    .line 32
.end method

.method public final join(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/runtime/Recomposer;->getCurrentState()Lkotlinx/coroutines/flow/t0;

    move-result-object v0

    new-instance v1, Landroidx/compose/runtime/Recomposer$join$2;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroidx/compose/runtime/Recomposer$join$2;-><init>(Lkotlin/coroutines/d;)V

    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/flow/k;->v0(Lkotlinx/coroutines/flow/i;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public movableContentStateReleased$runtime_release(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V
    .locals 2
    .param p1    # Landroidx/compose/runtime/MovableContentStateReference;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/MovableContentState;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionValueStatesAvailable:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    monitor-exit v0

    .line 15
    throw p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public movableContentStateResolve$runtime_release(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;
    .locals 2
    .param p1    # Landroidx/compose/runtime/MovableContentStateReference;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionValueStatesAvailable:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Landroidx/compose/runtime/MovableContentState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-object p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit v0

    .line 16
    throw p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final pauseCompositionFrameClock()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Landroidx/compose/runtime/Recomposer;->frameClockPaused:Z

    .line 6
    .line 7
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    monitor-exit v0

    .line 13
    throw v1
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public recordInspectionTable$runtime_release(Ljava/util/Set;)V
    .locals 0
    .param p1    # Ljava/util/Set;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Landroidx/compose/runtime/tooling/CompositionData;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public registerComposition$runtime_release(Landroidx/compose/runtime/ControlledComposition;)V
    .locals 0
    .param p1    # Landroidx/compose/runtime/ControlledComposition;
        .annotation build Lp4/l;
        .end annotation
    .end param

    return-void
.end method

.method public reportRemovedComposition$runtime_release(Landroidx/compose/runtime/ControlledComposition;)V
    .locals 2
    .param p1    # Landroidx/compose/runtime/ControlledComposition;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionsRemoved:Ljava/util/Set;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionsRemoved:Ljava/util/Set;

    .line 14
    .line 15
    :cond_0
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit v0

    .line 22
    throw p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final resumeCompositionFrameClock()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Landroidx/compose/runtime/Recomposer;->frameClockPaused:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, p0, Landroidx/compose/runtime/Recomposer;->frameClockPaused:Z

    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/compose/runtime/Recomposer;->deriveStateLocked()Lkotlinx/coroutines/p;

    .line 12
    .line 13
    .line 14
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    monitor-exit v0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    sget-object v0, Lkotlin/d1;->Companion:Lkotlin/d1$a;

    .line 21
    .line 22
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/d1;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v1, v0}, Lkotlin/coroutines/d;->resumeWith(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    monitor-exit v0

    .line 34
    throw v1
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final runRecomposeAndApplyChanges(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    new-instance v0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;-><init>(Landroidx/compose/runtime/Recomposer;Lkotlin/coroutines/d;)V

    invoke-direct {p0, v0, p1}, Landroidx/compose/runtime/Recomposer;->recompositionRunner(Lv3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final runRecomposeConcurrentlyAndApplyChanges(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/ExperimentalComposeApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/g;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    new-instance v0, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Landroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2;-><init>(Lkotlin/coroutines/g;Landroidx/compose/runtime/Recomposer;Lkotlin/coroutines/d;)V

    invoke-direct {p0, v0, p2}, Landroidx/compose/runtime/Recomposer;->recompositionRunner(Lv3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public unregisterComposition$runtime_release(Landroidx/compose/runtime/ControlledComposition;)V
    .locals 2
    .param p1    # Landroidx/compose/runtime/ControlledComposition;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/Recomposer;->stateLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0, p1}, Landroidx/compose/runtime/Recomposer;->removeKnownCompositionLocked(Landroidx/compose/runtime/ControlledComposition;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionInvalidations:Ljava/util/List;

    .line 8
    .line 9
    check-cast v1, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v1, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Landroidx/compose/runtime/Recomposer;->compositionsAwaitingApply:Ljava/util/List;

    .line 15
    .line 16
    check-cast v1, Ljava/util/Collection;

    .line 17
    .line 18
    invoke-interface {v1, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    monitor-exit v0

    .line 27
    throw p1
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method
