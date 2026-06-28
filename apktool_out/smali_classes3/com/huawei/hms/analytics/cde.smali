.class public final Lcom/huawei/hms/analytics/cde;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ikl:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/huawei/hms/analytics/cde;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field klm:Ljava/lang/String;

.field final lmn:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/cde;->ikl:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/huawei/hms/analytics/cde;->lmn:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_region"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    const-string v3, "Privacy_MY"

    invoke-static {p1, v3, v0, v2}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/cde;->klm:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v0, v0, Lcom/huawei/hms/analytics/ay;->ghi:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/analytics/cde;->klm:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/huawei/hms/analytics/cde;->klm:Ljava/lang/String;

    invoke-static {p1, v3, p2, v0}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static lmn(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/cde;
    .locals 2

    sget-object v0, Lcom/huawei/hms/analytics/cde;->ikl:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/huawei/hms/analytics/cde;

    return-object p0

    :cond_0
    new-instance v1, Lcom/huawei/hms/analytics/cde;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/analytics/cde;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method


# virtual methods
.method public final lmn()V
    .locals 3

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/cde;->lmn:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/bh;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "_openness_config_tag"

    iget-object v2, p0, Lcom/huawei/hms/analytics/cde;->lmn:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/huawei/hms/analytics/cde;->klm:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/bh;->lmn(Ljava/lang/String;)V

    :cond_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/cde;->klm:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/bh;->klm(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final lmn(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/cde;->klm:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/cde;->klm:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
