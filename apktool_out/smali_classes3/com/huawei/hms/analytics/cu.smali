.class public final Lcom/huawei/hms/analytics/cu;
.super Lcom/huawei/hms/analytics/cv;
.source "SourceFile"


# instance fields
.field private ijk:Ljava/lang/String;

.field public klm:Ljava/lang/String;

.field public lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hms/analytics/cv;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hms/analytics/cv;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/cu;->ijk:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/huawei/hms/analytics/cv;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/huawei/hms/analytics/cu;->ijk:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final lmn()Landroid/os/Bundle;
    .locals 4

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/cv;->klm()Landroid/os/Bundle;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/cu;->lmn:Ljava/lang/String;

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v1, v2

    :cond_0
    const-string v3, "$TrackId"

    invoke-virtual {v0, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/hms/analytics/cu;->ijk:Ljava/lang/String;

    if-nez v1, :cond_1

    move-object v1, v2

    :cond_1
    const-string v3, "$ChannelType"

    invoke-virtual {v0, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/hms/analytics/cu;->klm:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v2, v1

    :goto_0
    const-string v1, "$TrackClickTime"

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
