.class public Lcom/huawei/agconnect/credential/obs/aj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[Ljava/lang/String;

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "RU"

    const-string v1, "UNKNOWN"

    const-string v2, "CN"

    const-string v3, "DE"

    const-string v4, "SG"

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/credential/obs/aj;->a:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/credential/obs/aj;->b:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/agconnect/credential/obs/ak;
    .locals 2

    new-instance v0, Lcom/huawei/agconnect/credential/obs/an;

    const-string v1, ""

    invoke-direct {v0, p1, p2, v1}, Lcom/huawei/agconnect/credential/obs/an;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, v0}, Lcom/huawei/agconnect/credential/obs/am;->a(Landroid/content/Context;Lcom/huawei/agconnect/credential/obs/an;)Lcom/huawei/agconnect/credential/obs/ak;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/agconnect/credential/obs/ak;
    .locals 3

    if-eqz p3, :cond_1

    sget-object v0, Lcom/huawei/agconnect/credential/obs/aj;->b:Ljava/util/List;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p3, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/huawei/agconnect/credential/obs/an;

    invoke-virtual {p3, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {v0, p1, p2, p3}, Lcom/huawei/agconnect/credential/obs/an;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, v0}, Lcom/huawei/agconnect/credential/obs/am;->a(Landroid/content/Context;Lcom/huawei/agconnect/credential/obs/an;)Lcom/huawei/agconnect/credential/obs/ak;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "RoutePolicy check failed: "

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "HiAnalyticsBridge"

    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return-object p0
.end method
