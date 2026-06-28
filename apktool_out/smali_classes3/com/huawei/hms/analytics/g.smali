.class public final Lcom/huawei/hms/analytics/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/g$klm;,
        Lcom/huawei/hms/analytics/g$lmn;
    }
.end annotation


# instance fields
.field public lmn:Lcom/huawei/hms/analytics/p;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/huawei/hms/analytics/p;

    invoke-direct {v0, p1}, Lcom/huawei/hms/analytics/p;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/g;->lmn:Lcom/huawei/hms/analytics/p;

    return-void
.end method
