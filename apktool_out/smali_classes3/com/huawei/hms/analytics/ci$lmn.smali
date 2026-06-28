.class public final Lcom/huawei/hms/analytics/ci$lmn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/bx$lmn;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/ci;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "lmn"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final lmn()V
    .locals 3

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object v0

    const-string v1, "_openness_config_tag"

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/bh;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object v1

    const-string v2, "AGC_TAG"

    invoke-virtual {v1, v2}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/bh;

    move-result-object v1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/huawei/hms/analytics/bh;->lmn()V

    :cond_0
    if-eqz v1, :cond_1

    invoke-interface {v1}, Lcom/huawei/hms/analytics/bh;->lmn()V

    :cond_1
    return-void
.end method
