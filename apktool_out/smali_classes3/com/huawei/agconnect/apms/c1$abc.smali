.class public Lcom/huawei/agconnect/apms/c1$abc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/c1;->abc(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic abc:Lcom/huawei/agconnect/apms/c1;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/c1;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/c1$abc;->abc:Lcom/huawei/agconnect/apms/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lcom/huawei/agconnect/apms/c1$abc;->abc:Lcom/huawei/agconnect/apms/c1;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Lcom/huawei/agconnect/apms/c1;->abc(Lcom/huawei/agconnect/apms/c1;J)Lcom/huawei/agconnect/apms/g1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/huawei/agconnect/apms/c1$abc;->abc:Lcom/huawei/agconnect/apms/c1;

    .line 14
    .line 15
    iget-object v1, v1, Lcom/huawei/agconnect/apms/c1;->fgh:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
.end method
