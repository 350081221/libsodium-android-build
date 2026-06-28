.class public final Landroidx/compose/foundation/pager/PagerState$remeasurementModifier$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/RemeasurementModifier;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/pager/PagerState;-><init>(IF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "androidx/compose/foundation/pager/PagerState$remeasurementModifier$1",
        "Landroidx/compose/ui/layout/RemeasurementModifier;",
        "Landroidx/compose/ui/layout/Remeasurement;",
        "remeasurement",
        "Lkotlin/r2;",
        "onRemeasurementAvailable",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/foundation/pager/PagerState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/pager/PagerState;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState$remeasurementModifier$1;->this$0:Landroidx/compose/foundation/pager/PagerState;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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


# virtual methods
.method public onRemeasurementAvailable(Landroidx/compose/ui/layout/Remeasurement;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/layout/Remeasurement;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState$remeasurementModifier$1;->this$0:Landroidx/compose/foundation/pager/PagerState;

    invoke-static {v0, p1}, Landroidx/compose/foundation/pager/PagerState;->access$setRemeasurement(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/layout/Remeasurement;)V

    return-void
.end method
