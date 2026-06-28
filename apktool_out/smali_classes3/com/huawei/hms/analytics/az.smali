.class public abstract Lcom/huawei/hms/analytics/az;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/az$klm;,
        Lcom/huawei/hms/analytics/az$ikl;,
        Lcom/huawei/hms/analytics/az$ijk;,
        Lcom/huawei/hms/analytics/az$lmn;
    }
.end annotation


# instance fields
.field private ijk:[Ljava/lang/Object;

.field private ikl:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private klm:Ljava/lang/String;

.field private lmn:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/az;->lmn:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/hms/analytics/az;->klm:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/az;->ikl:[Ljava/lang/Class;

    iput-object p4, p0, Lcom/huawei/hms/analytics/az;->ijk:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method klm()Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/az;->lmn:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/analytics/az;->klm:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/hms/analytics/az;->ikl:[Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/analytics/az;->ijk:[Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v1, "PtokenAccess"

    const-string v2, "invokeStaticFun() Exception"

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public abstract lmn(Ljava/lang/String;)Landroid/os/Bundle;
.end method

.method public abstract lmn()Ljava/lang/String;
.end method
