.class public final Lcom/huawei/hms/analytics/cj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static klm:Z = false


# instance fields
.field public final lmn:Lcom/huawei/hms/analytics/bh;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/bh;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/cj;->lmn:Lcom/huawei/hms/analytics/bh;

    return-void
.end method

.method public static lmn()Lcom/huawei/hms/analytics/az;
    .locals 3

    sget-boolean v0, Lcom/huawei/hms/analytics/cj;->klm:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-static {}, Lcom/huawei/hms/analytics/z;->lmn()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-static {}, Lcom/huawei/hms/analytics/z;->klm()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/z;->ghi()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-static {}, Lcom/huawei/hms/analytics/z;->ijk()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/huawei/hms/analytics/z;->ikl()Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v0, Lcom/huawei/hms/analytics/az$ikl;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/az$ikl;-><init>()V

    return-object v0

    :cond_3
    invoke-static {}, Lcom/huawei/hms/analytics/z;->hij()Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v1, Lcom/huawei/hms/analytics/az$ijk;

    invoke-direct {v1, v0}, Lcom/huawei/hms/analytics/az$ijk;-><init>(Landroid/content/Context;)V

    return-object v1

    :cond_4
    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/hms/analytics/cj;->klm:Z

    return-object v1

    :cond_5
    :goto_0
    new-instance v1, Lcom/huawei/hms/analytics/az$klm;

    invoke-direct {v1, v0}, Lcom/huawei/hms/analytics/az$klm;-><init>(Landroid/content/Context;)V

    return-object v1

    :cond_6
    :goto_1
    new-instance v1, Lcom/huawei/hms/analytics/az$lmn;

    invoke-direct {v1, v0}, Lcom/huawei/hms/analytics/az$lmn;-><init>(Landroid/content/Context;)V

    return-object v1
.end method
