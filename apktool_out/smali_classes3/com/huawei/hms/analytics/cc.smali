.class public final Lcom/huawei/hms/analytics/cc;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/cc$lmn;
    }
.end annotation


# instance fields
.field private hij:J

.field public ijk:Ljava/lang/String;

.field public ikl:Ljava/lang/String;

.field public klm:Ljava/lang/String;

.field public lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "1"

    iput-object v0, p0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/analytics/cc;->ikl:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/analytics/cc;->ijk:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hms/analytics/cc;->hij:J

    return-void
.end method


# virtual methods
.method public final lmn()J
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/hms/analytics/cc;->hij:J

    sub-long/2addr v0, v2

    return-wide v0
.end method
