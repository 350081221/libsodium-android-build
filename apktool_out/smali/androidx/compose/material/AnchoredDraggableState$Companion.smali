.class public final Landroidx/compose/material/AnchoredDraggableState$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/material/AnchoredDraggableState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013Jw\u0010\u0011\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0004\u0012\u00028\u00010\u000f\"\u0008\u0008\u0001\u0010\u0002*\u00020\u00012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u00062!\u0010\u000c\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u00040\u00062\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\rH\u0007\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/compose/material/AnchoredDraggableState$Companion;",
        "",
        "T",
        "Landroidx/compose/animation/core/AnimationSpec;",
        "",
        "animationSpec",
        "Lkotlin/Function1;",
        "",
        "confirmValueChange",
        "Lkotlin/v0;",
        "name",
        "distance",
        "positionalThreshold",
        "Lkotlin/Function0;",
        "velocityThreshold",
        "Landroidx/compose/runtime/saveable/Saver;",
        "Landroidx/compose/material/AnchoredDraggableState;",
        "Saver",
        "<init>",
        "()V",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/material/AnchoredDraggableState$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final Saver(Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Lv3/l;Lv3/a;)Landroidx/compose/runtime/saveable/Saver;
    .locals 2
    .param p1    # Landroidx/compose/animation/core/AnimationSpec;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material/ExperimentalMaterialApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Lv3/l<",
            "-TT;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;",
            "Lv3/a<",
            "Ljava/lang/Float;",
            ">;)",
            "Landroidx/compose/runtime/saveable/Saver<",
            "Landroidx/compose/material/AnchoredDraggableState<",
            "TT;>;TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/material/AnchoredDraggableState$Companion$Saver$1;->INSTANCE:Landroidx/compose/material/AnchoredDraggableState$Companion$Saver$1;

    new-instance v1, Landroidx/compose/material/AnchoredDraggableState$Companion$Saver$2;

    invoke-direct {v1, p3, p4, p1, p2}, Landroidx/compose/material/AnchoredDraggableState$Companion$Saver$2;-><init>(Lv3/l;Lv3/a;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;)V

    invoke-static {v0, v1}, Landroidx/compose/runtime/saveable/SaverKt;->Saver(Lv3/p;Lv3/l;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object p1

    return-object p1
.end method
