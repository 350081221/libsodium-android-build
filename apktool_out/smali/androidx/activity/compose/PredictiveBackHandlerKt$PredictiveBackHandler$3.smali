.class final Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/compose/PredictiveBackHandlerKt;->PredictiveBackHandler(ZLv3/p;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $enabled:Z

.field final synthetic $onBack:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Lkotlinx/coroutines/flow/i<",
            "Landroidx/activity/BackEventCompat;",
            ">;",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(ZLv3/p;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lv3/p<",
            "Lkotlinx/coroutines/flow/i<",
            "Landroidx/activity/BackEventCompat;",
            ">;-",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;II)V"
        }
    .end annotation

    iput-boolean p1, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3;->$enabled:Z

    iput-object p2, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3;->$onBack:Lv3/p;

    iput p3, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3;->$$changed:I

    iput p4, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3;->$$default:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 3
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-boolean p2, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3;->$enabled:Z

    iget-object v0, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3;->$onBack:Lv3/p;

    iget v1, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3;->$$changed:I

    or-int/lit8 v1, v1, 0x1

    iget v2, p0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3;->$$default:I

    invoke-static {p2, v0, p1, v1, v2}, Landroidx/activity/compose/PredictiveBackHandlerKt;->PredictiveBackHandler(ZLv3/p;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
