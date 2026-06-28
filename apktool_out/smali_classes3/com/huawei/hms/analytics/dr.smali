.class public final Lcom/huawei/hms/analytics/dr;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static lmn(Landroid/content/Context;I)V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "global_v2"

    const-string v2, "sig_flg"

    invoke-static {p0, v1, v2, v0}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {p0, v1, v2, p1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method
