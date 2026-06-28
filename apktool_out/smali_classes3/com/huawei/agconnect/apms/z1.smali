.class public Lcom/huawei/agconnect/apms/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-string v0, "RU"

    const-string v1, "UNKNOWN"

    const-string v2, "CN"

    const-string v3, "DE"

    const-string v4, "SG"

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    return-void
.end method

.method public static abc(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lv1/a;
    .locals 2

    new-instance v0, Lcom/huawei/agconnect/apms/c2;

    const-string v1, ""

    invoke-direct {v0, p1, p2, v1}, Lcom/huawei/agconnect/apms/c2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, v0}, Lcom/huawei/agconnect/apms/b2;->abc(Landroid/content/Context;Lcom/huawei/agconnect/apms/c2;)Lv1/a;

    move-result-object p0

    return-object p0
.end method
