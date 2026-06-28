.class public final Lcom/huawei/hms/analytics/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private klm:Ljava/lang/String;

.field public lmn:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/s;->lmn:Landroid/content/Intent;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/analytics/s;->lmn:Landroid/content/Intent;

    iput-object p1, p0, Lcom/huawei/hms/analytics/s;->klm:Ljava/lang/String;

    return-void
.end method
