.class public final Lcom/huawei/hms/analytics/ci;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/ci$lmn;
    }
.end annotation


# instance fields
.field private final lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/ci;->lmn:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    new-instance v0, Lcom/huawei/hms/analytics/bx;

    iget-object v1, p0, Lcom/huawei/hms/analytics/ci;->lmn:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/huawei/hms/analytics/bx;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/huawei/hms/analytics/ci$lmn;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/ci$lmn;-><init>()V

    iput-object v1, v0, Lcom/huawei/hms/analytics/bx;->lmn:Lcom/huawei/hms/analytics/bx$lmn;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/bx;->klm()V

    return-void
.end method
