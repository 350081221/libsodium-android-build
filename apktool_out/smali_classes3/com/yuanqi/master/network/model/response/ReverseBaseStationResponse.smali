.class public final Lcom/yuanqi/master/network/model/response/ReverseBaseStationResponse;
.super Ljava/util/ArrayList;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\u0008\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/yuanqi/master/network/model/response/ReverseBaseStationResponse;",
        "Ljava/util/ArrayList;",
        "Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;",
        "Lkotlin/collections/ArrayList;",
        "()V",
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
.field public static final $stable:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge contains(Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 2
    instance-of v0, p1, Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/network/model/response/ReverseBaseStationResponse;->contains(Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;)Z

    move-result p1

    return p1
.end method

.method public bridge getSize()I
    .locals 1

    invoke-super {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public bridge indexOf(Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 2
    instance-of v0, p1, Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/network/model/response/ReverseBaseStationResponse;->indexOf(Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;)I

    move-result p1

    return p1
.end method

.method public bridge lastIndexOf(Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/ArrayList;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 2
    instance-of v0, p1, Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/network/model/response/ReverseBaseStationResponse;->lastIndexOf(Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;)I

    move-result p1

    return p1
.end method

.method public final bridge remove(I)Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/yuanqi/master/network/model/response/ReverseBaseStationResponse;->removeAt(I)Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;

    move-result-object p1

    return-object p1
.end method

.method public bridge remove(Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;)Z
    .locals 0

    .line 2
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1

    .line 3
    instance-of v0, p1, Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/network/model/response/ReverseBaseStationResponse;->remove(Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;)Z

    move-result p1

    return p1
.end method

.method public bridge removeAt(I)Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;
    .locals 0

    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;

    return-object p1
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, Lcom/yuanqi/master/network/model/response/ReverseBaseStationResponse;->getSize()I

    move-result v0

    return v0
.end method
