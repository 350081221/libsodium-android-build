.class public final Lcom/huawei/hms/analytics/bm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final lmn:[Ljava/lang/String;


# instance fields
.field public ikl:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public klm:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "com.huawei.agconnect.abtest.ABTestHAEventCallback"

    const-string v1, "com.huawei.agconnect.appmessaging.AppMessagingHAEventCallback"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/bm;->lmn:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/bm;->klm:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/bm;->ikl:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    iget-object v0, p0, Lcom/huawei/hms/analytics/bm;->ikl:Ljava/util/Map;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/analytics/bm;->klm:Ljava/util/Map;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v0, "$HA_METADATA_TAG"

    invoke-virtual {v4, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "$HA_METADATA_TYPE"

    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "$HA_METADATA_SOURCE"

    const-string p2, "Event"

    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/huawei/hms/analytics/cf;

    iget-object v5, p0, Lcom/huawei/hms/analytics/bm;->ikl:Ljava/util/Map;

    iget-object v6, p0, Lcom/huawei/hms/analytics/bm;->klm:Ljava/util/Map;

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    invoke-direct/range {v1 .. v6}, Lcom/huawei/hms/analytics/cf;-><init>(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/Map;Ljava/util/Map;)V

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->ikl()Lcom/huawei/hms/analytics/cx;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final lmn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 7

    iget-object v0, p0, Lcom/huawei/hms/analytics/bm;->ikl:Ljava/util/Map;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/analytics/bm;->klm:Ljava/util/Map;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v0, "$HA_METADATA_TAG"

    invoke-virtual {v4, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "$HA_METADATA_TYPE"

    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "$HA_METADATA_SOURCE"

    const-string p2, "StreamEvent"

    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "$HA_METADATA_TIMESTAMP"

    invoke-static {p5, p6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/huawei/hms/analytics/cf;

    iget-object v5, p0, Lcom/huawei/hms/analytics/bm;->ikl:Ljava/util/Map;

    iget-object v6, p0, Lcom/huawei/hms/analytics/bm;->klm:Ljava/util/Map;

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    invoke-direct/range {v1 .. v6}, Lcom/huawei/hms/analytics/cf;-><init>(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/Map;Ljava/util/Map;)V

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->ikl()Lcom/huawei/hms/analytics/cx;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method
