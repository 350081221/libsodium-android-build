.class public final Lcom/yuanqi/master/network/repository/h;
.super Lcom/yuanqi/master/network/repository/a;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0004J\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0004\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/yuanqi/master/network/repository/VipRepository;",
        "Lcom/yuanqi/master/network/repository/BaseRepository;",
        "()V",
        "createAliPayOrder",
        "Lretrofit2/Call;",
        "Lcom/yuanqi/master/network/model/ResultModel;",
        "type",
        "",
        "createWxPayOrder",
        "getVipMeal",
        "Lcom/yuanqi/master/network/model/response/VipMealResponse;",
        "giveVip",
        "Lcom/yuanqi/master/network/model/BasicResponse;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final g:Lcom/yuanqi/master/network/repository/h;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/yuanqi/master/network/repository/h;

    invoke-direct {v0}, Lcom/yuanqi/master/network/repository/h;-><init>()V

    sput-object v0, Lcom/yuanqi/master/network/repository/h;->g:Lcom/yuanqi/master/network/repository/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/master/network/repository/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/String;)Lretrofit2/Call;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/yuanqi/master/network/model/ResultModel;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->e()Lcom/yuanqi/master/network/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->c()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Lcom/yuanqi/master/network/model/request/CreateOrderRequest;

    .line 15
    .line 16
    const-string v3, "1"

    .line 17
    .line 18
    invoke-direct {v2, v3}, Lcom/yuanqi/master/network/model/request/CreateOrderRequest;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1, p1, v2}, Lcom/yuanqi/master/network/a;->B(Ljava/lang/String;Ljava/lang/String;Lcom/yuanqi/master/network/model/request/CreateOrderRequest;)Lretrofit2/Call;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
    .line 26
    .line 27
.end method

.method public final h(Ljava/lang/String;)Lretrofit2/Call;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/yuanqi/master/network/model/ResultModel;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->e()Lcom/yuanqi/master/network/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->c()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Lcom/yuanqi/master/network/model/request/CreateOrderRequest;

    .line 15
    .line 16
    const-string v3, "2"

    .line 17
    .line 18
    invoke-direct {v2, v3}, Lcom/yuanqi/master/network/model/request/CreateOrderRequest;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1, p1, v2}, Lcom/yuanqi/master/network/a;->n(Ljava/lang/String;Ljava/lang/String;Lcom/yuanqi/master/network/model/request/CreateOrderRequest;)Lretrofit2/Call;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
    .line 26
    .line 27
.end method

.method public final i()Lretrofit2/Call;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/yuanqi/master/network/model/response/VipMealResponse;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->e()Lcom/yuanqi/master/network/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/yuanqi/master/network/a;->g(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lretrofit2/Call;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/yuanqi/master/network/model/BasicResponse;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->e()Lcom/yuanqi/master/network/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/yuanqi/master/network/a;->b(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object v0

    return-object v0
.end method
