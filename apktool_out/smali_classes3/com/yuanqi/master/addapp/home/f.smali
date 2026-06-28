.class public final Lcom/yuanqi/master/addapp/home/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/yuanqi/master/addapp/home/f;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static b:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/yuanqi/master/addapp/home/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/yuanqi/master/addapp/home/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/yuanqi/master/addapp/home/f;->a:Lcom/yuanqi/master/addapp/home/f;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sget-object v1, Lcom/yuanqi/master/addapp/home/f$a;->INSTANCE:Lcom/yuanqi/master/addapp/home/f$a;

    .line 10
    .line 11
    const v2, -0x707d00bf

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lcom/yuanqi/master/addapp/home/f;->b:Lv3/q;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lv3/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/q<",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lcom/yuanqi/master/addapp/home/f;->b:Lv3/q;

    return-object v0
.end method
