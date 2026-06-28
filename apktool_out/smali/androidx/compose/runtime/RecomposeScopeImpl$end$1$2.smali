.class final Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/RecomposeScopeImpl;->end(I)Lv3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/runtime/Composition;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/runtime/Composition;",
        "composition",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/runtime/Composition;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n+ 2 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,444:1\n843#2:445\n845#2,4:459\n849#2:469\n373#3,6:446\n383#3,3:453\n386#3,2:457\n389#3,6:463\n1810#4:452\n1672#4:456\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n*L\n400#1:445\n400#1:459,4\n400#1:469\n400#1:446,6\n400#1:453,3\n400#1:457,2\n400#1:463,6\n400#1:452\n400#1:456\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $instances:Landroidx/collection/MutableObjectIntMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectIntMap<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $token:I

.field final synthetic this$0:Landroidx/compose/runtime/RecomposeScopeImpl;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/RecomposeScopeImpl;ILandroidx/collection/MutableObjectIntMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/RecomposeScopeImpl;",
            "I",
            "Landroidx/collection/MutableObjectIntMap<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->this$0:Landroidx/compose/runtime/RecomposeScopeImpl;

    iput p2, p0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->$token:I

    iput-object p3, p0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->$instances:Landroidx/collection/MutableObjectIntMap;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composition;

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->invoke(Landroidx/compose/runtime/Composition;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composition;)V
    .locals 19
    .param p1    # Landroidx/compose/runtime/Composition;
        .annotation build Lp4/l;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 2
    iget-object v2, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->this$0:Landroidx/compose/runtime/RecomposeScopeImpl;

    invoke-static {v2}, Landroidx/compose/runtime/RecomposeScopeImpl;->access$getCurrentToken$p(Landroidx/compose/runtime/RecomposeScopeImpl;)I

    move-result v2

    iget v3, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->$token:I

    if-ne v2, v3, :cond_9

    iget-object v2, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->$instances:Landroidx/collection/MutableObjectIntMap;

    iget-object v3, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->this$0:Landroidx/compose/runtime/RecomposeScopeImpl;

    invoke-static {v3}, Landroidx/compose/runtime/RecomposeScopeImpl;->access$getTrackedInstances$p(Landroidx/compose/runtime/RecomposeScopeImpl;)Landroidx/collection/MutableObjectIntMap;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 3
    instance-of v2, v1, Landroidx/compose/runtime/CompositionImpl;

    if-eqz v2, :cond_9

    .line 4
    iget-object v2, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->$instances:Landroidx/collection/MutableObjectIntMap;

    iget v3, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->$token:I

    iget-object v4, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->this$0:Landroidx/compose/runtime/RecomposeScopeImpl;

    .line 5
    iget-object v5, v2, Landroidx/collection/ObjectIntMap;->metadata:[J

    .line 6
    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_8

    const/4 v9, 0x0

    .line 7
    :goto_0
    aget-wide v10, v5, v9

    not-long v12, v10

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_7

    sub-int v12, v9, v6

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v12, :cond_6

    const-wide/16 v15, 0xff

    and-long/2addr v15, v10

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    const/16 v16, 0x1

    if-gez v15, :cond_0

    move/from16 v15, v16

    goto :goto_2

    :cond_0
    const/4 v15, 0x0

    :goto_2
    if-eqz v15, :cond_5

    shl-int/lit8 v15, v9, 0x3

    add-int/2addr v15, v14

    .line 8
    iget-object v8, v2, Landroidx/collection/ObjectIntMap;->keys:[Ljava/lang/Object;

    aget-object v8, v8, v15

    iget-object v13, v2, Landroidx/collection/ObjectIntMap;->values:[I

    aget v13, v13, v15

    if-eq v13, v3, :cond_1

    goto :goto_3

    :cond_1
    const/16 v16, 0x0

    :goto_3
    if-eqz v16, :cond_3

    .line 9
    move-object v13, v1

    check-cast v13, Landroidx/compose/runtime/CompositionImpl;

    invoke-virtual {v13, v8, v4}, Landroidx/compose/runtime/CompositionImpl;->removeObservation$runtime_release(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V

    .line 10
    instance-of v7, v8, Landroidx/compose/runtime/DerivedState;

    if-eqz v7, :cond_2

    move-object v7, v8

    check-cast v7, Landroidx/compose/runtime/DerivedState;

    goto :goto_4

    :cond_2
    const/4 v7, 0x0

    :goto_4
    if-eqz v7, :cond_3

    .line 11
    invoke-virtual {v13, v7}, Landroidx/compose/runtime/CompositionImpl;->removeDerivedStateObservation$runtime_release(Landroidx/compose/runtime/DerivedState;)V

    .line 12
    invoke-static {v4}, Landroidx/compose/runtime/RecomposeScopeImpl;->access$getTrackedDependencies$p(Landroidx/compose/runtime/RecomposeScopeImpl;)Landroidx/collection/MutableScatterMap;

    move-result-object v8

    if-eqz v8, :cond_3

    .line 13
    invoke-virtual {v8, v7}, Landroidx/collection/MutableScatterMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    invoke-virtual {v8}, Landroidx/collection/ScatterMap;->getSize()I

    move-result v7

    if-nez v7, :cond_3

    const/4 v7, 0x0

    .line 15
    invoke-static {v4, v7}, Landroidx/compose/runtime/RecomposeScopeImpl;->access$setTrackedDependencies$p(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/collection/MutableScatterMap;)V

    :cond_3
    if-eqz v16, :cond_4

    .line 16
    invoke-virtual {v2, v15}, Landroidx/collection/MutableObjectIntMap;->removeValueAt(I)V

    :cond_4
    const/16 v7, 0x8

    goto :goto_5

    :cond_5
    move v7, v13

    :goto_5
    shr-long/2addr v10, v7

    add-int/lit8 v14, v14, 0x1

    move v13, v7

    goto :goto_1

    :cond_6
    move v7, v13

    if-ne v12, v7, :cond_8

    :cond_7
    if-eq v9, v6, :cond_8

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 17
    :cond_8
    iget-object v1, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->$instances:Landroidx/collection/MutableObjectIntMap;

    invoke-virtual {v1}, Landroidx/collection/ObjectIntMap;->getSize()I

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->this$0:Landroidx/compose/runtime/RecomposeScopeImpl;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroidx/compose/runtime/RecomposeScopeImpl;->access$setTrackedInstances$p(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/collection/MutableObjectIntMap;)V

    :cond_9
    return-void
.end method
