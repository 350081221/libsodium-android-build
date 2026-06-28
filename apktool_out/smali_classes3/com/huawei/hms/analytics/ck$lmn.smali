.class final Lcom/huawei/hms/analytics/ck$lmn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/ck;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "lmn"
.end annotation


# instance fields
.field private final ikl:Lcom/huawei/hms/analytics/cc;

.field private klm:Z

.field final synthetic lmn:Lcom/huawei/hms/analytics/ck;


# direct methods
.method private constructor <init>(Lcom/huawei/hms/analytics/ck;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/ck$lmn;->lmn:Lcom/huawei/hms/analytics/ck;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/huawei/hms/analytics/ck$lmn;->klm:Z

    const-string p1, "ReferrerTask#ADSReferrer"

    invoke-static {p1}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/ck$lmn;->ikl:Lcom/huawei/hms/analytics/cc;

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hms/analytics/ck;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/hms/analytics/ck$lmn;-><init>(Lcom/huawei/hms/analytics/ck;)V

    return-void
.end method


# virtual methods
.method public final lmn(Ljava/lang/String;)V
    .locals 2

    const-string v0, "ReferrerMission"

    const-string v1, "onSuccess"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/huawei/hms/analytics/cu;

    const-string v0, ""

    invoke-direct {p1, v0}, Lcom/huawei/hms/analytics/cu;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/huawei/hms/analytics/cu;

    const-string v1, "PPS"

    invoke-direct {v0, v1, p1}, Lcom/huawei/hms/analytics/cu;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object p1, v0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/ck$lmn;->lmn:Lcom/huawei/hms/analytics/ck;

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/ck;->lmn(Lcom/huawei/hms/analytics/ck;Lcom/huawei/hms/analytics/cv;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/huawei/hms/analytics/ck$lmn;->klm:Z

    iget-object p1, p0, Lcom/huawei/hms/analytics/ck$lmn;->ikl:Lcom/huawei/hms/analytics/cc;

    const-string v0, "0"

    iput-object v0, p1, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-static {p1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final lmn(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "onFail: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReferrerMission"

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/huawei/hms/analytics/ck$lmn;->klm:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/huawei/hms/analytics/ck$lmn;->lmn:Lcom/huawei/hms/analytics/ck;

    new-instance v0, Lcom/huawei/hms/analytics/cu;

    const-string v1, ""

    invoke-direct {v0, v1}, Lcom/huawei/hms/analytics/cu;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/ck;->lmn(Lcom/huawei/hms/analytics/ck;Lcom/huawei/hms/analytics/cv;)V

    iget-object p1, p0, Lcom/huawei/hms/analytics/ck$lmn;->ikl:Lcom/huawei/hms/analytics/cc;

    iput-object p2, p1, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    invoke-static {p1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method
