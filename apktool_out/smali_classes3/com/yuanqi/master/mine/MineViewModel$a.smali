.class final Lcom/yuanqi/master/mine/MineViewModel$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/master/mine/MineViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Lcom/yuanqi/master/mine/MineViewModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/yuanqi/master/mine/MineViewModel;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/yuanqi/master/mine/MineViewModel$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/yuanqi/master/mine/MineViewModel$a;

    invoke-direct {v0}, Lcom/yuanqi/master/mine/MineViewModel$a;-><init>()V

    sput-object v0, Lcom/yuanqi/master/mine/MineViewModel$a;->INSTANCE:Lcom/yuanqi/master/mine/MineViewModel$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/yuanqi/master/mine/MineViewModel;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Lcom/yuanqi/master/mine/MineViewModel;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/yuanqi/master/mine/MineViewModel;-><init>(Lkotlin/jvm/internal/w;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/mine/MineViewModel$a;->invoke()Lcom/yuanqi/master/mine/MineViewModel;

    move-result-object v0

    return-object v0
.end method
