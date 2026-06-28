.class public final Lcom/huawei/hms/analytics/dq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final lmn:Lcom/huawei/hms/analytics/dq;


# instance fields
.field private klm:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/dq;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/dq;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/dq;->lmn:Lcom/huawei/hms/analytics/dq;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/dq;->klm:Z

    return-void
.end method

.method public static lmn()Lcom/huawei/hms/analytics/dq;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/dq;->lmn:Lcom/huawei/hms/analytics/dq;

    return-object v0
.end method


# virtual methods
.method public final lmn(Landroid/content/Context;)Z
    .locals 2

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/dq;->klm:Z

    if-nez v0, :cond_2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const-string v1, "user"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/UserManager;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/os/UserManager;->isUserUnlocked()Z

    move-result p1

    iput-boolean p1, p0, Lcom/huawei/hms/analytics/dq;->klm:Z

    goto :goto_0

    :cond_1
    iput-boolean v0, p0, Lcom/huawei/hms/analytics/dq;->klm:Z

    :cond_2
    :goto_0
    iget-boolean p1, p0, Lcom/huawei/hms/analytics/dq;->klm:Z

    return p1
.end method
