.class public Lcom/huawei/agconnect/apms/zab$abc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/agconnect/apms/zab;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "abc"
.end annotation


# instance fields
.field public abc:Lcom/huawei/agconnect/apms/zab;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/zab;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/zab$abc;->abc:Lcom/huawei/agconnect/apms/zab;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/zab$abc;->abc:Lcom/huawei/agconnect/apms/zab;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/huawei/agconnect/apms/zab;->abc(Lcom/huawei/agconnect/apms/zab;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->getInstance()Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/collect/HiAnalyticsManager;->onReport()V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
