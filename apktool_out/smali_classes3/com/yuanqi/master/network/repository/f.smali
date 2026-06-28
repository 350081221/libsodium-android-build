.class public final Lcom/yuanqi/master/network/repository/f;
.super Lcom/yuanqi/master/network/repository/a;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u0004J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00050\u0004J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u000cJ\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0004\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/yuanqi/master/network/repository/OtherRepository;",
        "Lcom/yuanqi/master/network/repository/BaseRepository;",
        "()V",
        "changeDevice",
        "Lretrofit2/Call;",
        "Lcom/yuanqi/master/network/model/BaseResult;",
        "",
        "getAppConfig",
        "Lcom/yuanqi/master/network/model/response/ConfigResponse;",
        "getForceByVersion",
        "Lcom/yuanqi/master/network/model/response/ForceByVersionResponse;",
        "version",
        "",
        "getShareList",
        "Lcom/yuanqi/master/network/model/response/ShareListResponse;",
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
.field public static final g:Lcom/yuanqi/master/network/repository/f;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/yuanqi/master/network/repository/f;

    invoke-direct {v0}, Lcom/yuanqi/master/network/repository/f;-><init>()V

    sput-object v0, Lcom/yuanqi/master/network/repository/f;->g:Lcom/yuanqi/master/network/repository/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/master/network/repository/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final g()Lretrofit2/Call;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/yuanqi/master/network/model/BaseResult<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->e()Lcom/yuanqi/master/network/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/yuanqi/master/network/a;->h(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object v0

    return-object v0
.end method

.method public final h()Lretrofit2/Call;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/yuanqi/master/network/model/BaseResult<",
            "Lcom/yuanqi/master/network/model/response/ConfigResponse;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->e()Lcom/yuanqi/master/network/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/yuanqi/master/network/a;->m()Lretrofit2/Call;

    move-result-object v0

    return-object v0
.end method

.method public final i(I)Lretrofit2/Call;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lretrofit2/Call<",
            "Lcom/yuanqi/master/network/model/BaseResult<",
            "Lcom/yuanqi/master/network/model/response/ForceByVersionResponse;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->e()Lcom/yuanqi/master/network/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/yuanqi/master/network/a;->w(I)Lretrofit2/Call;

    move-result-object p1

    return-object p1
.end method

.method public final j()Lretrofit2/Call;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Call<",
            "Lcom/yuanqi/master/network/model/response/ShareListResponse;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->e()Lcom/yuanqi/master/network/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/yuanqi/master/network/repository/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/yuanqi/master/network/a;->r(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object v0

    return-object v0
.end method
