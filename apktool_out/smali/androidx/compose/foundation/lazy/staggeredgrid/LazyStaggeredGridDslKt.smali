.class public final Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0003\u001a\u0083\u0001\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00082\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u00a2\u0006\u0002\u0008\u0014H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001a\u0083\u0001\u0010\"\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00082\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u00a2\u0006\u0002\u0008\u0014H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!\u001a\'\u0010#\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008#\u0010$\u001a\u00d2\u0001\u0010\'\u001a\u00020\u0013\"\u0004\u0008\u0000\u0010%*\u00020\u00122\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000&2%\u0008\n\u0010,\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0004\u0012\u00020+\u0018\u00010\u00112%\u0008\u0006\u0010-\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0006\u0012\u0004\u0018\u00010+0\u00112%\u0008\n\u0010/\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0004\u0012\u00020.\u0018\u00010\u001123\u0008\u0004\u00103\u001a-\u0012\u0004\u0012\u000201\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0004\u0012\u00020\u001300\u00a2\u0006\u0002\u00082\u00a2\u0006\u0002\u0008\u0014H\u0086\u0008\u00a2\u0006\u0004\u0008\'\u00104\u001a\u00a6\u0002\u00108\u001a\u00020\u0013\"\u0004\u0008\u0000\u0010%*\u00020\u00122\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000&2:\u0008\n\u0010,\u001a4\u0012\u0013\u0012\u001105\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(6\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0004\u0012\u00020+\u0018\u0001002:\u0008\u0006\u0010-\u001a4\u0012\u0013\u0012\u001105\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(6\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0006\u0012\u0004\u0018\u00010+002:\u0008\n\u0010/\u001a4\u0012\u0013\u0012\u001105\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(6\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0004\u0012\u00020.\u0018\u0001002H\u0008\u0004\u00103\u001aB\u0012\u0004\u0012\u000201\u0012\u0013\u0012\u001105\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(6\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0004\u0012\u00020\u001307\u00a2\u0006\u0002\u00082\u00a2\u0006\u0002\u0008\u0014H\u0086\u0008\u00a2\u0006\u0004\u00088\u00109\u001a\u00d2\u0001\u0010\'\u001a\u00020\u0013\"\u0004\u0008\u0000\u0010%*\u00020\u00122\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000:2%\u0008\n\u0010,\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0004\u0012\u00020+\u0018\u00010\u00112%\u0008\u0006\u0010-\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0006\u0012\u0004\u0018\u00010+0\u00112%\u0008\n\u0010/\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0004\u0012\u00020.\u0018\u00010\u001123\u0008\u0004\u00103\u001a-\u0012\u0004\u0012\u000201\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0004\u0012\u00020\u001300\u00a2\u0006\u0002\u00082\u00a2\u0006\u0002\u0008\u0014H\u0086\u0008\u00a2\u0006\u0004\u0008\'\u0010;\u001a\u00a6\u0002\u00108\u001a\u00020\u0013\"\u0004\u0008\u0000\u0010%*\u00020\u00122\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000:2:\u0008\n\u0010,\u001a4\u0012\u0013\u0012\u001105\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(6\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0004\u0012\u00020+\u0018\u0001002:\u0008\u0006\u0010-\u001a4\u0012\u0013\u0012\u001105\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(6\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0006\u0012\u0004\u0018\u00010+002:\u0008\n\u0010/\u001a4\u0012\u0013\u0012\u001105\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(6\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0004\u0012\u00020.\u0018\u0001002H\u0008\u0004\u00103\u001aB\u0012\u0004\u0012\u000201\u0012\u0013\u0012\u001105\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(6\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0008(*\u0012\u0004\u0012\u00020\u001307\u00a2\u0006\u0002\u00082\u00a2\u0006\u0002\u0008\u0014H\u0086\u0008\u00a2\u0006\u0004\u00088\u0010<\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006="
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;",
        "columns",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
        "state",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "contentPadding",
        "",
        "reverseLayout",
        "Landroidx/compose/ui/unit/Dp;",
        "verticalItemSpacing",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "horizontalArrangement",
        "Landroidx/compose/foundation/gestures/FlingBehavior;",
        "flingBehavior",
        "userScrollEnabled",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;",
        "Lkotlin/r2;",
        "Lkotlin/u;",
        "content",
        "LazyVerticalStaggeredGrid-zadm560",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLv3/l;Landroidx/compose/runtime/Composer;II)V",
        "LazyVerticalStaggeredGrid",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;",
        "rememberColumnSlots",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;",
        "rows",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "verticalArrangement",
        "horizontalItemSpacing",
        "LazyHorizontalStaggeredGrid-cJHQLPU",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLv3/l;Landroidx/compose/runtime/Composer;II)V",
        "LazyHorizontalStaggeredGrid",
        "rememberRowSlots",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;",
        "T",
        "",
        "items",
        "Lkotlin/v0;",
        "name",
        "item",
        "",
        "key",
        "contentType",
        "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;",
        "span",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;",
        "Landroidx/compose/runtime/Composable;",
        "itemContent",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lv3/l;Lv3/l;Lv3/l;Lv3/r;)V",
        "",
        "index",
        "Lkotlin/Function3;",
        "itemsIndexed",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lv3/p;Lv3/p;Lv3/p;Lv3/s;)V",
        "",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lv3/l;Lv3/l;Lv3/l;Lv3/r;)V",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lv3/p;Lv3/p;Lv3/p;Lv3/s;)V",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,463:1\n154#2:464\n154#2:465\n154#2:466\n154#2:477\n154#2:478\n154#2:479\n67#3,3:467\n66#3:470\n67#3,3:480\n66#3:483\n1116#4,6:471\n1116#4,6:484\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n*L\n66#1:464\n68#1:465\n69#1:466\n156#1:477\n158#1:478\n159#1:479\n95#1:467,3\n95#1:470\n185#1:480,3\n185#1:483\n95#1:471,6\n185#1:484,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final LazyHorizontalStaggeredGrid-cJHQLPU(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLv3/l;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .param p0    # Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/foundation/gestures/FlingBehavior;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p9    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p10    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Z",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "F",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            "Z",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v11, p11

    .line 4
    .line 5
    move/from16 v12, p12

    .line 6
    .line 7
    const v0, -0x843bda

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p10

    .line 11
    .line 12
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    and-int/lit8 v3, v12, 0x1

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    or-int/lit8 v3, v11, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v3, v11, 0xe

    .line 24
    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v3, 0x2

    .line 36
    :goto_0
    or-int/2addr v3, v11

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v3, v11

    .line 39
    :goto_1
    and-int/lit8 v5, v12, 0x2

    .line 40
    .line 41
    if-eqz v5, :cond_3

    .line 42
    .line 43
    or-int/lit8 v3, v3, 0x30

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    and-int/lit8 v6, v11, 0x70

    .line 47
    .line 48
    if-nez v6, :cond_5

    .line 49
    .line 50
    move-object/from16 v6, p1

    .line 51
    .line 52
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_4

    .line 57
    .line 58
    const/16 v7, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    const/16 v7, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v3, v7

    .line 64
    goto :goto_4

    .line 65
    :cond_5
    :goto_3
    move-object/from16 v6, p1

    .line 66
    .line 67
    :goto_4
    and-int/lit8 v7, v12, 0x4

    .line 68
    .line 69
    if-eqz v7, :cond_6

    .line 70
    .line 71
    or-int/lit16 v3, v3, 0x80

    .line 72
    .line 73
    :cond_6
    and-int/lit8 v8, v12, 0x8

    .line 74
    .line 75
    if-eqz v8, :cond_7

    .line 76
    .line 77
    or-int/lit16 v3, v3, 0xc00

    .line 78
    .line 79
    goto :goto_6

    .line 80
    :cond_7
    and-int/lit16 v9, v11, 0x1c00

    .line 81
    .line 82
    if-nez v9, :cond_9

    .line 83
    .line 84
    move-object/from16 v9, p3

    .line 85
    .line 86
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-eqz v10, :cond_8

    .line 91
    .line 92
    const/16 v10, 0x800

    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_8
    const/16 v10, 0x400

    .line 96
    .line 97
    :goto_5
    or-int/2addr v3, v10

    .line 98
    goto :goto_7

    .line 99
    :cond_9
    :goto_6
    move-object/from16 v9, p3

    .line 100
    .line 101
    :goto_7
    and-int/lit8 v10, v12, 0x10

    .line 102
    .line 103
    const v13, 0xe000

    .line 104
    .line 105
    .line 106
    if-eqz v10, :cond_a

    .line 107
    .line 108
    or-int/lit16 v3, v3, 0x6000

    .line 109
    .line 110
    goto :goto_9

    .line 111
    :cond_a
    and-int v14, v11, v13

    .line 112
    .line 113
    if-nez v14, :cond_c

    .line 114
    .line 115
    move/from16 v14, p4

    .line 116
    .line 117
    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    if-eqz v15, :cond_b

    .line 122
    .line 123
    const/16 v15, 0x4000

    .line 124
    .line 125
    goto :goto_8

    .line 126
    :cond_b
    const/16 v15, 0x2000

    .line 127
    .line 128
    :goto_8
    or-int/2addr v3, v15

    .line 129
    goto :goto_a

    .line 130
    :cond_c
    :goto_9
    move/from16 v14, p4

    .line 131
    .line 132
    :goto_a
    and-int/lit8 v15, v12, 0x20

    .line 133
    .line 134
    const/high16 v16, 0x70000

    .line 135
    .line 136
    if-eqz v15, :cond_d

    .line 137
    .line 138
    const/high16 v17, 0x30000

    .line 139
    .line 140
    or-int v3, v3, v17

    .line 141
    .line 142
    move-object/from16 v13, p5

    .line 143
    .line 144
    goto :goto_c

    .line 145
    :cond_d
    and-int v17, v11, v16

    .line 146
    .line 147
    move-object/from16 v13, p5

    .line 148
    .line 149
    if-nez v17, :cond_f

    .line 150
    .line 151
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v17

    .line 155
    if-eqz v17, :cond_e

    .line 156
    .line 157
    const/high16 v17, 0x20000

    .line 158
    .line 159
    goto :goto_b

    .line 160
    :cond_e
    const/high16 v17, 0x10000

    .line 161
    .line 162
    :goto_b
    or-int v3, v3, v17

    .line 163
    .line 164
    :cond_f
    :goto_c
    and-int/lit8 v17, v12, 0x40

    .line 165
    .line 166
    const/high16 v18, 0x380000

    .line 167
    .line 168
    if-eqz v17, :cond_10

    .line 169
    .line 170
    const/high16 v19, 0x180000

    .line 171
    .line 172
    or-int v3, v3, v19

    .line 173
    .line 174
    move/from16 v0, p6

    .line 175
    .line 176
    goto :goto_e

    .line 177
    :cond_10
    and-int v19, v11, v18

    .line 178
    .line 179
    move/from16 v0, p6

    .line 180
    .line 181
    if-nez v19, :cond_12

    .line 182
    .line 183
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 184
    .line 185
    .line 186
    move-result v20

    .line 187
    if-eqz v20, :cond_11

    .line 188
    .line 189
    const/high16 v20, 0x100000

    .line 190
    .line 191
    goto :goto_d

    .line 192
    :cond_11
    const/high16 v20, 0x80000

    .line 193
    .line 194
    :goto_d
    or-int v3, v3, v20

    .line 195
    .line 196
    :cond_12
    :goto_e
    const/high16 v20, 0x1c00000

    .line 197
    .line 198
    and-int v21, v11, v20

    .line 199
    .line 200
    if-nez v21, :cond_15

    .line 201
    .line 202
    and-int/lit16 v4, v12, 0x80

    .line 203
    .line 204
    if-nez v4, :cond_13

    .line 205
    .line 206
    move-object/from16 v4, p7

    .line 207
    .line 208
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v22

    .line 212
    if-eqz v22, :cond_14

    .line 213
    .line 214
    const/high16 v22, 0x800000

    .line 215
    .line 216
    goto :goto_f

    .line 217
    :cond_13
    move-object/from16 v4, p7

    .line 218
    .line 219
    :cond_14
    const/high16 v22, 0x400000

    .line 220
    .line 221
    :goto_f
    or-int v3, v3, v22

    .line 222
    .line 223
    goto :goto_10

    .line 224
    :cond_15
    move-object/from16 v4, p7

    .line 225
    .line 226
    :goto_10
    and-int/lit16 v0, v12, 0x100

    .line 227
    .line 228
    const/high16 v22, 0xe000000

    .line 229
    .line 230
    if-eqz v0, :cond_16

    .line 231
    .line 232
    const/high16 v23, 0x6000000

    .line 233
    .line 234
    or-int v3, v3, v23

    .line 235
    .line 236
    move/from16 v4, p8

    .line 237
    .line 238
    goto :goto_12

    .line 239
    :cond_16
    and-int v23, v11, v22

    .line 240
    .line 241
    move/from16 v4, p8

    .line 242
    .line 243
    if-nez v23, :cond_18

    .line 244
    .line 245
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 246
    .line 247
    .line 248
    move-result v23

    .line 249
    if-eqz v23, :cond_17

    .line 250
    .line 251
    const/high16 v23, 0x4000000

    .line 252
    .line 253
    goto :goto_11

    .line 254
    :cond_17
    const/high16 v23, 0x2000000

    .line 255
    .line 256
    :goto_11
    or-int v3, v3, v23

    .line 257
    .line 258
    :cond_18
    :goto_12
    and-int/lit16 v4, v12, 0x200

    .line 259
    .line 260
    if-eqz v4, :cond_19

    .line 261
    .line 262
    const/high16 v4, 0x30000000

    .line 263
    .line 264
    or-int/2addr v3, v4

    .line 265
    goto :goto_14

    .line 266
    :cond_19
    const/high16 v4, 0x70000000

    .line 267
    .line 268
    and-int/2addr v4, v11

    .line 269
    if-nez v4, :cond_1b

    .line 270
    .line 271
    move-object/from16 v4, p9

    .line 272
    .line 273
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v23

    .line 277
    if-eqz v23, :cond_1a

    .line 278
    .line 279
    const/high16 v23, 0x20000000

    .line 280
    .line 281
    goto :goto_13

    .line 282
    :cond_1a
    const/high16 v23, 0x10000000

    .line 283
    .line 284
    :goto_13
    or-int v3, v3, v23

    .line 285
    .line 286
    goto :goto_14

    .line 287
    :cond_1b
    move-object/from16 v4, p9

    .line 288
    .line 289
    :goto_14
    const/4 v4, 0x4

    .line 290
    if-ne v7, v4, :cond_1d

    .line 291
    .line 292
    const v4, 0x5b6db6db

    .line 293
    .line 294
    .line 295
    and-int/2addr v4, v3

    .line 296
    const v6, 0x12492492

    .line 297
    .line 298
    .line 299
    if-ne v4, v6, :cond_1d

    .line 300
    .line 301
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    if-nez v4, :cond_1c

    .line 306
    .line 307
    goto :goto_15

    .line 308
    :cond_1c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 309
    .line 310
    .line 311
    move-object/from16 v4, p1

    .line 312
    .line 313
    move-object/from16 v3, p2

    .line 314
    .line 315
    move/from16 v7, p6

    .line 316
    .line 317
    move-object/from16 v10, p7

    .line 318
    .line 319
    move-object v8, v9

    .line 320
    move-object v6, v13

    .line 321
    move v5, v14

    .line 322
    move/from16 v9, p8

    .line 323
    .line 324
    goto/16 :goto_1f

    .line 325
    .line 326
    :cond_1d
    :goto_15
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 327
    .line 328
    .line 329
    and-int/lit8 v4, v11, 0x1

    .line 330
    .line 331
    const v6, -0x1c00001

    .line 332
    .line 333
    .line 334
    if-eqz v4, :cond_21

    .line 335
    .line 336
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    if-eqz v4, :cond_1e

    .line 341
    .line 342
    goto :goto_17

    .line 343
    :cond_1e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 344
    .line 345
    .line 346
    if-eqz v7, :cond_1f

    .line 347
    .line 348
    and-int/lit16 v3, v3, -0x381

    .line 349
    .line 350
    :cond_1f
    and-int/lit16 v0, v12, 0x80

    .line 351
    .line 352
    if-eqz v0, :cond_20

    .line 353
    .line 354
    and-int/2addr v3, v6

    .line 355
    :cond_20
    move-object/from16 v4, p1

    .line 356
    .line 357
    move-object/from16 v7, p2

    .line 358
    .line 359
    move/from16 v5, p6

    .line 360
    .line 361
    move-object/from16 v10, p7

    .line 362
    .line 363
    move v6, v3

    .line 364
    move-object v8, v9

    .line 365
    move-object v9, v13

    .line 366
    :goto_16
    move v0, v14

    .line 367
    move/from16 v3, p8

    .line 368
    .line 369
    goto/16 :goto_1e

    .line 370
    .line 371
    :cond_21
    :goto_17
    if-eqz v5, :cond_22

    .line 372
    .line 373
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 374
    .line 375
    goto :goto_18

    .line 376
    :cond_22
    move-object/from16 v4, p1

    .line 377
    .line 378
    :goto_18
    const/4 v5, 0x0

    .line 379
    if-eqz v7, :cond_23

    .line 380
    .line 381
    const/4 v7, 0x3

    .line 382
    invoke-static {v5, v5, v2, v5, v7}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt;->rememberLazyStaggeredGridState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 383
    .line 384
    .line 385
    move-result-object v7

    .line 386
    and-int/lit16 v3, v3, -0x381

    .line 387
    .line 388
    goto :goto_19

    .line 389
    :cond_23
    move-object/from16 v7, p2

    .line 390
    .line 391
    :goto_19
    if-eqz v8, :cond_24

    .line 392
    .line 393
    int-to-float v8, v5

    .line 394
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 395
    .line 396
    .line 397
    move-result v8

    .line 398
    invoke-static {v8}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    .line 399
    .line 400
    .line 401
    move-result-object v8

    .line 402
    goto :goto_1a

    .line 403
    :cond_24
    move-object v8, v9

    .line 404
    :goto_1a
    if-eqz v10, :cond_25

    .line 405
    .line 406
    move v14, v5

    .line 407
    :cond_25
    if-eqz v15, :cond_26

    .line 408
    .line 409
    sget-object v9, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 410
    .line 411
    int-to-float v10, v5

    .line 412
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 413
    .line 414
    .line 415
    move-result v10

    .line 416
    invoke-virtual {v9, v10}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 417
    .line 418
    .line 419
    move-result-object v9

    .line 420
    goto :goto_1b

    .line 421
    :cond_26
    move-object v9, v13

    .line 422
    :goto_1b
    if-eqz v17, :cond_27

    .line 423
    .line 424
    int-to-float v5, v5

    .line 425
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 426
    .line 427
    .line 428
    move-result v5

    .line 429
    goto :goto_1c

    .line 430
    :cond_27
    move/from16 v5, p6

    .line 431
    .line 432
    :goto_1c
    and-int/lit16 v10, v12, 0x80

    .line 433
    .line 434
    if-eqz v10, :cond_28

    .line 435
    .line 436
    sget-object v10, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    .line 437
    .line 438
    const/4 v13, 0x6

    .line 439
    invoke-virtual {v10, v2, v13}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 440
    .line 441
    .line 442
    move-result-object v10

    .line 443
    and-int/2addr v3, v6

    .line 444
    goto :goto_1d

    .line 445
    :cond_28
    move-object/from16 v10, p7

    .line 446
    .line 447
    :goto_1d
    if-eqz v0, :cond_29

    .line 448
    .line 449
    const/4 v0, 0x1

    .line 450
    move v6, v3

    .line 451
    move v3, v0

    .line 452
    move v0, v14

    .line 453
    goto :goto_1e

    .line 454
    :cond_29
    move v6, v3

    .line 455
    goto :goto_16

    .line 456
    :goto_1e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 457
    .line 458
    .line 459
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 460
    .line 461
    .line 462
    move-result v13

    .line 463
    if-eqz v13, :cond_2a

    .line 464
    .line 465
    const/4 v13, -0x1

    .line 466
    const-string v14, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:162)"

    .line 467
    .line 468
    const v15, -0x843bda

    .line 469
    .line 470
    .line 471
    invoke-static {v15, v6, v13, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 472
    .line 473
    .line 474
    :cond_2a
    sget-object v14, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 475
    .line 476
    invoke-interface {v9}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    .line 477
    .line 478
    .line 479
    move-result v23

    .line 480
    and-int/lit8 v13, v6, 0xe

    .line 481
    .line 482
    shr-int/lit8 v15, v6, 0xc

    .line 483
    .line 484
    and-int/lit8 v15, v15, 0x70

    .line 485
    .line 486
    or-int/2addr v13, v15

    .line 487
    shr-int/lit8 v15, v6, 0x3

    .line 488
    .line 489
    and-int/lit16 v11, v15, 0x380

    .line 490
    .line 491
    or-int/2addr v11, v13

    .line 492
    invoke-static {v1, v9, v8, v2, v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt;->rememberRowSlots(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;

    .line 493
    .line 494
    .line 495
    move-result-object v11

    .line 496
    shl-int/lit8 v13, v6, 0x6

    .line 497
    .line 498
    and-int/lit16 v1, v13, 0x1c00

    .line 499
    .line 500
    or-int/lit8 v1, v1, 0x38

    .line 501
    .line 502
    shl-int/lit8 v17, v6, 0x3

    .line 503
    .line 504
    const v19, 0xe000

    .line 505
    .line 506
    .line 507
    and-int v19, v17, v19

    .line 508
    .line 509
    or-int v1, v1, v19

    .line 510
    .line 511
    and-int v16, v17, v16

    .line 512
    .line 513
    or-int v1, v1, v16

    .line 514
    .line 515
    and-int v16, v15, v18

    .line 516
    .line 517
    or-int v1, v1, v16

    .line 518
    .line 519
    and-int v15, v15, v20

    .line 520
    .line 521
    or-int/2addr v1, v15

    .line 522
    and-int v13, v13, v22

    .line 523
    .line 524
    or-int v25, v1, v13

    .line 525
    .line 526
    shr-int/lit8 v1, v6, 0x1b

    .line 527
    .line 528
    and-int/lit8 v26, v1, 0xe

    .line 529
    .line 530
    const/16 v27, 0x0

    .line 531
    .line 532
    move-object v13, v7

    .line 533
    move-object v15, v11

    .line 534
    move-object/from16 v16, v4

    .line 535
    .line 536
    move-object/from16 v17, v8

    .line 537
    .line 538
    move/from16 v18, v0

    .line 539
    .line 540
    move-object/from16 v19, v10

    .line 541
    .line 542
    move/from16 v20, v3

    .line 543
    .line 544
    move/from16 v21, v5

    .line 545
    .line 546
    move/from16 v22, v23

    .line 547
    .line 548
    move-object/from16 v23, p9

    .line 549
    .line 550
    move-object/from16 v24, v2

    .line 551
    .line 552
    invoke-static/range {v13 .. v27}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt;->LazyStaggeredGrid-LJWHXA8(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZFFLv3/l;Landroidx/compose/runtime/Composer;III)V

    .line 553
    .line 554
    .line 555
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 556
    .line 557
    .line 558
    move-result v1

    .line 559
    if-eqz v1, :cond_2b

    .line 560
    .line 561
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 562
    .line 563
    .line 564
    :cond_2b
    move-object v6, v9

    .line 565
    move v9, v3

    .line 566
    move-object v3, v7

    .line 567
    move v7, v5

    .line 568
    move v5, v0

    .line 569
    :goto_1f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 570
    .line 571
    .line 572
    move-result-object v13

    .line 573
    if-eqz v13, :cond_2c

    .line 574
    .line 575
    new-instance v14, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1;

    .line 576
    .line 577
    move-object v0, v14

    .line 578
    move-object/from16 v1, p0

    .line 579
    .line 580
    move-object v2, v4

    .line 581
    move-object v4, v8

    .line 582
    move-object v8, v10

    .line 583
    move-object/from16 v10, p9

    .line 584
    .line 585
    move/from16 v11, p11

    .line 586
    .line 587
    move/from16 v12, p12

    .line 588
    .line 589
    invoke-direct/range {v0 .. v12}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLv3/l;II)V

    .line 590
    .line 591
    .line 592
    invoke-interface {v13, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 593
    .line 594
    .line 595
    :cond_2c
    return-void
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
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method public static final LazyVerticalStaggeredGrid-zadm560(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLv3/l;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .param p0    # Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/foundation/gestures/FlingBehavior;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p9    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p10    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "ZF",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            "Z",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v11, p11

    .line 4
    .line 5
    move/from16 v12, p12

    .line 6
    .line 7
    const v0, 0x650c9692

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p10

    .line 11
    .line 12
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    and-int/lit8 v3, v12, 0x1

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    or-int/lit8 v3, v11, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v3, v11, 0xe

    .line 24
    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v3, 0x2

    .line 36
    :goto_0
    or-int/2addr v3, v11

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v3, v11

    .line 39
    :goto_1
    and-int/lit8 v5, v12, 0x2

    .line 40
    .line 41
    if-eqz v5, :cond_3

    .line 42
    .line 43
    or-int/lit8 v3, v3, 0x30

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    and-int/lit8 v6, v11, 0x70

    .line 47
    .line 48
    if-nez v6, :cond_5

    .line 49
    .line 50
    move-object/from16 v6, p1

    .line 51
    .line 52
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_4

    .line 57
    .line 58
    const/16 v7, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    const/16 v7, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v3, v7

    .line 64
    goto :goto_4

    .line 65
    :cond_5
    :goto_3
    move-object/from16 v6, p1

    .line 66
    .line 67
    :goto_4
    and-int/lit8 v7, v12, 0x4

    .line 68
    .line 69
    if-eqz v7, :cond_6

    .line 70
    .line 71
    or-int/lit16 v3, v3, 0x80

    .line 72
    .line 73
    :cond_6
    and-int/lit8 v8, v12, 0x8

    .line 74
    .line 75
    if-eqz v8, :cond_7

    .line 76
    .line 77
    or-int/lit16 v3, v3, 0xc00

    .line 78
    .line 79
    goto :goto_6

    .line 80
    :cond_7
    and-int/lit16 v9, v11, 0x1c00

    .line 81
    .line 82
    if-nez v9, :cond_9

    .line 83
    .line 84
    move-object/from16 v9, p3

    .line 85
    .line 86
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-eqz v10, :cond_8

    .line 91
    .line 92
    const/16 v10, 0x800

    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_8
    const/16 v10, 0x400

    .line 96
    .line 97
    :goto_5
    or-int/2addr v3, v10

    .line 98
    goto :goto_7

    .line 99
    :cond_9
    :goto_6
    move-object/from16 v9, p3

    .line 100
    .line 101
    :goto_7
    and-int/lit8 v10, v12, 0x10

    .line 102
    .line 103
    const v13, 0xe000

    .line 104
    .line 105
    .line 106
    if-eqz v10, :cond_a

    .line 107
    .line 108
    or-int/lit16 v3, v3, 0x6000

    .line 109
    .line 110
    goto :goto_9

    .line 111
    :cond_a
    and-int v14, v11, v13

    .line 112
    .line 113
    if-nez v14, :cond_c

    .line 114
    .line 115
    move/from16 v14, p4

    .line 116
    .line 117
    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    if-eqz v15, :cond_b

    .line 122
    .line 123
    const/16 v15, 0x4000

    .line 124
    .line 125
    goto :goto_8

    .line 126
    :cond_b
    const/16 v15, 0x2000

    .line 127
    .line 128
    :goto_8
    or-int/2addr v3, v15

    .line 129
    goto :goto_a

    .line 130
    :cond_c
    :goto_9
    move/from16 v14, p4

    .line 131
    .line 132
    :goto_a
    and-int/lit8 v15, v12, 0x20

    .line 133
    .line 134
    const/high16 v16, 0x70000

    .line 135
    .line 136
    if-eqz v15, :cond_d

    .line 137
    .line 138
    const/high16 v17, 0x30000

    .line 139
    .line 140
    or-int v3, v3, v17

    .line 141
    .line 142
    move/from16 v13, p5

    .line 143
    .line 144
    goto :goto_c

    .line 145
    :cond_d
    and-int v17, v11, v16

    .line 146
    .line 147
    move/from16 v13, p5

    .line 148
    .line 149
    if-nez v17, :cond_f

    .line 150
    .line 151
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 152
    .line 153
    .line 154
    move-result v17

    .line 155
    if-eqz v17, :cond_e

    .line 156
    .line 157
    const/high16 v17, 0x20000

    .line 158
    .line 159
    goto :goto_b

    .line 160
    :cond_e
    const/high16 v17, 0x10000

    .line 161
    .line 162
    :goto_b
    or-int v3, v3, v17

    .line 163
    .line 164
    :cond_f
    :goto_c
    and-int/lit8 v17, v12, 0x40

    .line 165
    .line 166
    const/high16 v18, 0x380000

    .line 167
    .line 168
    if-eqz v17, :cond_10

    .line 169
    .line 170
    const/high16 v19, 0x180000

    .line 171
    .line 172
    or-int v3, v3, v19

    .line 173
    .line 174
    move-object/from16 v0, p6

    .line 175
    .line 176
    goto :goto_e

    .line 177
    :cond_10
    and-int v19, v11, v18

    .line 178
    .line 179
    move-object/from16 v0, p6

    .line 180
    .line 181
    if-nez v19, :cond_12

    .line 182
    .line 183
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v20

    .line 187
    if-eqz v20, :cond_11

    .line 188
    .line 189
    const/high16 v20, 0x100000

    .line 190
    .line 191
    goto :goto_d

    .line 192
    :cond_11
    const/high16 v20, 0x80000

    .line 193
    .line 194
    :goto_d
    or-int v3, v3, v20

    .line 195
    .line 196
    :cond_12
    :goto_e
    const/high16 v20, 0x1c00000

    .line 197
    .line 198
    and-int v21, v11, v20

    .line 199
    .line 200
    if-nez v21, :cond_15

    .line 201
    .line 202
    and-int/lit16 v4, v12, 0x80

    .line 203
    .line 204
    if-nez v4, :cond_13

    .line 205
    .line 206
    move-object/from16 v4, p7

    .line 207
    .line 208
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v22

    .line 212
    if-eqz v22, :cond_14

    .line 213
    .line 214
    const/high16 v22, 0x800000

    .line 215
    .line 216
    goto :goto_f

    .line 217
    :cond_13
    move-object/from16 v4, p7

    .line 218
    .line 219
    :cond_14
    const/high16 v22, 0x400000

    .line 220
    .line 221
    :goto_f
    or-int v3, v3, v22

    .line 222
    .line 223
    goto :goto_10

    .line 224
    :cond_15
    move-object/from16 v4, p7

    .line 225
    .line 226
    :goto_10
    and-int/lit16 v0, v12, 0x100

    .line 227
    .line 228
    const/high16 v22, 0xe000000

    .line 229
    .line 230
    if-eqz v0, :cond_16

    .line 231
    .line 232
    const/high16 v23, 0x6000000

    .line 233
    .line 234
    or-int v3, v3, v23

    .line 235
    .line 236
    move/from16 v4, p8

    .line 237
    .line 238
    goto :goto_12

    .line 239
    :cond_16
    and-int v23, v11, v22

    .line 240
    .line 241
    move/from16 v4, p8

    .line 242
    .line 243
    if-nez v23, :cond_18

    .line 244
    .line 245
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 246
    .line 247
    .line 248
    move-result v23

    .line 249
    if-eqz v23, :cond_17

    .line 250
    .line 251
    const/high16 v23, 0x4000000

    .line 252
    .line 253
    goto :goto_11

    .line 254
    :cond_17
    const/high16 v23, 0x2000000

    .line 255
    .line 256
    :goto_11
    or-int v3, v3, v23

    .line 257
    .line 258
    :cond_18
    :goto_12
    and-int/lit16 v4, v12, 0x200

    .line 259
    .line 260
    if-eqz v4, :cond_19

    .line 261
    .line 262
    const/high16 v4, 0x30000000

    .line 263
    .line 264
    or-int/2addr v3, v4

    .line 265
    goto :goto_14

    .line 266
    :cond_19
    const/high16 v4, 0x70000000

    .line 267
    .line 268
    and-int/2addr v4, v11

    .line 269
    if-nez v4, :cond_1b

    .line 270
    .line 271
    move-object/from16 v4, p9

    .line 272
    .line 273
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v23

    .line 277
    if-eqz v23, :cond_1a

    .line 278
    .line 279
    const/high16 v23, 0x20000000

    .line 280
    .line 281
    goto :goto_13

    .line 282
    :cond_1a
    const/high16 v23, 0x10000000

    .line 283
    .line 284
    :goto_13
    or-int v3, v3, v23

    .line 285
    .line 286
    goto :goto_14

    .line 287
    :cond_1b
    move-object/from16 v4, p9

    .line 288
    .line 289
    :goto_14
    const/4 v4, 0x4

    .line 290
    if-ne v7, v4, :cond_1d

    .line 291
    .line 292
    const v4, 0x5b6db6db

    .line 293
    .line 294
    .line 295
    and-int/2addr v4, v3

    .line 296
    const v6, 0x12492492

    .line 297
    .line 298
    .line 299
    if-ne v4, v6, :cond_1d

    .line 300
    .line 301
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    if-nez v4, :cond_1c

    .line 306
    .line 307
    goto :goto_15

    .line 308
    :cond_1c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 309
    .line 310
    .line 311
    move-object/from16 v4, p1

    .line 312
    .line 313
    move-object/from16 v3, p2

    .line 314
    .line 315
    move-object/from16 v7, p6

    .line 316
    .line 317
    move-object/from16 v10, p7

    .line 318
    .line 319
    move-object v8, v9

    .line 320
    move v6, v13

    .line 321
    move v5, v14

    .line 322
    move/from16 v9, p8

    .line 323
    .line 324
    goto/16 :goto_1f

    .line 325
    .line 326
    :cond_1d
    :goto_15
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 327
    .line 328
    .line 329
    and-int/lit8 v4, v11, 0x1

    .line 330
    .line 331
    const v6, -0x1c00001

    .line 332
    .line 333
    .line 334
    if-eqz v4, :cond_21

    .line 335
    .line 336
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    if-eqz v4, :cond_1e

    .line 341
    .line 342
    goto :goto_17

    .line 343
    :cond_1e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 344
    .line 345
    .line 346
    if-eqz v7, :cond_1f

    .line 347
    .line 348
    and-int/lit16 v3, v3, -0x381

    .line 349
    .line 350
    :cond_1f
    and-int/lit16 v0, v12, 0x80

    .line 351
    .line 352
    if-eqz v0, :cond_20

    .line 353
    .line 354
    and-int/2addr v3, v6

    .line 355
    :cond_20
    move-object/from16 v4, p1

    .line 356
    .line 357
    move-object/from16 v7, p2

    .line 358
    .line 359
    move-object/from16 v5, p6

    .line 360
    .line 361
    move-object/from16 v10, p7

    .line 362
    .line 363
    move v6, v3

    .line 364
    move-object v8, v9

    .line 365
    move v9, v13

    .line 366
    :goto_16
    move v0, v14

    .line 367
    move/from16 v3, p8

    .line 368
    .line 369
    goto/16 :goto_1e

    .line 370
    .line 371
    :cond_21
    :goto_17
    if-eqz v5, :cond_22

    .line 372
    .line 373
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 374
    .line 375
    goto :goto_18

    .line 376
    :cond_22
    move-object/from16 v4, p1

    .line 377
    .line 378
    :goto_18
    const/4 v5, 0x0

    .line 379
    if-eqz v7, :cond_23

    .line 380
    .line 381
    const/4 v7, 0x3

    .line 382
    invoke-static {v5, v5, v2, v5, v7}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt;->rememberLazyStaggeredGridState(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 383
    .line 384
    .line 385
    move-result-object v7

    .line 386
    and-int/lit16 v3, v3, -0x381

    .line 387
    .line 388
    goto :goto_19

    .line 389
    :cond_23
    move-object/from16 v7, p2

    .line 390
    .line 391
    :goto_19
    if-eqz v8, :cond_24

    .line 392
    .line 393
    int-to-float v8, v5

    .line 394
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 395
    .line 396
    .line 397
    move-result v8

    .line 398
    invoke-static {v8}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    .line 399
    .line 400
    .line 401
    move-result-object v8

    .line 402
    goto :goto_1a

    .line 403
    :cond_24
    move-object v8, v9

    .line 404
    :goto_1a
    if-eqz v10, :cond_25

    .line 405
    .line 406
    move v14, v5

    .line 407
    :cond_25
    if-eqz v15, :cond_26

    .line 408
    .line 409
    int-to-float v9, v5

    .line 410
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 411
    .line 412
    .line 413
    move-result v9

    .line 414
    goto :goto_1b

    .line 415
    :cond_26
    move v9, v13

    .line 416
    :goto_1b
    if-eqz v17, :cond_27

    .line 417
    .line 418
    sget-object v10, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 419
    .line 420
    int-to-float v5, v5

    .line 421
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    invoke-virtual {v10, v5}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    goto :goto_1c

    .line 430
    :cond_27
    move-object/from16 v5, p6

    .line 431
    .line 432
    :goto_1c
    and-int/lit16 v10, v12, 0x80

    .line 433
    .line 434
    if-eqz v10, :cond_28

    .line 435
    .line 436
    sget-object v10, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    .line 437
    .line 438
    const/4 v13, 0x6

    .line 439
    invoke-virtual {v10, v2, v13}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 440
    .line 441
    .line 442
    move-result-object v10

    .line 443
    and-int/2addr v3, v6

    .line 444
    goto :goto_1d

    .line 445
    :cond_28
    move-object/from16 v10, p7

    .line 446
    .line 447
    :goto_1d
    if-eqz v0, :cond_29

    .line 448
    .line 449
    const/4 v0, 0x1

    .line 450
    move v6, v3

    .line 451
    move v3, v0

    .line 452
    move v0, v14

    .line 453
    goto :goto_1e

    .line 454
    :cond_29
    move v6, v3

    .line 455
    goto :goto_16

    .line 456
    :goto_1e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 457
    .line 458
    .line 459
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 460
    .line 461
    .line 462
    move-result v13

    .line 463
    if-eqz v13, :cond_2a

    .line 464
    .line 465
    const/4 v13, -0x1

    .line 466
    const-string v14, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:72)"

    .line 467
    .line 468
    const v15, 0x650c9692

    .line 469
    .line 470
    .line 471
    invoke-static {v15, v6, v13, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 472
    .line 473
    .line 474
    :cond_2a
    sget-object v14, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 475
    .line 476
    invoke-interface {v5}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    .line 477
    .line 478
    .line 479
    move-result v23

    .line 480
    and-int/lit8 v13, v6, 0xe

    .line 481
    .line 482
    shr-int/lit8 v15, v6, 0xf

    .line 483
    .line 484
    and-int/lit8 v15, v15, 0x70

    .line 485
    .line 486
    or-int/2addr v13, v15

    .line 487
    shr-int/lit8 v15, v6, 0x3

    .line 488
    .line 489
    and-int/lit16 v11, v15, 0x380

    .line 490
    .line 491
    or-int/2addr v11, v13

    .line 492
    invoke-static {v1, v5, v8, v2, v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt;->rememberColumnSlots(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;

    .line 493
    .line 494
    .line 495
    move-result-object v11

    .line 496
    shl-int/lit8 v13, v6, 0x6

    .line 497
    .line 498
    and-int/lit16 v13, v13, 0x1c00

    .line 499
    .line 500
    or-int/lit8 v13, v13, 0x38

    .line 501
    .line 502
    shl-int/lit8 v17, v6, 0x3

    .line 503
    .line 504
    const v19, 0xe000

    .line 505
    .line 506
    .line 507
    and-int v19, v17, v19

    .line 508
    .line 509
    or-int v13, v13, v19

    .line 510
    .line 511
    and-int v16, v17, v16

    .line 512
    .line 513
    or-int v13, v13, v16

    .line 514
    .line 515
    and-int v16, v15, v18

    .line 516
    .line 517
    or-int v13, v13, v16

    .line 518
    .line 519
    and-int v15, v15, v20

    .line 520
    .line 521
    or-int/2addr v13, v15

    .line 522
    shl-int/lit8 v15, v6, 0x9

    .line 523
    .line 524
    and-int v15, v15, v22

    .line 525
    .line 526
    or-int v25, v13, v15

    .line 527
    .line 528
    shr-int/lit8 v6, v6, 0x1b

    .line 529
    .line 530
    and-int/lit8 v26, v6, 0xe

    .line 531
    .line 532
    const/16 v27, 0x0

    .line 533
    .line 534
    move-object v13, v7

    .line 535
    move-object v15, v11

    .line 536
    move-object/from16 v16, v4

    .line 537
    .line 538
    move-object/from16 v17, v8

    .line 539
    .line 540
    move/from16 v18, v0

    .line 541
    .line 542
    move-object/from16 v19, v10

    .line 543
    .line 544
    move/from16 v20, v3

    .line 545
    .line 546
    move/from16 v21, v9

    .line 547
    .line 548
    move/from16 v22, v23

    .line 549
    .line 550
    move-object/from16 v23, p9

    .line 551
    .line 552
    move-object/from16 v24, v2

    .line 553
    .line 554
    invoke-static/range {v13 .. v27}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt;->LazyStaggeredGrid-LJWHXA8(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZFFLv3/l;Landroidx/compose/runtime/Composer;III)V

    .line 555
    .line 556
    .line 557
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 558
    .line 559
    .line 560
    move-result v6

    .line 561
    if-eqz v6, :cond_2b

    .line 562
    .line 563
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 564
    .line 565
    .line 566
    :cond_2b
    move v6, v9

    .line 567
    move v9, v3

    .line 568
    move-object v3, v7

    .line 569
    move-object v7, v5

    .line 570
    move v5, v0

    .line 571
    :goto_1f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 572
    .line 573
    .line 574
    move-result-object v13

    .line 575
    if-eqz v13, :cond_2c

    .line 576
    .line 577
    new-instance v14, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1;

    .line 578
    .line 579
    move-object v0, v14

    .line 580
    move-object/from16 v1, p0

    .line 581
    .line 582
    move-object v2, v4

    .line 583
    move-object v4, v8

    .line 584
    move-object v8, v10

    .line 585
    move-object/from16 v10, p9

    .line 586
    .line 587
    move/from16 v11, p11

    .line 588
    .line 589
    move/from16 v12, p12

    .line 590
    .line 591
    invoke-direct/range {v0 .. v12}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLv3/l;II)V

    .line 592
    .line 593
    .line 594
    invoke-interface {v13, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 595
    .line 596
    .line 597
    :cond_2c
    return-void
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
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method public static final items(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lv3/l;Lv3/l;Lv3/l;Lv3/r;)V
    .locals 3
    .param p0    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Lv3/r;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;",
            "Ljava/util/List<",
            "+TT;>;",
            "Lv3/l<",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lv3/l<",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lv3/l<",
            "-TT;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;",
            ">;",
            "Lv3/r<",
            "-",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;",
            "-TT;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 2
    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$2$1;

    invoke-direct {v2, p2, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$2$1;-><init>(Lv3/l;Ljava/util/List;)V

    move-object p2, v2

    goto :goto_0

    :cond_0
    move-object p2, v1

    .line 3
    :goto_0
    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$3;

    invoke-direct {v2, p3, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$3;-><init>(Lv3/l;Ljava/util/List;)V

    if-eqz p4, :cond_1

    .line 4
    new-instance p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$4$1;

    invoke-direct {p3, p4, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$4$1;-><init>(Lv3/l;Ljava/util/List;)V

    move-object p4, p3

    goto :goto_1

    :cond_1
    move-object p4, v1

    .line 5
    :goto_1
    new-instance p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$5;

    invoke-direct {p3, p5, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$5;-><init>(Lv3/r;Ljava/util/List;)V

    const p1, -0x34d6409f    # -1.1124577E7f

    const/4 p5, 0x1

    invoke-static {p1, p5, p3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p5

    move p1, v0

    move-object p3, v2

    .line 6
    invoke-interface/range {p0 .. p5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILv3/l;Lv3/l;Lv3/l;Lv3/r;)V

    return-void
.end method

.method public static final items(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lv3/l;Lv3/l;Lv3/l;Lv3/r;)V
    .locals 3
    .param p0    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Lv3/r;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;",
            "[TT;",
            "Lv3/l<",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lv3/l<",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lv3/l<",
            "-TT;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;",
            ">;",
            "Lv3/r<",
            "-",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;",
            "-TT;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 7
    array-length v0, p1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 8
    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$7$1;

    invoke-direct {v2, p2, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$7$1;-><init>(Lv3/l;[Ljava/lang/Object;)V

    move-object p2, v2

    goto :goto_0

    :cond_0
    move-object p2, v1

    .line 9
    :goto_0
    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$8;

    invoke-direct {v2, p3, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$8;-><init>(Lv3/l;[Ljava/lang/Object;)V

    if-eqz p4, :cond_1

    .line 10
    new-instance p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$9$1;

    invoke-direct {p3, p4, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$9$1;-><init>(Lv3/l;[Ljava/lang/Object;)V

    move-object p4, p3

    goto :goto_1

    :cond_1
    move-object p4, v1

    .line 11
    :goto_1
    new-instance p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$10;

    invoke-direct {p3, p5, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$10;-><init>(Lv3/r;[Ljava/lang/Object;)V

    const p1, 0x7d3f3b80

    const/4 p5, 0x1

    invoke-static {p1, p5, p3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p5

    move p1, v0

    move-object p3, v2

    .line 12
    invoke-interface/range {p0 .. p5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILv3/l;Lv3/l;Lv3/l;Lv3/r;)V

    return-void
.end method

.method public static synthetic items$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lv3/l;Lv3/l;Lv3/l;Lv3/r;ILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    .line 1
    sget-object p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$1;->INSTANCE:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$1;

    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    move-object p4, v0

    .line 2
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-eqz p2, :cond_3

    .line 3
    new-instance p6, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$2$1;

    invoke-direct {p6, p2, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$2$1;-><init>(Lv3/l;Ljava/util/List;)V

    move-object v3, p6

    goto :goto_0

    :cond_3
    move-object v3, v0

    .line 4
    :goto_0
    new-instance v4, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$3;

    invoke-direct {v4, p3, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$3;-><init>(Lv3/l;Ljava/util/List;)V

    if-eqz p4, :cond_4

    .line 5
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$4$1;

    invoke-direct {v0, p4, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$4$1;-><init>(Lv3/l;Ljava/util/List;)V

    :cond_4
    move-object v5, v0

    .line 6
    new-instance p2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$5;

    invoke-direct {p2, p5, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$5;-><init>(Lv3/r;Ljava/util/List;)V

    const p1, -0x34d6409f    # -1.1124577E7f

    const/4 p3, 0x1

    invoke-static {p1, p3, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    move-object v1, p0

    .line 7
    invoke-interface/range {v1 .. v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILv3/l;Lv3/l;Lv3/l;Lv3/r;)V

    return-void
.end method

.method public static synthetic items$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lv3/l;Lv3/l;Lv3/l;Lv3/r;ILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    .line 8
    sget-object p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$6;->INSTANCE:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$6;

    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    move-object p4, v0

    .line 9
    :cond_2
    array-length v2, p1

    if-eqz p2, :cond_3

    .line 10
    new-instance p6, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$7$1;

    invoke-direct {p6, p2, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$7$1;-><init>(Lv3/l;[Ljava/lang/Object;)V

    move-object v3, p6

    goto :goto_0

    :cond_3
    move-object v3, v0

    .line 11
    :goto_0
    new-instance v4, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$8;

    invoke-direct {v4, p3, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$8;-><init>(Lv3/l;[Ljava/lang/Object;)V

    if-eqz p4, :cond_4

    .line 12
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$9$1;

    invoke-direct {v0, p4, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$9$1;-><init>(Lv3/l;[Ljava/lang/Object;)V

    :cond_4
    move-object v5, v0

    .line 13
    new-instance p2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$10;

    invoke-direct {p2, p5, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$10;-><init>(Lv3/r;[Ljava/lang/Object;)V

    const p1, 0x7d3f3b80

    const/4 p3, 0x1

    invoke-static {p1, p3, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    move-object v1, p0

    .line 14
    invoke-interface/range {v1 .. v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILv3/l;Lv3/l;Lv3/l;Lv3/r;)V

    return-void
.end method

.method public static final itemsIndexed(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lv3/p;Lv3/p;Lv3/p;Lv3/s;)V
    .locals 3
    .param p0    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Lv3/s;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;",
            "Ljava/util/List<",
            "+TT;>;",
            "Lv3/p<",
            "-",
            "Ljava/lang/Integer;",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lv3/p<",
            "-",
            "Ljava/lang/Integer;",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lv3/p<",
            "-",
            "Ljava/lang/Integer;",
            "-TT;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;",
            ">;",
            "Lv3/s<",
            "-",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;",
            "-",
            "Ljava/lang/Integer;",
            "-TT;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 2
    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$2$1;

    invoke-direct {v2, p2, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$2$1;-><init>(Lv3/p;Ljava/util/List;)V

    move-object p2, v2

    goto :goto_0

    :cond_0
    move-object p2, v1

    .line 3
    :goto_0
    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$3;

    invoke-direct {v2, p3, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$3;-><init>(Lv3/p;Ljava/util/List;)V

    if-eqz p4, :cond_1

    .line 4
    new-instance p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$4$1;

    invoke-direct {p3, p4, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$4$1;-><init>(Lv3/p;Ljava/util/List;)V

    move-object p4, p3

    goto :goto_1

    :cond_1
    move-object p4, v1

    .line 5
    :goto_1
    new-instance p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$5;

    invoke-direct {p3, p5, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$5;-><init>(Lv3/s;Ljava/util/List;)V

    const p1, 0x10fa3898

    const/4 p5, 0x1

    invoke-static {p1, p5, p3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p5

    move p1, v0

    move-object p3, v2

    .line 6
    invoke-interface/range {p0 .. p5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILv3/l;Lv3/l;Lv3/l;Lv3/r;)V

    return-void
.end method

.method public static final itemsIndexed(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lv3/p;Lv3/p;Lv3/p;Lv3/s;)V
    .locals 3
    .param p0    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Lv3/s;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;",
            "[TT;",
            "Lv3/p<",
            "-",
            "Ljava/lang/Integer;",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lv3/p<",
            "-",
            "Ljava/lang/Integer;",
            "-TT;+",
            "Ljava/lang/Object;",
            ">;",
            "Lv3/p<",
            "-",
            "Ljava/lang/Integer;",
            "-TT;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;",
            ">;",
            "Lv3/s<",
            "-",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;",
            "-",
            "Ljava/lang/Integer;",
            "-TT;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 7
    array-length v0, p1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 8
    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$7$1;

    invoke-direct {v2, p2, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$7$1;-><init>(Lv3/p;[Ljava/lang/Object;)V

    move-object p2, v2

    goto :goto_0

    :cond_0
    move-object p2, v1

    .line 9
    :goto_0
    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$8;

    invoke-direct {v2, p3, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$8;-><init>(Lv3/p;[Ljava/lang/Object;)V

    if-eqz p4, :cond_1

    .line 10
    new-instance p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$9$1;

    invoke-direct {p3, p4, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$9$1;-><init>(Lv3/p;[Ljava/lang/Object;)V

    move-object p4, p3

    goto :goto_1

    :cond_1
    move-object p4, v1

    .line 11
    :goto_1
    new-instance p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$10;

    invoke-direct {p3, p5, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$10;-><init>(Lv3/s;[Ljava/lang/Object;)V

    const p1, -0x2ff3825f

    const/4 p5, 0x1

    invoke-static {p1, p5, p3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p5

    move p1, v0

    move-object p3, v2

    .line 12
    invoke-interface/range {p0 .. p5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILv3/l;Lv3/l;Lv3/l;Lv3/r;)V

    return-void
.end method

.method public static synthetic itemsIndexed$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lv3/p;Lv3/p;Lv3/p;Lv3/s;ILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    .line 1
    sget-object p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$1;->INSTANCE:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$1;

    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    move-object p4, v0

    .line 2
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-eqz p2, :cond_3

    .line 3
    new-instance p6, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$2$1;

    invoke-direct {p6, p2, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$2$1;-><init>(Lv3/p;Ljava/util/List;)V

    move-object v3, p6

    goto :goto_0

    :cond_3
    move-object v3, v0

    .line 4
    :goto_0
    new-instance v4, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$3;

    invoke-direct {v4, p3, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$3;-><init>(Lv3/p;Ljava/util/List;)V

    if-eqz p4, :cond_4

    .line 5
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$4$1;

    invoke-direct {v0, p4, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$4$1;-><init>(Lv3/p;Ljava/util/List;)V

    :cond_4
    move-object v5, v0

    .line 6
    new-instance p2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$5;

    invoke-direct {p2, p5, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$5;-><init>(Lv3/s;Ljava/util/List;)V

    const p1, 0x10fa3898

    const/4 p3, 0x1

    invoke-static {p1, p3, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    move-object v1, p0

    .line 7
    invoke-interface/range {v1 .. v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILv3/l;Lv3/l;Lv3/l;Lv3/r;)V

    return-void
.end method

.method public static synthetic itemsIndexed$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lv3/p;Lv3/p;Lv3/p;Lv3/s;ILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    .line 8
    sget-object p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$6;->INSTANCE:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$6;

    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    move-object p4, v0

    .line 9
    :cond_2
    array-length v2, p1

    if-eqz p2, :cond_3

    .line 10
    new-instance p6, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$7$1;

    invoke-direct {p6, p2, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$7$1;-><init>(Lv3/p;[Ljava/lang/Object;)V

    move-object v3, p6

    goto :goto_0

    :cond_3
    move-object v3, v0

    .line 11
    :goto_0
    new-instance v4, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$8;

    invoke-direct {v4, p3, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$8;-><init>(Lv3/p;[Ljava/lang/Object;)V

    if-eqz p4, :cond_4

    .line 12
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$9$1;

    invoke-direct {v0, p4, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$9$1;-><init>(Lv3/p;[Ljava/lang/Object;)V

    :cond_4
    move-object v5, v0

    .line 13
    new-instance p2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$10;

    invoke-direct {p2, p5, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$10;-><init>(Lv3/s;[Ljava/lang/Object;)V

    const p1, -0x2ff3825f

    const/4 p3, 0x1

    invoke-static {p1, p3, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    move-object v1, p0

    .line 14
    invoke-interface/range {v1 .. v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;->items(ILv3/l;Lv3/l;Lv3/l;Lv3/r;)V

    return-void
.end method

.method private static final rememberColumnSlots(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    const v0, -0x4b860ee9

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:94)"

    .line 15
    .line 16
    invoke-static {v0, p4, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const p4, 0x607fb4c4

    .line 20
    .line 21
    .line 22
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    or-int/2addr p4, v0

    .line 34
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    or-int/2addr p4, v0

    .line 39
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-nez p4, :cond_1

    .line 44
    .line 45
    sget-object p4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 46
    .line 47
    invoke-virtual {p4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p4

    .line 51
    if-ne v0, p4, :cond_2

    .line 52
    .line 53
    :cond_1
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlotCache;

    .line 54
    .line 55
    new-instance p4, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberColumnSlots$1$1;

    .line 56
    .line 57
    invoke-direct {p4, p2, p0, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberColumnSlots$1$1;-><init>(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, p4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlotCache;-><init>(Lv3/p;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 67
    .line 68
    .line 69
    check-cast v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;

    .line 70
    .line 71
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_3

    .line 76
    .line 77
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 78
    .line 79
    .line 80
    :cond_3
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 81
    .line 82
    .line 83
    return-object v0
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
.end method

.method private static final rememberRowSlots(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    const v0, -0x5b564f4d

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:184)"

    .line 15
    .line 16
    invoke-static {v0, p4, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const p4, 0x607fb4c4

    .line 20
    .line 21
    .line 22
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    or-int/2addr p4, v0

    .line 34
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    or-int/2addr p4, v0

    .line 39
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-nez p4, :cond_1

    .line 44
    .line 45
    sget-object p4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 46
    .line 47
    invoke-virtual {p4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p4

    .line 51
    if-ne v0, p4, :cond_2

    .line 52
    .line 53
    :cond_1
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlotCache;

    .line 54
    .line 55
    new-instance p4, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberRowSlots$1$1;

    .line 56
    .line 57
    invoke-direct {p4, p2, p0, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberRowSlots$1$1;-><init>(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, p4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlotCache;-><init>(Lv3/p;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 67
    .line 68
    .line 69
    check-cast v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;

    .line 70
    .line 71
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_3

    .line 76
    .line 77
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 78
    .line 79
    .line 80
    :cond_3
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 81
    .line 82
    .line 83
    return-object v0
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
.end method
