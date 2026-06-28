.class final Lcom/yuanqi/master/mine/MineViewModel$q0;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/mine/MineViewModel;->O()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/network/model/BasicResponse;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/yuanqi/master/network/model/BasicResponse;",
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
.field public static final INSTANCE:Lcom/yuanqi/master/mine/MineViewModel$q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/yuanqi/master/mine/MineViewModel$q0;

    invoke-direct {v0}, Lcom/yuanqi/master/mine/MineViewModel$q0;-><init>()V

    sput-object v0, Lcom/yuanqi/master/mine/MineViewModel$q0;->INSTANCE:Lcom/yuanqi/master/mine/MineViewModel$q0;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/yuanqi/master/network/model/BasicResponse;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/MineViewModel$q0;->invoke(Lcom/yuanqi/master/network/model/BasicResponse;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/yuanqi/master/network/model/BasicResponse;)V
    .locals 1
    .param p1    # Lcom/yuanqi/master/network/model/BasicResponse;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 2
    sget-object p1, Lcom/yuanqi/master/tools/w0;->a:Lcom/yuanqi/master/tools/w0;

    const-string v0, "share_code_key"

    invoke-virtual {p1, v0}, Lcom/yuanqi/master/tools/w0;->f(Ljava/lang/String;)V

    return-void
.end method
