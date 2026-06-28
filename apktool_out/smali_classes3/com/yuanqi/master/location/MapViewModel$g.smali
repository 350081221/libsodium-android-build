.class final Lcom/yuanqi/master/location/MapViewModel$g;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/location/MapViewModel;->g(Ljava/lang/String;Ljava/lang/String;Lv3/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/network/model/response/ReverseEncodingResponse;",
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
        "Lcom/yuanqi/master/network/model/response/ReverseEncodingResponse;",
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


# instance fields
.field final synthetic $action:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Lcom/yuanqi/master/network/model/CustomAddress;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lv3/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Lcom/yuanqi/master/network/model/CustomAddress;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/location/MapViewModel$g;->$action:Lv3/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/yuanqi/master/network/model/response/ReverseEncodingResponse;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/location/MapViewModel$g;->invoke(Lcom/yuanqi/master/network/model/response/ReverseEncodingResponse;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/yuanqi/master/network/model/response/ReverseEncodingResponse;)V
    .locals 7
    .param p1    # Lcom/yuanqi/master/network/model/response/ReverseEncodingResponse;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/yuanqi/master/location/MapViewModel$g;->$action:Lv3/l;

    invoke-interface {p1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ReverseEncodingResponse;->getStatus()Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ReverseEncodingResponse;->getResult()Lcom/yuanqi/master/network/model/response/Result;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/Result;->getAddressComponent()Lcom/yuanqi/master/network/model/response/AddressComponent;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yuanqi/master/network/model/response/AddressComponent;->getAddress()Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/Result;->getLocation()Lcom/yuanqi/master/network/model/response/ReverseEncodingLocation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yuanqi/master/network/model/response/ReverseEncodingLocation;->getLat()D

    move-result-wide v3

    .line 7
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/Result;->getLocation()Lcom/yuanqi/master/network/model/response/ReverseEncodingLocation;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ReverseEncodingLocation;->getLon()D

    move-result-wide v5

    .line 8
    iget-object p1, p0, Lcom/yuanqi/master/location/MapViewModel$g;->$action:Lv3/l;

    new-instance v0, Lcom/yuanqi/master/network/model/CustomAddress;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/yuanqi/master/network/model/CustomAddress;-><init>(Ljava/lang/String;DD)V

    invoke-interface {p1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 9
    :cond_1
    iget-object v1, p0, Lcom/yuanqi/master/location/MapViewModel$g;->$action:Lv3/l;

    invoke-interface {v1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ReverseEncodingResponse;->getStatus()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v1, v2, v0}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    :goto_0
    return-void
.end method
