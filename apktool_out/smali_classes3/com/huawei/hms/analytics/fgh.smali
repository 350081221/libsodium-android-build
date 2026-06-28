.class public final Lcom/huawei/hms/analytics/fgh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static lmn:Lcom/huawei/hms/analytics/fgh;


# instance fields
.field private final klm:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/huawei/hms/analytics/bh;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/fgh;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/fgh;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/fgh;->lmn:Lcom/huawei/hms/analytics/fgh;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/fgh;->klm:Ljava/util/Map;

    return-void
.end method

.method public static klm(Landroid/content/Context;)V
    .locals 3

    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/app/Activity;

    new-instance v0, Lcom/huawei/hms/analytics/receiver/SafeIntent;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hms/analytics/receiver/SafeIntent;-><init>(Landroid/content/Intent;)V

    invoke-static {p0}, Lcom/huawei/hms/analytics/cz;->lmn(Landroid/app/Activity;)Lcom/huawei/hms/analytics/bw;

    move-result-object v1

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v2, v2, Lcom/huawei/hms/analytics/at;->d:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p0, v1}, Lcom/huawei/hms/analytics/cz;->lmn(Landroid/app/Activity;Lcom/huawei/hms/analytics/bw;)V

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p0

    iget-object p0, p0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object p0, p0, Lcom/huawei/hms/analytics/at;->e:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {v1}, Lcom/huawei/hms/analytics/cz;->klm(Lcom/huawei/hms/analytics/bw;)V

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p0

    iget-object p0, p0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/at;->cde:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public static lmn()Lcom/huawei/hms/analytics/fgh;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/fgh;->lmn:Lcom/huawei/hms/analytics/fgh;

    return-object v0
.end method

.method public static lmn(Landroid/content/Context;)V
    .locals 3

    const-string v0, "is_analytics_initialized"

    const/4 v1, 0x1

    const-string v2, "global_v2"

    invoke-static {p0, v2, v0, v1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static lmn(Landroid/content/Context;Lcom/huawei/hms/analytics/bh;)V
    .locals 2

    instance-of v0, p0, Landroid/app/Application;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/app/Application;

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/dg;->lmn()Landroid/app/Application;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lcom/huawei/hms/analytics/a;->lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/a;

    move-result-object v0

    iput-object p1, v0, Lcom/huawei/hms/analytics/a;->ikl:Lcom/huawei/hms/analytics/bh;

    iget-boolean v1, v0, Lcom/huawei/hms/analytics/a;->lmn:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/a;->lmn()V

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/bcd;->lmn()Lcom/huawei/hms/analytics/bcd;

    move-result-object v0

    iput-object p1, v0, Lcom/huawei/hms/analytics/bcd;->def:Lcom/huawei/hms/analytics/bh;

    invoke-static {}, Lcom/huawei/hms/analytics/abc;->lmn()Lcom/huawei/hms/analytics/abc;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/huawei/hms/analytics/abc;->lmn(Landroid/app/Application;)V

    return-void
.end method

.method public static lmn(Lcom/huawei/hms/analytics/hij;)V
    .locals 1

    invoke-static {}, Lcom/huawei/hms/analytics/cx;->lmn()Lcom/huawei/hms/analytics/cx;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hms/analytics/cx;->lmn(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static lmn(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "UNKNOWN"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p0

    iget-object p0, p0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object p0, p0, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object p0, p0, Lcom/huawei/hms/analytics/ay;->ghi:Ljava/lang/String;

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/cde;->lmn(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/cde;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/huawei/hms/analytics/cde;->lmn(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final klm()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/hms/analytics/fgh;->klm:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "_openness_config_tag"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/huawei/hms/analytics/ar;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/au;

    move-result-object v3

    iget-boolean v3, v3, Lcom/huawei/hms/analytics/au;->ikl:Z

    if-nez v3, :cond_1

    const-string v1, "The Analytics Kit is disabled. serviceTag: "

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "HiAnalyticsInstanceCommander"

    const-string v3, "IE-006"

    invoke-static {v2, v3, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hms/analytics/bh;

    invoke-interface {v1}, Lcom/huawei/hms/analytics/bh;->lmn()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/bh;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/fgh;->klm:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/huawei/hms/analytics/bh;

    return-object p1
.end method

.method public final lmn(Ljava/lang/String;Lcom/huawei/hms/analytics/bh;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/fgh;->klm:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
