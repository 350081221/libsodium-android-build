.class public final Lcom/huawei/hms/analytics/av;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/av$lmn;,
        Lcom/huawei/hms/analytics/av$ikl;,
        Lcom/huawei/hms/analytics/av$klm;
    }
.end annotation


# instance fields
.field public ghi:Z

.field public hij:Lcom/huawei/hms/analytics/av$lmn;

.field public ijk:Ljava/lang/String;

.field public ikl:Ljava/lang/Long;

.field public klm:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/av$klm;",
            ">;"
        }
    .end annotation
.end field

.field public lmn:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/av;->ikl:Ljava/lang/Long;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/av;->ghi:Z

    return-void
.end method


# virtual methods
.method public final lmn(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/av;->ijk:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
